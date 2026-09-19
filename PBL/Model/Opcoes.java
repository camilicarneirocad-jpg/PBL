import java.util.Map;

public class Opcoes {
    private int id;
    private String nome;
    private String respostaCurta;
    private Map<Personagem, Integer> impactos;
    private int idExpressao;
    private int qtdAtipatia;
    private boolean aumentaAntipatia;

    public Opcoes(int id, String nome, String respostaCurta, Map<Personagem, Integer> impactos, int idExpressao, int qtdAtipatia, boolean aumentaAntipatia) {
        this.id = id;
        this.nome = nome;
        this.respostaCurta = respostaCurta;
        this.impactos = impactos;
        this.idExpressao = idExpressao;
        this.qtdAtipatia = qtdAtipatia;
        this.aumentaAntipatia = aumentaAntipatia;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRespostaCurta() {
        return respostaCurta;
    }

    public Map<Personagem, Integer> getImpactos() {
        return impactos;
    }

    public int getIdExpressao() {
        return idExpressao;
    }

    public int getQtdAtipatia() {
        return qtdAtipatia;
    }

    public boolean isAumentaAntipatia() {
        return aumentaAntipatia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRespostaCurta(String respostaCurta) {
        this.respostaCurta = respostaCurta;
    }

    public void setImpactos(Map<Personagem, Integer> impactos) {
        this.impactos = impactos;
    }

    public void setIdExpressao(int idExpressao) {
        this.idExpressao = idExpressao;
    }

    public void setQtdAtipatia(int qtdAtipatia) {
        this.qtdAtipatia = qtdAtipatia;
    }

    public void setAumentaAntipatia(boolean aumentaAntipatia) {
        this.aumentaAntipatia = aumentaAntipatia;
    }
}