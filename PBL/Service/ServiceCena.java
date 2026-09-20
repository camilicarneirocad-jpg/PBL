import java.util.List;

public class ServiceCena {
    private Jogo jogo;

    public ServiceCena(Jogo jogo){
        this.jogo=jogo;
    }


    public static final int ID_ANGELA = 1;
    public static final int ID_MONICA = 2;
    public static final int ID_MARCIA = 3;
    public static final int ID_GABRIELA = 4;

    private static final int SEM_PROXIMA = -1;

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


    public boolean ninguemAtingiu(List<Secundario> secundarios, int afinidadeMinima) {
        if (secundarios == null) {
            return true;
        }
        for (Secundario s : secundarios) {
            if (s.getAfinidade() >= afinidadeMinima) {
                return false;
            }
        }
        return true;
    }


    public void verificarProxCena(Capitulo capitulo, Cena cenaAtual, List<Secundario> secundarios) {
        if (capitulo == null || cenaAtual == null) return;

        int idCapitulo = capitulo.getIdCapitulo();
        int idCena = cenaAtual.getId();
        Integer proxima = null;

        if (idCapitulo == 7 && (idCena == 1 || idCena == 2)) {
            proxima = proximaCenaCap7(verificarMaiorAfinidade(secundarios));
        } else if (idCapitulo == 8 && idCena == 1) {
            proxima = proximaCenaCap8(verificarMenorAfinidade(secundarios));
        }

        if (proxima != null) {
            cenaAtual.setIdProximacena(proxima);
        }
    }


    public int proximaCenaCap7(Secundario maiorAfinidade) {
        if (maiorAfinidade == null) return SEM_PROXIMA;

        switch (maiorAfinidade.getId()) {
            case ID_ANGELA:   jogo.getInventario().adicionarItem(new Item("Pingente","Pingente")); return 3; // cafe_angela
            case ID_MONICA:   jogo.getInventario().adicionarItem(new Item("Caneta","Caneta")); return 4; // cafe_monica
            case ID_MARCIA:   jogo.getInventario().adicionarItem(new Item("Marcador de Paginas","Marcador")); return 5; // cafe_marcia
            case ID_GABRIELA: jogo.getInventario().adicionarItem(new Item("Caderno","Caderno")); return 6; // cafe_gabriela
            default:          return SEM_PROXIMA;
        }
    }


    public int proximaCenaCap8(Secundario menorAfinidade) {
        if (menorAfinidade == null) return SEM_PROXIMA;

        switch (menorAfinidade.getId()) {
            case ID_ANGELA:   return 2; // 2a
            case ID_MONICA:   return 3; // 2b
            case ID_GABRIELA: return 4; // 2c
            case ID_MARCIA:   return 5; // 2d
            default:          return SEM_PROXIMA;
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