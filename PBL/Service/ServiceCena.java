import java.util.List;

public class ServiceCena {

    public Secundario verificarMaiorAfinidade(List<Secundario> secundarios) {
        if (secundarios == null || secundarios.isEmpty()) {
            return null;
        }

        Secundario melhor = secundarios.get(0);
        for (int i = 1; i < secundarios.size(); i++) {
            Secundario atual = secundarios.get(i);
            
            if (atual.getAfinidade() > melhor.getAfinidade()) {
                melhor = atual;
            } else if (atual.getAfinidade() == melhor.getAfinidade()) {
                if (atual.getExigencia() < melhor.getExigencia()) {
                    melhor = atual;
                }
            }
        }
        return melhor;
    }

    public boolean houveEmpate(List<Secundario> secundarios) {
        if (secundarios == null || secundarios.size() < 2) {
            return false;
        }
        
        int maiorAfinidade = secundarios.get(0).getAfinidade();
        int contagem = 0;

        for (Secundario s : secundarios) {
            if (s.getAfinidade() == maiorAfinidade) {
                contagem++;
            } else if (s.getAfinidade() > maiorAfinidade) {
                maiorAfinidade = s.getAfinidade();
                contagem = 1;
            }
        }
        return contagem > 1;
    }

    public Secundario verificarMenorAfinidade(List<Secundario> secundarios) {
        if (secundarios == null || secundarios.isEmpty()) {
            return null;
        }
        
        Secundario pior = secundarios.get(0);
        for (int i = 1; i < secundarios.size(); i++) {
            Secundario atual = secundarios.get(i);
            
            if (atual.getAfinidade() < pior.getAfinidade()) {
                pior = atual;
            } else if (atual.getAfinidade() == pior.getAfinidade()) {
                if (atual.getExigencia() > pior.getExigencia()) {
                    pior = atual;
                }
            }
        }
        return pior;
    }

    public void verificarProxCena(Capitulo capitulo, int idCena, int idFala, Secundario maiorAfinidade, Secundario menorAfinidade) {
        Fala falaAtual = null;
        if (capitulo.getCenas() != null) {
            for (Cena c : capitulo.getCenas()) {
                if (c.getId() == idCena && c.getFalas() != null) {
                    for (Fala f : c.getFalas()) {
                        if (f.getIdFala() == idFala) {
                            falaAtual = f;
                            break;
                        }
                    }
                }
            }
        }

        if (falaAtual == null) return;

        if (capitulo.getIdCapitulo() == 7 && idCena == 1) {
            if (maiorAfinidade != null) {
                String nome = maiorAfinidade.getNome().toLowerCase();
                if (nome.equals("angela")) {
                    falaAtual.setIdProximaFala(3);
                } else if (nome.equals("marcia")) {
                    falaAtual.setIdProximaFala(5);
                } else if (nome.equals("monica")) {
                    falaAtual.setIdProximaFala(4);
                } else if (nome.equals("gabriela")) {
                    falaAtual.setIdProximaFala(6);
                }
            }
        } else if (capitulo.getIdCapitulo() == 8 && idCena == 1) {
            if (menorAfinidade != null) {
                String nome = menorAfinidade.getNome().toLowerCase();
                if (nome.equals("angela")) {
                    falaAtual.setIdProximaFala(2);
                } else if (nome.equals("marcia")) {
                    falaAtual.setIdProximaFala(5);
                } else if (nome.equals("monica")) {
                    falaAtual.setIdProximaFala(3);
                } else if (nome.equals("gabriela")) {
                    falaAtual.setIdProximaFala(4);
                }
            }
        }
    }

    public Cena passarCenas(Capitulo capitulo, int idProximaCena) {
        if (capitulo.getCenas() != null) {
            for (Cena cena : capitulo.getCenas()) {
                if (cena.getId() == idProximaCena) {
                    return cena;
                }
            }
        }
        return null;
    }



    
}