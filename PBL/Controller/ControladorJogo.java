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
        this.controladorCapitulos = new ControladorCapitulos(view, controladorCenas);
    }

    public void iniciarFluxoPrincipal() {
        jogoService.iniciarNovoJogo();
        
        if (jogo.getCapitulos() != null && !jogo.getCapitulos().isEmpty()) {
            // Se quiser rodar todos os capítulos em sequência até o final:
            for (Capitulo capitulo : jogo.getCapitulos()) {
                controladorCapitulos.iniciarCapitulo(capitulo, jogo.getProta(), jogo.getSecundarios());
            }
        }
        
        view.exibirTexto("\nFim de jogo!");
    }
}