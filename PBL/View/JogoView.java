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
        String nome = leitor.nextLine();
        return nome;
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

    public static void exibirInicioCapitulo(Capitulo capitulo) {
        System.out.println("Iniciando capítulo: " + capitulo.getTitulo());
    }

    public static void exibirMensagemErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }

    public static void exibirFala(Fala fala) {
        System.out.println("\n[" + fala.getNomePersonagem() + "]: " + fala.getTexto());
    }
}