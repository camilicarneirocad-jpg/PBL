package Model;

public class NPC extends Personagem {
    private String funcao;


    public NPC(String nome, int id, int afinidade, String funcao) {
        super(nome, id, afinidade);
        this.funcao = funcao;
    }

    public String getFuncao() { return funcao; }
    public void setFuncao(String funcao) { this.funcao = funcao; }

}