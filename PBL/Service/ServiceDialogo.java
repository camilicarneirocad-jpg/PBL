package Service;

import Model.Cena;
import Model.Dialogo;
import Model.Fala;
import Model.Opcoes;
import Model.Personagem;
import Model.Jogo;
import View.JogoView;

import java.util.List;

public class ServiceDialogo {
    private Cena cena;
    private List<Fala> falas;
    private Fala falaAtual;
    private JogoView view;

    public ServiceDialogo(Cena cena, Fala falaAtual, JogoView view) {
        this.cena = cena;
        this.falaAtual = falaAtual;
        this.falas = (cena != null) ? cena.getFalas() : null;
        this.view = view;
    }

    public Fala passarFalas(Fala falaAtual) {
        if (falaAtual == null) return null;

        view.exibirFala(falaAtual.getTexto(), falaAtual.getNomePersonagem());
        view.receberEnter();

        int idProxima = falaAtual.getIdProximaFala();
        if (falas != null) {
            for (Fala fala : falas) {
                if (fala.getIdFala() == idProxima) {
                    return fala;
                }
            }
        }
        return null;
    }

    public void processarInfo(int escolha, Fala falaAtual, Jogo jogo) {
        if (!(falaAtual instanceof Dialogo) || jogo == null) return;

        Dialogo dialogo = (Dialogo) falaAtual;
        if (dialogo.getOpcoesObjetos() == null) return;

        for (Personagem personagem : jogo.getSecundarios()) {
            for (Opcoes op : dialogo.getOpcoesObjetos()) {
                if (op.getId() == escolha) {
                    Integer impacto = op.getImpactos().get(personagem.getNome());
                    if (impacto != null) {
                        personagem.setAfinidade(personagem.getAfinidade() + impacto);
                    }
                }
            }
        }
    }

    public Fala passarDialogo(Fala falaAtual, Jogo jogo) {
        if (falaAtual == null) return null;

        view.exibirFala(falaAtual.getTexto(), falaAtual.getNomePersonagem());

        if (falaAtual instanceof Dialogo) {
            Dialogo dialogo = (Dialogo) falaAtual;
            if (dialogo.getOpcoesObjetos() != null) {
                for (Opcoes op : dialogo.getOpcoesObjetos()) {
                    String opcaoTexto = op.getId() + " - " + op.getTexto();
                    view.exibirTexto(opcaoTexto);
                }
            }

            int escolha = view.receberOpcaoNumerica();
            processarInfo(escolha, falaAtual, jogo);
        }

        int idProxima = falaAtual.getIdProximaFala();
        if (falas != null) {
            for (Fala fala : falas) {
                if (fala.getIdFala() == idProxima) {
                    return fala;
                }
            }
        }
        return null;
    }
}