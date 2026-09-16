public class ControladorMenu {
    private Menu menu;
    private MenuView view;
    private JogoService = service;
    private JogoView= jview;
    private boolean rodando;

    public ControladorMenu(Menu menu, MenuView view) {
        this.menu = menu;
        this.view = view;
        this.rodando = true;
    }

    public void iniciar() {
        while (rodando) {
            view.exibirMenu(menu);
            int escolha = view.lerOpcao(menu);

            switch (escolha) {
                case 1:
                    service.iniciarNovoJogo();
                    break;
                case 2:
                    jview.mostrarCreditos();
                    break;
                case 3:
                    System.out.println("Encerrando o jogo");
                    rodando = false; 
                    break;
            }
        }
    }