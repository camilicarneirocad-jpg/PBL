public class Cena{
    private int idCena;
    private int idDialogoAtual;
    private boolean cenaFinalizada;

    public int getidCena() {
        return idCapitulo;
    }

    public int getidDialogoAtual() {
        return idDialogoAtual;
    }

    public void proximoDialogo (int idDialogoAtual, int idProximoDialogo) {
        this.idDialogoAtual=idProximoDialogo;
    }

    public void finalizarCena(boolean cenaFinalizada, int idCena, int idProximaCena){
        this.cenaFinalizada = true;
        if (this.idCena!=0){
            this.idCena=idProximaCena;
        }
    }
}
