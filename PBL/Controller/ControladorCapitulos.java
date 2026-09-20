import java.util.List;

public class ControladorCapitulos {
    private ServiceCapitulo serviceCapitulo;
    private ControladorCenas controladorCenas;
    private JogoView view;

    public ControladorCapitulos(JogoView view, ControladorCenas controladorCenas) {
        this.view = view;
        this.serviceCapitulo = new ServiceCapitulo();
        this.controladorCenas = controladorCenas;
    }

    public void iniciarCapitulo(Capitulo capitulo, Protagonista prota, List<Secundario> secundarios) {
        view.exibirTexto("\n========================================");
        view.exibirTexto("CAPÍTULO " + capitulo.getIdCapitulo() + ": " + capitulo.getTitulo());
        view.exibirTexto("========================================");
  
        serviceCapitulo.definirPrimeiraCena(capitulo, prota, secundarios, controladorCenas.getServiceCena());
        
        int proximaCenaId = capitulo.getIdPrimeiraCena();
        

        while (proximaCenaId > 0) {
            Cena cenaExecutada = controladorCenas.executarCena(capitulo, proximaCenaId, prota, secundarios);
            
            if (cenaExecutada != null && cenaExecutada.getIdProximacena() != null) {
                proximaCenaId = cenaExecutada.getIdProximacena();
            } else {
                break;
            }
        }
    }
}