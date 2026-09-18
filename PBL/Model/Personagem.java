package Model;

public class Personagem {

    private String nome;
    private int id;
    private int afinidade;

    public Personagem() {

    }
    public Personagem(String nome, int id, int afinidade) {
        this.nome = nome;
        this.id = id;
        this.afinidade = afinidade;
    }
    
    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }
    public int getAfinidade() { return afinidade; }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setid(int id) {
        this.id= id;
    }

    public void setAfinidade(int afinidade) { this.afinidade = afinidade; }
}