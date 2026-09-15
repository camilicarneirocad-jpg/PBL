public class RoteiroMasculinoRepository extends RoteiroRepository {

    public RoteiroMasculinoRepository() {
        carregarDadosMasculinos();
    }

    private void carregarDadosMasculinos() {
        bancoDeFalas.put(101, new Narrativa(101, "Texto da rota masculina...", 102));
    }
}