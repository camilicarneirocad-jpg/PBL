public class NPC extends Personagem {
    private String nome;


    public NPC(String nome) {
        this.funcao = nome;
    }
    

    public String getfnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }
   


}