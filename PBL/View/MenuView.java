import java.util.Map;
import java.util.Scanner;

public class MenuView {
    private Scanner leitor;

    public MenuView() {
        this.leitor = new Scanner(System.in);
    }

    public void exibirMenu(Menu menu) {
        System.out.println("========================================");
        System.out.println(" " + menu.getTitulo());
        System.out.println("========================================");
        
        for (Map.Entry<Integer, String> entry : menu.getOpcoes().entrySet()) {
            System.out.println("[" + entry.getKey() + "] " + entry.getValue());
        }
    }

    public int lerOpcao(Menu menu) {
        int opcao = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("\nDigite o número da sua escolha: ");
            
            if (leitor.hasNextInt()) {
                opcao = leitor.nextInt();
                
                // vê se a entrada é um id de uma das opções do menu
                if (menu.getOpcoes().containsKey(opcao)) {
                    entradaValida = true;
                } else {
                    System.out.println("Opção inexistente. Tente novamente.");
                }
            } else {
                System.out.println("Por favor, digite apenas um número inteiro.");
                leitor.next(); 
            }
        }
        return opcao;
    }
}