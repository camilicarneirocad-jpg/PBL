public class ControladorMenu {
    private Menu menu;
    private MenuView view;
    private JogoService service;
    private JogoView jview;
    private ControladorJogo controladorJogo;
    private boolean rodando;

    public ControladorMenu(Menu menu, MenuView view, JogoService service, JogoView jview, ControladorJogo controladorJogo) {
        this.menu = menu;
        this.view = view;
        this.service = service;
        this.jview = jview;
        this.controladorJogo = controladorJogo;
        this.rodando = true;
    }

    public void iniciar() {
        while (rodando) {
            view.exibirMenu(menu);
            int escolha = view.lerOpcao(menu);

            switch (escolha) {
                case 1:
                    controladorJogo.iniciarFluxoPrincipal();
                    break;
                case 2:
                    service.exibirCreditos();
                    break;
                case 3:
                    service.exibirInstrucoes();
                    break;
                case 4:
                    System.out.println("Encerrando o jogo");
                    rodando = false; 
                    break;
            }
        }
    }
}