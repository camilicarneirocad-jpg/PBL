package Model;
import java.io.Serializable;
import java.util.List;


public class Inventario implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Item> itens;

public void setItens(List<Item> itens) {
    this.itens = itens;
}

public List<Item> getItens() {
    return itens;
}

public void adicionarItem(Item item) {
    this.itens.add(item);
}

}