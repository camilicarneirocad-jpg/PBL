package Repository;

import Model.Protagonista;
import Model.Secundario;

import java.util.List;

public class Partida{
    private int idPartida;
    private int idCapituloAtual;
    private int idElenco;
    private boolean finalizada;
    private Protagonista prota;
    private List<Secundario> secundarios;

    public Partida() {
    }

    public Partida(int idPartida, int idCapituloAtual, int idElenco, Protagonista prota, List<Secundario> secundarios) {
        this.idPartida = idPartida;
        this.idCapituloAtual = idCapituloAtual;
        this.idElenco = idElenco;
        this.prota = prota;
        this.secundarios = secundarios;
        this.finalizada = false;
    }

    public int getidPartida() {
        return idPartida;
    }
    public void setidPartida(int idPartida) {this.idPartida = idPartida;}

    public int getIdCapituloAtual() {
        return idCapituloAtual;
    }
    public void setIdCapituloAtual(int idCapituloAtual) {
        this.idCapituloAtual = idCapituloAtual;
    }

    public int getIdElenco() {
        return idElenco;
    }
    public void setIdElenco(int idElenco) {
        this.idElenco = idElenco;
    }

    public boolean isFinalizada() {
        return finalizada;
    }
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
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

    public void proximoCapitulo(int idProximoCapitulo) {
        this.idCapituloAtual = idProximoCapitulo;
    }
    public void finalizarPartida() {
        this.finalizada = true;
    }
}
