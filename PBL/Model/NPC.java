package Model;

import java.io.Serializable;

public class NPC extends Personagem implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nomeNPC;

    public NPC(String nome, int id) {
        super(nome, id);
        this.nomeNPC = nome;
    }

    public String getNomeNPC() {
        return nomeNPC;
    }

    public void setNomeNPC(String nomeNPC) {
        this.nomeNPC = nomeNPC;
    }
}