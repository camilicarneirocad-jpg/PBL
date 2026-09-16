import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoteiroFemininoRepository extends RoteiroRepository {
    
    private Protagonista prota;

    public RoteiroFemininoRepository(Protagonista prota) {
        this.prota = prota;
        carregarCapitulo1();
    }

    private Capitulo carregarCapitulo1() {
        //CENA 1
        List<Fala> falasCena1 = new ArrayList<>();

        falasCena1.add(new Narrativa(1, "As portas do Reserva para Dois estão abertas! O único lugar onde o amor é o prato principal, mas a reserva... ah, essa precisa ser conquistada. No programa de hoje, " + prota.getNome() + " entra na nossa sala VIP e fica de frente para o nosso exigente grupo de solteiras. O objetivo? Usar todo o seu charme, lábia e coração para sair daqui com o convite para o encontro perfeito. Será que ele consegue encantar uma delas a tempo?", "Apresentador", null));
        
        falasCena1.add(new Narrativa(2, "Com vocês, o nosso solteiro da noite: " + prota.getNome() + "! Ele é aquele cara focado, que passa o dia inteiro imerso em projetos, resolvendo problemas e tentando manter a vida funcionando bem. O problema? Ele esqueceu que o amor não tem um código exato e muito menos segue um manual de instruções! Cansado de ver o nosso amigo pedindo pizza todo fim de semana e preso numa rotina inquebrável, os próprios amigos dele roubaram o celular dele e o inscreveram no nosso programa como um verdadeiro agora ou nunca! E para a nossa surpresa... ele topou o desafio!\nVamos conhecer quem vai avaliar o nosso jogador!", "Apresentador", null));
        
        falasCena1.add(new Narrativa(3, "E para abrir o nosso painel de hoje temos uma mulher que sabe exatamente o que é lutar pelo primeiro lugar! Apresento a vocês a incrível Ângela!", "Apresentador", null));
        
        falasCena1.add(new Narrativa(4, "Acostumada a superar limites desde os oito anos de idade, ela é uma atleta de pentatlo que já brilhou nos maiores campeonatos mundiais. Mas, depois de alcançar o auge, a Ângela decidiu fazer uma pausa estratégica no esporte para focar no seu maior desafio até agora: encontrar um amor de verdade. Fica aqui um segredinho dos bastidores para você, " + prota.getNome() + ": por mais que ela seja durona na pista, a Ângela tem pavor de água funda ou de mar aberto.", "Apresentador", null));
        
        falasCena1.add(new Narrativa(5, "Nascida no interior, nossa solteira é apaixonada pela vida ao ar livre e troca qualquer tapete vermelho por um bom pôr do sol na natureza. Hoje, ela divide sua energia ensinando natação para crianças. Mas não se engane, " + prota.getNome() + "! Por trás da doçura de professora, existe a garra de uma competidora internacional. Será que você tem o ritmo e o espírito livre necessários para acompanhar essa mulher?", "Apresentador", null));
        
        falasCena1.add(new Narrativa(6, "Dando Continuidade... Para ocupar a próxima cadeira do nosso painel, nós trouxemos o verdadeiro significado de alta-costura para o Reserva para Dois! Preparem-se para o charme de Mônica!", "Apresentador", null));
        
        falasCena1.add(new Narrativa(7, "Com passaporte carimbado nas capitais mais badaladas do mundo e dupla nacionalidade, dividindo o coração entre o Brasil e a Itália, ela é estilista de uma agência de modelos renomadíssima. Depois de brilhar lá fora, Mônica está de volta ao Brasil com um objetivo claro: injetar as raízes e a essência do nosso país em suas próximas obras-primas.", "Apresentador", null));
        
        falasCena1.add(new Narrativa(8, "Agora que já desfez as malas de grife e se estabilizou por aqui, ela procura o único detalhe que falta na sua coleção: um par romântico à altura! Apaixonada pela selva de pedra, pelo asfalto e pela vida noturna agitada, ela quer alguém que tenha fôlego para acompanhá-la em festas, desfiles e eventos VIPs. E aí, " + prota.getNome() + "? Você tem a elegância e a energia necessárias para desfilar no tapete vermelho ao lado dessa mulher?", "Apresentador", null));
        
        falasCena1.add(new Narrativa(9, "E para provar que a atração não é apenas uma questão de química, mas sim de física, a nossa próxima solteira tem uma mente brilhante e um perfil muito diferente! Apresento a vocês a nossa campeã das Olimpíadas de Física: Marcia!", "Apresentador", null));
        
        falasCena1.add(new Narrativa(10, "Trabalhando nos laboratórios de uma empresa de tecnologia de ponta focada em física quântica, ela passa os dias desvendando os maiores mistérios do universo. Mas vou contar um segredinho nosso, " + prota.getNome() + "... a Marcia não queria estar aqui. O lugar favorito dela no mundo é o conforto e o silêncio da sua própria casa, e ela foi literalmente obrigada pela família a sair do sofá e vir participar do nosso programa!", "Apresentador", null));
        
        falasCena1.add(new Narrativa(11, "Ela não está impressionada com holofotes ou jantares barulhentos, e para ela, o amor ainda é uma equação sem solução. E aí? Você tem o intelecto e a paciência necessários para provar a essa mulher que sair de casa hoje à noite foi a melhor escolha que ela (ou a família dela) poderia ter feito?", "Apresentador", null));
        
        falasCena1.add(new Narrativa(12, "E para completar o nosso painel com um toque de romance e sensibilidade, trazemos uma mulher cuja própria vida parece ter saído das páginas de um clássico! Com vocês, a encantadora Gabriela!", "Apresentador", null));
        
        falasCena1.add(new Narrativa(13, "Batizada em uma linda homenagem à literatura pelos seus pais, ela herdou não apenas o nome famoso, mas uma paixão inabalável pelas palavras. Nossa solteira é escritora e tem o dom de enxergar o mundo de forma poética, valorizando a beleza nas pequenas coisas do dia a dia. Ah, e um detalhe curioso sobre ela que vazou na produção: Gabriela tem um medo obsessivo de que seu estilo soe comercial demais, o que a faz quebrar a cabeça e até queimar rascunhos inteiros. E tem mais: se existe algo que ganha o coração dela mais rápido do que um bom livro, são os animais, sua verdadeira paixão!", "Apresentador", null));
        
        falasCena1.add(new Narrativa(14, "Mas não se iluda achando que será fácil conquistá-la com palavras vazias: para ganhar o coração dessa Gabriela, o seu romance vai precisar ter muito cravo e canela!", "Apresentador", null));
        
        falasCena1.add(new Narrativa(15, "Ela veio ao Reserva para Dois procurando alguém que saiba ler nas entrelinhas e que não tenha medo de viver um romance digno de cinema, ou melhor, de literatura. E aí, " + prota.getNome() + "? Você tem a sensibilidade e o vocabulário necessários para se tornar o protagonista do próximo capítulo da vida dessa escritora?", "Apresentador", null));

        Cena cena1 = new Cena(1, "studio", "trilha_apresentacao.mp3", falasCena1);


        //CENA 2
        List<Fala> falasCena2 = new ArrayList<>();

        falasCena2.add(new Narrativa(1, "Atenção, audiência! O nosso restaurante está oficialmente de portas abertas. As nossas quatro solteiras já estão em seus lugares no painel, e agora chegou a hora da verdade para o nosso convidado. Bem-vindos à nossa primeira dinâmica da temporada!", "Apresentador", null));

        falasCena2.add(new Narrativa(2, prota.getNome() + ", agora você vai se apresentar melhor. Eu vou te fazer três perguntas fundamentais para testar o seu paladar romântico. Cada resposta sua vai ser avaliada em tempo real pelas nossas juradas. Será que você vai conseguir conquistar uma reserva... ou vai fazer o nosso painel pedir a conta mais cedo?", "Apresentador", null));

    
        Secundario Angela = new Secundario(30, 6);
        Secundario Marcia = new Secundario(30, 8);
        Secundario Gabriela = new Secundario(30, 4);
        Secundario Mônica = new Secundario(30, 10);

        // DIÁLOGO1
        Map<Integer, String> opcoesEntrada = Map.of(
            1, "Eu adoraria fugir da cidade. Uma trilha de manhã cedo terminando com um piquenique surpresa no topo de uma montanha",
            2, "Acho que o luxo mora na cidade. Um jantar em um bistrô sofisticado, seguido por uma festa VIP para brindarmos a noite toda.",
            3, "Sinceramente? Ficar em casa. Pedir uma comida excelente, colocar roupas confortáveis e maratonar um bom documentário ou filme de ficção científica.",
            4, "Um passeio no fim da tarde por uma cidade histórica, parando em um café literário e, quem sabe, brincando com alguns cachorros de rua pelo caminho.",
            5, "Ah, qualquer lugar serve. Eu sou uma pessoa fácil de lidar, deixo a garota escolher o que ela quiser."
        );
        

        
        Map<Integer, String> respostasCurtasEntrada = Map.of(
            1, "Uma escolha aventureira! Tirar o encontro da zona de conforto e respirar ar puro mostra muita energia.",
            2, "Classe e sofisticação! Muito bem!",
            3, "Ousado! Fugir das multidões e apostar no conforto do sofá. É uma estratégia intimista...",
            4, "Um romântico à moda antiga! Um passeio tranquilo com direito a café e pets mostra muita sensibilidade!",
            5, "Falta de atitude e iniciativa! Ninguém gosta de quem não planeja nada!"
        );

        Map<Integer, Integer> pontosEntradaangela = Map.of(1, 3, 2, 0, 3, 0, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradamonica = Map.of(1, 0, 2, 3, 3, 0, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradamarcia = Map.of(1, 0, 2, 0, 3, 3, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradagabriela = Map.of(1, 0, 2, 0, 3, 0, 4, 3, 5, -2);

        Map<Secundario, Map<Integer, Integer>> impactoTotal = new HashMap<>();
        impactoTotal.put(Angela, pontosEntradaangela);
        impactoTotal.put(Mônica, pontosEntradamonica);
        impactoTotal.put(Marcia, pontosEntradamarcia);     
        impactoTotal.put(Gabriela, pontosEntradagabriela); 

        falasCena2.add(new Dialogo(
            3, 
            "Muito bem, " + prota.getNome() + ", vamos começar a esquentar os motores. Para o nosso 'Prato de Entrada', eu quero saber: se você ganhasse a oportunidade de montar seu date, como seria o seu encontro ideal para impressionar logo de cara?", 
            "Apresentador", 
            null,                     
            opcoesEntrada, 
            destinosEntrada, 
            respostasCurtasEntrada, 
            impactoTotal,          
            5                         
        ));

        // DIÁLOGO 2
        Map<Integer, String> opcoesEntrada2 = Map.of(
            1, "Aproveito o silêncio. Ficar ouvindo a chuva bater na janela enquanto conversamos sobre coisas profundas é melhor do que qualquer lugar lotado.",
            2, "Convido ela a correr na chuva, provando que o clima não estraga um bom romance.",
            3, "Chuva não me assusta! Eu a desafio para uma corrida até o carro ou invento uma competição rápida só para não perdermos a adrenalina.",
            4, "Eu chamo um ótimo carro de aplicativo e mudo a rota para um evento fechado de alta classe. Sempre tenho um plano B sofisticado.",
            5, "Eu provavelmente ficaria de mau humor até a noite acabar."
        );
        
        Map<Integer, Integer> destinosEntrada2 = Map.of(1, 5, 2, 5, 3, 5, 4, 5, 5, 5);
        
        Map<Integer, String> respostasCurtasEntrada2 = Map.of(
            1, "Enxergar a paz no meio de um imprevisto é para poucos!",
            2, "O clássico romantismo para salvar a noite!",
            3, "Para transformar um desastre em uma competição debaixo de água... É preciso muita disposição.",
            4, "Plano B de altíssimo nível!",
            5, "Eu provavelmente ficaria de mau humor e pediria desculpas o tempo todo até a noite acabar."
        );

        Map<Integer, Integer> pontosEntradaangela2 = Map.of(1, 0, 2, 0, 3, 4, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradamonica2 = Map.of(1, 0, 2, 0, 3, 0, 4, 4, 5, -2);
        Map<Integer, Integer> pontosEntradamarcia2 = Map.of(1, 4, 2, 0, 3, 0, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradagabriela2 = Map.of(1, 0, 2, 4, 3, 0, 4, 0, 5, -2);

        Map<Secundario, Map<Integer, Integer>> impactoTotal2 = new HashMap<>();
        impactoTotal2.put(Angela, pontosEntradaangela2);
        impactoTotal2.put(Mônica, pontosEntradamonica2);
        impactoTotal2.put(Marcia, pontosEntradamarcia2);    
        impactoTotal2.put(Gabriela, pontosEntradagabriela2); 

        falasCena2.add(new Dialogo(
            4, 
            "Gostei da resposta! Mas no amor, nem tudo sai como planejado. Vamos para o nosso 'Prato Principal': imagine que o encontro de vocês deu totalmente errado e começou a chover muito. Como você salva a noite?", 
            "Apresentador", 
            null,                     
            opcoesEntrada2, 
            destinosEntrada2, 
            respostasCurtasEntrada2, 
            impactoTotal2,          
            5                         
        ));

        //DIÁLOGO 3 
        Map<Integer, String> opcoesEntrada3 = Map.of(
            1, "Procuro alguém ambiciosa, que tenha uma vida badalada e que queira dominar o mundo ao meu lado.",
            2, "Estou em busca de um amor épico, daqueles que a gente lê nos livros clássicos, cheio de significado nas pequenas coisas.",
            3, "Quero alguém que não me force a ser o centro das atenções, que entenda que o silêncio a dois também é uma declaração de amor.",
            4, "Quero uma companheira que me desafie, que tope qualquer aventura.",
            5, "Não sei direito ainda, só não queria ficar sozinho no fim de semana, para ser sincero."
        );
        
        Map<Integer, Integer> destinosEntrada3 = Map.of(1, 6, 2, 6, 3, 6, 4, 6, 5, 6);
        
        Map<Integer, String> respostasCurtasEntrada3 = Map.of(
            1, "Ótimo! Uma dupla que nunca sai de moda.",
            2, "Isso é tão romântico!",
            3, "Valorizar o silêncio compartilhado mostra muita maturidade.",
            4, "Um casal de aventureiros! Que maravilha.",
            5, "'Não querer ficar sozinho' é a pior desculpa que a nossa plateia já ouviu."
        );

        Map<Integer, Integer> pontosEntradaangela3 = Map.of(1, 0, 2, 0, 3, 0, 4, 5, 5, -2);
        Map<Integer, Integer> pontosEntradamonica3 = Map.of(1, 5, 2, 0, 3, 0, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradamarcia3 = Map.of(1, 0, 2, 0, 3, 5, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradagabriela3 = Map.of(1, 0, 2, 5, 3, 0, 4, 0, 5, -2);

        Map<Secundario, Map<Integer, Integer>> impactoTotal3 = new HashMap<>();
        impactoTotal3.put(Angela, pontosEntradaangela3);
        impactoTotal3.put(Mônica, pontosEntradamonica3);
        impactoTotal3.put(Marcia, pontosEntradamarcia3);    
        impactoTotal3.put(Gabriela, pontosEntradagabriela3); 

        falasCena2.add(new Dialogo(
            5, 
            "Para fechar o nosso menu de perguntas, a 'Sobremesa'! O nosso painel de solteiras é exigente, " + prota.getNome() + "! Por que você está aqui hoje? O que você realmente busca em uma parceira?", 
            "Apresentador", 
            null,                     
            opcoesEntrada3, 
            destinosEntrada3, 
            respostasCurtasEntrada3, 
            impactoTotal3,          
            5                         
        ));

        Cena cena2 = new Cena(2, "Studio", "trilha_jantar.mp3", falasCena2);

        List<Cena> cenasCap1 = new ArrayList<>();
        cenasCap1.add(cena1);
        cenasCap1.add(cena2);

        Capitulo capitulo1 = new Capitulo(1, "Estreia", 1, 1, cenasCap1);
    }
}