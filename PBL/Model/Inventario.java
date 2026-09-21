import java.util.List;


public class Inventario {
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