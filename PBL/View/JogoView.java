import java.util.Scanner;
public class JogoView {
    private Scanner leitor;
    private Fala fala;

    public String receberNome() {
          System.out.println("Digite o nome do personagem");
          nome =leitor.nextLine();
        return nome;
    }

    public int escolherOpcao(){
        System.out.println("Escolha uma opcao\n 1-feminino\n 2-masculino");
        opcao=leitor.nextInt();
        return opcao;
    }

    public int escolherRoupa(){
        System.out.println("Escolha uma opcao\n 1-roupa 1\n 2-roupa 2\n3-roupa 3\n4-roupa 4");
        opcao=leitor.nextInt();
        return opcao;
    }

    public int escolherElenco(){
        System.out.println("Escolha uma elenco\n 1-feminino\n 2-masculino");
        opcao=leitor.nextInt();
        return opcao;
    }


    public void exibirTexto(String texto,String nome){
        System.out.println("["+nome+"]"+":"+texto);
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