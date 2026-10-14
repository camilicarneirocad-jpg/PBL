package Service;

import Model.SaveGame;

import java.io.*;

public class SaveService {
    private static final int TOTAL_SLOTS = 3;

    public boolean salvarJogo(int slotId, SaveGame saveGame) {
        if (slotId < 1 || slotId > TOTAL_SLOTS) return false;
        File arquivo = new File("slot" + slotId + ".dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(saveGame);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public SaveGame carregarJogo(int slotId) {
        if (slotId < 1 || slotId > TOTAL_SLOTS) return null;
        File arquivo = new File("slot" + slotId + ".dat");
        if (!arquivo.exists()) return null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            return (SaveGame) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String obterMetadadosSlot(int slotId) {
        SaveGame save = carregarJogo(slotId);
        if (save == null) {
            return "Slot " + slotId + ": [Vazio]";
        }
        return save.getResumo();
    }
}