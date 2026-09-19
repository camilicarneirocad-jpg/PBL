public class Protagonista extends Personagem {
    private int genero;
    private int antipatia;
    private int idRoupa;

    public Protagonista(String nome, int id, int genero, int antipatia, int idRoupa) {
        super(nome, id);
        this.genero = genero;
        this.antipatia = antipatia;
        this.idRoupa = idRoupa;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getAntipatia() {
        return antipatia;
    }

    public void setAntipatia(int antipatia) {
        this.antipatia = antipatia;
    }

    public void incrementarAntipatia(int qtd) {
        this.antipatia = this.antipatia + qtd;
    }

    public int getIdRoupa() {
        return idRoupa;
    }

    public void setIdRoupa(int idRoupa) {
        this.idRoupa = idRoupa;
    }
}