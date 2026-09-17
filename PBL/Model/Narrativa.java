package Model;

public class Narrativa extends Fala {
    private int idProximaFala;

    public Narrativa(int id, String texto, int idProximaFala) {
        super(id, texto);
        this.idProximaFala = idProximaFala;
    }

    public int getIdProximaFala() { return idProximaFala; }
}