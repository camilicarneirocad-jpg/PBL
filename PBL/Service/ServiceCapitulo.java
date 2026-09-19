import java.util.List;

public class ServiceCapitulo {

    public void definirPrimeiraCena(Capitulo capitulo, Protagonista prota, List<Secundario> secundarios, ServiceCena serviceCena) {
        if (capitulo.getIdCapitulo() == 7) {
            if (prota.getaintipatia() >= 50) {
                capitulo.setIdPrimeiraFala(2);
            } else {
                capitulo.setIdPrimeiraFala(1);
            }
        } else if (capitulo.getIdCapitulo() == 10) {
            boolean empate = serviceCena.houveEmpate(secundarios);
            Secundario maiorAf = serviceCena.verificarMaiorAfinidade(secundarios);
            String nomeMaior = (maiorAf != null) ? maiorAf.getNome().toLowerCase() : "";
            int idMaior = (maiorAf != null) ? maiorAf.getId() : 0;

            boolean nenhumaChegou40 = true;
            if (secundarios != null) {
                for (Secundario s : secundarios) {
                    if (s.getAfinidade() >= 40) {
                        nenhumaChegou40 = false;
                        break;
                    }
                }
            }

            int antipatia = prota.getaintipatia();

            if ((empate && antipatia > 60) || (nenhumaChegou40 && antipatia > 60)) {
                capitulo.setIdPrimeiraFala(6);
            } else if (nomeMaior.equals("angela") && antipatia > 60 && idMaior >= 40) {
                capitulo.setIdPrimeiraFala(1);
            } else if (nomeMaior.equals("marcia") && antipatia > 60 && idMaior >= 40) {
                capitulo.setIdPrimeiraFala(4);
            } else if (nomeMaior.equals("monica") && antipatia > 60 && idMaior >= 40) {
                capitulo.setIdPrimeiraFala(2);
            } else if (nomeMaior.equals("gabriela") && antipatia > 60 && idMaior >= 40) {
                capitulo.setIdPrimeiraFala(3);
            } else if (antipatia < 60) {
                capitulo.setIdPrimeiraFala(5);
            }
        }
    }
}