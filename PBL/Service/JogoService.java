import java.util.ArrayList;
import java.util.List;

public class JogoService {
    
    private Jogo jogo;
    private JogoView view;

    public JogoService(Jogo jogo, JogoView view) {
        this.jogo = jogo;
        this.view = view;
    }

    public Protagonista iniciarPersonagem() {
        String nome = view.receberNome();
        int genero = view.escolherOpcao();
        int idRoupa = view.escolherRoupa();

        return new Protagonista(nome, 0, genero, 0, idRoupa);
    }

    public void iniciarNovoJogo() {
        jogo.setNome("Reserva para Dois"); // Ajustado para definir o nome do jogo
        jogo.setInventario(new Inventario());
        jogo.getInventario().setItens(new ArrayList<>());

        Protagonista prota = iniciarPersonagem();
        jogo.setProta(prota);

        List<Secundario> secundarios = new ArrayList<>();
        secundarios.add(new Secundario("Ângela", 1, 30, 6));
        secundarios.add(new Secundario("Mônica", 2, 30, 10));
        secundarios.add(new Secundario("Márcia", 3, 30, 8));
        secundarios.add(new Secundario("Gabriela", 4, 30, 4));
        jogo.setSecundarios(secundarios);

        RoteiroRepository roteiro;
        if (prota.getGenero() == 1) {
            roteiro = new RoteiroFemininoRepository(prota);
        } else {
            roteiro = new RoteiroMasculinoRepository(prota);
        }

        List<Capitulo> capitulos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Capitulo cap = roteiro.buscarCapitulo(i);
            if (cap != null) {
                capitulos.add(cap);
            }
        }
        jogo.setCapitulos(capitulos);
    }

    public void exibirInstrucoes() {
        view.exibirTexto("\n--- Instruções ---\nFaça suas escolhas com sabedoria.\n");
    }

    public void exibirCreditos() {
        view.exibirTexto("\n--- Créditos ---\nDesenvolvido por:\n Camili Carneiro\n Yarlley Fernandes \n Ano: 2026\n");
    }
}