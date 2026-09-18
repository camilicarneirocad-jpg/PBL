package Controller;

import Model.Cena;
import Model.Fala;

public class ControladorCenas {
    private Cena cenaAtual;
    private int indiceFalaAtual;

    public void carregarCena(Cena cena) {
        this.cenaAtual = cena;
        this.indiceFalaAtual = 0;
        System.out.println("\n==============================================");
        System.out.println("CENA " + cena.getId() + " | Local: " + cena.getImagemCenario() + " | Trilha: " + cena.getTrilhaSonora());
        System.out.println("==============================================");
    }

    public Fala getFalaAtual() {
        if (cenaAtual != null && indiceFalaAtual < cenaAtual.getFalas().size()) {
            return cenaAtual.getFalas().get(indiceFalaAtual);
        }
        return null;
    }

    public boolean avancarFala() {
        indiceFalaAtual++;
        return cenaAtual != null && indiceFalaAtual < cenaAtual.getFalas().size();
    }

    public boolean temProximaFala() {
        return cenaAtual != null && indiceFalaAtual < cenaAtual.getFalas().size();
    }
}