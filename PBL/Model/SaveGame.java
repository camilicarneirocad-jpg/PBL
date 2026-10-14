package Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveGame implements Serializable {
    private static final long serialVersionUID = 1L;

    private int slotId;
    private String nomeJogador;
    private String dataHora;
    private int idCapitulo;
    private int idCena;
    private int idFala;
    private Jogo jogo;

    public SaveGame(int slotId, Jogo jogo, int idCapitulo, int idCena, int idFala) {
        this.slotId = slotId;
        this.jogo = jogo;
        this.nomeJogador = jogo.getProta() != null ? jogo.getProta().getNome() : "Desconhecido";
        this.dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        this.idCapitulo = idCapitulo;
        this.idCena = idCena;
        this.idFala = idFala;
    }

    public int getSlotId() { return slotId; }
    public String getNomeJogador() { return nomeJogador; }
    public String getDataHora() { return dataHora; }
    public int getIdCapitulo() { return idCapitulo; }
    public int getIdCena() { return idCena; }
    public int getIdFala() { return idFala; }
    public Jogo getJogo() { return jogo; }

    public String getResumo() {
        return "Slot " + slotId + " | Jogador: " + nomeJogador + " | Cap: " + idCapitulo + " | Cena: " + idCena + " | Data: " + dataHora;
    }
}