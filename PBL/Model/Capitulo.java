import java.util.List;

public class Capitulo {
    private int idCapitulo;
    private String titulo;
    private int idPrimeiraFala;
    private int numeroCenas;
    private List<Cena> cenas;

    public Capitulo(int idCapitulo, String titulo, int idPrimeiraFala, int numeroCenas, List<Cena> cenas) {
        this.idCapitulo = idCapitulo;
        this.titulo = titulo;
        this.idPrimeiraFala = idPrimeiraFala;
        this.numeroCenas = numeroCenas;
        this.cenas = cenas;
    }

    // para deixar o nome correto
    public int getIdPrimeiraCena() {
        return this.idPrimeiraFala; 
    }

    public int getIdCapitulo() {
        return idCapitulo;
    }

    public void setIdCapitulo(int idCapitulo) {
        this.idCapitulo = idCapitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdPrimeiraFala() {
        return idPrimeiraFala;
    }

    public void setIdPrimeiraFala(int idPrimeiraFala) {
        this.idPrimeiraFala = idPrimeiraFala;
    }

    public int getNumeroCenas() {
        return numeroCenas;
    }

    public void setNumeroCenas(int numeroCenas) {
        this.numeroCenas = numeroCenas;
    }

    public List<Cena> getCenas() {
        return cenas;
    }

    public void setCenas(List<Cena> cenas) {
        this.cenas = cenas;
    }
}