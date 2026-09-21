import java.util.List;

public class Cena {
    private int id;
    private String imagemCenario;
    private String trilhaSonora;
    private int idPrimeiraFala;
    private int idUltimaaFala;
    private Integer idProximacena;
    private List<Fala> falas;
    //private List<Secundario> participantes;
    private boolean cenaFinalizada;

    public Cena(int id, String imagemCenario, String trilhaSonora, List<Fala> falas, Integer idProximacena) {
        this.id = id;
        this.imagemCenario = imagemCenario;
        this.trilhaSonora = trilhaSonora;
        this.falas = falas;
        this.idProximacena = idProximacena;
    }

    public Cena(int id, String imagemCenario, String trilhaSonora, List<Fala> falas) {
        this.id = id;
        this.imagemCenario = imagemCenario;
        this.trilhaSonora = trilhaSonora;
        this.falas = falas;
    }

    public int getId() {
        return id;
    }

    public String getImagemCenario() {
        return imagemCenario;
    }

    public String getTrilhaSonora() {
        return trilhaSonora;
    }

    public int getIdPrimeiraFala() {
        return idPrimeiraFala;
    }

    public int getIdUltimaaFala() {
        return idUltimaaFala;
    }

    public Integer getIdProximacena() {
        return idProximacena;
    }

    public List<Fala> getFalas() {
        return falas;
    }

 

    public boolean isCenaFinalizada() {
        return cenaFinalizada;
    }

    public void setIdPrimeiraFala(int idPrimeiraFala) {
        this.idPrimeiraFala = idPrimeiraFala;
    }

    public void setIdUltimaaFala(int idUltimaaFala) {
        this.idUltimaaFala = idUltimaaFala;
    }

    public void setIdProximacena(Integer idProximacena) {
        this.idProximacena = idProximacena;
    }

    public void setFalas(List<Fala> falas) {
        this.falas = falas;
    }

    public void setCenaFinalizada(boolean cenaFinalizada) {
        this.cenaFinalizada = cenaFinalizada;
    }
}