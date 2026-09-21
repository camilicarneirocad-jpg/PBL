import java.util.List;

public class Jogo {
    private Inventario inventario;
    private String nome;
    private Protagonista prota;
    private List<Secundario> secundarios;
    private List<Capitulo> capitulos;

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Protagonista getProta() {
        return prota;
    }

    public void setProta(Protagonista prota) {
        this.prota = prota;
    }

    public List<Secundario> getSecundarios() {
        return secundarios;
    }

    public void setSecundarios(List<Secundario> secundarios) {
        this.secundarios = secundarios;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }
}