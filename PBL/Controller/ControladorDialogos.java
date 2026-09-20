public class ControladorDialogos {
    private JogoView view;
    private Jogo jogo;
    private Cena cena;
    private ServiceDialogo service;
    private Capitulo capituloAtual;

    public ControladorDialogos(JogoView view, Jogo jogo, Cena cena, Capitulo capituloAtual) {
        this.view = view;
        this.jogo = jogo;
        this.cena = cena;
        this.service = new ServiceDialogo(cena, view, jogo);
        this.capituloAtual = capituloAtual;
    }

    public void iniciar(Fala falaInicial) {
        if (falaInicial == null) return;
        
        Fala falaAtual = falaInicial;
        
        while (falaAtual != null) {
            Secundario maiorAfinidade = new ServiceCena().verificarMaiorAfinidade(jogo.getSecundarios());
            
            if (this.capituloAtual != null) {
                service.verificarProxDialogo(this.capituloAtual, cena.getId(), falaAtual.getIdFala(), maiorAfinidade);
            }

            if (falaAtual.isNarrativa()) {
                falaAtual = service.passarFalas(falaAtual);
            } else {
                view.exibirTexto(falaAtual.getTexto());
                
                if (falaAtual instanceof Dialogo) {
                    Dialogo dialogo = (Dialogo) falaAtual;
                    if (dialogo.getOpcoes() != null) {
                        for (Opcoes op : dialogo.getOpcoes()) {
                            view.exibirTexto("[" + op.getId() + "] " + op.getNome());
                        }
                    }
                }
                
                int escolhaDoUsuario = view.receberOpcaoNumerica();
                service.processarInfo(escolhaDoUsuario, falaAtual, jogo.getProta());
                
                falaAtual = service.obterProximaFala(falaAtual);
            }
        }
    }
}