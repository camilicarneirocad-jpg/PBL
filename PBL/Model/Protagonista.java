
public class Protagonista extends Personagem {
    private int opcaoEscolhida;
    private int antipatia;
    private int idRoupa;
    private int idElenco;


    public Protagonista(int opcaoEscolhida,int idRoupa,int idElenco) {
        this.opcaoEscolhida = opcaoEscolhida;
        this.idRoupa = idRoupa;
        this.idElenco= idElenco;
        this.antipatia=0;
    }
    

    public int getaintipatia() {
        return nome;
    }
    public int getopcaoEscolhida() {
        return opcaoEscolhida;
    }
    public int getidRoupa() {
        return idRoupa;
    }
    public int getidElenco() {
        return idElenco;
    }

    public void setidRoupa(int idRoupa) {
        this.idRoupa = idRoupa;
    }
    public void setidElenco(int idElenco){
        this.idElenco = idElenco;
    }
    public void setopcaoEscolhida(int opcaoEscolhida){
        this.opcaoEscolhida = opcaoEscolhida;
    }
    public void incrementarAntipatia(int qtd){
        this.antipatia=this.antipatia+qtd;
    }



}