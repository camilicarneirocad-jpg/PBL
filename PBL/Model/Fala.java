public abstract class Fala {
    private int id;
    private String texto;
    private String nomePersonagem;
    private Secundario solteiraAlvo;

    public Fala(int id, String texto, String nomePersonagem, Secundario solteiraAlvo) {
        this.id = id;
        this.texto = texto;
        this.nomePersonagem = nomePersonagem;
        this.solteiraAlvo = solteiraAlvo;
    }

    public int getId() { return id; }
    public String getTexto() { return texto; }
    public String getNomePersonagem() { return nomePersonagem; }
    public Secundario getSolteiraAlvo() { return solteiraAlvo; }
}