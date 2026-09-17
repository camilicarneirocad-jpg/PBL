package Model;

import java.util.List;

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

    public int getId() { return id; }
    public String getImagemCenario() { return imagemCenario; }
    public String getTrilhaSonora() { return trilhaSonora; }
    public int getIdPrimeiraFala() { return idPrimeiraFala; }
    public List<Fala> getFalas() { return falas; }

    public void setFalas(List<Fala> falas) { this.falas = falas; }
}