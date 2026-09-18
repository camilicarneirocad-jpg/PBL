package Controller;

import Model.Capitulo;
import Model.Cena;

public class ControladorCapitulos {
    private Capitulo capituloAtual;
    private int indiceCenaAtual;

    public void carregarCapitulo(Capitulo capitulo) {
        this.capituloAtual = capitulo;
        this.indiceCenaAtual = 0;
    }

    public Cena getCenaAtual() {
        if (capituloAtual != null && indiceCenaAtual < capituloAtual.getCenas().size()) {
            return capituloAtual.getCenas().get(indiceCenaAtual);
        }
        return null;
    }

    public boolean avancarCena() {
        indiceCenaAtual++;
        if (capituloAtual != null && indiceCenaAtual >= capituloAtual.getCenas().size()) {
            capituloAtual.setFinalizado(true);
            return false;
        }
        return true;
    }

    public boolean temProximaCena() {
        return capituloAtual != null && indiceCenaAtual < capituloAtual.getCenas().size();
    }
}