import java.util.List;

public class ControladorCapitulos {
    private ServiceCapitulo serviceCapitulo;
    private ControladorCenas controladorCenas;
    private JogoView view;
    private Jogo jogo;

    public ControladorCapitulos(JogoView view, Jogo jogo, ControladorCenas controladorCenas) {
        this.view = view;
        this.jogo = jogo;
        this.serviceCapitulo = new ServiceCapitulo();
        this.controladorCenas = controladorCenas;
    }

    public void iniciarCapitulo(Capitulo capitulo, Protagonista prota, List<Secundario> secundarios) {
        view.exibirTexto(" CAPÍTULO " + capitulo.getIdCapitulo() + ": " + capitulo.getTitulo());
  
        serviceCapitulo.definirPrimeiraCena(capitulo, prota, secundarios, controladorCenas.getServiceCena());
        
        int idPrimeiraCena = capitulo.getIdPrimeiraCena();
        
        controladorCenas.executarCena(capitulo, idPrimeiraCena, prota, secundarios);
    }
}