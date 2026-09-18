package Repository;

import Model.Narrativa;

public class RoteiroMasculinoRepository extends RoteiroRepository {

    public RoteiroMasculinoRepository() {
        carregarDadosMasculinos();
    }

    private void carregarDadosMasculinos() {
        Narrativa fala101 = new Narrativa(101, "Texto da rota masculina...", 102);
        bancoDeFalas.put(fala101.getIdFala(), fala101);
    }
}