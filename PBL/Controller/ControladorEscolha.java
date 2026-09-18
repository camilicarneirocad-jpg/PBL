package Controller;

import Model.Dialogo;
import Model.Opcoes;
import Model.Protagonista;
import Model.Secundario;

import java.util.Map;
import java.util.Scanner;

public class ControladorEscolha {
    private Scanner scanner = new Scanner(System.in);

    public int obterEscolhaJogador(Dialogo dialogo) {
        System.out.println("\n--- SUAS OPÇÕES DE RESPOSTA ---");
        for (Opcoes opcao : dialogo.getOpcoes()) {
            System.out.println("[" + opcao.getId() + "] " + opcao.getNome());
        }

        int escolha = -1;
        boolean escolhaValida = false;

        while (!escolhaValida) {
            System.out.print("\nEscolha o número da sua resposta: ");
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                for (Opcoes opcao : dialogo.getOpcoes()) {
                    if (opcao.getId() == escolha) {
                        escolhaValida = true;
                        break;
                    }
                }
            } else {
                scanner.next();
            }
        }
        return escolha;
    }

    public void processarImpacto(Dialogo dialogo, int escolha, Protagonista prota) {
        String resposta = dialogo.getRespostaCurta(escolha);
        if (resposta != null) {
            System.out.println("\n[Apresentador]: \"" + resposta + "\"");
        }

        Map<Secundario, Map<Integer, Integer>> pontos = dialogo.getPontosPorPersonagem();
        if (pontos != null) {
            for (Map.Entry<Secundario, Map<Integer, Integer>> entry : pontos.entrySet()) {
                Secundario sec = entry.getKey();
                Map<Integer, Integer> tabelaPontos = entry.getValue();
                if (tabelaPontos != null && tabelaPontos.containsKey(escolha)) {
                    int varAfinidade = tabelaPontos.get(escolha);
                    sec.setAfinidade(sec.getAfinidade() + varAfinidade);
                }
            }
        }

        if (escolha == dialogo.getPiorOpcao()) {
            prota.incrementarAntipatia(2);
            System.out.println("*(A sua resposta causou uma má impressão nas juradas...)*");
        }
    }
}