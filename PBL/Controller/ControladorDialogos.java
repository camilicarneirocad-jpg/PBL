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
                view.exibirFala(falaAtual.getTexto(),falaAtual.getNomePersonagem());

                if (falaAtual instanceof Dialogo) {
                    Dialogo dialogo = (Dialogo) falaAtual;
                    if (dialogo.getOpcoes() != null) {
                        for (Opcoes op : dialogo.getOpcoes()) {
                            view.exibirTexto("[" + op.getId() + "] " + op.getNome());
                        }
                    }
                }

                int escolhaDoUsuario = view.receberOpcaoNumerica();


                if (falaAtual instanceof Dialogo) {
                    Opcoes escolhida = service.buscarOpcao((Dialogo) falaAtual, escolhaDoUsuario);
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