package Service;

import Model.Capitulo;
import Model.Dialogo;
import Model.Protagonista;
import Model.Secundario;
import Repository.RoteiroRepository;

import java.util.Map;

public class JogoService {

    private Protagonista protagonista;
    private RoteiroRepository repository;
    private Capitulo capituloAtual;

    public JogoService(RoteiroRepository repository, Capitulo capitulo, Protagonista protagonista) {
        this.repository = repository;
        this.capituloAtual = capitulo;
        this.protagonista = protagonista;
    }

    public JogoService(RoteiroRepository repository) {
        this.repository = repository;
    }

    public Protagonista iniciarPersonagem(String nome, int idElenco, int idRoupa) {
        // Instancia Protagonista com os parâmetros exigidos pelo construtor (nome, nivel, antipatia, idRoupa, idElenco)
        return new Protagonista(nome, 1, 5,0, idRoupa, idElenco);
    }

    public void iniciarNovoJogo() {
        this.protagonista = iniciarPersonagem("Jogador", 1, 1);

        int idPrimeiroCapitulo = 1;
        iniciarCapitulo(idPrimeiroCapitulo);
    }

    public void iniciarCapitulo(int idCapitulo) {
        if (repository == null) {
            exibirMensagemErro("Repositório de roteiro não foi inicializado.");
            return;
        }

        Capitulo cap = repository.buscarCapitulo(idCapitulo);

        if (cap != null) {
            this.capituloAtual = cap;
            this.capituloAtual.setFinalizado(false);
            exibirInicioCapitulo(this.capituloAtual);
        } else {
            exibirMensagemErro("Não foi possível carregar o capítulo de ID: " + idCapitulo);
        }
    }

    private void exibirInicioCapitulo(Capitulo cap) {
        System.out.println("\n=================================");
        System.out.println("Iniciando Capítulo: " + cap.getTitulo());
        System.out.println("=================================\n");
    }

    private void exibirMensagemErro(String mensagem) {
        System.err.println("[ERRO] " + mensagem);
    }

    public String obterCreditos() {
        return "\n--- Créditos ---\nDesenvolvido por:\n Camili Carneiro\n Yarlley Fernandes\n Ano: 2026\n";
    }

    public void processarImpacto(Secundario solteira, int pontosBase) {
        if (solteira == null) return;

        int valorFinal = pontosBase;
        if (pontosBase < 0) {
            valorFinal = pontosBase - (solteira.getExigencia() / 2);
        }

        solteira.setAfinidade(solteira.getAfinidade() + valorFinal);
    }

    public void processarJogada(Dialogo dialogo, int escolhaDoJogador) {
        if (dialogo == null) return;

        Map<Secundario, Map<Integer, Integer>> pontos = dialogo.getPontosPorPersonagem();
        if (pontos != null) {
            for (Map.Entry<Secundario, Map<Integer, Integer>> entry : pontos.entrySet()) {
                Secundario solteira = entry.getKey();
                Map<Integer, Integer> tabelaPontos = entry.getValue();

                if (tabelaPontos != null && tabelaPontos.containsKey(escolhaDoJogador)) {
                    int pontosBase = tabelaPontos.get(escolhaDoJogador);
                    processarImpacto(solteira, pontosBase);
                }
            }
        }
    }

    // Getters e Setters
    public Protagonista getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Protagonista protagonista) {
        this.protagonista = protagonista;
    }

    public Capitulo getCapituloAtual() {
        return capituloAtual;
    }
}