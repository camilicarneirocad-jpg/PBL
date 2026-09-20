import java.util.List;

public class ServiceCapitulo {

    // Cap 7: a partir desse nível de antipatia o gabarito começa no modo difícil (cena 2)
    private static final int ANTIPATIA_MODO_DIFICIL = 50;

    // Cap 10
    private static final int ANTIPATIA_CANCELAMENTO = 60;   // acima disso: programa cancelado
    private static final int AFINIDADE_MINIMA_FINAL = 40;   // ninguém chegou nisso: ninguém fica

    private static final int CENA_ANGELA = 1;
    private static final int CENA_MARCIA = 2;
    private static final int CENA_GABRIELA = 3;
    private static final int CENA_MONICA = 4;
    private static final int CENA_CANCELAMENTO = 5;
    private static final int CENA_NINGUEM = 6;

    public void definirPrimeiraCena(Capitulo capitulo, Protagonista prota, List<Secundario> secundarios, ServiceCena serviceCena) {
        if (capitulo.getIdCapitulo() == 7) {
            capitulo.setIdPrimeiraFala(prota.getAntipatia() >= ANTIPATIA_MODO_DIFICIL ? 2 : 1);
        } else if (capitulo.getIdCapitulo() == 10) {
            capitulo.setIdPrimeiraFala(escolherFinalCap10(prota, secundarios, serviceCena));
        }
    }


    public int escolherFinalCap10(Protagonista prota, List<Secundario> secundarios, ServiceCena serviceCena) {
        if (prota.getAntipatia() > ANTIPATIA_CANCELAMENTO) {
            return CENA_CANCELAMENTO;
        }

        if (serviceCena.houveEmpate(secundarios) || serviceCena.ninguemAtingiu(secundarios, AFINIDADE_MINIMA_FINAL)) {
            return CENA_NINGUEM;
        }

        Secundario maior = serviceCena.verificarMaiorAfinidade(secundarios);
        if (maior == null) {
            return CENA_NINGUEM;
        }

        switch (maior.getId()) {
            case ServiceCena.ID_ANGELA:   return CENA_ANGELA;
            case ServiceCena.ID_MARCIA:   return CENA_MARCIA;
            case ServiceCena.ID_GABRIELA: return CENA_GABRIELA;
            case ServiceCena.ID_MONICA:   return CENA_MONICA;
            default:                      return CENA_NINGUEM;
        }
    }
}