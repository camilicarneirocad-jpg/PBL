import java.util.List;

public class ControladorCenas {
    private ServiceCena serviceCena;
    private JogoView view;
    private Jogo jogo;

    public ControladorCenas(JogoView view, Jogo jogo) {
        this.view = view;
        this.jogo = jogo;
        this.serviceCena = new ServiceCena();
    }

    public ServiceCena getServiceCena() {
        return serviceCena;
    }

    public void executarCena(Capitulo capitulo, int idCenaAlvo, Protagonista prota, List<Secundario> secundarios) {
        Cena cenaAtual = serviceCena.passarCenas(capitulo, idCenaAlvo);
        
        if (cenaAtual != null && cenaAtual.getFalas() != null && !cenaAtual.getFalas().isEmpty()) {
            Fala primeiraFala = cenaAtual.getFalas().get(0);
            
            ControladorDialogos controladorDialogos = new ControladorDialogos(view, jogo, cenaAtual);
            controladorDialogos.iniciar(primeiraFala);
        }
    }
}