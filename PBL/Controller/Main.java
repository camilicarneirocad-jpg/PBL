import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        JogoView jogoView = new JogoView();
        MenuView menuView = new MenuView();
        JogoService jogoService = new JogoService(jogo, jogoView);
        ControladorJogo controladorJogo = new ControladorJogo(jogo, jogoView);

        Map<Integer, String> opcoesMenu = new HashMap<>();
        opcoesMenu.put(1, "Novo Jogo");
        opcoesMenu.put(2, "Créditos");
        opcoesMenu.put(3, "Instruções");
        opcoesMenu.put(4, "Sair");

        Menu menuPrincipal = new Menu("Reserva Para Dois", opcoesMenu);

        ControladorMenu controladorMenu = new ControladorMenu(
            menuPrincipal, 
            menuView, 
            jogoService, 
            controladorJogo
        );

        controladorMenu.iniciar();
    }
}