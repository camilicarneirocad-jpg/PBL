public class Fala {
    private int idFala;
    private boolean eNarrativa;
    private String texto;
    private String nomePersonagem;
    private Secundario solteiraAlvo;
    private Integer idProximaFala;

    public Fala(int idFala, String texto, String nomePersonagem, Secundario solteiraAlvo, boolean eNarrativa, Integer idProximaFala) {
        this.idFala = idFala;
        this.texto = texto;
        this.nomePersonagem = nomePersonagem;
        this.solteiraAlvo = solteiraAlvo;
        this.eNarrativa = eNarrativa;
        this.idProximaFala = idProximaFala;
    }

    public Fala(int idFala, String texto, String nomePersonagem, Secundario solteiraAlvo, boolean eNarrativa) {
        this.idFala = idFala;
        this.texto = texto;
        this.nomePersonagem = nomePersonagem;
        this.solteiraAlvo = solteiraAlvo;
        this.eNarrativa = eNarrativa;
    }

    public int getIdFala() {
        return idFala;
    }

    public boolean isNarrativa() {
        return eNarrativa;
    }

    public String getTexto() {
        return texto;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public Secundario getSolteiraAlvo() {
        return solteiraAlvo;
    }

    public Integer getIdProximaFala() {
        return idProximaFala;
    }

    public void setIdFala(int idFala) {
        this.idFala = idFala;
    }

    public void setNarrativa(boolean eNarrativa) {
        this.eNarrativa = eNarrativa;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public void setSolteiraAlvo(Secundario solteiraAlvo) {
        this.solteiraAlvo = solteiraAlvo;
    }

    public void setIdProximaFala(Integer idProximaFala) {
        this.idProximaFala = idProximaFala;
    }
}