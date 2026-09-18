package Controller;

import Model.Menu;

import java.util.Map;
import java.util.Scanner;

public class ControladorMenu {
    private Scanner scanner = new Scanner(System.in);

    public int exibirMenu(Menu menu) {
        System.out.println("\n==================================");
        System.out.println("       " + menu.getTitulo().toUpperCase());
        System.out.println("==================================");
        for (Map.Entry<Integer, String> opcao : menu.getOpcoes().entrySet()) {
            System.out.println("[" + opcao.getKey() + "] " + opcao.getValue());
        }
        System.out.print("\nOpção: ");

        int escolha = -1;
        if (scanner.hasNextInt()) {
            escolha = scanner.nextInt();
        } else {
            scanner.next();
        }
        return escolha;
    }
}