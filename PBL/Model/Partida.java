import java.util.List;

public class Partida {
    private int idPartida;
    private Protagonista prota;
    private List<Secundario> secundarios;
    private List<NPC> npc;
    private Capitulo finalCapitulo;

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public Protagonista getProta() {
        return prota;
    }

    public void setProta(Protagonista prota) {
        this.prota = prota;
    }

    public List<Secundario> getSecundarios() {
        return secundarios;
    }

    public void setSecundarios(List<Secundario> secundarios) {
        this.secundarios = secundarios;
    }

    public List<NPC> getNpc() {
        return npc;
    }

    public void setNpc(List<NPC> npc) {
        this.npc = npc;
    }

    public Capitulo getFinalCapitulo() {
        return finalCapitulo;
    }

    public void setFinalCapitulo(Capitulo finalCapitulo) {
        this.finalCapitulo = finalCapitulo;
    }
}