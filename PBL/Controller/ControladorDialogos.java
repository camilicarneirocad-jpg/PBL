public class ControladorDialogos {
    private ServiceDialogo service;
    private JogoView view;
    private Jogo jogo;
    private Cena cena;

    public ControladorDialogos(JogoView view, Jogo jogo, Cena cena) {
        this.view = view;
        this.jogo = jogo;
        this.cena = cena;
    }

    public void iniciar(Fala falaInicial) {
        if (falaInicial == null) return;
        
        this.service = new ServiceDialogo(cena, falaInicial, view, jogo);
        Fala falaAtual = falaInicial;
        
        while (falaAtual != null) {
            if (falaAtual.isNarrativa()) {
                falaAtual = service.passarFalas(falaAtual);
            } else {
                view.exibirTexto(falaAtual.getTexto());
                int escolhaDoUsuario = view.receberOpcaoNumerica();
                
                service.processarInfo(escolhaDoUsuario, falaAtual, jogo.getProta());
                
                falaAtual = service.passarFalas(falaAtual);
            }
        }
    }
}