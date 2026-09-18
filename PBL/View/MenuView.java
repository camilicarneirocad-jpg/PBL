package View;

import Model.Menu;

import java.util.Map;
import java.util.Scanner;

public class MenuView {
    private Scanner leitor;

    public MenuView() {
        this.leitor = new Scanner(System.in);
    }

    public void exibirTituloJogo() {
        System.out.println("==================================================");
        System.out.println("               RESERVA PARA DOIS                  ");
        System.out.println("        Um Reality Show de Amor e Escolhas        ");
        System.out.println("==================================================");
    }

    public int exibirMenuPrincipal() {
        exibirTituloJogo();
        System.out.println(" 1. Iniciar Novo Jogo");
        System.out.println(" 2. Carregar Capítulo");
        System.out.println(" 3. Créditos");
        System.out.println(" 4. Sair");
        System.out.println("==================================================");
        System.out.print("Escolha uma opção: ");

        return lerOpcaoValida(1, 4);
    }

    public int exibirMenu(Menu menu) {
        if (menu == null) return -1;

        System.out.println("\n==================================");
        System.out.println("       " + menu.getTitulo().toUpperCase());
        System.out.println("==================================");

        if (menu.getOpcoes() != null) {
            for (Map.Entry<Integer, String> opcao : menu.getOpcoes().entrySet()) {
                System.out.println("[" + opcao.getKey() + "] " + opcao.getValue());
            }
        }

        System.out.print("\nOpção: ");
        return lerOpcaoValida(1, menu.getOpcoes() != null ? menu.getOpcoes().size() : 1);
    }

    public void exibirCreditos(String creditos) {
        System.out.println(creditos);
        System.out.println("Pressione ENTER para voltar...");
        leitor.nextLine();
    }

    private int lerOpcaoValida(int min, int max) {
        int opcao = -1;
        while (true) {
            if (leitor.hasNextInt()) {
                opcao = leitor.nextInt();
                leitor.nextLine(); // Limpa buffer do '\n'
                if (opcao >= min && opcao <= max) {
                    break;
                }
            } else {
                leitor.next(); // Limpa entrada inválida
            }
            System.out.print("Opção inválida! Digite um valor entre " + min + " e " + max + ": ");
        }
        return opcao;
    }
}