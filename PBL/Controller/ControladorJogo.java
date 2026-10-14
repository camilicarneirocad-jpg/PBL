package Controller;

import Model.Capitulo;
import Model.Jogo;
import Service.JogoService;
import View.JogoView;

public class ControladorJogo {
    private Jogo jogo;
    private JogoView view;
    private JogoService jogoService;
    private ControladorCenas controladorCenas;
    private ControladorCapitulos controladorCapitulos;

    public ControladorJogo(Jogo jogo, JogoView view) {
        this.jogo = jogo;
        this.view = view;
        this.jogoService = new JogoService(jogo, view);
        this.controladorCenas = new ControladorCenas(view, jogo);
        this.controladorCapitulos = new ControladorCapitulos(view, controladorCenas, jogo);
    }

    public void iniciarFluxoPrincipal() {
        jogoService.iniciarNovoJogo();
        executarCapitulos();
    }

    public void retomarPartida(Jogo jogoCarregado) {
        this.jogo = jogoCarregado;
        this.controladorCenas = new ControladorCenas(view, this.jogo);
        this.controladorCapitulos = new ControladorCapitulos(view, this.controladorCenas, this.jogo);
        view.exibirTexto("\nPartida retomada com sucesso!");
        executarCapitulos();
    }

    private void executarCapitulos() {
        try {
            if (jogo.getCapitulos() != null && !jogo.getCapitulos().isEmpty()) {
                for (Capitulo capitulo : jogo.getCapitulos()) {
                    controladorCapitulos.iniciarCapitulo(capitulo, jogo.getProta(), jogo.getSecundarios());
                }
            }
            view.exibirTexto("\nFim de jogo!");
        } catch (SairParaMenuException e) {
            view.exibirTexto("\nVoltando ao Menu Principal...");
        }
    }
}