import java.util.List;
import java.util.Map;

public class ServiceDialogo {
    private Cena cena;
    private List<Fala> falas;
    private JogoView view;
    private Jogo jogo;
    private Capitulo capitulo;
    private Personagem maiorAfinidade;
    private ServiceCena serviceCena;


    public ServiceDialogo(Cena cena, JogoView view, Jogo jogo) {
        this.cena = cena;
        this.falas = (cena != null) ? cena.getFalas() : null;
        this.view = view;
        this.jogo = jogo;
        this.serviceCena = new ServiceCena(jogo);
    }



    public Capitulo getCapitulo() {
        return this.capitulo;
    }

    public Cena getCena() {
        return this.cena;
    }

    public void setmaiorAfinidade(Personagem maiorAfinidade) {
        this.maiorAfinidade = maiorAfinidade;
    }

    public Fala obterProximaFala(Fala falaAtual) {
        if (falas == null) return null;

        Integer idProxima = falaAtual.getIdProximaFala();


        if (idProxima == null) {
            int indice = falas.indexOf(falaAtual);
            return (indice >= 0 && indice + 1 < falas.size()) ? falas.get(indice + 1) : null;
        }

        for (Fala fala : falas) {
            if (fala.getIdFala() == idProxima) {
                return fala;
            }
        }
        return null;
    }


    public Fala passarFalas(Fala falaAtual, Capitulo capituloAtual) {
        view.exibirTexto(falaAtual.getTexto());
        view.receberEnter();

        return obterProximaFala(falaAtual);
    }


    public Opcoes buscarOpcao(Dialogo dialogo, int escolha) {
        if (dialogo == null || dialogo.getOpcoes() == null) return null;
        for (Opcoes opcao : dialogo.getOpcoes()) {
            if (opcao.getId() == escolha) {
                return opcao;
            }
        }
        return null;
    }

    public void processarInfo(int escolha, Fala falaAtual, Protagonista prota) {
        if (!(falaAtual instanceof Dialogo)) {
            return;
        }

        Dialogo dialogo = (Dialogo) falaAtual;
        if (dialogo.getOpcoes() == null) {
            return;
        }

        Opcoes opcaoEscolhida = buscarOpcao(dialogo, escolha);

        // Antipatia só muda pela opção escolhida (antes somava a de todas as opções marcadas)
        if (opcaoEscolhida != null && opcaoEscolhida.isAumentaAntipatia()) {
            prota.incrementarAntipatia(opcaoEscolhida.getQtdAtipatia());
        }

        if (opcaoEscolhida != null && opcaoEscolhida.getImpactos() != null) {
            for (Map.Entry<Personagem, Integer> entry : opcaoEscolhida.getImpactos().entrySet()) {
                Personagem personagemNaOpcao = entry.getKey();
                int impacto = entry.getValue();

                for (Secundario personagemJogo : jogo.getSecundarios()) {
                    if (personagemJogo.getId() == personagemNaOpcao.getId()) {
                        personagemJogo.setAfinidade(personagemJogo.getAfinidade() + impacto);

                        String sinal = (impacto >= 0) ? "+" : "";
                        view.exibirTexto(personagemJogo.getNome() + " " + sinal + impacto);
                        break;
                    }
                }
            }
        }
    }

    public Fala buscarFalaPorIds(List<Capitulo> capitulos, int idCapitulo, int idCena, int idFala) {
        if (capitulos == null) return null;

        for (Capitulo cap : capitulos) {
            if (cap.getIdCapitulo() == idCapitulo) {
                if (cap.getCenas() != null) {
                    for (Cena cena : cap.getCenas()) {
                        if (cena.getId() == idCena) {
                            if (cena.getFalas() != null) {
                                for (Fala fala : cena.getFalas()) {
                                    if (fala.getIdFala() == idFala) {
                                        return fala;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Define o idProximaFala das FALAS que vêm antes de um desdobramento e não têm próxima fixa.
     * Chamada com a fala atual, antes de passar para a seguinte.
     *
     * Cap 9, cena 1: cada participante tem duas falas, "a" (não tem a maior afinidade) e
     * "b" (tem a maior afinidade):
     *   fala 2        -> Ângela:   b = 4, a = 3
     *   falas 3 ou 4  -> Mônica:   b = 6, a = 5
     *   falas 5 ou 6  -> Márcia:   b = 8, a = 7
     *   falas 7 ou 8  -> Gabriela: b = 10, a = 9
     *   falas 9 ou 10 -> 11 (fecha o capítulo; sem isso a "a" cairia na "b")
     */
    public void verificarProxDialogo(Capitulo capitulo, int idCena, int idFalaAtual, Secundario maiorAfinidade) {
        if (capitulo == null || capitulo.getIdCapitulo() != 9 || idCena != 1) return;

        Fala fala = buscarFalaPorIds(List.of(capitulo), capitulo.getIdCapitulo(), idCena, idFalaAtual);
        if (fala == null) return;

        int idMaior = (maiorAfinidade != null) ? maiorAfinidade.getId() : -1;

        switch (idFalaAtual) {
            case 2:
                fala.setIdProximaFala(idMaior == ServiceCena.ID_ANGELA ? 4 : 3);
                break;
            case 3:
            case 4:
                fala.setIdProximaFala(idMaior == ServiceCena.ID_MONICA ? 6 : 5);
                break;
            case 5:
            case 6:
                fala.setIdProximaFala(idMaior == ServiceCena.ID_MARCIA ? 8 : 7);
                break;
            case 7:
            case 8:
                fala.setIdProximaFala(idMaior == ServiceCena.ID_GABRIELA ? 10 : 9);
                break;
            case 9:
            case 10:
                fala.setIdProximaFala(11);
                break;
            default:
                break;
        }
    }

}