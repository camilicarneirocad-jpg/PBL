package Model;

import java.util.ArrayList;
import java.util.List;

public class Iventario {
    private List<String> itens;
    private int capacidadeMaxima;

    public Iventario() {
        this.itens = new ArrayList<>();
        this.capacidadeMaxima = 10;
    }

    public Iventario(int capacidadeMaxima) {
        this.itens = new ArrayList<>();
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean adicionarItem(String item) {
        if (itens.size() < capacidadeMaxima) {
            itens.add(item);
            return true;
        }
        System.out.println("Inventário cheio!");
        return false;
    }

    public boolean removerItem(String item) {
        return itens.remove(item);
    }

    public boolean temItem(String item) {
        return itens.contains(item);
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
}