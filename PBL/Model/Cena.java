public class Cena {
    private int id;
    private String imagemCenario;
    private String trilhaSonora;
    private int idPrimeiraFala;
    private List<Fala> falas;

    public Cena(int id, String imagemCenario, String trilhaSonora, int idPrimeiraFala,List<Fala> falas) {
        this.id = id;
        this.imagemCenario = imagemCenario;
        this.trilhaSonora = trilhaSonora;
        this.idPrimeiraFala = idPrimeiraFala;
        this.falas = falas;
    }
    public int getfalas() { return falas; }
    public int falas(List<Cena> falas) { 
        this.falas = falas; 
        }
}