package Model;

import java.io.Serializable;

public class Secundario extends Personagem implements Serializable {
    private static final long serialVersionUID = 1L;

    private int afinidade;
    private int exigencia;

    public Secundario(String nome, int id, int afinidade, int exigencia) {
        super(nome, id);
        this.afinidade = afinidade;
        this.exigencia = exigencia;
    }

    public int getAfinidade() {
        return afinidade;
    }

    public int getExigencia() {
        return exigencia;
    }

    public void setExigencia(int exigencia) {
        this.exigencia = exigencia;
    }

    public void setAfinidade(int afinidade) {
        this.afinidade = afinidade;
    }
}