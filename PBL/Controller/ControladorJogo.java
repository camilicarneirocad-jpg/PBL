package Controller;

import Model.*;
import Repository.*;

import java.util.Map;
import java.util.Scanner;

public class ControladorJogo {
    private Partida partida;
    private RoteiroRepository roteiro;
    private ControladorCapitulos ctrlCapitulos;
    private ControladorCenas ctrlCenas;
    private ControladorDialogos ctrlDialogos;
    private ControladorEscolha ctrlEscolha;
    private ControladorMenu ctrlMenu;
    private Scanner scanner;

    public ControladorJogo() {
        this.ctrlCapitulos = new ControladorCapitulos();
        this.ctrlCenas = new ControladorCenas();
        this.ctrlDialogos = new ControladorDialogos();
        this.ctrlEscolha = new ControladorEscolha();
        this.ctrlMenu = new ControladorMenu();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        Menu menuInicial = new Menu("Reserva para Dois", Map.of(1, "Iniciar Programa", 2, "Sair"));
        int opcao = ctrlMenu.exibirMenu(menuInicial);

        if (opcao == 1) {
            configurarPartida();
            executarLoopJogo();
        } else {
            System.out.println("Programa encerrado.");
        }
    }

    private void configurarPartida() {
        System.out.print("\nDigite o nome do Protagonista: ");
        String nome = scanner.nextLine();
        if (nome.trim().isEmpty()) nome = "Enzo";

        Protagonista prota = new Protagonista(nome, 1, 5,0, 1, 1);
        this.roteiro = new RoteiroFemininoRepository(prota);

        Capitulo cap1 = roteiro.buscarCapitulo(1);
        this.partida = new Partida(1, cap1.getIdCapitulo(), 1, prota, null);
        this.ctrlCapitulos.carregarCapitulo(cap1);
    }

    private void executarLoopJogo() {
        boolean executandoJogo = true;

        while (executandoJogo) {
            // Loop de Cenas e Falas do capítulo carregado
            while (ctrlCapitulos.temProximaCena()) {
                Cena cena = ctrlCapitulos.getCenaAtual();
                ctrlCenas.carregarCena(cena);

                while (ctrlCenas.temProximaFala()) {
                    Fala fala = ctrlCenas.getFalaAtual();
                    ctrlDialogos.exibirFala(fala);

                    if (fala instanceof Dialogo) {
                        Dialogo dialogo = (Dialogo) fala;
                        int escolha = ctrlEscolha.obterEscolhaJogador(dialogo);
                        ctrlEscolha.processarImpacto(dialogo, escolha, partida.getProta());
                    }

                    ctrlCenas.avancarFala();
                }

                ctrlCapitulos.avancarCena();
            }

            // Fim do capítulo atual -> Busca o próximo
            int proximoId = partida.getIdCapituloAtual() + 1;
            Capitulo proximoCapitulo = roteiro.buscarCapitulo(proximoId);

            if (proximoCapitulo != null) {
                System.out.println("\n==============================================");
                System.out.println("   Avançando para o Capítulo " + proximoId + ": " + proximoCapitulo.getTitulo());
                System.out.println("==============================================\n");

                partida.proximoCapitulo(proximoId);
                ctrlCapitulos.carregarCapitulo(proximoCapitulo);
            } else {
                executandoJogo = false;
                partida.finalizarPartida();
                System.out.println("\nParabéns! Você chegou ao fim do jogo.");
            }
        }
    }
}