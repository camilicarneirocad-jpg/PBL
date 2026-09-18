package Model;

public class Protagonista extends Personagem {
    private int opcaoEscolhida;
    private int antipatia;
    private int idRoupa;
    private int idElenco;


    public Protagonista(String nome, int id, int afinidade, int opcaoEscolhida, int idRoupa, int idElenco) {
        super(nome, id, afinidade);
        this.opcaoEscolhida = opcaoEscolhida;
        this.idRoupa = idRoupa;
        this.idElenco = idElenco;
        this.antipatia = 0;
    }


    public int getAntipatia() { return antipatia; }
    public int getOpcaoEscolhida() { return opcaoEscolhida; }
    public int getIdRoupa() { return idRoupa; }
    public int getIdElenco() { return idElenco; }


    public void setIdRoupa(int idRoupa) { this.idRoupa = idRoupa; }
    public void setIdElenco(int idElenco) { this.idElenco = idElenco; }
    public void setOpcaoEscolhida(int opcaoEscolhida) { this.opcaoEscolhida = opcaoEscolhida; }

    public void incrementarAntipatia(int qtd) {
        this.antipatia += qtd;
    }



}