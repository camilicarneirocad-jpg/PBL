package Model;

import java.util.List;

public class Capitulo {
    private int idCapitulo;
    private String titulo;
    private int idPrimeiraFala;
    private int idUltimaFala;
    private boolean finalizado;
    private List<Cena> cenas;

    public Capitulo(int idCapitulo, String titulo, int idPrimeiraFala, int idUltimaFala, List<Cena> cenas) {
        this.idCapitulo = idCapitulo;
        this.titulo = titulo;
        this.idPrimeiraFala = idPrimeiraFala;
        this.idUltimaFala = idUltimaFala;
        this.cenas = cenas;
        this.finalizado = false;
    }

    public int getIdCapitulo() { return idCapitulo; }
    public String getTitulo() { return titulo; }
    public int getIdPrimeiraFala() { return idPrimeiraFala; }
    public int getIdUltimaFala() { return idUltimaFala; }
    public boolean isFinalizado() { return finalizado; }
    public List<Cena> getCenas() { return cenas; }

    public void setFinalizado(boolean finalizado) { this.finalizado = finalizado; }
    public void setCenas(List<Cena> cenas) { this.cenas = cenas; }
}
