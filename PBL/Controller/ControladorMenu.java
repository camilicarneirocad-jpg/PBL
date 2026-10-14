package Controller;

import Model.Menu;
import Model.SaveGame;
import Service.JogoService;
import Service.SaveService;
import View.MenuView;

public class ControladorMenu {
    private Menu menu;
    private MenuView view;
    private JogoService service;
    private ControladorJogo controladorJogo;
    private SaveService saveService;
    private boolean rodando;

    public ControladorMenu(Menu menu, MenuView view, JogoService service, ControladorJogo controladorJogo) {
        this.menu = menu;
        this.view = view;
        this.service = service;
        this.controladorJogo = controladorJogo;
        this.saveService = new SaveService();
        this.rodando = true;
    }

    public void iniciar() {
        while (rodando) {
            view.exibirMenu(menu);
            int escolha = view.lerOpcao(menu);

            switch (escolha) {
                case 1:
                    controladorJogo.iniciarFluxoPrincipal();
                    break;
                case 2:
                    gerenciarCarregamento();
                    break;
                case 3:
                    service.exibirCreditos();
                    break;
                case 4:
                    service.exibirInstrucoes();
                    break;
                case 5:
                    System.out.println("Encerrando o jogo");
                    rodando = false;
                    break;
            }
        }
    }

    private void gerenciarCarregamento() {
        System.out.println("\n=== CARREGAR JOGO (SLOTS) ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("[" + i + "] " + saveService.obterMetadadosSlot(i));
        }
        System.out.println("[0] Voltar");
        System.out.print("Escolha o slot para carregar: ");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int slot = scanner.nextInt();

        if (slot >= 1 && slot <= 3) {
            SaveGame save = saveService.carregarJogo(slot);
            if (save != null) {
                System.out.println("Carregando jogo de: " + save.getNomeJogador());
                controladorJogo.retomarPartida(save.getJogo());
            } else {
                System.out.println("Slot vazio ou corrompido.");
            }
        }
    }
}