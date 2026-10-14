package Controller;

import Model.*;
import Service.SaveService;
import Service.ServiceCapitulo;
import View.JogoView;

import java.util.List;

public class ControladorCapitulos {
    private ServiceCapitulo serviceCapitulo;
    private ControladorCenas controladorCenas;
    private JogoView view;
    private Jogo jogo;
    private SaveService saveService;

    public ControladorCapitulos(JogoView view, ControladorCenas controladorCenas, Jogo jogo) {
        this.view = view;
        this.serviceCapitulo = new ServiceCapitulo();
        this.controladorCenas = controladorCenas;
        this.jogo = jogo;
        this.saveService = new SaveService();
    }

    public void iniciarCapitulo(Capitulo capitulo, Protagonista prota, List<Secundario> secundarios) {
        view.exibirTexto("\n========================================");
        view.exibirTexto("CAPÍTULO " + capitulo.getIdCapitulo() + ": " + capitulo.getTitulo());
        view.exibirTexto("========================================");

        serviceCapitulo.definirPrimeiraCena(capitulo, prota, secundarios, controladorCenas.getServiceCena());

        int proximaCenaId = capitulo.getIdPrimeiraCena();
        int ultimaCenaExecutada = proximaCenaId;

        while (proximaCenaId > 0) {
            Cena cenaExecutada = controladorCenas.executarCena(capitulo, proximaCenaId, prota, secundarios);

            if (cenaExecutada != null) {
                ultimaCenaExecutada = cenaExecutada.getId();
                if (cenaExecutada.getIdProximacena() != null) {
                    proximaCenaId = cenaExecutada.getIdProximacena();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        // Salvamento automático ao concluir o capítulo
        executarSalvamentoAutomatico(capitulo.getIdCapitulo(), ultimaCenaExecutada);
    }

    private void executarSalvamentoAutomatico(int idCapitulo, int idCena) {
        int slotAutomatico = 1;
        SaveGame save = new SaveGame(slotAutomatico, jogo, idCapitulo, idCena, 1);
        boolean sucesso = saveService.salvarJogo(slotAutomatico, save);

        if (sucesso) {
            view.exibirTexto("\n[💾 Salvamento Automático]: Fim do Capítulo " + idCapitulo + " salvo no Slot " + slotAutomatico + "!");
        }
    }
}