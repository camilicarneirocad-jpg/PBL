public class Capitulo{
    private int idCapitulo;
    private int idCenaAtual;
    private boolean finalizado;

    public int getidCapitulo() {
        return idCapitulo;
    }

    public int getidCenaAtual() {
        return idCenaAtual;
    }

    public void proximaCena (int idCenaAtual, int idProximaCena) {
        this.idCenaAtual=idProximaCena;
    }

    public void finalizarCapitulo(boolean finalizado, int idCapitulo, int idProximoCapitulo){
        this.finalizado= true;
        if (this.idCapitulo!=0){
            this.idCapitulo=idProximoCapitulo;
        }
    }
}
