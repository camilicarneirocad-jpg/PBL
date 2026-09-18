import java.util.List;

public class ControladorDialogos {
    private ServiceDialogo service;
    private JogoView view;
    private Jogo jogo;
    private Cena cena;

    public ControladorDialogos(Cena cena, JogoView view, Jogo jogo) {
        this.cena = cena;
        this.view = view;
        this.jogo = jogo;
    }

    Fala falaInicial=cena.idPrimeiraFala;

    private int decidirProximaFalaDinamica(Fala falaAtual) {
        if()
    }

    public void iniciar(Fala falaInicial) {
        this.service = new ServiceDialogo(cena, falaInicial, view);
        Fala falaAtual = falaInicial;
        while (falaAtual != null) {
            if (falaAtual.getENarrativa() == 1) {
                falaAtual = service.passarFalas(falaAtual);
            } else {
                falaAtual = service.passarDialogo(falaAtual, jogo);
            }

        }
    }

