package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Dialogo extends Fala {
    private Map<Integer, String> opcoesMap;
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
        this.opcoesMap = opcoes;
        this.destinos = destinos;
        this.respostasCurtas = respostasCurtas;
        this.pontosPorPersonagem = pontosPorPersonagem;
        this.piorOpcao = piorOpcao;
    }

    public Map<Integer, String> getOpcoesMap() { return opcoesMap; }

    public List<Opcoes> getOpcoes() {
        List<Opcoes> lista = new ArrayList<>();
        if (opcoesMap != null) {
            for (Map.Entry<Integer, String> entry : opcoesMap.entrySet()) {
                lista.add(new Opcoes(entry.getKey(), entry.getValue(), respostasCurtas != null ? respostasCurtas.get(entry.getKey()) : "", null, 0));
            }
        }
        return lista;
    }

    public Map<Integer, Integer> getDestinos() { return destinos; }
    public void setDestinos(Map<Integer, Integer> destinos) { this.destinos = destinos; }
    public String getRespostaCurta(int escolha) { return respostasCurtas != null ? respostasCurtas.get(escolha) : null; }
    public Map<Secundario, Map<Integer, Integer>> getPontosPorPersonagem() { return pontosPorPersonagem; }
    public int getPiorOpcao() { return piorOpcao; }

    public Opcoes[] getOpcoesObjetos() {
        if (this.opcoesMap == null || this.opcoesMap.isEmpty()) {
            return new Opcoes[0];
        }

        Opcoes[] vetorOpcoes = new Opcoes[this.opcoesMap.size()];
        int index = 0;

        for (Map.Entry<Integer, String> entry : this.opcoesMap.entrySet()) {
            String resposta = (this.respostasCurtas != null) ? this.respostasCurtas.get(entry.getKey()) : "";
            vetorOpcoes[index++] = new Opcoes(entry.getKey(), entry.getValue(), resposta, null, 0);
        }

        return vetorOpcoes;
    }
}