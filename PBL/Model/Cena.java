public class Cena {
    private int id;
    private String imagemCenario;
    private String trilhaSonora;
    private int idPrimeiraFala;
    private int idUltimaaFala;
    private int idProximacena;
    private List<Fala> falas;
    private List<Secundario> participantes;
    private boolean cenaFinalizada;

    public Cena(int id, String imagemCenario, String trilhaSonora, int idUltimaFala,List<Fala> falas) {
        this.id = id;
        this.imagemCenario = imagemCenario;
        this.trilhaSonora = trilhaSonora;
        this.idPrimeiraFala = idPrimeiraFala;
        this.falas = falas;
    }
    public int getfalas() { return falas; }
    public int setidProximacena(int idProximacena ){
        this.idProximacena=idProximacena;
    }
}