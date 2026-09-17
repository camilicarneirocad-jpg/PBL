package Model;

import java.util.Map;

public class Opcoes{
    private int id;
    private String nome;
    private String respostaCurta;
    private Map<Personagem, Integer> impactos;
    private int idExpressao;

    public Opcoes(int id, String nome, String respostaCurta, Map<Personagem, Integer> impactos, int idExpressao) {
        this.id = id;
        this.nome = nome;
        this.respostaCurta = respostaCurta;
        this.impactos = impactos;
        this.idExpressao = idExpressao;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getRespostaCurta() { return respostaCurta; }
    public Map<Personagem, Integer> getImpactos() { return impactos; }
    public int getIdExpressao() { return idExpressao; }
}