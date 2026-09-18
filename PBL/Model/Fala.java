public abstract class Fala {
    private int idFala;
    private boolean eNarrativa;
    private String texto;
    private String nomePersonagem;
    private int idProximaFala;

    public Fala(int id, String texto, String nomePersonagem, Secundario solteiraAlvo, int idFalaAtual,boolean eNarrativa) {
        this.id = id;
        this.texto = texto;
        this.nomePersonagem = nomePersonagem;
        this.solteiraAlvo = solteiraAlvo;
        this.idFalaAtual=0;
        this.eNarrativa=eNarrativa;
    }

    public int getId() { return id; }
    public String getTexto() { return texto; }
    public String getNomePersonagem() { return nomePersonagem; }
    public Secundario getSolteiraAlvo() { return solteiraAlvo; }
    public int geteNArrativa() { return eNArrativa; }

}