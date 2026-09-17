package Model;

public class Personagem {

    private String nome;
    private int id;

    public Personagem() {

    }
    public Personagem(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setid(int id) {
        this.id= id;
    }

}