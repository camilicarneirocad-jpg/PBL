package Controller;

import Model.*;
import Service.SaveService;
import Service.ServiceCena;
import Service.ServiceDialogo;
import View.JogoView;

public class ControladorDialogos {
    private JogoView view;
    private Jogo jogo;
    private Cena cena;
    private ServiceDialogo service;
    private Capitulo capituloAtual;
    private ServiceCena serviceCena;

    public ControladorDialogos(JogoView view, Jogo jogo, Cena cena, Capitulo capituloAtual) {
        this.view = view;
        this.jogo = jogo;
        this.cena = cena;
        this.service = new ServiceDialogo(cena, view, jogo);
        this.capituloAtual = capituloAtual;
        this.serviceCena = new ServiceCena(jogo);
    }

    public void iniciar(Fala falaInicial) {
        if (falaInicial == null) return;

        Fala falaAtual = falaInicial;

        while (falaAtual != null) {

            if (this.capituloAtual != null) {
                Secundario maiorAfinidade = serviceCena.verificarMaiorAfinidade(jogo.getSecundarios());
                service.verificarProxDialogo(this.capituloAtual, cena.getId(), falaAtual.getIdFala(), maiorAfinidade);
            }

            if (falaAtual.isNarrativa()) {
                falaAtual = service.passarFalas(falaAtual, this.capituloAtual);
            } else {
                view.exibirFala(falaAtual.getTexto(), falaAtual.getNomePersonagem());

                if (falaAtual instanceof Model.Dialogo) { // Usar Model.Dialogo ou apenas Dialogo com o import correto
                    Model.Dialogo dialogo = (Model.Dialogo) falaAtual;
                    if (dialogo.getOpcoes() != null) {
                        view.exibirTexto("\n[0] ⏸️ Pausar / Menu de Pausa");
                        for (Opcoes op : dialogo.getOpcoes()) {
                            view.exibirTexto("[" + op.getId() + "] " + op.getNome());
                        }
                    }
                }

                int escolhaDoUsuario = view.receberOpcaoNumerica();

                // Tratamento da tecla de pausa (0)
                if (escolhaDoUsuario == 0) {
                    int acaoPausa = view.exibirMenuPausa();
                    if (acaoPausa == 1) { // Salvar Manual
                        int slotEscolhido = view.escolherSlot();
                        if (slotEscolhido >= 1 && slotEscolhido <= 3) {
                            SaveGame save = new SaveGame(slotEscolhido, jogo, this.capituloAtual.getIdCapitulo(), cena.getId(), falaAtual.getIdFala());
                            SaveService saveService = new SaveService();
                            if (saveService.salvarJogo(slotEscolhido, save)) {
                                view.exibirTexto("✅ Jogo salvo com sucesso no Slot " + slotEscolhido + "!");
                            } else {
                                view.exibirTexto("❌ Erro ao salvar o jogo.");
                            }
                        }
                    } else if (acaoPausa == 3) {
                        throw new SairParaMenuException();
                    }
                    continue;
                }

                if (falaAtual instanceof Model.Dialogo) {
                    Model.Dialogo diag = (Model.Dialogo) falaAtual;
                    Opcoes escolhida = service.buscarOpcao(diag, escolhaDoUsuario);
                    if (escolhida != null && escolhida.getRespostaCurta() != null
                            && !escolhida.getRespostaCurta().isBlank()) {
                        view.exibirFala(escolhida.getRespostaCurta(), falaAtual.getNomePersonagem());
                    }
                }

                service.processarInfo(escolhaDoUsuario, falaAtual, jogo.getProta());

                falaAtual = service.obterProximaFala(falaAtual);
            }
        }
    }
}