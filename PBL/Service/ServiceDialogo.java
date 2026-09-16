import java.util.List;

public class ServiceDialogo {
    private Cena cena;
    private List<Fala> falas;
    private Fala falaAtual;
    private JogoView view;
    private Jogo jogo;
    
    public ServiceDialogo(Cena cena, Fala falaAtual, JogoView view) {
        this.cena = cena;
        this.falaAtual = falaAtual;
        this.falas = cena.getFalas();
        this.view = view;
    }

    public Fala passarFalas(Fala falaAtual) {
        // Usando falaAtual, pois 'fala' não existia no escopo
        exibirFala(falaAtual.getTexto(), falaAtual.getNome());

        view.receberEnter();

        int idProxima = falaAtual.getIdProximaFala();
        for (Fala fala : falas) {
            if (fala.getIdFala() == idProxima) {
                falaAtual = fala;
            }
        }
        return falaAtual;
    }

    public void processarInfo(int escolha, Fala falaAtual, Jogo jogo) {
        for (Personagem personagem : jogo.getSecundarios()) {
            for (Opcao op : falaAtual.getOpcoes()) {
                if (op.getId() == escolha) {
                    Integer impacto = op.getImpactos().get(personagem.getNome());
                    if (impacto != null) {
                        personagem.setAfinidade(personagem.getAfinidade() + impacto);
                    }
                }
            }
        }
    }

    public Fala passarDialogo(Fala falaAtual, Jogo jogo) {
        exibirFala(falaAtual.getTexto(), falaAtual.getNome());

        // 'opcao' alterado para 'Opcao'
        for (Opcao op : falaAtual.getOpcoes()) {
            String opcaoTexto = op.getId() + "- " + op.getTexto();
            exibirTexto(opcaoTexto);
        }
        
        int escolha = receberOpcaoNumerica();
        processarInfo(escolha, falaAtual, jogo);

        int idProxima = falaAtual.getIdProximaFala();
        for (Fala fala : falas) {
            if (fala.getIdFala() == idProxima) {
                falaAtual = fala;
            }
        }
        return falaAtual;
    }
}