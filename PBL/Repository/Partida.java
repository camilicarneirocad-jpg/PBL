public class Partida{
    private int idPartida;
    private int idCapituloAtual;
    private boolean finalizada;

    public int getidPartida() {
        return idPartida;
    }

    public int idCapituloAtual() {
        return idCapituloAtual;
    }

    public void proximoCapitulo(int idCapituloAtual, int idProximoCapitulo) {
        this.idCapituloAtual=idProximoCapitulo;
    }

    public void finalizarpartida(boolean finalizada) {
        this.finalizada= true;
    }
}
