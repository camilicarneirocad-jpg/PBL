import java.util.List;
import java.util.ArrayList;

public class Inventario {
    private List<Item> itens;

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> getItens() {
        return new ArrayList<>(itens);
    }
}