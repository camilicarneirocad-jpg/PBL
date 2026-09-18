package Model;

public abstract class Fala {
    private int idFala;
    private String texto;
    private String nomePersonagem;
    private Secundario solteiraAlvo;
    private int idFalaAtual;
    private boolean eNarrativa;

    public Fala(int idFala, String texto) {
        this.idFala = idFala;
        this.texto = texto;
        this.eNarrativa = true;
    }

    public Fala(int idFala, String texto, String nomePersonagem, Secundario solteiraAlvo) {
        this.idFala = idFala;
        this.texto = texto;
        this.nomePersonagem = nomePersonagem;
        this.solteiraAlvo = solteiraAlvo;
        this.eNarrativa = false;
    }

    public Fala(int idFala, String texto, String nomePersonagem, Secundario solteiraAlvo, int idFalaAtual, boolean eNarrativa) {
        this.idFala = idFala;
        this.texto = texto;
        this.nomePersonagem = nomePersonagem;
        this.solteiraAlvo = solteiraAlvo;
        this.idFalaAtual = idFalaAtual;
        this.eNarrativa = eNarrativa;
    }

    public int getId() { return idFala; }
    public int getIdFala() { return idFala; }
    public int getIdProximaFala() { return idFala + 1; }
    public String getTexto() { return texto; }
    public String getNomePersonagem() { return nomePersonagem; }
    public Secundario getSolteiraAlvo() { return solteiraAlvo; }
    public int getIdFalaAtual() { return idFalaAtual; }
    public boolean isENarrativa() { return eNarrativa; }
}