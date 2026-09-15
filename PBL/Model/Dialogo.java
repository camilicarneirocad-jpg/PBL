import java.util.Map;

public class Dialogo extends Fala {
    private Map<Integer, String> opcoes;
    private Map<Integer, Integer> destinos;
    private Map<Integer, String> respostasCurtas;
    private Map<Secundario, Map<Integer, Integer>> pontosPorPersonagem;
    private int piorOpcao;

    public Dialogo(int id, String texto, String nomePersonagem, Secundario solteiraAlvo,
                   Map<Integer, String> opcoes, 
                   Map<Integer, Integer> destinos, 
                   Map<Integer, String> respostasCurtas, 
                   Map<Secundario, Map<Integer, Integer>> pontosPorPersonagem,
                   int piorOpcao) {
        super(id, texto, nomePersonagem, solteiraAlvo);
        this.opcoes = opcoes;
        this.destinos = destinos;
        this.respostasCurtas = respostasCurtas;
        this.pontosPorPersonagem = pontosPorPersonagem;
        this.piorOpcao = piorOpcao;
    }

    public Map<Integer, String> getOpcoes() { 
        return opcoes; 
    }

    public Map<Integer, Integer> getDestinos() { 
        return destinos; 
    }

    public String getRespostaCurta(int escolha) { 
        return respostasCurtas.get(escolha); 
    }

    public Map<Secundario, Map<Integer, Integer>> getPontosPorPersonagem() { 
        return pontosPorPersonagem; 
    }

    public int getPiorOpcao() { 
        return piorOpcao; 
    }
}