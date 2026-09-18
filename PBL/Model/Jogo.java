package Model;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private Protagonista protagonista;
    private List<Secundario> secundarios;
    private Capitulo capituloAtual;
    private Cena cenaAtual;
    private Fala falaAtual;
    private boolean rodando;

    public Jogo() {
        this.secundarios = new ArrayList<>();
        this.rodando = true;
    }

    public Jogo(Protagonista protagonista, List<Secundario> secundarios, Capitulo capituloAtual) {
        this.protagonista = protagonista;
        this.secundarios = (secundarios != null) ? secundarios : new ArrayList<>();
        this.capituloAtual = capituloAtual;
        this.rodando = true;
    }

    public void adicionarSecundario(Secundario secundario) {
        if (this.secundarios == null) {
            this.secundarios = new ArrayList<>();
        }
        this.secundarios.add(secundario);
    }

    public Secundario buscarSecundarioPorNome(String nome) {
        if (secundarios != null && nome != null) {
            for (Secundario sec : secundarios) {
                if (nome.equalsIgnoreCase(sec.getNome())) {
                    return sec;
                }
            }
        }
        return null;
    }

    // Getters e Setters
    public Protagonista getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Protagonista protagonista) {
        this.protagonista = protagonista;
    }

    public List<Secundario> getSecundarios() {
        return secundarios;
    }

    public void setSecundarios(List<Secundario> secundarios) {
        this.secundarios = secundarios;
    }

    public Capitulo getCapituloAtual() {
        return capituloAtual;
    }

    public void setCapituloAtual(Capitulo capituloAtual) {
        this.capituloAtual = capituloAtual;
    }

    public Cena getCenaAtual() {
        return cenaAtual;
    }

    public void setCenaAtual(Cena cenaAtual) {
        this.cenaAtual = cenaAtual;
    }

    public Fala getFalaAtual() {
        return falaAtual;
    }

    public void setFalaAtual(Fala falaAtual) {
        this.falaAtual = falaAtual;
    }

    public boolean isRodando() {
        return rodando;
    }

    public void setRodando(boolean rodando) {
        this.rodando = rodando;
    }
}