import java.util.List;

public class ServiceDialogo {
    private Cena cena;
    private List<Fala> falas;
    private Fala falaAtual;
    private JogoView view;
    private Jogo jogo;
    
    public ServiceDialogo(Cena cena, Fala falaAtual, JogoView view) {
        this.cena = cena;
        this.falaAtual = falaAtual;
        this.falas = cena.getFalas();
        this.view = view;
    }

    public Fala passarFalas(Fala falaAtual) {
        exibirFala(falaAtual.getTexto(), falaAtual.getNome());

        view.receberEnter();

        int idProxima = falaAtual.getIdProximaFala();
        falaAtual=null;
        for (Fala fala : falas) {
            if (fala.getIdFala() == idProxima) {
                falaAtual = fala;
                return falaAtual;
            }
        }
        return falaAtual;
    }

    public void processarInfo(int escolha, Fala falaAtual, Jogo jogo, Protagonista prota) {
        for(Opcao op1:falaAtual.getOpcoes()){
            if(op1.aumentaAntipatia){
                prota.setantipatia(op.qtdAtipatia);
            }
        }
        
        for (Personagem personagem : jogo.getSecundarios()) {
            for (Opcao op2 : falaAtual.getOpcoes()) {
                if (op2.getId() == escolha) {
                    Integer impacto = op2.getImpactos().get(personagem.getNome());
                    if (impacto != null) {
                        personagem.setAfinidade(personagem.getAfinidade() + impacto);
                        if(impacto>=0){
                            String mensagem=personagem +"+"+impacto;
                        }
                        else{
                            String mensagem=personagem +"-"+impacto;
                        }
                        exibirTexto(mensagem);
                    }
                }
            }
        }
    }

    public Fala passarDialogo(Fala falaAtual, Jogo jogo) {
        exibirFala(falaAtual.getTexto(), falaAtual.getNome());
        for (Opcao op : falaAtual.getOpcoes()) {
            String opcaoTexto = op.getId() + "- " + op.getTexto();
            exibirTexto(opcaoTexto);
        }
        
        int escolha = receberOpcaoNumerica();
        processarInfo(escolha, falaAtual, jogo, jogo.getProtagonista());

        int idProxima = falaAtual.getIdProximaFala();
        falaAtual=null;
        for (Fala fala : falas) {
            if (fala.getIdFala() == idProxima) {
                falaAtual = fala;
            }
        }
        return falaAtual;
    }

     public void verificarProxDialogo(Fala atual, int idProxFala) {
        atual.setIdProximaFala(idProxFala);
    }

    public void verificarProxDialogo(Fala fAtual, int idFala1, int idFala2, Personagem secundario) {
        if (secundario.getAfinidade() < 50) {
            fAtual.setIdProximaFala(idFala1);
        } else {
            fAtual.setIdProximaFala(idFala2);
        }
    }

        public void verificarProxDialogo(Fala fAtual, int idFala1, int idFala2, int idFala3, int idFala4, Personagem eliminado) {
        List<Integer> idFalas = new ArrayList<>();
        idFalas.add(idFala1);
        idFalas.add(idFala2);
        idFalas.add(idFala3);
        idFalas.add(idFala4);
        
        idFalas.remove(eliminado.getId());
        
        if (idFalas.size() > 0) {
            fAtual.setIdProximaFala(idFalas.get(0));
        }
    }

    public void verificarProxDialogo(Fala fAtual, int idCena1, int idCena2, int idCena3, int idCena4, Personagem eliminado, Jogo jogo) {
        switch (eliminado.getId()) {
            case 0:
                fAtual.setIdProximaFala(idCena1);
                break;
            case 1:
                fAtual.setIdProximaFala(idCena2);
                break;
            case 2:
                fAtual.setIdProximaFala(idCena3);
                break;
            case 3:
                fAtual.setIdProximaFala(idCena4);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public int verificarProxDialogo(Fala fAtual, int idFala1, int idFala2, int idFala3, Personagem personagem) {
        if (personagem.getAfinidade() < 50) {
            fAtual.setIdProximaFala(idFala1);
            return idFala1;
        } else if (personagem.getAfinidade() >= 50 && personagem.getAfinidade() < 70) {
            fAtual.setIdProximaFala(idFala2);
            return idFala2;
        } else {
            fAtual.setIdProximaFala(idFala3);
            return idFala3;
        }
    }

    private Fala buscarFalaPorId(int id, Cena cena) {
        for (Fala f : cena.getFalas()) {
            if (f.getIdFala() == id) {
                return f;
            }
        }
        return null;
    }

    public void verificarProxDialogo(Fala fAtual, int idFala1, int idFala2, int idFala3, 
                                     int idFala4, int idFala5, int idFala6, 
                                     int idFala7, int idFala8, int idFala9, 
                                     int idFala10, int idFala11, int idFala12, 
                                     Personagem eliminado, Jogo jogo, Cena cena) {
        
        int proxFalaAtual = 0;

        if (jogo.getSecundarios()[0] != null && !jogo.getSecundarios()[0].equals(eliminado)) {
            proxFalaAtual = verificarProxDialogo(fAtual, idFala1, idFala2, idFala3, jogo.getSecundarios()[0]);
        }

        if (jogo.getSecundarios()[1] != null && !jogo.getSecundarios()[1].equals(eliminado)) {
            Fala falaBase = (proxFalaAtual != 0) ? buscarFalaPorId(proxFalaAtual, cena) : fAtual;
            proxFalaAtual = verificarProxDialogo(falaBase, idFala4, idFala5, idFala6, jogo.getSecundarios()[1]);
        }

        if (jogo.getSecundarios()[2] != null && !jogo.getSecundarios()[2].equals(eliminado)) {
            Fala falaBase = (proxFalaAtual != 0) ? buscarFalaPorId(proxFalaAtual, cena) : fAtual;
            proxFalaAtual = verificarProxDialogo(falaBase, idFala7, idFala8, idFala9, jogo.getSecundarios()[2]);
        }

    
}
}