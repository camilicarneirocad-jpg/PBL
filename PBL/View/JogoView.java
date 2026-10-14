package View;
import Model.Capitulo;
import Model.Fala;
import java.util.Scanner;

public class JogoView {
    private Scanner leitor;

    public JogoView() {
        this.leitor = new Scanner(System.in);
    }

    public void exibirFala(String texto, String nome) {
        System.out.println("[" + nome + "]: " + texto);
    }

    public void exibirTexto(String texto) {
        System.out.println(texto);
    }

    public int receberOpcaoNumerica() {
        int opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;
    }

    public void receberEnter() {
        System.out.println("Digite enter para continuar");
        leitor.nextLine();
    }

    public String receberNome() {
        System.out.println("Digite o nome do personagem:");
        return leitor.nextLine();
    }

    public int escolherOpcao() {
        System.out.println("Escolha uma opcao\n 1-feminino\n 2-masculino");
        int opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;
    }

    public int escolherRoupa() {
        System.out.println("Escolha uma opcao\n 1-roupa 1\n 2-roupa 2\n 3-roupa 3\n 4-roupa 4");
        int opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;
    }

    // --- MÉTODOS PARA O MENU DE PAUSA (TECLA 0 / ESC) ---
    public int exibirMenuPausa() {
        System.out.println("\n========================================");
        System.out.println("               MENU DE PAUSA             ");
        System.out.println("========================================");
        System.out.println("[1] Salvar Jogo Manualmente");
        System.out.println("[2] Retomar Partida");
        System.out.println("[3] Sair para o Menu Principal");
        System.out.println("========================================");
        System.out.print("Escolha uma opção: ");
        return receberOpcaoNumerica();
    }

    public int escolherSlot() {
        System.out.println("\nEscolha o slot de salvamento (1, 2 ou 3): ");
        return receberOpcaoNumerica();
    }
}