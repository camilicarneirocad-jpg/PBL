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
        String autor = (nome != null && !nome.trim().isEmpty()) ? nome : "Narrador";
        System.out.println("[" + autor + "]: " + texto);
    }

    public static void exibirFala(Fala fala) {
        if (fala != null) {
            String autor = (fala.getNomePersonagem() != null && !fala.getNomePersonagem().trim().isEmpty())
                    ? fala.getNomePersonagem()
                    : "Narrador";
            System.out.println("\n[" + autor + "]: " + fala.getTexto());
        }
    }

    public void exibirTexto(String texto) {
        System.out.println(texto);
    }

    public int receberOpcaoNumerica() {
        System.out.print("\nDigite sua opção: ");
        while (!leitor.hasNextInt()) {
            System.out.print("Entrada inválida! Digite um número: ");
            leitor.next();
        }
        int opcao = leitor.nextInt();
        leitor.nextLine(); // Consome o '\n' do buffer
        return opcao;
    }

    public void receberEnter() {
        System.out.println("\n[Pressione ENTER para continuar...]");
        leitor.nextLine();
    }

    public String receberNome() {
        System.out.print("Digite o nome do personagem: ");
        String nome = leitor.nextLine();
        while (nome == null || nome.trim().isEmpty()) {
            System.out.print("Nome inválido. Digite novamente: ");
            nome = leitor.nextLine();
        }
        return nome.trim();
    }

    public int escolherOpcao() {
        System.out.println("\nEscolha uma opção de gênero:");
        System.out.println(" 1 - Feminino");
        System.out.println(" 2 - Masculino");
        return receberOpcaoNumerica();
    }

    public int escolherRoupa() {
        System.out.println("\nEscolha o visual do seu personagem:");
        System.out.println(" 1 - Roupa 1 (Casual)");
        System.out.println(" 2 - Roupa 2 (Elegante)");
        System.out.println(" 3 - Roupa 3 (Despojado)");
        System.out.println(" 4 - Roupa 4 (Formal)");
        return receberOpcaoNumerica();
    }

    public int escolherElenco() {
        System.out.println("\nEscolha o elenco participante:");
        System.out.println(" 1 - Elenco Feminino");
        System.out.println(" 2 - Elenco Masculino");
        return receberOpcaoNumerica();
    }

    public static void exibirInicioCapitulo(Capitulo capitulo) {
        if (capitulo != null) {
            System.out.println("\n==============================================");
            System.out.println("Iniciando capítulo: " + capitulo.getTitulo());
            System.out.println("==============================================\n");
        }
    }

    public static void exibirMensagemErro(String mensagem) {
        System.err.println("[ERRO]: " + mensagem);
    }
}