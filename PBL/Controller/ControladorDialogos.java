package Controller;

import Model.Fala;
import Model.Narrativa;
import Model.Dialogo;

public class ControladorDialogos {

  public void exibirFala(Fala fala) {
    if (fala instanceof Narrativa) {
      System.out.println("\n[Narrador - " + fala.getNomePersonagem() + "]:");
      System.out.println(fala.getTexto());
    } else if (fala instanceof Dialogo) {
      System.out.println("\n[" + fala.getNomePersonagem() + "]:");
      System.out.println(fala.getTexto());
    } else {
      String autor = fala.getNomePersonagem() != null ? fala.getNomePersonagem() : "Personagem";
      System.out.println("\n[" + autor + "]: " + fala.getTexto());
    }
  }
}