package Model;
import java.io.Serializable;
import java.util.List;

public class Dialogo extends Fala implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Opcoes> opcoes;
    private int piorOpcao;

 
    public Dialogo(
            int idFala,
            String texto,
            String nomePersonagem,
            Secundario solteiraAlvo,
            int idProximaFala,
            boolean eNarrativa,
            List<Opcoes> opcoes,
            int piorOpcao
    ) {
        super(idFala, texto, nomePersonagem, solteiraAlvo, eNarrativa, idProximaFala);
        this.opcoes = opcoes;
        this.piorOpcao = piorOpcao;
    }

    public Dialogo(
            int idFala,
            String texto,
            String nomePersonagem,
            Secundario solteiraAlvo,
            boolean eNarrativa,
            List<Opcoes> opcoes,
            int piorOpcao
    ) {
        super(idFala, texto, nomePersonagem, solteiraAlvo, eNarrativa);
        this.opcoes = opcoes;
        this.piorOpcao = piorOpcao;
    }

    public List<Opcoes> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<Opcoes> opcoes) {
        this.opcoes = opcoes;
    }

    public int getPiorOpcao() {
        return piorOpcao;
    }

    public void setPiorOpcao(int piorOpcao) {
        this.piorOpcao = piorOpcao;
    }
}