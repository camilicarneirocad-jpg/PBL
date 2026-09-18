public class ServiceCena{
     //dialogos: dialogos diretos
     public void verificarProxDialogo(Fala atual,int idProxFala){
        atual.setIdProximaFala(idFala2);
     }
    //cena1 cap7
    public void verificarProxDialogo(Fala fAtual,int idFala1, int idFala2, Personagem secundario){
        if(secundario.getAfinidade()<50){
            fAtual.setIdProximaFala(idFala1);
        }
        else{
            fAtual.setIdProximaFala(idFala2);
        }
    }


    //cenas: cena2 cap 7
    public void verificarProximaCena(Cena cAtual,int idCena1, int idCena2,int idCena3,int idCena4, Personagem secundario){
        Personagem personagemEliminado;
        int menorAfinidade=null;
        for(Personagem personagem:Jogo.getPersonagens()){
            if(menorAfinidade==null||menorAfinidade>personagem.getAfinidade()){
                menorAfinidade=personagem.getAfinidade();
                personagemEliminado=personagem;
            }
        }

        switch (personagemEliminado.getId()) {
            case 0:
               cena.setidProximacena(idCena1);
               break;
            case 1:
               cena.setidProximacena(idCena2);
               break;
            case 2:
               cena.setidProximacena(idCena3);
               break;
            case 3:
               cena.setidProximacena(idCena4);
               break;
            default:
                System.out.println("Opção inválida.");
                break;
}
    }
 //cena: cena 3 cap7   
   public Item ganharItem(Personagem personagem, Iventario iventario){
    switch (personagem.getId()) {
            case 0:
               Item item(1,"Pigente");
               inventario.getItens().add(item);
               view.exibirTexto(item.nome+"adicionado ao iventário");
               break;
            case 1:
               Item item(2,"Caderno");
               inventario.getItens().add(item);
               view.exibirTexto(item.nome+"adicionado ao iventário");
               break;
            case 2:
               Item item(3,"Marcador");
               inventario.getItens().add(item);
               view.exibirTexto(item.nome+"adicionado ao iventário");
               break;
            case 3:
               Item item(4,"Caneta");
               inventario.getItens().add(item);
               view.exibirTexto(item.nome+"adicionada ao iventário");
               break;
            default:
                System.out.println("Opção inválida.");
                break;
}
   }
   public Cena verificarProximaCena(Cena cAtual,int idCena1, int idCena2,int idCena3,int idCena4, Personagem secundario, Iventario inventario){
        Personagem personagemComAfinidade;
        int maiorAfinidade=null;
        for(Personagem personagem:Jogo.getPersonagens()){
            if(maiorAfinidade==null||maiorAfinidade<personagem.getAfinidade()){
                maiorAfinidade=personagem.getAfinidade();
                personagemComAfinidade=personagem;
            }
        }

        switch (personagemComAfinidade.getId()) {
            case 0:
               cena.setidProximacena(idCena1);
               break;
            case 1:
               cena.setidProximacena(idCena2);
               break;
            case 2:
               cena.setidProximacena(idCena3);
               break;
            case 3:
               cena.setidProximacena(idCena4);
               break;
            default:
                System.out.println("Opção inválida.");
                break;
}
    }
    
    
// dialogos: cena 1 cap8
    public void verificarProxDialogo(Fala fAtual,int idFala1, int idFala2, int idFala3, int idFala4, Personagem eliminado){
        list<int> idFalas= new ArrayList<>();
        idFalas.add(idFala1);
        idFalas.add(idFala2);
        idFalas.add(idFala3);
        idFalas.add(idFala4);
        
        idFalas.remove(eliminado.getId());
        verificarProxDialogo(fAtual,idFalas[0]);
        verificarProxDialogo(idFalas[0],idFalas[1]);
        verificarProxDialogo(idFalas[1],idFalas[2]);
    }

    public void verificarProxDialogo(Fala fAtual,int idFala1, int idFala2, int idFala3, int idFala4, Personagem eliminado, Jogo jogo){

        switch (eliminado.getId()) {
            case 0:
               fAtual.setidProximacena(idCena1);
               break;
            case 1:
               fAtual.setidProximacena(idCena2);
               break;
            case 2:
               fAtual.setidProximacena(idCena3);
               break;
            case 3:
               fAtual.setidProximacena(idCena4);
               break;
            default:
                System.out.println("Opção inválida.");
                break;
}
    }

    // dialogos: cena 1 cap9
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

    if (jogo.getSecundarios()[3] != null && !jogo.getSecundarios()[3].equals(eliminado)) {
        Fala falaBase = (proxFalaAtual != 0) ? buscarFalaPorId(proxFalaAtual, cena) : fAtual;
        verificarProxDialogo(falaBase, idFala10, idFala11, idFala12, jogo.getSecundarios()[3]);
    }
}

//cena: cena 1 cap9
public void verificarProximaCena(Cena cAtual,int idCena1, int idCena2, Personagem protagonista){
    (protagonista.getAntipatia()>60)? cAtual.setidProximacena(idCena1):cAtual.setidProximacena(idCena2);
    
}

//cena: cena do cap10
public void verificarProximaCena(Cena cAtual,int idCena1, int idCena2, int idCena3, int idCena4, int Cena5, int Cena6,Jogo jogo){
    int contador80 = 0;
    Personagem personagemCom80 = null;

    for (Personagem p : jogo.getSecundarios()) {
        if (!p.equals(eliminado)) {
            if (p.getAfinidade() >= 80) {
                contador80++;
                personagemCom80 = p;
            }
        }
    }

    if (contador80 == 1) {
        if(personagemCom80.getId()==0){
            cAtual.setidProximacena(idCena1);
        }
        else if(personagemCom80.getId()==1){
            cAtual.setidProximacena(idCena2);
        }
        else if(personagemCom80.getId()==2){
            cAtual.setidProximacena(idCena3);
        }
        else if(personagemCom80.getId()==3){
            cAtual.setidProximacena(idCena4);
        }
    } else if (contador80 > 1) {
        cAtual.setidProximacena(idCena5);
    } else {
        cAtual.setidProximacena(idCena6);
    }
}
}
}