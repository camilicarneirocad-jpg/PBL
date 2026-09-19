import java.util.List;

public class ServiceDialogo {
    private Cena cena;
    private List<Fala> falas;
    private Fala falaAtual;
    private JogoView view;
    private Jogo jogo;
    
    public ServiceDialogo(Cena cena, Fala falaAtual, JogoView view, Jogo jogo) {
        this.cena = cena;
        this.falaAtual = falaAtual;
        this.falas = (cena != null) ? cena.getFalas() : null;
        this.view = view;
        this.jogo = jogo;
    }

    public Fala passarFalas(Fala falaAtual) {
        view.exibirTexto(falaAtual.getTexto());
        view.receberEnter();

        Integer idProxima = falaAtual.getIdProximaFala();
        if (idProxima == null || falas == null) return null;

        for (Fala fala : falas) {
            if (fala.getIdFala() == idProxima) {
                return fala;
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

    for (Opcoes opcao : dialogo.getOpcoes()) {
        if (opcao.isAumentaAntipatia()) {
            prota.incrementarAntipatia(opcao.getQtdAtipatia());
        }
    }

    Opcoes opcaoEscolhida = null;
    for (Opcoes opcao : dialogo.getOpcoes()) {
        if (opcao.getId() == escolha) {
            opcaoEscolhida = opcao;
            break;
        }
    }

    if (opcaoEscolhida != null && opcaoEscolhida.getImpactos() != null) {
        for (Map.Entry<Secundario, Integer> entry : opcaoEscolhida.getImpactos().entrySet()) {
            Secundario secundarioNaOpcao = entry.getKey();
            int impacto = entry.getValue();

            for (Secundario personagemJogo : jogo.getSecundarios()) {
                if (personagemJogo.getId() == secundarioNaOpcao.getId()) {
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

    public void verificarProxDialogo(Capitulo capitulo, int idCena, int idFalaAtual, Secundario maiorAfinidade) {
        Fala fala = buscarFalaPorIds(List.of(capitulo), capitulo.getIdCapitulo(), idCena, idFalaAtual);
        if (fala == null) return;

        if (capitulo.getIdCapitulo() == 9 && idCena == 1) {
            String nomeMaior = (maiorAfinidade != null) ? maiorAfinidade.getNome().toLowerCase() : "";
            boolean isAngela = nomeMaior.equals("angela");
            boolean isMonica = nomeMaior.equals("monica");
            boolean isMarcia = nomeMaior.equals("marcia");
            boolean isGabriela = nomeMaior.equals("gabriela");

            if (idFalaAtual == 2) {
                if (isAngela) {
                    fala.setIdProximaFala(4);
                } else {
                    fala.setIdProximaFala(3);
                }
            } else if (idFalaAtual == 3 || idFalaAtual == 4) {
                if (isMonica) {
                    fala.setIdProximaFala(6);
                } else {
                    fala.setIdProximaFala(5);
                }
            } else if (idFalaAtual == 5 || idFalaAtual == 6) {
                if (isMarcia) {
                    fala.setIdProximaFala(8);
                } else {
                    fala.setIdProximaFala(7);
                }
            } else if (idFalaAtual == 7 || idFalaAtual == 8) {
                if (isGabriela) {
                    fala.setIdProximaFala(10);
                } else {
                    fala.setIdProximaFala(9);
                }
            }
        }
    }

}