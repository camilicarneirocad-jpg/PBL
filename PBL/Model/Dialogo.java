package Model;

import java.util.List;
import java.util.Map;

public class Dialogo extends Fala {
    private List<Opcoes> opcoes;
    private Map<Integer, String> respostasCurtas;
    private Map<Secundario, Map<Integer, Integer>> pontosPorPersonagem;
    private Map<Integer, Integer> destinos;
    private int piorOpcao;

    public Dialogo(int id, String texto, String nomePersonagem, Secundario solteiraAlvo,
                   List<Opcoes> opcoes,
                   Map<Integer, String> respostasCurtas, 
                   Map<Secundario, Map<Integer, Integer>> pontosPorPersonagem,
                   int piorOpcao) {
        super(id, texto, nomePersonagem, solteiraAlvo);
        this.opcoes = opcoes;
        this.respostasCurtas = respostasCurtas;
        this.pontosPorPersonagem = pontosPorPersonagem;
        this.piorOpcao = piorOpcao;
    }

    public List<Opcoes> getOpcoes() { return opcoes; }
    public Map<Integer, Integer> getDestinos() { return destinos; }
    public String getRespostaCurta(int escolha) { return respostasCurtas.get(escolha); }
    public Map<Secundario, Map<Integer, Integer>> getPontosPorPersonagem() { return pontosPorPersonagem; }
    public int getPiorOpcao() { return piorOpcao; }

    public void setDestinos(Map<Integer, Integer> destinos) {
        this.destinos = destinos;
    }
}