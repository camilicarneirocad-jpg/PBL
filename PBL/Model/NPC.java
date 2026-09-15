
public class NPC extends Personagem {
    private String funcao;


    public Protagonista(String funcao) {
        this.funcao = funcao;
    }
    

    public String getfuncao() {
        return funcao;
    }

    public void setfuncao(String funcao) {
        this.funcao = funcao;
    }
   
    public void falar(Dialogo.getfalaEscolhida()){
        System.out.println(Dialogo.getfalaEscolhida());
    }


}