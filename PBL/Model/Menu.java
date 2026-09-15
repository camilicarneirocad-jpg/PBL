import java.util.Map;

public class Menu {
    private String titulo;
    private Map<Integer, String> opcoes;

    public Menu(String titulo, Map<Integer, String> opcoes) {
        this.titulo = titulo;
        this.opcoes = opcoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Map<Integer, String> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(Map<Integer, String> opcoes) {
        this.opcoes = opcoes;
    }
}