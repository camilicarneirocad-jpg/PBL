package Model;

import java.io.Serializable;

public class Personagem implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private int id;

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

    public void setId(int id) {
        this.id = id;
    }
}