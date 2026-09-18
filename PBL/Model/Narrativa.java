package Model;

public class Narrativa extends Fala {
    private int idProximaFala;

    public Narrativa(int id, String texto, int idProximaFala) {
        super(id, texto);
        this.idProximaFala = idProximaFala;
    }

    public Narrativa(int id, String texto, String nomePersonagem, Secundario solteiraAlvo) {
        super(id, texto, nomePersonagem, solteiraAlvo);
    }

    public int getIdProximaFala() { return idProximaFala; }
}