package Repository;

import Model.Capitulo;
import Model.Fala;

import java.util.HashMap;
import java.util.Map;

public abstract class RoteiroRepository {
    // As classes filhas acessam os atributos sem a necessidade de usar getters e setters (protected).
    protected Map<Integer, Fala> bancoDeFalas = new HashMap<>();
    protected Map<Integer, Capitulo> bancoDeCapitulos = new HashMap<>();

    public Capitulo buscarCapitulo(int id) {
        return bancoDeCapitulos.get(id);
    }

    public Fala buscarFala(int id) {
        return bancoDeFalas.get(id);
    }
}