
public class Secundario extends Personagem {
    private int afinidade;
    private int exigencia;


    public Protagonista(int afinidade, int exigencia) {
        this.afinidade = afinidade;
        this.exigencia = exigencia;
    }
    

    public int getafinidade() {
        return afinidade;
    }
    public int getexigencia() {
        return exigencia;
    }

    public void setexigencia(int exigencia) {
        this.exigencia = exigencia;
    }
    public void setiafinidade(int idElenco){
        this.afinidade=40;
    }

    public void incrementarafinidade(int qtd){
        this.afinidade=this.antipatia+qtd;
    }

        public void decrementarafinidade(int qtd){
        this.afinidade=this.antipatia-qtd;
    }

    public void falar(Dialogo.getfalaEscolhida()){
        System.out.println(Dialogo.getfalaEscolhida());
    }


}