package Repository;

import Model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoteiroFemininoRepository extends RoteiroRepository {
    
    private Protagonista prota;

    public RoteiroFemininoRepository(Protagonista prota) {
        this.prota = prota;
        carregarCapitulo1();
        carregarCapitulo2();
        carregarCapitulo3();
        carregarCapitulo4();
        carregarCapitulo5();
        carregarCapitulo6();
        carregarCapitulo7();
        carregarCapitulo8();
        carregarCapitulo9();
        carregarCapitulo10();
    }

    private Capitulo carregarCapitulo1() {
        //CENA 14
        List<Fala> falasCena1 = new ArrayList<>();

        falasCena1.add(new Narrativa(1, "As portas do Reserva para Dois estão abertas! O único lugar onde o amor é o prato principal, mas a reserva... ah, essa precisa ser conquistada. No programa de hoje, " + prota.getNome() + " entra na nossa sala VIP e fica de frente para o nosso exigente grupo de solteiras. O objetivo? Usar todo o seu charme, lábia e coração para sair daqui com o convite para o encontro perfeito. Será que ele consegue encantar uma delas a tempo?", 2));
        falasCena1.add(new Narrativa(2, "Com vocês, o nosso solteiro da noite: " + prota.getNome() + "! Ele é aquele cara focado, que passa o dia inteiro imerso em projetos, resolvendo problemas e tentando manter a vida funcionando bem. O problema? Ele esqueceu que o amor não tem um código exato e muito menos segue um manual de instruções! Cansado de ver o nosso amigo pedindo pizza todo fim de semana e preso numa rotina inquebrável, os próprios amigos dele roubaram o celular dele e o inscreveram no nosso programa como um verdadeiro agora ou nunca! E para a nossa surpresa... ele topou o desafio!\nVamos conhecer quem vai avaliar o nosso jogador!", 3));
        falasCena1.add(new Narrativa(3, "E para abrir o nosso painel de hoje temos uma mulher que sabe exatamente o que é lutar pelo primeiro lugar! Apresento a vocês a incrível Ângela!", 4));
        falasCena1.add(new Narrativa(4, "Acostumada a superar limites desde os oito anos de idade, ela é uma atleta de pentatlo que já brilhou nos maiores campeonatos mundiais. Mas, depois de alcançar o auge, a Ângela decidiu fazer uma pausa estratégica no esporte para focar no seu maior desafio até agora: encontrar um amor de verdade. Fica aqui um segredinho dos bastidores para você, " + prota.getNome() + ": por mais que ela seja durona na pista, a Ângela tem pavor de água funda ou de mar aberto.", 5));
        falasCena1.add(new Narrativa(5, "Nascida no interior, nossa solteira é apaixonada pela vida ao ar livre e troca qualquer tapete vermelho por um bom pôr do sol na natureza. Hoje, ela divide sua energia ensinando natação para crianças. Mas não se engane, " + prota.getNome() + "! Por trás da doçura de professora, existe a garra de uma competidora internacional. Será que você tem o ritmo e o espírito livre necessários para acompanhar essa mulher?", 6));
        falasCena1.add(new Narrativa(6, "Dando Continuidade... Para ocupar a próxima cadeira do nosso painel, nós trouxemos o verdadeiro significado de alta-costura para o Reserva para Dois! Preparem-se para o charme de Mônica!", 7));
        falasCena1.add(new Narrativa(7, "Com passaporte carimbado nas capitais mais badaladas do mundo e dupla nacionalidade, dividindo o coração entre o Brasil e a Itália, ela é estilista de uma agência de modelos renomadíssima. Depois de brilhar lá fora, Mônica está de volta ao Brasil com um objetivo claro: injetar as raízes e a essência do nosso país em suas próximas obras-primas.", 8));
        falasCena1.add(new Narrativa(8, "Agora que já desfez as malas de grife e se estabilizou por aqui, ela procura o único detalhe que falta na sua coleção: um par romântico à altura! Apaixonada pela selva de pedra, pelo asfalto e pela vida noturna agitada, ela quer alguém que tenha fôlego para acompanhá-la em festas, desfiles e eventos VIPs. E aí, " + prota.getNome() + "? Você tem a elegância e a energia necessárias para desfilar no tapete vermelho ao lado dessa mulher?", 9));
        falasCena1.add(new Narrativa(9, "E para provar que a atração não é apenas uma questão de química, mas sim de física, a nossa próxima solteira tem uma mente brilhante e um perfil muito diferente! Apresento a vocês a nossa campeã das Olimpíadas de Física: Marcia!", 10));
        falasCena1.add(new Narrativa(10, "Trabalhando nos laboratórios de uma empresa de tecnologia de ponta focada em física quântica, ela passa os dias desvendando os maiores mistérios do universo. Mas vou contar um segredinho nosso, " + prota.getNome() + "... a Marcia não queria estar aqui. O lugar favorito dela no mundo é o conforto e o silêncio da sua própria casa, e ela foi literalmente obrigada pela família a sair do sofá e vir participar do nosso programa!", 11));
        falasCena1.add(new Narrativa(11, "Ela não está impressionada com holofotes ou jantares barulhentos, e para ela, o amor ainda é uma equação sem solução. E aí? Você tem o intelecto e a paciência necessários para provar a essa mulher que sair de casa hoje à noite foi a melhor escolha que ela (ou a família dela) poderia ter feito?", 12));
        falasCena1.add(new Narrativa(12, "E para completar o nosso painel com um toque de romance e sensibilidade, trazemos uma mulher cuja própria vida parece ter saído das páginas de um clássico! Com vocês, a encantadora Gabriela!", 13));
        falasCena1.add(new Narrativa(13, "Batizada em uma linda homenagem à literatura pelos seus pais, ela herdou não apenas o nome famoso, mas uma paixão inabalável pelas palavras. Nossa solteira é escritora e tem o dom de enxergar o mundo de forma poética, valorizando a beleza nas pequenas coisas do dia a dia. Ah, e um detalhe curioso sobre ela que vazou na produção: Gabriela tem um medo obsessivo de que seu estilo soe comercial demais, o que a faz quebrar a cabeça e até queimar rascunhos inteiros. E tem mais: se existe algo que ganha o coração dela mais rápido do que um bom livro, são os animais, sua verdadeira paixão!", 14));
        falasCena1.add(new Narrativa(14, "Mas não se iluda achando que será fácil conquistá-la com palavras vazias: para ganhar o coração dessa Gabriela, o seu romance vai precisar ter muito cravo e canela!", 15));
        falasCena1.add(new Narrativa(15, "Ela veio ao Reserva para Dois procurando alguém que saiba ler nas entrelinhas e que não tenha medo de viver um romance digno de cinema, ou melhor, de literatura. E aí, " + prota.getNome() + "? Você tem a sensibilidade e o vocabulário necessários para se tornar o protagonista do próximo capítulo da vida dessa escritora?", 0));

        Cena cena1 = new Cena(1, "studio", "trilha_apresentacao.mp3", 1, falasCena1);


        //CENA 2
        List<Fala> falasCena2 = new ArrayList<>();

        falasCena2.add(new Narrativa(1, "Atenção, audiência! O nosso restaurante está oficialmente de portas abertas. As nossas quatro solteiras já estão em seus lugares no painel, e agora chegou a hora da verdade para o nosso convidado. Bem-vindos à nossa primeira dinâmica da temporada!", 2));
        falasCena2.add(new Narrativa(2, prota.getNome() + ", agora você vai se apresentar melhor. Eu vou te fazer três perguntas fundamentais para testar o seu paladar romântico. Cada resposta sua vai ser avaliada em tempo real pelas nossas juradas. Será que você vai conseguir conquistar uma reserva... ou vai fazer o nosso painel pedir a conta mais cedo?", 0));

    
        Secundario Angela = new Secundario("Angela", 6, 5, 5);
        Secundario Marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario Gabriela = new Secundario("Gabriela", 4, 5, 5);
        Secundario Monica = new Secundario("Mônica", 10, 5, 50);

        // DIÁLOGO1
        Map<Integer, String> opcoesEntrada = Map.of(
            1, "Eu adoraria fugir da cidade. Uma trilha de manhã cedo terminando com um piquenique surpresa no topo de uma montanha",
            2, "Acho que o luxo mora na cidade. Um jantar em um bistrô sofisticado, seguido por uma festa VIP para brindarmos a noite toda.",
            3, "Sinceramente? Ficar em casa. Pedir uma comida excelente, colocar roupas confortáveis e maratonar um bom documentário ou filme de ficção científica.",
            4, "Um passeio no fim da tarde por uma cidade histórica, parando em um café literário e, quem sabe, brincando com alguns cachorros de rua pelo caminho.",
            5, "Ah, qualquer lugar serve. Eu sou uma pessoa fácil de lidar, deixo a garota escolher o que ela quiser."
        );

        Map<Integer, Integer> destinosEntrada = Map.of(1, 4, 2, 4, 3, 4, 4, 4, 5, 4);
        
        Map<Integer, String> respostasCurtasEntrada = Map.of(
            1, "Uma escolha aventureira! Tirar o encontro da zona de conforto e respirar ar puro mostra muita energia.",
            2, "Classe e sofisticação! Muito bem!",
            3, "Ousado! Fugir das multidões e apostar no conforto do sofá. É uma estratégia intimista...",
            4, "Um romântico à moda antiga! Um passeio tranquilo com direito a café e pets mostra muita sensibilidade!",
            5, "Falta de atitude e iniciativa! Ninguém gosta de quem não planeja nada!"
        );

        Map<Integer, Integer> pontosEntradaAngela = Map.of(1, 3, 2, 0, 3, 0, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradaMonica = Map.of(1, 0, 2, 3, 3, 0, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradaMarcia = Map.of(1, 0, 2, 0, 3, 3, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradaGabriela = Map.of(1, 0, 2, 0, 3, 0, 4, 3, 5, -2);

        Map<Secundario, Map<Integer, Integer>> impactoTotal = new HashMap<>();
        impactoTotal.put(Angela, pontosEntradaAngela);
        impactoTotal.put(Monica, pontosEntradaMonica);
        impactoTotal.put(Marcia, pontosEntradaMarcia);
        impactoTotal.put(Gabriela, pontosEntradaGabriela);

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

        Map<Integer, Integer> pontosEntradaAngela2 = Map.of(1, 0, 2, 0, 3, 4, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradaMonica2 = Map.of(1, 0, 2, 0, 3, 0, 4, 4, 5, -2);
        Map<Integer, Integer> pontosEntradaMarcia2 = Map.of(1, 4, 2, 0, 3, 0, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradaGabriela2 = Map.of(1, 0, 2, 4, 3, 0, 4, 0, 5, -2);

        Map<Secundario, Map<Integer, Integer>> impactoTotal2 = new HashMap<>();
        impactoTotal2.put(Angela, pontosEntradaAngela2);
        impactoTotal2.put(Monica, pontosEntradaMonica2);
        impactoTotal2.put(Marcia, pontosEntradaMarcia2);
        impactoTotal2.put(Gabriela, pontosEntradaGabriela2);

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

        Map<Integer, Integer> pontosEntradaAngela3 = Map.of(1, 0, 2, 0, 3, 0, 4, 5, 5, -2);
        Map<Integer, Integer> pontosEntradaMonica3 = Map.of(1, 5, 2, 0, 3, 0, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradaMarcia3 = Map.of(1, 0, 2, 0, 3, 5, 4, 0, 5, -2);
        Map<Integer, Integer> pontosEntradaGabriela3 = Map.of(1, 0, 2, 5, 3, 0, 4, 0, 5, -2);

        Map<Secundario, Map<Integer, Integer>> impactoTotal3 = new HashMap<>();
        impactoTotal3.put(Angela, pontosEntradaAngela3);
        impactoTotal3.put(Monica, pontosEntradaMonica3);
        impactoTotal3.put(Marcia, pontosEntradaMarcia3);
        impactoTotal3.put(Gabriela, pontosEntradaGabriela3);

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

        // Guardando no repositório
        for (Fala fala : falasCena1) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        for (Fala fala : falasCena2) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        bancoDeCapitulos.put(capitulo1.getIdCapitulo(), capitulo1);

        return capitulo1;
    }

    private Capitulo carregarCapitulo2() {
        Secundario angela = new Secundario("Angela", 6, 5, 5);
        Secundario monica = new Secundario("Mônica", 10, 5, 50);
        Secundario marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario gabriela = new Secundario("Gabriela", 4, 5, 5);

        // CENA 1 - Arvorismo com a Ângela
        List<Fala> falasCena1 = new ArrayList<>();

        falasCena1.add(new Narrativa(201, "O jogo esquentou, Brasil! O palco ficou pequeno demais para as emoções de hoje, então decidimos mandar o nosso solteiro direto para a ação. Começa agora a nossa rodada de encontros individuais!", 202));
        falasCena1.add(new Narrativa(202, "E para estrear essa fase com o pé direito — ou melhor, nas alturas — " + prota.getNome() + " terá o seu primeiro encontro com a nossa imparável atleta, Ângela!", 203));
        falasCena1.add(new Narrativa(203, "A nossa produção preparou um cenário perfeito para testar os limites dessa dupla: um circuito de arvorismo radical no meio da natureza!", 204));

        // Diálogo 1 - Desespero na subida
        Map<Integer, String> opcoes1 = Map.of(
                1, "Desespero nenhum, eu adoro um desafio! Mas confesso que vou ter que treinar muito para te acompanhar na próxima vez.",
                2, "Foi intenso, mas a vista daqui de cima e respirar esse ar puro compensam qualquer esforço que a gente fez.",
                3, "Só tentei não olhar para baixo. Foi legal, mas espero que nosso próximo encontro seja no nível do chão.",
                4, "Achei meio exagerado, para ser sincero. Não sei quem inventou que escalar no primeiro encontro é uma boa ideia."
        );
        Map<Integer, Integer> destinos1 = Map.of(1, 205, 2, 205, 3, 205, 4, 205);
        Map<Integer, String> respostas1 = Map.of(
                1, "Opa, promessa é dívida! Já vou começar a pensar em qual vai ser a nossa próxima arena de treino.",
                2, "É, a recompensa visual daqui de cima é imbatível mesmo. Valeu o suor.",
                3, "Justo. A gravidade não é a melhor amiga de todo mundo, eu entendo o seu lado.",
                4, "Se fosse para ser fácil e confortável, a gente tinha ficado no sofá do estúdio, né?"
        );
        Map<Secundario, Map<Integer, Integer>> impacto1 = Map.of(
                angela, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                204,
                "Uau, conseguimos! Admito que fiquei surpresa quando a produção sugeriu esse paredão de escalada para o primeiro encontro. E aí, qual foi o seu nível de desespero lá no meio daquela subida?",
                "Ângela", angela, opcoes1, destinos1, respostas1, impacto1, 4
        ));

        // Diálogo 2 - Travar na fenda principal
        Map<Integer, String> opcoes2 = Map.of(
                1, "Admito, aquela parte exigiu muito de mim. Ter você ali torcendo foi o empurrão que faltava pra eu não desistir.",
                2, "Foi culpa daquele equipamento de segurança, juro que o equipamento deu uma emperrada na pior hora possível.",
                3, "Eu travei porque a produção ficou gritando no meu ponto eletrônico, acabei perdendo totalmente a concentração.",
                4, "Não ouse rir da minha técnica infalível! Eu chamo aquilo de 'tática milenar do pânico controlado'. Tudo milimetricamente calculado!"
        );
        Map<Integer, Integer> destinos2 = Map.of(1, 206, 2, 206, 3, 206, 4, 206);
        Map<Integer, String> respostas2 = Map.of(
                1, "Pode deixar. Se precisar, eu viro a sua treinadora motivacional oficial do programa.",
                2, "Aham, sei... A velha desculpa de que a culpa é do equipamento e nunca da pecinha presa nele.",
                3, "Sério? Foco! Você não pode deixar o barulho de fora te derrubar no meio do percurso.",
                4, "Pânico controlado! Essa é nova, vou ter que anotar no meu caderninho de desculpas esfarrapadas!"
        );
        Map<Secundario, Map<Integer, Integer>> impacto2 = Map.of(
                angela, Map.of(1, 3, 2, -1, 3, -3, 4, 5)
        );

        falasCena1.add(new Dialogo(
                205,
                "Para um novato, você até que se saiu bem. Mas teve uma hora ali na fenda principal que você travou bonito. Vai admitir que precisou de uma ajudinha da minha torcida para não travar de vez?",
                "Ângela", angela, opcoes2, destinos2, respostas2, impacto2, 3
        ));

        // Diálogo 3 - Sair da zona de conforto
        Map<Integer, String> opcoes3 = Map.of(
                1, "Na verdade? Só a pressão das obrigações. Se eu pudesse, passava os meus dias no modo avião sem muito esforço.",
                2, "Conhecer histórias novas, viver momentos fora da curva como o que estamos dividindo hoje. Isso vale a pena.",
                3, "Eu gosto da minha rotina. Prefiro ter as coisas sob controle e bem planejadas do que ficar caçando caos o tempo todo.",
                4, "A sensação de me superar. Eu gosto de olhar para trás e ver que resolvi um problema e evoluí, não importa a área."
        );
        Map<Integer, Integer> destinos3 = Map.of(1, 207, 2, 207, 3, 207, 4, 207);
        Map<Integer, String> respostas3 = Map.of(
                1, "Nossa... Que jeito triste de levar a vida. Falta um pouco de combustível no seu motor.",
                2, "É uma visão bonita da vida... Um pouco poética demais pra mim, talvez, mas muito bonita.",
                3, "Entendi. Você é do tipo que prefere ler o manual de instruções inteiro.",
                4, "Exatamente! É sobre provar para si mesmo que você consegue ser melhor hoje do que foi ontem!"
        );
        Map<Secundario, Map<Integer, Integer>> impacto3 = Map.of(
                angela, Map.of(1, -3, 2, 3, 3, -1, 4, 5)
        );

        falasCena1.add(new Dialogo(
                206,
                "Sabe, as pessoas acham que quem é competitivo só quer aparecer para os outros. Mas, para mim, o esporte é sobre o frio na barriga de superar algo difícil. E você? O que te tira da sua zona de conforto de verdade quando você acorda?",
                "Ângela", angela, opcoes3, destinos3, respostas3, impacto3, 1
        ));

        falasCena1.add(new Narrativa(207, "De repente, o tempo vira e algumas gotas começam a cair. Ângela estende a mão, sentindo a garoa.", 208));

        // Diálogo 4 - Reação à chuva
        Map<Integer, String> opcoes4 = Map.of(
                1, "Que falta de organização da equipe, né? Custava ter olhado a previsão do tempo antes de armar esse circo todo?",
                2, "A gente enrola a produção! Uma chuvinha de leve só deixa essa vista mais épica. Vamos ficar sentados aqui mais um pouco.",
                3, "Acho melhor a gente começar a descer. A madeira pode ficar escorregadia e a segurança tem que vir em primeiro lugar.",
                4, "Péssimo momento! A minha roupa já estava suada, agora vai ficar toda encharcada. Vamos sair daqui agora."
        );
        Map<Integer, Integer> destinos4 = Map.of(1, 209, 2, 209, 3, 209, 4, 209);
        Map<Integer, String> respostas4 = Map.of(
                1, "Eles só estão fazendo o trabalho deles. Reclamar agora não vai fazer a chuva parar de cair.",
                2, "Gostei da atitude! Deixa a direção pirar lá embaixo, a vista agora é só nossa!",
                3, "É, você tem um ponto. Não adianta a gente bancar o herói e escorregar na descida.",
                4, "Sério que o seu problema agora é a roupa? Que frescura! É só água!"
        );
        Map<Secundario, Map<Integer, Integer>> impacto4 = Map.of(
                angela, Map.of(1, -1, 2, 5, 3, 3, 4, -3)
        );

        falasCena1.add(new Dialogo(
                208,
                "Ih, parece que o clima resolveu testar a gente. Se apertar, a direção vai cortar a gravação e mandar a gente de volta pra van correndo. O que a gente faz?",
                "Ângela", angela, opcoes4, destinos4, respostas4, impacto4, 4
        ));

        falasCena1.add(new Narrativa(209, "A chuva aperta um pouquinho, e vocês começam a juntar os equipamentos.", 210));

        // Diálogo 5 - Avaliação final do passeio
        Map<Integer, String> opcoes5 = Map.of(
                1, "Eu me diverti muito, de verdade. Foi a quebra de rotina perfeita que eu não sabia que precisava.",
                2, "Foi sensacional. Mas já vou avisando, Ângela: no nosso próximo encontro, eu escolho a arena!",
                3, "Eu queria muito te impressionar hoje. Se você achou legal, então o meu sacrifício valeu a pena.",
                4, "É tudo parte do jogo, né? A gente precisa entregar um bom roteiro para o público se quiser ganhar a temporada."
        );
        Map<Integer, Integer> destinos5 = Map.of(1, 211, 2, 211, 3, 211, 4, 211);
        Map<Integer, String> respostas5 = Map.of(
                1, "Que bom! Fico feliz que eu tenha conseguido te arrancar do modo automático hoje.",
                2, "Fechado! Quero só ver se você tem bala na agulha para me desafiar no próximo round!",
                3, "Não precisa de tanto sacrifício assim. O objetivo era a gente tentar se divertir juntos.",
                4, "Ah, entendi. Então pode avisar a direção que a minha cota de atuação por hoje acabou."
        );
        Map<Secundario, Map<Integer, Integer>> impacto5 = Map.of(
                angela, Map.of(1, 3, 2, 5, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                210,
                "Antes de a gente voltar lá para baixo e entrar no 'modo reality show' de novo, me responde de verdade: você gostou do passeio de hoje, ou só topou escalar pra não ficar mal na televisão?",
                "Ângela", angela, opcoes5, destinos5, respostas5, impacto5, 4
        ));

        Cena cena1 = new Cena(1, "Circuito de Arvorismo", "trilha_aventura.mp3", 201, falasCena1);

        // CENA 2 - Escolha de Foto e Legenda para as Redes Sociais
        List<Fala> falasCena2 = new ArrayList<>();

        // Escolha da Foto
        Map<Integer, String> opcoesFoto = Map.of(
                1, "Selfie no topo da parede, rosto suado, sorrindo e mostrando os músculos (ou fazendo um sinal de vitória).",
                2, "Foto conceitual apenas dos equipamentos de escalada (mosquetões e cordas) com um filtro preto e branco super elegante.",
                3, "Foto macro de um inseto ou da textura da madeira da plataforma, sem nenhuma pessoa na imagem.",
                4, "Foto espontânea das nuvens de chuva se formando no horizonte, com a luz do sol cortando a paisagem."
        );
        Map<Integer, Integer> destinosFoto = Map.of(1, 212, 2, 212, 3, 212, 4, 212);
        Map<Integer, String> respostasFoto = Map.of(
                1, "Foto publicada! O perfil oficial destacou a tua energia no circuito de escalada.",
                2, "Foto publicada! O visual conceitual impressionou os seguidores mais exigentes.",
                3, "Foto publicada! Um olhar detalhista e calmo sobre a natureza local.",
                4, "Foto publicada! O toque poético do horizonte rendeu muitas interações."
        );
        Map<Secundario, Map<Integer, Integer>> impactoFoto = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0),
                monica, Map.of(1, 0, 2, 5, 3, 0, 4, 0),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0),
                gabriela, Map.of(1, 0, 2, 0, 3, 0, 4, 5)
        );

        falasCena2.add(new Dialogo(
                211,
                "Hora de atualizar o feed oficial do programa! Escolha a foto do seu encontro:",
                "Apresentador", null, opcoesFoto, destinosFoto, respostasFoto, impactoFoto, 0
        ));

        // Escolha da Legenda
        Map<Integer, String> opcoesLegenda = Map.of(
                1, "A gravidade tentou, mas hoje eu venci! Que venha o próximo desafio.",
                2, "Aventuras ao ar livre são ótimas, mas confesso que já estou sentindo falta de um ar-condicionado e uma taça de champanhe.",
                3, "O silêncio lá de cima foi a melhor parte. É fascinante como a física da escalada depende de tanta distribuição de peso perfeita.",
                4, "Às vezes, a gente precisa subir o mais alto possível para enxergar o que realmente importa. Um encontro para ficar na memória."
        );
        Map<Integer, Integer> destinosLegenda = Map.of(1, 213, 2, 213, 3, 213, 4, 213);
        Map<Integer, String> respostasLegenda = Map.of(
                1, "Legenda salva com sucesso!",
                2, "Legenda salva com sucesso!",
                3, "Legenda salva com sucesso!",
                4, "Legenda salva com sucesso!"
        );
        Map<Secundario, Map<Integer, Integer>> impactoLegenda = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0),
                monica, Map.of(1, 0, 2, 5, 3, 0, 4, 0),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0),
                gabriela, Map.of(1, 0, 2, 0, 3, 0, 4, 5)
        );

        falasCena2.add(new Dialogo(
                212,
                "Agora escolha a legenda perfeita para acompanhar a sua foto:",
                "Apresentador", null, opcoesLegenda, destinosLegenda, respostasLegenda, impactoLegenda, 0
        ));

        Cena cena2 = new Cena(2, "Rede Social", "trilha_feed.mp3", 211, falasCena2);

        List<Cena> cenasCap2 = new ArrayList<>();
        cenasCap2.add(cena1);
        cenasCap2.add(cena2);

        Capitulo capitulo2 = new Capitulo(2, "Encontros Individuais - Ângela", 201, 212, cenasCap2);

        for (Fala fala : falasCena1) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        for (Fala fala : falasCena2) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        bancoDeCapitulos.put(capitulo2.getIdCapitulo(), capitulo2);

        return capitulo2;
    }

    private Capitulo carregarCapitulo3() {
        Secundario angela = new Secundario("Angela", 6, 5, 5);
        Secundario monica = new Secundario("Mônica", 10, 5, 50);
        Secundario marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario gabriela = new Secundario("Gabriela", 4, 5, 5);

        // CENA 1 - Sebo Literário com a Gabriela
        List<Fala> falasCena1 = new ArrayList<>();

        falasCena1.add(new Narrativa(301, "Ufa! Depois de suarmos a camisa nas alturas, acho que todo mundo precisa de um chá para acalmar os nervos, não é mesmo? O nosso restaurante preza pelo equilíbrio, e é por isso que o segundo encontro da temporada muda completamente de ritmo.", 302));
        falasCena1.add(new Narrativa(302, "Hoje, " + prota.getNome() + " vai mergulhar no universo da nossa romântica escritora, Gabriela! A produção preparou uma tarde em um dos sebos literários mais antigos e charmosos da cidade. Será que o nosso protagonista consegue compreender as metáforas do coração? Ou será que ele vai ficar sem palavras logo no primeiro parágrafo? Silêncio no set, porque o capítulo de hoje já começou a ser escrito!", 303));

        // Diálogo 1 - O cheiro dos livros
        Map<Integer, String> opcoes1 = Map.of(
                1, "Com certeza. Pensar que essas páginas já fizeram companhia para tantas pessoas no passado dá até um arrepio.",
                2, "É um lugar tranquilo. Um ótimo esconderijo para fugir do barulho da cidade por algumas horas.",
                3, "É interessante, mas eu sou uma pessoa prática. Prefiro ler tudo no meu leitor digital para não ocupar espaço.",
                4, "Sinceramente? Para mim tem cheiro de mofo e poeira. Já estou até com vontade de espirrar."
        );
        Map<Integer, Integer> destinos1 = Map.of(1, 304, 2, 304, 3, 304, 4, 304);
        Map<Integer, String> respostas1 = Map.of(
                1, "Exato! É um privilégio compartilhar a mesma história que um estranho do passado.",
                2, "Sim, a paz daqui é um refúgio muito necessário.",
                3, "A tecnologia tem suas vantagens, mas falta a textura da história nas mãos, não acha?",
                4, "Oh... Que pena. Acho que a poesia não sobrevive muito bem à rinite, não é?"
        );
        Map<Secundario, Map<Integer, Integer>> impacto1 = Map.of(
                gabriela, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                303,
                "Sabe o que eu mais amo neste lugar? O cheiro das páginas antigas. Cada livro aqui já foi lido por dezenas de pessoas antes de nós. É como se estivéssemos rodeados por centenas de vidas diferentes. Você consegue sentir isso?",
                "Gabriela", gabriela, opcoes1, destinos1, respostas1, impacto1, 4
        ));

        // Diálogo 2 - Escolha da Leitura
        Map<Integer, String> opcoes2 = Map.of(
                1, "Algo sobre ciências ou matemática. Gosto de coisas que me ensinem fatos e tenham respostas lógicas e exatas.",
                2, "Uma biografia sobre alguém rico e famoso. Sempre é bom aprender com quem soube vencer na vida.",
                3, "Um mistério bem construído. Gosto da sensação de tentar montar um quebra-cabeça na minha mente.",
                4, "Um romance clássico, daqueles com cartas escritas à mão e promessas de amor que atravessam décadas."
        );
        Map<Integer, Integer> destinos2 = Map.of(1, 305, 2, 305, 3, 305, 4, 305);
        Map<Integer, String> respostas2 = Map.of(
                1, "A exatidão e a lógica têm o seu valor... mas eu sinto que a verdadeira beleza está naquilo que não tem explicação.",
                2, "Entendo. O sucesso financeiro atrai muita gente.",
                3, "Um bom mistério prende a atenção. Quem sabe você não me ajuda a desvendar alguns por aqui?",
                4, "Ah, as promessas que desafiam o tempo... Você acabou de roubar as palavras da minha boca."
        );
        Map<Secundario, Map<Integer, Integer>> impacto2 = Map.of(
                gabriela, Map.of(1, -1, 2, -3, 3, 3, 4, 5)
        );

        falasCena1.add(new Dialogo(
                304,
                "Eu acredito que você não escolhe um livro, o livro escolhe você. Se você tivesse que pegar uma história para levar para casa hoje e ler antes de dormir, qual gênero procuraria?",
                "Gabriela", gabriela, opcoes2, destinos2, respostas2, impacto2, 2
        ));

        // Diálogo 3 - O Destino
        Map<Integer, String> opcoes3 = Map.of(
                1, "Eu seguro a caneta. Tudo o que eu tenho hoje foi fruto das minhas escolhas, não acredito em destino.",
                2, "Acho que nem importa. O universo é um caos aleatório e a gente só está tentando sobreviver aos boletos.",
                3, "Um pouco dos dois. O destino nos coloca na mesma página, mas somos nós que decidimos o final do capítulo.",
                4, "Acredito que tudo acontece por um motivo. Se a gente está aqui hoje, é porque estava escrito que deveria ser assim."
        );
        Map<Integer, Integer> destinos3 = Map.of(1, 306, 2, 306, 3, 306, 4, 306);
        Map<Integer, String> respostas3 = Map.of(
                1, "Uma visão muito pragmática. Um pouco solitária, talvez, mas muito forte.",
                2, "Nossa... Que jeito duro de enxergar o milagre de estarmos vivos.",
                3, "Que frase linda! Eu não teria escrito essa resposta de forma mais perfeita.",
                4, "É reconfortante acreditar nisso. Tira um pouco o peso das nossas costas."
        );
        Map<Secundario, Map<Integer, Integer>> impacto3 = Map.of(
                gabriela, Map.of(1, -1, 2, -3, 3, 5, 4, 3)
        );

        falasCena1.add(new Dialogo(
                305,
                "Os personagens deste livro lutam contra o destino até a última página. Isso me faz pensar... Você acha que a nossa história já está escrita nas estrelas, ou somos nós que seguramos a caneta?",
                "Gabriela", gabriela, opcoes3, destinos3, respostas3, impacto3, 2
        ));

        falasCena1.add(new Narrativa(306, "Um raio cai lá fora e, de repente, as luzes do sebo se apagam. Fica apenas a luz fraca da janela.", 307));

        // Diálogo 4 - O Apagão
        Map<Integer, String> opcoes4 = Map.of(
                1, "A gente aproveita. Vou pedir duas velas para o dono do café e transformar isso num encontro à luz de velas.",
                2, "Eu ligo a lanterna do celular. Não precisa ter medo, eu ilumino o caminho até a gente achar a saída.",
                3, "Vou reclamar com a produção. É um absurdo eles não terem um gerador para esse tipo de emergência nas gravações!",
                4, "Você tem medo do escuro? É só uma queda de luz, Gabriela, não estamos num filme de terror."
        );
        Map<Integer, Integer> destinos4 = Map.of(1, 308, 2, 308, 3, 308, 4, 308);
        Map<Integer, String> respostas4 = Map.of(
                1, "À luz de velas, num sebo antigo, no meio de uma tempestade... Você tem a alma de um romancista.",
                2, "Obrigada. Sua luz guiando o caminho no escuro me traz muita segurança.",
                3, "Deixe a equipe em paz, não há gerador no mundo que controle o clima lá fora.",
                4, "Não precisa ser grosseiro. Cada um tem suas próprias sensibilidades, " + prota.getNome() + "."
        );
        Map<Secundario, Map<Integer, Integer>> impacto4 = Map.of(
                gabriela, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                307,
                "Ai! Essa me pegou de surpresa. O escuro absoluto me deixa um pouco ansiosa... O que a gente faz agora?",
                "Gabriela", gabriela, opcoes4, destinos4, respostas4, impacto4, 4
        ));

        // Diálogo 5 - Avaliação Final
        Map<Integer, String> opcoes5 = Map.of(
                1, "Sinceramente, foi um pouco parado demais. Eu esperava que a gente fizesse alguma atividade mais dinâmica.",
                2, "Foi bonito, mas eu fiquei com medo de dizer alguma coisa errada e quebrar esse clima literário de vocês.",
                3, "Foi muito relaxante. Foi um ótimo alívio depois de um dia longo de gravações estressantes.",
                4, "Eu encontrei poesia em você. Esse tempo que passamos juntos valeu mais do que mil aventuras lá fora."
        );
        Map<Integer, Integer> destinos5 = Map.of(1, 309, 2, 309, 3, 309, 4, 309);
        Map<Integer, String> respostas5 = Map.of(
                1, "Compreendo. Algumas pessoas nasceram para ler contos curtos, e não romances longos.",
                2, "O amor não é um rascunho perfeito. Você não precisa ter medo de errar a gramática comigo.",
                3, "Fico contente que eu tenha sido um bom refúgio para o seu cansaço.",
                4, "Nossa... Essa foi a dedicatória mais bonita que alguém já deixou na minha história."
        );
        Map<Secundario, Map<Integer, Integer>> impacto5 = Map.of(
                gabriela, Map.of(1, -3, 2, -1, 3, 3, 4, 5)
        );

        falasCena1.add(new Dialogo(
                308,
                "A luz voltou... Acho que o nosso capítulo de hoje está chegando ao fim. Me diz a verdade: esse encontro te entediou, ou você conseguiu enxergar esse lugar como eu?",
                "Gabriela", gabriela, opcoes5, destinos5, respostas5, impacto5, 1
        ));

        Cena cena1 = new Cena(1, "Sebo Literário", "trilha_sebo.mp3", 301, falasCena1);

        // CENA 2 - Redes Sociais (Foto e Legenda do Livro)
        List<Fala> falasCena2 = new ArrayList<>();

        // Escolha do Livro
        Map<Integer, String> opcoesFoto = Map.of(
                1, "Um manual: 'Guia de Escalada e Sobrevivência'.",
                2, "Um livro de arte/moda: 'História da Alta Costura'. Capa minimalista com cabide de roupas ou salto alto.",
                3, "Um livro acadêmico: 'Física Quântica para Iniciantes'. Capa dura simétrica com símbolo do átomo.",
                4, "Um clássico antigo: 'Antologia Poética'. Aspecto de couro velho com penugem de pena/tinteiro."
        );
        Map<Integer, Integer> destinosFoto = Map.of(1, 310, 2, 310, 3, 310, 4, 310);
        Map<Integer, String> respostasFoto = Map.of(
                1, "Foto publicada! O estilo aventureiro chamou a atenção da Ângela.",
                2, "Foto publicada! O toque elegante e chique agradou à Mônica.",
                3, "Foto publicada! O perfil acadêmico chamou a atenção da Márcia.",
                4, "Foto publicada! A escolha clássica encantou a Gabriela."
        );
        Map<Secundario, Map<Integer, Integer>> impactoFoto = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0),
                monica, Map.of(1, 0, 2, 5, 3, 0, 4, 0),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0),
                gabriela, Map.of(1, 0, 2, 0, 3, 0, 4, 5)
        );

        falasCena2.add(new Dialogo(
                309,
                "Hora de atualizar o feed das redes sociais! Escolha a foto do livro para publicar:",
                "Apresentador", null, opcoesFoto, destinosFoto, respostasFoto, impactoFoto, 0
        ));

        // Escolha da Legenda
        Map<Integer, String> opcoesLegenda = Map.of(
                1, "Ler sobre grandes aventuras é ótimo, mas vivê-las na prática sempre vai ser o meu estilo favorito.",
                2, "O vintage nunca sai de moda. O café perfeito, a iluminação perfeita, o estilo perfeito. O bom gosto mora nos pequenos detalhes.",
                3, "A melhor parte desse lugar nem são os livros, é o silêncio absoluto. A prova de que a paz e o isolamento recarregam qualquer bateria.",
                4, "Entre tantas páginas e histórias perdidas no tempo, a minha favorita estava sentada bem na minha frente. Um encontro inesquecível."
        );
        Map<Integer, Integer> destinosLegenda = Map.of(1, 311, 2, 311, 3, 311, 4, 311);
        Map<Integer, String> respostasLegenda = Map.of(
                1, "Legenda salva com sucesso!",
                2, "Legenda salva com sucesso!",
                3, "Legenda salva com sucesso!",
                4, "Legenda salva com sucesso!"
        );
        Map<Secundario, Map<Integer, Integer>> impactoLegenda = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0),
                monica, Map.of(1, 0, 2, 5, 3, 0, 4, 0),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0),
                gabriela, Map.of(1, 0, 2, 0, 3, 0, 4, 5)
        );

        falasCena2.add(new Dialogo(
                310,
                "Escolha a legenda perfeita para acompanhar a sua foto:",
                "Apresentador", null, opcoesLegenda, destinosLegenda, respostasLegenda, impactoLegenda, 0
        ));

        Cena cena2 = new Cena(2, "Rede Social", "trilha_feed.mp3", 309, falasCena2);

        List<Cena> cenasCap3 = new ArrayList<>();
        cenasCap3.add(cena1);
        cenasCap3.add(cena2);

        Capitulo capitulo3 = new Capitulo(3, "Encontros Individuais - Gabriela", 301, 310, cenasCap3);

        for (Fala fala : falasCena1) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        for (Fala fala : falasCena2) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        bancoDeCapitulos.put(capitulo3.getIdCapitulo(), capitulo3);

        return capitulo3;
    }

    private Capitulo carregarCapitulo4() {
        Secundario angela = new Secundario("Angela", 6, 5, 5);
        Secundario monica = new Secundario("Mônica", 10, 5, 50);
        Secundario marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario gabriela = new Secundario("Gabriela", 4, 5, 5);

        // CENA 1 - Museu de Tecnologia com a Marcia
        List<Fala> falasCena1 = new ArrayList<>();

        falasCena1.add(new Narrativa(401, "Atenção, Brasil! Depois de toda a agitação dos últimos episódios, a nossa produção decidiu baixar um pouco as luzes e o volume. O encontro de hoje é para quem valoriza uma boa conversa sem precisar gritar por cima da música.", 402));
        falasCena1.add(new Narrativa(402, "O " + prota.getNome() + " vai passar a noite com a nossa cientista, Marcia. E para garantir que ela se sinta em casa, nós fechamos o Museu de Tecnologia da cidade inteirinho só para eles.", 403));

        // Diálogo 1 - O Ambiente Vazio
        Map<Integer, String> opcoes1 = Map.of(
                1, "De jeito nenhum. É um alívio ter paz para conversar e pensar sem ter que gritar.",
                2, "Até que é interessante, dá pra focar melhor nas exposições sem ninguém atrapalhando.",
                3, "É um pouco estranho. Parece que o museu está fechado e a gente invadiu.",
                4, "Sendo bem sincero, eu acho meio deprimente. Falta energia, falta gente."
        );
        Map<Integer, Integer> destinos1 = Map.of(1, 404, 2, 404, 3, 404, 4, 404);
        Map<Integer, String> respostas1 = Map.of(
                1, "Que alívio ouvir isso. É raro encontrar quem não tenha pavor do próprio silêncio.",
                2, "Concordo. Sem distrações, dá para realmente absorver o lugar.",
                3, "A ideia era justamente ter exclusividade, mas entendo que o vazio possa causar certa estranheza.",
                4, "Deprimente? Acho que temos definições bem diferentes do que é um ambiente agradável."
        );
        Map<Secundario, Map<Integer, Integer>> impacto1 = Map.of(
                marcia, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                403,
                "A produção acertou em cheio ao esvaziar este lugar. Ter que disputar espaço e ouvir o barulho de multidões me daria dor de cabeça em cinco minutos.",
                "Marcia", marcia, opcoes1, destinos1, respostas1, impacto1, 4
        ));

        // Diálogo 2 - A Exposição de Circuitos
        Map<Integer, String> opcoes2 = Map.of(
                1, "Com certeza. A previsibilidade da lógica evitaria muitos conflitos desnecessários entre as pessoas.",
                2, "Eu adoro entender como a lógica funciona por trás das coisas. É como resolver um quebra-cabeça.",
                3, "Acho meio frio. As emoções humanas não podem ser resumidas apenas a álgebra e cálculos.",
                4, "Nossa, que tédio. Não consigo imaginar nada pior do que agir como um robô programado."
        );
        Map<Integer, Integer> destinos2 = Map.of(1, 405, 2, 405, 3, 405, 4, 405);
        Map<Integer, String> respostas2 = Map.of(
                1, "Exato. Poupava tanto tempo se as pessoas fossem mais claras e diretas sobre o que querem.",
                2, "É uma ótima forma de ver as coisas. Desvendar como algo funciona é fascinante.",
                3, "É justo. Mas confesso que um pouco dessa previsibilidade me traria muito mais segurança.",
                4, "Buscar estabilidade não significa ser um robô. Mas cada um com suas prioridades."
        );
        Map<Secundario, Map<Integer, Integer>> impacto2 = Map.of(
                marcia, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                404,
                "Olhe essa estrutura. É fascinante como a base do mundo digital se resume a circuitos e máquinas de estados finitos. Uma entrada, uma transição lógica, e uma saída previsível baseada no estado anterior. Não seria ótimo se o comportamento das pessoas fosse claro assim?",
                "Marcia", marcia, opcoes2, destinos2, respostas2, impacto2, 4
        ));

        // Diálogo 3 - Razão e Emoção
        Map<Integer, String> opcoes3 = Map.of(
                1, "Concordo plenamente. Escolher um parceiro exige compatibilidade real e dados, não só um impulso cego.",
                2, "Acho que as emoções são importantes, mas o bom senso nunca pode ser deixado de lado.",
                3, "Eu prefiro não pensar muito. Se a gente sente algo forte na hora, tem que se jogar.",
                4, "Você analisa demais. O amor é irracional e caótico, tentar controlar isso é bobagem."
        );
        Map<Integer, Integer> destinos3 = Map.of(1, 406, 2, 406, 3, 406, 4, 406);
        Map<Integer, String> respostas3 = Map.of(
                1, "Finalmente alguém que entende! Um relacionamento precisa ter base, não só impulso.",
                2, "É um equilíbrio válido. O bom senso sempre ajuda a evitar desastres.",
                3, "Esse tipo de mergulho no escuro me deixa um pouco ansiosa, confesso.",
                4, "Se for para abraçar o caos e perder o controle, eu prefiro ficar na minha."
        );
        Map<Secundario, Map<Integer, Integer>> impacto3 = Map.of(
                marcia, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                405,
                "Sabe, muita gente diz que me acham fria por eu analisar as coisas demais, mas na verdade eu só gosto de ser realista. Por mais que eu não resista a uma boa comédia romântica (eu sou totalmente incapaz de segurar o choro assistindo a qualquer comédia romântica clichê na TV) eu acredito que na vida real até mesmo o amor precisa passar por um filtro racional. O que você acha disso?",
                "Marcia", marcia, opcoes3, destinos3, respostas3, impacto3, 4
        ));

        falasCena1.add(new Narrativa(406, "A produção avisou que o museu era exclusivo, mas de repente, as portas do saguão se abrem e um grupo imenso e barulhento de patrocinadores chega para um coquetel surpresa. O eco das vozes e das risadas toma conta do espaço.", 407));

        // Diálogo 4 - O Grupo de Patrocinadores
        Map<Integer, String> opcoes4 = Map.of(
                1, "Vem por aqui. Tem uma sala de exposições menores no segundo andar que deve estar vazia. Vamos sair de fininho.",
                2, "Quer que eu peça para a equipe de gravação segurar o grupo na outra ala por um tempo?",
                3, "Vamos só ficar aqui no nosso canto. Se a gente ignorar, eles logo passam para a próxima sala.",
                4, "Até que enfim! Eles parecem super animados, bora lá se enturmar e ver o que tá rolando!"
        );
        Map<Integer, Integer> destinos4 = Map.of(1, 408, 2, 408, 3, 408, 4, 408);
        Map<Integer, String> respostas4 = Map.of(
                1, "Ótima ideia. Obrigada por não me obrigar a passar pelo meio daquela multidão.",
                2, "Seria bom, mas não quero causar confusão com os patrocinadores.",
                3, "Eles podem demorar... Mas tudo bem.",
                4, "Sério? Se você veio para ficar no meio da muvuca, eu prefiro pedir um táxi e ir para casa."
        );
        Map<Secundario, Map<Integer, Integer>> impacto4 = Map.of(
                marcia, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                407,
                "O que a gente faz agora com essa barulheira toda?",
                "Marcia", marcia, opcoes4, destinos4, respostas4, impacto4, 4
        ));

        // Diálogo 5 - Avaliação do Encontro
        Map<Integer, String> opcoes5 = Map.of(
                1, "Foi o meu encontro favorito. Eu trocaria qualquer festa badalada por essa paz interior.",
                2, "Foi uma noite muito agradável. Fez bem para desacelerar a cabeça depois da loucura que é esse programa.",
                3, "Foi legal. É bem diferente do que eu estou acostumado, mas valeu a experiência de algo novo.",
                4, "Foi bom pra descansar, mas confesso que agora eu até toparia ir pra um barzinho mais animado pra fechar a noite."
        );
        Map<Integer, Integer> destinos5 = Map.of(1, 409, 2, 409, 3, 409, 4, 409);
        Map<Integer, String> respostas5 = Map.of(
                1, "Isso... é muito bom de ouvir. Acho que temos um ritmo bem parecido.",
                2, "Fez bem para mim também. Sair um pouco do foco das câmeras foi um alívio.",
                3, "Entendo. Que bom que pelo menos serviu como uma experiência diferente.",
                4, "Ah... Bom, eu já esgotei a minha cota de sair por hoje. Fica para a próxima."
        );
        Map<Secundario, Map<Integer, Integer>> impacto5 = Map.of(
                marcia, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                408,
                "Sabe, eu estava com muito receio de que você achasse essa noite parada demais. É difícil achar alguém que entenda que eu não preciso de música alta para me divertir. Como foi para você?",
                "Marcia", marcia, opcoes5, destinos5, respostas5, impacto5, 4
        ));

        Cena cena1 = new Cena(1, "Museu de Tecnologia", "trilha_tecnologia.mp3", 401, falasCena1);

        // CENA 2 - Redes Sociais
        List<Fala> falasCena2 = new ArrayList<>();

        // Escolha da Foto
        Map<Integer, String> opcoesFoto = Map.of(
                1, "Uma pilha ou bateria estilizada com o desenho de um raio no meio.",
                2, "Um crachá com um cordão elegante escrito 'Acesso VIP'.",
                3, "Um microchip (processador) clássico.",
                4, "Uma lâmpada vintage, mas com o filamento interno no formato de um coração."
        );
        Map<Integer, Integer> destinosFoto = Map.of(1, 410, 2, 410, 3, 410, 4, 410);
        Map<Integer, String> respostasFoto = Map.of(
                1, "Foto publicada! A escolha enérgica chamou a atenção da Ângela.",
                2, "Foto publicada! O toque VIP agradou à Mônica.",
                3, "Foto publicada! A estética do microchip encantou a Marcia.",
                4, "Foto publicada! A combinação tecnológica e romântica tocou a Gabriela."
        );
        Map<Secundario, Map<Integer, Integer>> impactoFoto = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0),
                monica, Map.of(1, 0, 2, 5, 3, 0, 4, 0),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0),
                gabriela, Map.of(1, 0, 2, 0, 3, 0, 4, 5)
        );

        falasCena2.add(new Dialogo(
                409,
                "Hora de atualizar o feed oficial do programa! Escolha a foto para publicar:",
                "Apresentador", null, opcoesFoto, destinosFoto, respostasFoto, impactoFoto, 0
        ));

        // Escolha da Legenda
        Map<Integer, String> opcoesLegenda = Map.of(
                1, "Pausa na correria só pra recarregar a bateria. Mal posso esperar para as novas aventuras do reality 🔋⚡",
                2, "Ter um museu inteiro fechado só pra nós é o tipo de exclusividade que eu valorizo. O cenário perfeito, sem filas e com muito estilo. 🎫✨",
                3, "A melhor invenção da humanidade ainda é o silêncio. Uma noite incrível, focada no que importa, longe de qualquer interferência externa. 🧠🔌",
                4, "No meio de tantas máquinas e circuitos frios, é incrível como a verdadeira faísca ainda vem de uma boa conversa. 💡❤️"
        );
        Map<Integer, Integer> destinosLegenda = Map.of(1, 411, 2, 411, 3, 411, 4, 411);
        Map<Integer, String> respostasLegenda = Map.of(
                1, "Legenda salva com sucesso!",
                2, "Legenda salva com sucesso!",
                3, "Legenda salva com sucesso!",
                4, "Legenda salva com sucesso!"
        );
        Map<Secundario, Map<Integer, Integer>> impactoLegenda = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0),
                monica, Map.of(1, 0, 2, 5, 3, 0, 4, 0),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0),
                gabriela, Map.of(1, 0, 2, 0, 3, 0, 4, 5)
        );

        falasCena2.add(new Dialogo(
                410,
                "Escolha a legenda perfeita para acompanhar a sua foto:",
                "Apresentador", null, opcoesLegenda, destinosLegenda, respostasLegenda, impactoLegenda, 0
        ));

        Cena cena2 = new Cena(2, "Rede Social", "trilha_feed.mp3", 409, falasCena2);

        List<Cena> cenasCap4 = new ArrayList<>();
        cenasCap4.add(cena1);
        cenasCap4.add(cena2);

        Capitulo capitulo4 = new Capitulo(4, "Encontros Individuais - Marcia", 401, 410, cenasCap4);

        for (Fala fala : falasCena1) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        for (Fala fala : falasCena2) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        bancoDeCapitulos.put(capitulo4.getIdCapitulo(), capitulo4);

        return capitulo4;
    }

    private Capitulo carregarCapitulo5() {
        Secundario angela = new Secundario("Angela", 6, 5, 5);
        Secundario monica = new Secundario("Mônica", 10, 5, 50);
        Secundario marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario gabriela = new Secundario("Gabriela", 4, 5, 5);

        // CENA 1 - Rooftop / Cobertura com a Mônica
        List<Fala> falasCena1 = new ArrayList<>();

        falasCena1.add(new Narrativa(501, "Boa noite, Brasil! Para dar sequência aos nossos emocionantes encontros, a nossa produção decidiu subir o nível (literalmente)! Hoje, o " + prota.getNome() + " vai pegar o elevador panorâmico direto para a cobertura, porque é dia de encontro com a nossa glamourosa, Mônica!", 502));
        falasCena1.add(new Narrativa(502, "Um ambiente exclusivo, drinks assinados e a cidade inteira aos pés deles. Mas não se deixem enganar pelas luzes: a Mônica é exigente e não aceita menos que a excelência. Será que o nosso protagonista tem cacife para acompanhar esse ritmo badalado, ou vai ser barrado na área VIP?", 503));

        // Diálogo 1 - O Ambiente da Cobertura
        Map<Integer, String> opcoes1 = Map.of(
                1, "Perfeito. Estar no topo, com um serviço excelente e uma vista dessas, é o mínimo que a gente merece.",
                2, "Muito bonito. A decoração é incrível e o clima da cidade à noite sempre rende bons momentos.",
                3, "É legal, mas eu não faço tanta questão. Um lugar mais simples também me agradaria sem problemas.",
                4, "Acho um exagero. Gasta-se muito à toa só para tirar foto e dizer que esteve aqui."
        );
        Map<Integer, Integer> destinos1 = Map.of(1, 504, 2, 504, 3, 504, 4, 504);
        Map<Integer, String> respostas1 = Map.of(
                1, "Gostei da atitude. Quem sabe o que merece não aceita menos do que o melhor.",
                2, "Sim, os detalhes importam muito. E a atmosfera daqui está impecável.",
                3, "A simplicidade tem seu charme... Mas um pouco de sofisticação nunca fez mal a ninguém, não acha?",
                4, "Se você vê investimento em qualidade como 'exagero', acho que temos visões de vida bem diferentes."
        );
        Map<Secundario, Map<Integer, Integer>> impacto1 = Map.of(
                monica, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                503,
                "Preciso admitir que a produção tem bom gosto. A energia da cidade lá embaixo e a exclusividade aqui em cima... É o equilíbrio perfeito. O que você acha do cenário que escolheram para nós hoje?",
                "Mônica", monica, opcoes1, destinos1, respostas1, impacto1, 10
        ));

        // Diálogo 2 - Visão de Sucesso e Ambição
        Map<Integer, String> opcoes2 = Map.of(
                1, "No topo, liderando bons projetos. Gosto de ter ambição e não tenho medo de trabalhar duro para conquistar o melhor.",
                2, "Quero estabilidade e reconhecimento. Ter uma carreira sólida que me permita aproveitar as coisas boas da vida em paz.",
                3, "Não penso muito longe. Só quero ter paz, pagar minhas contas em dia e ter meu tempo livre.",
                4, "Acho que focar demais em sucesso estraga a pessoa. Prefiro uma vida sem cobranças de carreira."
        );
        Map<Integer, Integer> destinos2 = Map.of(1, 505, 2, 505, 3, 505, 4, 505);
        Map<Integer, String> respostas2 = Map.of(
                1, "Exatamente o que eu queria ouvir. Ambição não é defeito, é motor.",
                2, "É um ótimo plano. Construir uma base sólida é o primeiro passo para o conforto.",
                3, "Entendo. É um jeito seguro de viver... Só acho que falta um pouco de faísca.",
                4, "Sem cobranças, sem evolução. Uma pena que você pense assim."
        );
        Map<Secundario, Map<Integer, Integer>> impacto2 = Map.of(
                monica, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                504,
                "Sabe, para mim, sucesso não é só o dinheiro na conta. É construir um nome forte, ser lembrada e não ter medo de ocupar espaço. E você? Onde quer estar daqui a alguns anos?",
                "Mônica", monica, opcoes2, destinos2, respostas2, impacto2, 10
        ));

        // Diálogo 3 - Exigência e Padrão de Qualidade
        Map<Integer, String> opcoes3 = Map.of(
                1, "Com certeza. Quem aceita qualquer coisa, acaba vivendo de qualquer jeito. Prefiro investir em qualidade, seja no trabalho ou nas escolhas.",
                2, "Depende da situação. Tem horas que é bom ser exigente, mas em outras é melhor relaxar e deixar as coisas fluírem.",
                3, "Eu acho que a vida é muito curta para ficar reparando em detalhes. Sou bem mais desencanado com essas coisas.",
                4, "Frescura pura. Ficar exigindo demais só serve para estressar a cabeça à toa com coisas fúteis."
        );
        Map<Integer, Integer> destinos3 = Map.of(1, 506, 2, 506, 3, 506, 4, 506);
        Map<Integer, String> respostas3 = Map.of(
                1, "Exatamente. É ótimo ver que alguém entende o valor de ter critérios na vida.",
                2, "Um equilíbrio aceitável, embora eu prefira ter o controle das variáveis.",
                3, "Desencanado demais, diria eu. Os detalhes são justamente o que diferem o ordinário do extraordinário.",
                4, "O que você chama de 'futilidade' é o padrão de excelência que move o mundo ao meu redor."
        );
        Map<Secundario, Map<Integer, Integer>> impacto3 = Map.of(
                monica, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                505,
                "Eu sou extremamente exigente com as coisas ao meu redor — desde os projetos em que trabalho até as pessoas com quem decido me associar. Muita gente acha isso frescura ou mania de controle... mas quer saber de uma coisa? Eu só quero que todo meu esforço investido valha a pena. Todo esse meu império de negócios e exigência começou do zero com um brechó online que eu geria escondida dos pais no quarto de casa, suando a camisa de verdade. E você? Também é do tipo que não abre mão de buscar o melhor?",
                "Mônica", monica, opcoes3, destinos3, respostas3, impacto3, 10
        ));

        // Diálogo 4 - Imagem e Estilo Pessoal
        Map<Integer, String> opcoes4 = Map.of(
                1, "Eu penso em cada detalhe. A imagem abre portas, e eu gosto de estar sempre preparado para causar uma boa impressão.",
                2, "Gosto de estar bem vestido e cheiroso, claro, mas sem grandes exageros. O básico bem feito não tem erro.",
                3, "Só visto o que é confortável para mim. Se alguém quiser me julgar pela roupa, o problema é dela.",
                4, "Para mim isso é pura futilidade. Roupa serve para cobrir o corpo e só."
        );
        Map<Integer, Integer> destinos4 = Map.of(1, 507, 2, 507, 3, 507, 4, 507);
        Map<Integer, String> respostas4 = Map.of(
                1, "Dá para notar. Uma pessoa atenta aos detalhes ganha pontos antes mesmo de dizer 'olá'.",
                2, "Um minimalismo bem executado tem o seu valor. Gostei da escolha.",
                3, "Autenticidade é ótimo, mas ignorar a leitura do ambiente é fechar portas de graça.",
                4, "Chamar de futilidade o que move a minha vida e a minha carreira... Bela jogada, " + prota.getNome() + "."
        );
        Map<Secundario, Map<Integer, Integer>> impacto4 = Map.of(
                monica, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                506,
                "A forma como nos vestimos é o nosso primeiro cartão de visitas antes mesmo de abrirmos a boca. Você costuma pensar na imagem que quer transmitir, ou pegou a primeira roupa limpa do armário hoje?",
                "Mônica", monica, opcoes4, destinos4, respostas4, impacto4, 10
        ));

        // Diálogo 5 - Avaliação do Estilo de Vida
        Map<Integer, String> opcoes5 = Map.of(
                1, "Se for para ter a sua companhia nos melhores lugares da cidade, eu estou sempre pronto. O sofá pode esperar.",
                2, "Eu gosto muito de sair e aproveitar, mas acho que um equilíbrio é a chave. Uma folga de vez em quando também faz bem.",
                3, "Sinceramente? Sou mais caseiro. Um evento desses por mês já é o suficiente para mim.",
                4, "Eu já estou louco para ir para casa. Essa rotina de sorrisos e aparências cansa rápido demais."
        );
        Map<Integer, Integer> destinos5 = Map.of(1, 508, 2, 508, 3, 508, 4, 508);
        Map<Integer, String> respostas5 = Map.of(
                1, "Excelente resposta. Já estou até pensando em qual lista VIP vou colocar o seu nome amanhã.",
                2, "Justo. Até mesmo quem vive de eventos precisa de um dia de 'off' para recarregar.",
                3, "Entendo. Acho que teríamos que negociar bastante as nossas agendas de fim de semana, então.",
                4, "Podemos ir embora, se preferir. Não quero tomar mais nenhum minuto do seu precioso descanso."
        );
        Map<Secundario, Map<Integer, Integer>> impacto5 = Map.of(
                monica, Map.of(1, 5, 2, 3, 3, -1, 4, -3)
        );

        falasCena1.add(new Dialogo(
                507,
                "A noite foi agradável. Eu amei o ambiente. E você? Realmente se identifica com uma vida recheada de eventos e compromissos ou numa sexta-feira à noite, o sofá vai acabar ganhando do passeio de hoje?",
                "Mônica", monica, opcoes5, destinos5, respostas5, impacto5, 10
        ));

        Cena cena1 = new Cena(1, "Cobertura VIP", "trilha_rooftop.mp3", 501, falasCena1);

        // CENA 2 - Redes Sociais
        List<Fala> falasCena2 = new ArrayList<>();

        // Escolha da Foto
        Map<Integer, String> opcoesFoto = Map.of(
                1, "Um alvo de dardos.",
                2, "Uma taça de Martini com uma azeitona no fundo.",
                3, "A fachada simplificada de uma casa.",
                4, "Um guardanapo de pano luxuoso com uma pequena frase escrita à mão usando uma caneta tinteiro."
        );
        Map<Integer, Integer> destinosFoto = Map.of(1, 509, 2, 509, 3, 509, 4, 509);
        Map<Integer, String> respostasFoto = Map.of(
                1, "Foto publicada! O estilo competitivo chamou a atenção da Ângela.",
                2, "Foto publicada! O toque VIP e sofisticado agradou à Mônica.",
                3, "Foto publicada! A ideia de tranquilidade e lar encantou a Marcia.",
                4, "Foto publicada! O detalhe poético tocou o coração da Gabriela."
        );
        Map<Secundario, Map<Integer, Integer>> impactoFoto = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0),
                monica, Map.of(1, 0, 2, 5, 3, 0, 4, 0),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0),
                gabriela, Map.of(1, 0, 2, 0, 3, 0, 4, 5)
        );

        falasCena2.add(new Dialogo(
                508,
                "Hora de atualizar o feed oficial do programa! Escolha a foto para publicar:",
                "Apresentador", null, opcoesFoto, destinosFoto, respostasFoto, impactoFoto, 0
        ));

        // Escolha da Legenda
        Map<Integer, String> opcoesLegenda = Map.of(
                1, "O lugar é chic, mas a verdadeira diversão começou quando a gente achou a área de jogos. Mira calibrada e pronto para o próximo round! 🎯🔥",
                2, "Noites no topo da cidade exigem a melhor companhia. Brindando ao sucesso, à estética impecável e aos bons momentos. 🍸✨",
                3, "De volta à base, depois de um dia longo. 🏠🔌",
                4, "Até mesmo no lugar mais agitado do mundo, tudo o que importa é a poesia de um bom olhar e uma conversa que faz o tempo parar. 🖋️mbito❤️"
        );
        Map<Integer, Integer> destinosLegenda = Map.of(1, 510, 2, 510, 3, 510, 4, 510);
        Map<Integer, String> respostasLegenda = Map.of(
                1, "Legenda salva com sucesso!",
                2, "Legenda salva com sucesso!",
                3, "Legenda salva com sucesso!",
                4, "Legenda salva com sucesso!"
        );
        Map<Secundario, Map<Integer, Integer>> impactoLegenda = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0),
                monica, Map.of(1, 0, 2, 5, 3, 0, 4, 0),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0),
                gabriela, Map.of(1, 0, 2, 0, 3, 0, 4, 5)
        );

        falasCena2.add(new Dialogo(
                509,
                "Escolha a legenda perfeita para acompanhar a sua foto:",
                "Apresentador", null, opcoesLegenda, destinosLegenda, respostasLegenda, impactoLegenda, 0
        ));

        Cena cena2 = new Cena(2, "Rede Social", "trilha_feed.mp3", 508, falasCena2);

        List<Cena> cenasCap5 = new ArrayList<>();
        cenasCap5.add(cena1);
        cenasCap5.add(cena2);

        Capitulo capitulo5 = new Capitulo(5, "Encontros Individuais - Mônica", 501, 509, cenasCap5);

        for (Fala fala : falasCena1) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        for (Fala fala : falasCena2) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        bancoDeCapitulos.put(capitulo5.getIdCapitulo(), capitulo5);

        return capitulo5;
    }

    private Capitulo carregarCapitulo6() {
        Secundario angela = new Secundario("Angela", 6, 5, 5);
        Secundario monica = new Secundario("Mônica", 10, 5, 50);
        Secundario marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario gabriela = new Secundario("Gabriela", 4, 5, 5);

        // CENA 1 - O Bastidor e o Filtro de Decisões
        List<Fala> falasCena1 = new ArrayList<>();

        falasCena1.add(new Narrativa(601, "E as câmeras não param, Brasil! Enquanto as nossas participantes descansam no camarim, o nosso solteiro foi convocado para uma missão especial nos bastidores. Hora de tomar decisões importantes!", 602));

        // Decisão 1 - Salvar um Item Pessoal
        Map<Integer, String> opcoes1 = Map.of(
                1, "Garrafa térmica metálica de treino cheia de adesivos de trilha.",
                2, "Caderno de couro com páginas amareladas e rascunhos à mão.",
                3, "HD externo com capa protetora.",
                4, "Nécessaire de couro de grife com estampa minimalista.",
                5, "Uma agenda corporativa preta, genérica e sem identificação."
        );
        Map<Integer, Integer> destinos1 = Map.of(1, 603, 2, 603, 3, 603, 4, 603, 5, 603);
        Map<Integer, String> respostas1 = Map.of(
                1, "Item guardado no armário! A Ângela vai adorar saber que valoriza o ritmo dela.",
                2, "Item guardado no armário! A Gabriela ficará encantada com o seu cuidado poético.",
                3, "Item guardado no armário! A Marcia vai respeitar o seu foco e cuidado intelectual.",
                4, "Item guardado no armário! A Mônica certamente aprova o seu bom gosto e estilo.",
                5, "Item guardado... Mas esta agenda genérica não pertence a nenhuma delas e demonstrou distração."
        );
        Map<Secundario, Map<Integer, Integer>> impacto1 = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0, 5, -1),
                gabriela, Map.of(1, 0, 2, 5, 3, 0, 4, 0, 5, -1),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0, 5, -1),
                monica, Map.of(1, 0, 2, 0, 3, 0, 4, 5, 5, -1)
        );

        falasCena1.add(new Dialogo(
                602,
                "A produção deixou quatro objetos esquecidos na mesa central do estúdio e você só pode resgatar um para guardar no seu armário antes da limpeza. Qual escolhe?",
                "Apresentador", null, opcoes1, destinos1, respostas1, impacto1, 0
        ));

        // Decisão 2 - Descartar um Item
        Map<Integer, String> opcoes2 = Map.of(
                1, "Um tênis esportivo antigo, meio sujo de poeira.",
                2, "Um livro de poesia clássica com a lombada gasta.",
                3, "Um manual técnico impresso cheio de grifos.",
                4, "Uma revista de moda de luxo da estação passada.",
                5, "Um bloco de notas simples de papel reciclado, sem marca ou assinatura."
        );
        Map<Integer, Integer> destinos2 = Map.of(1, 604, 2, 604, 3, 604, 4, 604, 5, 604);
        Map<Integer, String> respostas2 = Map.of(
                1, "Item descartado. A Ângela não vai gostar nada de ver o tênis dela no lixo.",
                2, "Item descartado. A Gabriela vai ficar profundamente magoada com o descarte da poesia.",
                3, "Item descartado. A Marcia ficará bastante chateada ao ver o manual técnico no lixo.",
                4, "Item descartado. A Mônica vai detestar a falta de consideração pela revista dela.",
                5, "Item descartado. Ninguém reclamou o bloco genérico, mas soou um pouco indiferente."
        );
        Map<Secundario, Map<Integer, Integer>> impacto2 = Map.of(
                angela, Map.of(1, -5, 2, 0, 3, 0, 4, 0, 5, -1),
                gabriela, Map.of(1, 0, 2, -5, 3, 0, 4, 0, 5, -1),
                marcia, Map.of(1, 0, 2, 0, 3, -5, 4, 0, 5, -1),
                monica, Map.of(1, 0, 2, 0, 3, 0, 4, -5, 5, -1)
        );

        falasCena1.add(new Dialogo(
                603,
                "A produção pede para você jogar no lixo um objeto acumulado nos bastidores para abrir espaço. Qual item decide descartar?",
                "Apresentador", null, opcoes2, destinos2, respostas2, impacto2, 0
        ));

        // Decisão 3 - Comprar um Presente na Loja do Programa
        Map<Integer, String> opcoes3 = Map.of(
                1, "Smartwatch com monitor de frequência cardíaca e GPS.",
                2, "Caneta tinteiro clássica com estojo de madeira.",
                3, "Luminária de mesa, para estudos, articulada com controle de iluminação.",
                4, "Lenço de seda bordado de edição limitada.",
                5, "Um fone de ouvido bluetooth padrão, branco e sem marca registrada."
        );
        Map<Integer, Integer> destinos3 = Map.of(1, 605, 2, 605, 3, 605, 4, 605, 5, 605);
        Map<Integer, String> respostas3 = Map.of(
                1, "Presente comprado! A Ângela vai adorar acompanhar o ritmo de treino.",
                2, "Presente comprado! A Gabriela ficará encantada com a elegância clássica.",
                3, "Presente comprado! A Marcia apreciará muito a utilidade para as suas leituras.",
                4, "Presente comprado! A Mônica ficará fascinada pela exclusividade do lenço.",
                5, "Presente comprado! Um fone genérico que demonstra pouca criatividade."
        );
        Map<Secundario, Map<Integer, Integer>> impacto3 = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0, 5, -1),
                gabriela, Map.of(1, 0, 2, 5, 3, 0, 4, 0, 5, -1),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0, 5, -1),
                monica, Map.of(1, 0, 2, 0, 3, 0, 4, 5, 5, -1)
        );

        falasCena1.add(new Dialogo(
                604,
                "Você recebeu créditos da produção para escolher um único presente especial na loja oficial. O que deseja comprar?",
                "Apresentador", null, opcoes3, destinos3, respostas3, impacto3, 0
        ));

        // Decisão 4 - Salvar uma Mensagem de Amor para Dar Like
        Map<Integer, String> opcoes4 = Map.of(
                1, "\"Ver a Ângela se soltar e sorrir com o " + prota.getNome() + " na pista foi a cena mais autêntica e cheia de vida da temporada!\"",
                2, "\"A conexão da Gabriela com ele parece ter saído direto das páginas de um romance clássico, puro significado.\"",
                3, "\"O silêncio confortável entre a Marcia e o " + prota.getNome() + " provou que a inteligência e a paz valem mais que qualquer barulho.\"",
                4, "\"A Mônica e o " + prota.getNome() + " formam o casal de alto padrão definitivo, pura sintonia e elegância no topo!\"",
                5, "\"Torço muito pelo casal, mas acho que no fundo ele ainda está meio indeciso sobre o que quer da vida.\""
        );
        Map<Integer, Integer> destinos4 = Map.of(1, 606, 2, 606, 3, 606, 4, 606, 5, 606);
        Map<Integer, String> respostas4 = Map.of(
                1, "Like registrado e fixado no telão! A Ângela adorou a escolha.",
                2, "Like registrado e fixado no telão! A Gabriela ficou emocionada.",
                3, "Like registrado e fixado no telão! A Marcia valorizou a mensagem.",
                4, "Like registrado e fixado no telão! A Mônica adorou o destaque VIP.",
                5, "Like registrado... Mas escolher um comentário morno transpareceu indecisão."
        );
        Map<Secundario, Map<Integer, Integer>> impacto4 = Map.of(
                angela, Map.of(1, 5, 2, 0, 3, 0, 4, 0, 5, -1),
                gabriela, Map.of(1, 0, 2, 5, 3, 0, 4, 0, 5, -1),
                marcia, Map.of(1, 0, 2, 0, 3, 5, 4, 0, 5, -1),
                monica, Map.of(1, 0, 2, 0, 3, 0, 4, 5, 5, -1)
        );

        falasCena1.add(new Dialogo(
                605,
                "O painel exibe quatro declarações carinhosas e apaixonadas dos fãs nas redes sociais. Escolha apenas uma para dar like e fixar publicamente no telão:",
                "Apresentador", null, opcoes4, destinos4, respostas4, impacto4, 0
        ));

        Cena cena1 = new Cena(1, "Bastidores - Filtro de Decisões", "trilha_bastidores.mp3", 601, falasCena1);

        // CENA 2 - Teste de Atenção (Fatos Verídicos)
        List<Fala> falasCena2 = new ArrayList<>();

        falasCena2.add(new Narrativa(606, "E para fechar a nossa rodada de decisões no camarim, vamos testar se o " + prota.getNome() + " realmente prestou atenção nas entrelinhas. O telão vai revelar fatos sobre as nossas solteiras. Escolha com cuidado.", 607));

        // Decisão 5 - Revelação de Fato Verídico
        Map<Integer, String> opcoes5 = Map.of(
                1, "Tem pavor de água funda e mar aberto, apesar de dar aulas de natação em piscinas rasas.",
                2, "É incapaz de segurar o choro ao assistir a comédias românticas clichês na TV.",
                3, "Começou a carreira gerindo um brechó online escondida dos pais no quarto de casa.",
                4, "Possui um medo obsessivo de que seu estilo acabe parecendo comercial demais.",
                5, "Tem uma tatuagem secreta de um código binário antigo na nuca que fez escondida aos dezessete anos."
        );
        Map<Integer, Integer> destinos5 = Map.of(1, 608, 2, 608, 3, 608, 4, 608, 5, 608);
        Map<Integer, String> respostas5 = Map.of(
                1, "Acertou em cheio! Este é um fato real sobre a Ângela. Ganhou um bónus massivo de afinidade com ela!",
                2, "Acertou em cheio! Este é um fato real sobre a Marcia. Ganhou um bónus massivo de afinidade com ela!",
                3, "Acertou em cheio! Este é um fato real sobre a Mônica. Ganhou um bónus massivo de afinidade com ela!",
                4, "Acertou em cheio! Este é um fato real sobre a Gabriela. Ganhou um bónus massivo de afinidade com ela!",
                5, "Fato incorreto! Esse segredo nunca existiu e provou que estava a adivinhar no escuro."
        );
        Map<Secundario, Map<Integer, Integer>> impacto5 = Map.of(
                angela, Map.of(1, 10, 2, 0, 3, 0, 4, 0, 5, -5),
                marcia, Map.of(1, 0, 2, 10, 3, 0, 4, 0, 5, -5),
                monica, Map.of(1, 0, 2, 0, 3, 10, 4, 0, 5, -5),
                gabriela, Map.of(1, 0, 2, 0, 3, 0, 4, 10, 5, -5)
        );

        falasCena2.add(new Dialogo(
                607,
                "Qual destes fatos revelados no painel é verdadeiro sobre uma das participantes?",
                "Apresentador", null, opcoes5, destinos5, respostas5, impacto5, 0
        ));

        falasCena2.add(new Narrativa(608, "Decisões tomadas, dados salvos e o relógio não para! Enquanto o nosso solteiro absorve o resultado das suas escolhas, a nossa produção vai preparar os últimos detalhes. Fique ligado, porque logo depois dos comerciais o Reserva para Dois volta para a reta final!", 608));

        Cena cena2 = new Cena(2, "Teste de Memória no Camarim", "trilha_revelacao.mp3", 606, falasCena2);

        List<Cena> cenasCap6 = new ArrayList<>();
        cenasCap6.add(cena1);
        cenasCap6.add(cena2);

        Capitulo capitulo6 = new Capitulo(6, "O Bastidor e o Filtro de Decisões", 601, 608, cenasCap6);

        for (Fala fala : falasCena1) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        for (Fala fala : falasCena2) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        bancoDeCapitulos.put(capitulo6.getIdCapitulo(), capitulo6);

        return capitulo6;
    }

    private Capitulo carregarCapitulo7() {
        Secundario angela = new Secundario("Angela", 6, 5, 5);
        Secundario monica = new Secundario("Mônica", 10, 5, 50);
        Secundario marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario gabriela = new Secundario("Gabriela", 4, 5, 5);

        // CENA 1 - Gabarito do Amor & Raio-X
        List<Fala> falasCena1 = new ArrayList<>();

        falasCena1.add(new Narrativa(701, "Olá! Sejam bem-vindos a mais um episódio de Reserva para Dois. Hoje o nosso programa é especial porque a plateia vai ditar o rumo do participante no quadro Gabarito do Amor!", 702));

        // Pergunta 1 - Ângela (Trilha)
        Map<Integer, String> opcoes1 = Map.of(
                1, "Aceito o desafio na hora! Entro na brincadeira e aproveito para mostrar que também gosto de competir.",
                2, "Recuso imediatamente e digo que não tenho interesse nenhum em esportes ou atividades físicas.",
                3, "Aceito o desafio, mas começo a me exibir e transformar a competição em uma disputa séria demais."
        );
        Map<Integer, Integer> destinos1 = Map.of(1, 703, 2, 703, 3, 703);
        Map<Integer, String> respostas1 = Map.of(
                1, "Você aceitou a disputa com entusiasmo! Ângela adorou a sua energia competitiva.",
                2, "Você recusou o desafio. Ângela ficou decepcionada com a falta de ritmo.",
                3, "Você levou a sério demais e deixou o clima pesado durante a subida."
        );
        Map<Secundario, Map<Integer, Integer>> impacto1 = Map.of(
                angela, Map.of(1, 20, 2, -20, 3, -20)
        );

        falasCena1.add(new Dialogo(
                702,
                "Ângela te convida para passar o dia em uma trilha e propõe um desafio: quem chegar primeiro ao topo da montanha. O que você faz?",
                "Apresentador", null, opcoes1, destinos1, respostas1, impacto1, 0
        ));

        // Pergunta 2 - Mônica (Culinária)
        Map<Integer, String> opcoes2 = Map.of(
                1, "Escolho um lugar especial e apresento a ela um prato brasileiro que combine com seus gostos.",
                2, "Digo que tanto faz o restaurante e deixo que ela escolha tudo sozinha, sem me preocupar muito.",
                3, "Escolho o restaurante mais barato possível e reclamo do preço sempre que ela demonstra interesse."
        );
        Map<Integer, Integer> destinos2 = Map.of(1, 704, 2, 704, 3, 704);
        Map<Integer, String> respostas2 = Map.of(
                1, "Excelente escolha! Mônica valorizou a sua consideração e refinamento.",
                2, "Atitude indiferente. Mônica percebeu a sua falta de empenho.",
                3, "Reclamar de custos num encontro deixou Mônica bastante desconfortável."
        );
        Map<Secundario, Map<Integer, Integer>> impacto2 = Map.of(
                monica, Map.of(1, 20, 2, -20, 3, -20)
        );

        falasCena1.add(new Dialogo(
                703,
                "Mônica comenta que ainda não conhece muito bem a culinária brasileira e quer experimentar algo diferente. Como você reage?",
                "Apresentador", null, opcoes2, destinos2, respostas2, impacto2, 0
        ));

        // Pergunta 3 - Márcia (Restaurante Movimentado)
        Map<Integer, String> opcoes3 = Map.of(
                1, "Percebo o desconforto e pergunto tranquilamente se ela prefere procurar um lugar mais reservado.",
                2, "Tento fazer com que ela se solte à força, fazendo várias perguntas e dizendo para parar de ser tímida.",
                3, "Fico irritado com o silêncio e começo a reclamar que ela está tornando o encontro estranho."
        );
        Map<Integer, Integer> destinos3 = Map.of(1, 705, 2, 705, 3, 705);
        Map<Integer, String> respostas3 = Map.of(
                1, "Sua empatia foi fundamental! Márcia sentiu-se respeitada e acolhida.",
                2, "Pressionar Márcia aumentou a ansiedade dela e gerou um afastamento.",
                3, "Sua irritação deixou o ambiente insustentável para ela."
        );
        Map<Secundario, Map<Integer, Integer>> impacto3 = Map.of(
                marcia, Map.of(1, 20, 2, -20, 3, -20)
        );

        falasCena1.add(new Dialogo(
                704,
                "No restaurante movimentado, Márcia parece desconfortável com a quantidade de pessoas e fica em silêncio. O que você faz?",
                "Apresentador", null, opcoes3, destinos3, respostas3, impacto3, 0
        ));

        // Pergunta 4 - Gabriela (Cachorro Perdido)
        Map<Integer, String> opcoes4 = Map.of(
                1, "Paro com ela para ajudar o cachorro, procurando uma forma segura de encontrar o dono ou resgatá-lo.",
                2, "Digo que não temos nada a ver com aquilo e sugiro que simplesmente continuemos o encontro.",
                3, "Começo a fazer piadas sobre a situação e digo que ela está exagerando por se preocupar tanto."
        );
        Map<Integer, Integer> destinos4 = Map.of(1, 706, 2, 706, 3, 706);
        Map<Integer, String> respostas4 = Map.of(
                1, "Atitude nobre! Gabriela ficou encantada com o seu carinho e compaixão.",
                2, "Sua insensibilidade deixou Gabriela desapontada com a sua postura.",
                3, "Debochar da preocupação dela causou um sério desentendimento."
        );
        Map<Secundario, Map<Integer, Integer>> impacto4 = Map.of(
                gabriela, Map.of(1, 20, 2, -20, 3, -20)
        );

        falasCena1.add(new Dialogo(
                705,
                "Vocês encontram um cachorro perdido na rua e Gabriela quer ajudar o animal. O que você faz?",
                "Apresentador", null, opcoes4, destinos4, respostas4, impacto4, 0
        ));

        // Pergunta 5 - Raio-X: Passado Amoroso
        Map<Integer, String> opcoes5 = Map.of(
                1, "Sou totalmente sincero, assumo meus erros do passado de forma madura e mostro que mudei.",
                2, "Minto ou mudo de assunto dizendo que passado é passado, apenas para não me expor.",
                3, "Falo muito mal da minha ex, jogando toda a culpa do término nas costas dela."
        );
        Map<Integer, Integer> destinos5 = Map.of(1, 707, 2, 707, 3, 707);
        Map<Integer, String> respostas5 = Map.of(
                1, "Transparência total! A sua maturidade impressionou positivamente o painel.",
                2, "A hesitação e a esquiva deixaram uma dúvida no ar sobre a sua sinceridade.",
                3, "Culpar a ex demonstrou imaturidade e pegou muito mal com as pretendentes."
        );
        Map<Secundario, Map<Integer, Integer>> impacto5 = Map.of(
                angela, Map.of(1, 10, 2, -15, 3, -15),
                monica, Map.of(1, 10, 2, -15, 3, -15),
                marcia, Map.of(1, 10, 2, -15, 3, -15),
                gabriela, Map.of(1, 10, 2, -15, 3, -15)
        );

        falasCena1.add(new Dialogo(
                706,
                "Sua acompanhante pergunta detalhadamente por que o seu último relacionamento sério terminou. O que você faz?",
                "Apresentador", null, opcoes5, destinos5, respostas5, impacto5, 0
        ));

        // Pergunta 6 - Raio-X: Foto no Feed
        Map<Integer, String> opcoes6 = Map.of(
                1, "Posto com orgulho, afinal se estou namorando não tenho absolutamente nada a esconder do mundo.",
                2, "Recuso categoricamente, dizendo que prefiro manter minha vida amorosa cem por cento privada.",
                3, "Enrolo por semanas e acabo postando apenas nos Melhores Amigos dos stories para poucas pessoas."
        );
        Map<Integer, Integer> destinos6 = Map.of(1, 708, 2, 708, 3, 708);
        Map<Integer, String> respostas6 = Map.of(
                1, "Postura firme e convicta! Todas valorizaram o seu orgulho e comprometimento.",
                2, "A recusa categórica gerou desconfiança e insegurança.",
                3, "Esconder a relação nos stories soou como falta de compromisso."
        );
        Map<Secundario, Map<Integer, Integer>> impacto6 = Map.of(
                angela, Map.of(1, 15, 2, -15, 3, -15),
                monica, Map.of(1, 15, 2, -15, 3, -15),
                marcia, Map.of(1, 15, 2, -15, 3, -15),
                gabriela, Map.of(1, 15, 2, -15, 3, -15)
        );

        falasCena1.add(new Dialogo(
                707,
                "Ao começarem a namorar sério, seu par pede para postar uma foto junta no feed para oficializar. Qual é a sua atitude?",
                "Apresentador", null, opcoes6, destinos6, respostas6, impacto6, 0
        ));

        Cena cena1 = new Cena(1, "Gabarito do Amor e Raio-X", "trilha_estudio.mp3", 701, falasCena1);

        // CENA 2 - O Veredito e Desistência (Menor Afinidade)
        List<Fala> falasCena2 = new ArrayList<>();

        falasCena2.add(new Narrativa(708, "De volta do comercial! É hora do veredito e de conceder o direito de desistência na corrida do amor. Diante do botão vermelho, a contagem regressiva começa: 5... 4... 3... 2... 1...", 709));

        falasCena2.add(new Dialogo(
                709,
                "Um sinal sonoro ecoa no estúdio! A participante com menor afinidade toma a decisão e aperta o botão vermelho de desistência.",
                "Apresentador", null, Map.of(1, "Acompanhar a saída"), Map.of(1, 710),
                Map.of(1, "A jornada dessa participante no programa chega ao fim."),
                Map.of(), 0
        ));

        falasCena2.add(new Narrativa(710, "A participante justifica que não sentiu a sintonia necessária para continuar na disputa. Ela despede-se de todos e deixa o palco sob os aplausos do público.", 711));

        Cena cena2 = new Cena(2, "O Veredito e a Desistência", "trilha_tensao.mp3", 708, falasCena2);

        // CENA 3 - Sala de Café (Apoio da Maior Afinidade)
        List<Fala> falasCena3 = new ArrayList<>();

        falasCena3.add(new Narrativa(711, "Ufa, o dia foi extremamente desgastante. Se as coisas continuarem assim, posso acabar cometendo algum erro grave. De repente, a participante com quem você possui maior afinidade entra na sala de café e senta-se ao seu lado.", 712));

        falasCena3.add(new Dialogo(
                712,
                "Ela percebe o seu cansaço, conversa abertamente sobre as suas dúvidas e oferece um presente especial como símbolo de apoio para as próximas etapas.",
                "Pretendente", null, Map.of(1, "Aceitar o presente e agradecer o apoio"), Map.of(1, 713),
                Map.of(1, "Você guarda o amuleto/item especial na mochila e ganha renovada confiança."),
                Map.of(), 0
        ));

        falasCena3.add(new Narrativa(713, "Com o apoio recebido na sala de café e as energias recarregadas, o programa encerra mais um capítulo decisivo rumo à reta final!", 713));

        Cena cena3 = new Cena(3, "Refúgio na Sala de Café", "trilha_emocional.mp3", 711, falasCena3);

        List<Cena> cenasCap7 = new ArrayList<>();
        cenasCap7.add(cena1);
        cenasCap7.add(cena2);
        cenasCap7.add(cena3);

        Capitulo capitulo7 = new Capitulo(7, "Gabarito do Amor e a Decisão", 701, 713, cenasCap7);

        for (Fala fala : falasCena1) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        for (Fala fala : falasCena2) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        for (Fala fala : falasCena3) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        bancoDeCapitulos.put(capitulo7.getIdCapitulo(), capitulo7);

        return capitulo7;
    }

    private Capitulo carregarCapitulo8() {
        Secundario angela = new Secundario("Angela", 6, 5, 5);
        Secundario monica = new Secundario("Mônica", 10, 5, 50);
        Secundario marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario gabriela = new Secundario("Gabriela", 4, 5, 5);

        // CENA 1 - Plantão Reserva para Dois
        List<Fala> falasCena1 = new ArrayList<>();

        falasCena1.add(new Narrativa(801, "Olá, telespectadores! Sejam bem-vindos ao Plantão Reserva para dois, o seu canal de notícias do reality de romance mais famoso dos últimos tempos.", 802));
        falasCena1.add(new Narrativa(802, "No noticiário de hoje, temos novidades sobre nossos participantes, atualizações de suas carreiras e as alegações polêmicas da participante eliminada nos bastidores!", 803));

        Cena cena1 = new Cena(1, "Plantão Reserva para Dois", "trilha_noticiario.mp3", 801, falasCena1);

        // CENA 2 - Gerenciamento de Redes Sociais e Notificações
        List<Fala> falasCena2 = new ArrayList<>();

        falasCena2.add(new Narrativa(803, "Depois do plantão, você não para de receber notificações. Parece que todo mundo tem alguma coisa para dizer. É melhor pensar bem antes de responder...", 804));

        // Pergunta 1 Geral - Imagem Pessoal
        Map<Integer, String> opcoes1 = Map.of(
                1, "Ela está claramente tentando me prejudicar porque não aceitou ser eliminada. Não vou levar a sério alguém assim.",
                2, "Entendo que ela tenha se sentido assim. Posso explicar o meu lado, mas não quero transformar isso em uma briga.",
                3, "Não acho que eu precise ficar me justificando. Quem assistiu ao programa pode tirar suas próprias conclusões.",
                4, "Se ela não gostou de mim, o problema é dela. Não vou perder meu tempo tentando agradar ninguém."
        );
        Map<Integer, Integer> destinos1 = Map.of(1, 805, 2, 805, 3, 805, 4, 805);
        Map<Integer, String> respostas1 = Map.of(
                1, "Sua resposta soou defensiva e gerou forte rejeição do público.",
                2, "Sua postura madura e compreensiva repercutiu positivamente.",
                3, "Você manteve a neutralidade e evitou estender o assunto.",
                4, "Sua resposta pareceu arrogante e causou uma leve desaprovação."
        );
        Map<Secundario, Map<Integer, Integer>> impacto1 = Map.of(
                angela, Map.of(1, -4, 2, 2, 3, 0, 4, -2),
                monica, Map.of(1, -4, 2, 2, 3, 0, 4, -2),
                marcia, Map.of(1, -4, 2, 2, 3, 0, 4, -2),
                gabriela, Map.of(1, -4, 2, 2, 3, 0, 4, -2)
        );

        falasCena2.add(new Dialogo(
                804,
                "Comentário do Público: 'Depois de ouvir o que ela falou, você não acha que deveria se explicar melhor? Afinal, a imagem que ela passou de você não foi muito boa.'",
                "Rede Social", null, opcoes1, destinos1, respostas1, impacto1, 0
        ));

        // Pergunta 2 Geral - Sinceridade dos Sentimentos
        Map<Integer, String> opcoes2 = Map.of(
                1, "Eu prefiro não responder. Algumas coisas que aconteceram entre nós devem permanecer entre nós.",
                2, "Se eu estivesse fingindo, provavelmente teria escolhido alguém muito mais fácil de conquistar.",
                3, "Ela está falando isso porque não conseguiu ganhar. É muito conveniente me chamar de falso depois que saiu.",
                4, "Eu estava aqui para conhecer alguém, então é claro que pensei no jogo. Mas isso não significa que meus sentimentos fossem falsos."
        );
        Map<Integer, Integer> destinos2 = Map.of(1, 806, 2, 806, 3, 806, 4, 806);
        Map<Integer, String> respostas2 = Map.of(
                1, "Você optou pela discrição e preservou a privacidade do programa.",
                2, "O tom irônico da resposta não agradou os telespectadores.",
                3, "A atitude reativa e acusatória aumentou a rejeição do público.",
                4, "Sua transparência sobre o jogo e seus sentimentos recebeu elogios."
        );
        Map<Secundario, Map<Integer, Integer>> impacto2 = Map.of(
                angela, Map.of(1, 0, 2, -2, 3, -4, 4, 2),
                monica, Map.of(1, 0, 2, -2, 3, -4, 4, 2),
                marcia, Map.of(1, 0, 2, -2, 3, -4, 4, 2),
                gabriela, Map.of(1, 0, 2, -2, 3, -4, 4, 2)
        );

        falasCena2.add(new Dialogo(
                805,
                "Comentário do Público: 'Ela disse que você só estava fingindo interesse para continuar no programa. Você realmente gostava dela ou estava apenas jogando?'",
                "Rede Social", null, opcoes2, destinos2, respostas2, impacto2, 0
        ));

        // Pergunta Específica - Ângela
        Map<Integer, String> opcoesAngela = Map.of(
                1, "Talvez eu não acompanhe sempre, mas gosto de pessoas que me desafiam a sair da zona de conforto.",
                2, "Eu tentaria acompanhar. Acho que seria divertido viver essas experiências com ela.",
                3, "Não sei se conseguiria acompanhar, mas também não vejo isso como um problema.",
                4, "Sinceramente, acho que ela deveria aprender a diminuir um pouco esse espírito competitivo."
        );
        Map<Integer, Integer> destinosAngela = Map.of(1, 807, 2, 807, 3, 807, 4, 807);
        Map<Integer, String> respostasAngela = Map.of(
                1, "Excelente postura! Ângela apreciou a sua disposição para superar desafios.",
                2, "Ângela gostou do seu entusiasmo em participar do ritmo dela.",
                3, "Resposta neutra. Manteve a relação estável sem grandes alterações.",
                4, "A crítica ao espírito competitivo gerou um atrito direto com Ângela."
        );
        Map<Secundario, Map<Integer, Integer>> impactoAngela = Map.of(
                angela, Map.of(1, 4, 2, 2, 3, 0, 4, -2)
        );

        falasCena2.add(new Dialogo(
                806,
                "Comentário sobre Ângela: 'Ângela é conhecida pelo espírito competitivo. Você acha que conseguiria acompanhar o ritmo dela?'",
                "Rede Social", null, opcoesAngela, destinosAngela, respostasAngela, impactoAngela, 0
        ));

        // Pergunta Específica - Mônica
        Map<Integer, String> opcoesMonica = Map.of(
                1, "Eu não sei se me adaptaria completamente, mas acho que poderia aprender a acompanhar o ritmo dela.",
                2, "Eu adoraria conhecer esse lado da vida dela e descobrir novos lugares e experiências ao lado dela.",
                3, "Acho que cada um pode continuar vivendo do seu jeito, mesmo estando em um relacionamento.",
                4, "Ela parece viver ocupada demais. Talvez precisasse desacelerar antes de pensar em um relacionamento."
        );
        Map<Integer, Integer> destinosMonica = Map.of(1, 808, 2, 808, 3, 808, 4, 808);
        Map<Integer, String> respostasMonica = Map.of(
                1, "Mônica apreciou a sua humildade e disposição em adaptar-se ao estilo dela.",
                2, "Resposta perfeita! Mônica adorou a sua abertura para novas experiências.",
                3, "Posição diplomática e neutra sobre a independência do casal.",
                4, "Sugerir desaceleração desagradou imensamente a Mônica."
        );
        Map<Secundario, Map<Integer, Integer>> impactoMonica = Map.of(
                monica, Map.of(1, 2, 2, 4, 3, 0, 4, -2)
        );

        falasCena2.add(new Dialogo(
                807,
                "Comentário sobre Mônica: 'Mônica já viajou pelo mundo e tem uma rotina bastante agitada. Você acha que conseguiria se adaptar ao estilo de vida dela?'",
                "Rede Social", null, opcoesMonica, destinosMonica, respostasMonica, impactoMonica, 0
        ));

        // Pergunta Específica - Márcia
        Map<Integer, String> opcoesMarcia = Map.of(
                1, "Eu tentaria ajudá-la a se soltar, mesmo que precisasse insistir um pouco.",
                2, "Eu respeitaria o jeito dela e deixaria que ela se sentisse confortável para se abrir no próprio ritmo.",
                3, "Acho que eu precisaria de um tempo para entender melhor como ela gosta de interagir.",
                4, "Eu não me importaria muito. Cada pessoa tem seu jeito, e eu seguiria normalmente."
        );
        Map<Integer, Integer> destinosMarcia = Map.of(1, 809, 2, 809, 3, 809, 4, 809);
        Map<Integer, String> respostasMarcia = Map.of(
                1, "A ideia de insistência assustou Márcia e gerou certo desconforto.",
                2, "Atitude exemplar! Márcia sentiu-se acolhida e respeitada na sua essência.",
                3, "Márcia valorizou o seu cuidado em querer compreender o tempo dela.",
                4, "Atitude neutra, sem demonstrar preocupação com as particularidades dela."
        );
        Map<Secundario, Map<Integer, Integer>> impactoMarcia = Map.of(
                marcia, Map.of(1, -2, 2, 4, 3, 2, 4, 0)
        );

        falasCena2.add(new Dialogo(
                808,
                "Comentário sobre Márcia: 'Márcia é uma pessoa mais reservada e não parece se sentir muito confortável em situações sociais. Como você lidaria com isso?'",
                "Rede Social", null, opcoesMarcia, destinosMarcia, respostasMarcia, impactoMarcia, 0
        ));

        // Pergunta Específica - Gabriela
        Map<Integer, String> opcoesGabriela = Map.of(
                1, "Acho que sim. Gosto de pessoas que conseguem transformar coisas simples em momentos especiais.",
                2, "Eu tentaria conhecer melhor esse lado dela. Acho que temos muito a descobrir um sobre o outro.",
                3, "Não sei se temos exatamente o mesmo jeito, mas acredito que diferenças também podem funcionar.",
                4, "Acho que ela leva algumas coisas simples a sério demais. Eu provavelmente não teria muita paciência para isso."
        );
        Map<Integer, Integer> destinosGabriela = Map.of(1, 810, 2, 810, 3, 810, 4, 810);
        Map<Integer, String> respostasGabriela = Map.of(
                1, "Resposta poética e alinhada! Gabriela encantou-se com a sua sensibilidade.",
                2, "Gabriela apreciou o seu interesse sincero em aprofundar o vínculo.",
                3, "Uma perspetiva madura e equilibrada sobre aceitação das diferenças.",
                4, "Demonstrar impaciência com o modo de ser de Gabriela magoou-a bastante."
        );
        Map<Secundario, Map<Integer, Integer>> impactoGabriela = Map.of(
                gabriela, Map.of(1, 4, 2, 2, 3, 0, 4, -2)
        );

        falasCena2.add(new Dialogo(
                809,
                "Comentário sobre Gabriela: 'Gabriela é conhecida por ser uma pessoa descontraída, apaixonada por literatura e por animais. Você acha que conseguiria acompanhar esse jeito tão leve e profundo de enxergar a vida?'",
                "Rede Social", null, opcoesGabriela, destinosGabriela, respostasGabriela, impactoGabriela, 0
        ));

        falasCena2.add(new Narrativa(810, "Espero que essas respostas não piorem as coisas... É melhor ir dormir e me preparar para a grande final do programa!", 810));

        Cena cena2 = new Cena(2, "Gerenciamento de Redes Sociais", "trilha_celular.mp3", 803, falasCena2);

        List<Cena> cenasCap8 = new ArrayList<>();
        cenasCap8.add(cena1);
        cenasCap8.add(cena2);

        Capitulo capitulo8 = new Capitulo(8, "Plantão Reserva para Dois e as Redes Sociais", 801, 810, cenasCap8);

        for (Fala fala : falasCena1) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        for (Fala fala : falasCena2) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        bancoDeCapitulos.put(capitulo8.getIdCapitulo(), capitulo8);

        return capitulo8;
    }

    private Capitulo carregarCapitulo9() {
        Secundario angela = new Secundario("Angela", 6, 5, 5);
        Secundario monica = new Secundario("Mônica", 10, 5, 50);
        Secundario marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario gabriela = new Secundario("Gabriela", 4, 5, 5);

        List<Cena> cenasCap9 = new ArrayList<>();

        // CAMINHO 2 — PONTOS NEGATIVOS ACIMA OU IGUAL A 60 (Cancelamento do Programa)
        if (prota.getPontosNegativos() >= 60) {
            List<Fala> falasCancelamento = new ArrayList<>();

            falasCancelamento.add(new Narrativa(901, "[PLANTÃO EXTRAORDINÁRIO] Olá, telespectadores. Interrompemos nossa programação para trazer uma notícia inesperada sobre o futuro de Reserva para Dois.", 902));
            falasCancelamento.add(new Narrativa(902, "Infelizmente, apesar de todos os esforços da produção, o programa não conseguiu alcançar a audiência esperada nesta temporada.", 903));
            falasCancelamento.add(new Narrativa(903, "Após uma queda significativa no interesse do público, a produção tomou uma decisão difícil: Reserva para Dois está oficialmente cancelado.", 904));
            falasCancelamento.add(new Narrativa(904, "O desempenho e a postura de " + prota.getNome() + " ao longo do programa acabaram contribuindo para a perda de interesse dos telespectadores.", 904));

            Cena cenaCancelamento = new Cena(1, "Plantão Extraordinário - Cancelamento", "trilha_cancelamento.mp3", 901, falasCancelamento);
            cenasCap9.add(cenaCancelamento);

            for (Fala fala : falasCancelamento) {
                bancoDeFalas.put(fala.getIdFala(), fala);
            }
        }
        // CAMINHO 1 — PONTOS NEGATIVOS ABAIXO DE 60 (A Grande Final)
        else {
            List<Fala> falasFinal = new ArrayList<>();

            falasFinal.add(new Narrativa(901, "Olá, fãs de Reserva para Dois! Finalmente chegamos ao momento mais esperado: a grande final!", 902));
            falasFinal.add(new Narrativa(902, "Hoje, nossas últimas competidoras irão dar suas considerações finais sobre o nosso protagonista.", 903));
            falasFinal.add(new Narrativa(903, "Para a decisão final, vamos ouvir não apenas as participantes, mas também vocês aí de casa! Vocês poderão votar em quem acreditam ter mais química com " + prota.getNome() + " e decidir se ele merece sair acompanhado.", 904));

            // Adiciona as considerações dinâmicas de cada participante com base na afinidade
            int idFalaAtual = 904;
            Secundario[] participantes = {angela, monica, marcia, gabriela};

            for (Secundario participante : participantes) {
                String mensagemAfinidade = obterMensagemConsideracao(participante);
                falasFinal.add(new Narrativa(idFalaAtual, participante.getNome() + ": \"" + mensagemAfinidade + "\"", idFalaAtual + 1));
                idFalaAtual++;
            }

            falasFinal.add(new Narrativa(idFalaAtual, "Essas foram as considerações finais das nossas meninas. Agora, chegou a hora de vocês tomarem a decisão final! Voltamos logo após os comerciais.", idFalaAtual));

            Cena cenaFinal = new Cena(1, "A Grande Final - Considerações Finais", "trilha_final.mp3", 901, falasFinal);
            cenasCap9.add(cenaFinal);

            for (Fala fala : falasFinal) {
                bancoDeFalas.put(fala.getIdFala(), fala);
            }
        }

        Capitulo capitulo9 = new Capitulo(9, "A Grande Final e o Veredito", 901, 910, cenasCap9);
        bancoDeCapitulos.put(capitulo9.getIdCapitulo(), capitulo9);

        return capitulo9;
    }

    // Método auxiliar para selecionar o discurso de cada participante com base no nível de afinidade
    private String obterMensagemConsideracao(Secundario participante) {
        int afinidade = participante.getAfinidade();
        String nome = participante.getNome();

        switch (nome) {
            case "Angela":
                if (afinidade < 50) {
                    return "Eu gostei das experiências que tivemos juntos, mas acho que nossa conexão não evoluiu como eu esperava. Por isso, decidi deixar o programa.";
                } else if (afinidade <= 70) {
                    return "Eu não posso dizer que me envolvi completamente com você, mas gostei do tempo que passamos juntos e estou disposta a descobrir se isso pode se transformar em algo mais.";
                } else {
                    return "Você conseguiu acompanhar meu ritmo de um jeito que eu não esperava. Ainda quero viver muita coisa ao seu lado e descobrir até onde essa história pode chegar.";
                }

            case "Mônica":
                if (afinidade < 50) {
                    return "Foi interessante conhecer você e viver essa experiência, mas não acho que tenhamos construído uma conexão forte o suficiente. Prefiro encerrar nossa história por aqui.";
                } else if (afinidade <= 70) {
                    return "Você despertou minha curiosidade e estou disposta a te conhecer melhor para descobrir onde isso pode chegar.";
                } else {
                    return "Eu não costumo me abrir facilmente, e acho que você conseguiu chegar mais perto de mim do que eu imaginava. Quero continuar vivendo isso.";
                }

            case "Marcia":
                if (afinidade < 50) {
                    return "Acho que não consegui me sentir confortável o suficiente para construir uma conexão de verdade. Por isso, prefiro deixar o programa.";
                } else if (afinidade <= 70) {
                    return "Eu ainda não sei exatamente o que sinto por você, mas acho que preciso de mais tempo para te conhecer melhor.";
                } else {
                    return "Com você, percebi que consigo me sentir confortável sendo eu mesma. Gosto da sua companhia e quero continuar descobrindo o que existe entre nós.";
                }

            case "Gabriela":
                if (afinidade < 50) {
                    return "Gostei de conhecer você, mas algumas histórias simplesmente terminam antes de se tornarem um livro inteiro. Por isso, decidi parar por aqui.";
                } else if (afinidade <= 70) {
                    return "Acho que ainda existe uma história que não terminamos de contar. Quero continuar te conhecendo, sem pressa.";
                } else {
                    return "Você se tornou alguém importante para mim, e eu gosto do que construímos juntos. Quero descobrir quais serão os próximos capítulos dessa história.";
                }

            default:
                return "";
        }
    }

    private Capitulo carregarCapitulo10() {
        Secundario angela = new Secundario("Angela", 6, 5, 5);
        Secundario monica = new Secundario("Mônica", 10, 5, 50);
        Secundario marcia = new Secundario("Marcia", 8, 5, 5);
        Secundario gabriela = new Secundario("Gabriela", 4, 5, 5);

        List<Cena> cenasCap10 = new ArrayList<>();
        List<Fala> falasFinal = new ArrayList<>();

        // Cálculo automático do final com base nas pontuações do protagonista
        Secundario maiorAfinidade = calcularMaiorAfinidade(angela, monica, marcia, gabriela);
        boolean existeEmpateOuPontuacaoBaixa = verificarEmpateOuPontuacaoInsuficiente(angela, monica, marcia, gabriela);

        if (prota.getPontosNegativos() >= 60) {
            // Final: Retirada do programa do ar
            falasFinal.add(new Narrativa(1001, "Devido à elevada rejeição do público pelas atitudes do " + prota.getNome() + ", o programa foi retirado do ar antes da decisão final.", 1002));
            falasFinal.add(new Narrativa(1002, "Você encerra a sua participação sem conquistar o público nem nenhuma das participantes.", 1002));
            cenasCap10.add(new Cena(1, "Final: Baixa Reputação", "trilha_cancelamento.mp3", 1001, falasFinal));

        } else if (existeEmpateOuPontuacaoBaixa) {
            // Final: Todas apertam o botão de rejeição
            falasFinal.add(new Narrativa(1001, "No momento decisivo, a indecisão do " + prota.getNome() + " e a falta de conexão suficiente fizeram com que todas as participantes apertassem o botão vermelho.", 1002));
            falasFinal.add(new Narrativa(1002, "Apresentador: 'Parece que o nosso solteiro não conseguiu conquistar o coração de nenhuma das pretendentes. O Reserva para Dois termina sem um casal!'", 1002));
            cenasCap10.add(new Cena(1, "Final: Rejeição Total / Empate", "trilha_tensao.mp3", 1001, falasFinal));

        } else {
            // Final Individual com a participante de maior afinidade
            String nomeVencedora = maiorAfinidade.getNome();

            falasFinal.add(new Narrativa(1001, "Chegou o momento da verdade! As votações foram encerradas e a sintonia construída ao longo do programa falou mais alto.", 1002));

            if (nomeVencedora.equalsIgnoreCase("Angela")) {
                falasFinal.add(new Narrativa(1002, "Você e a Ângela decidiram seguir juntos! A energia e o espírito competitivo de vocês formaram uma combinação perfeita fora das câmeras.", 1003));
            } else if (nomeVencedora.equalsIgnoreCase("Mônica")) {
                falasFinal.add(new Narrativa(1002, "Você e a Mônica decidiram seguir juntos! A sofisticação, a sintonia e o estilo de ambos superaram todos os desafios do reality.", 1003));
            } else if (nomeVencedora.equalsIgnoreCase("Marcia")) {
                falasFinal.add(new Narrativa(1002, "Você e a Márcia decidiram seguir juntos! A conexão sincera e o conforto no silêncio provaram que a compreensão mútua vale mais que o barulho do estúdio.", 1003));
            } else if (nomeVencedora.equalsIgnoreCase("Gabriela")) {
                falasFinal.add(new Narrativa(1002, "Você e a Gabriela decidiram seguir juntos! Um verdadeiro final de livro, pronto para começar os seus próximos capítulos a dois.", 1003));
            }

            falasFinal.add(new Narrativa(1003, "O público aplaude emocionado. As luzes do estúdio apagam-se e assim se encerra a temporada de Reserva para Dois!", 1003));
            cenasCap10.add(new Cena(1, "Final: " + nomeVencedora, "trilha_encerramento.mp3", 1001, falasFinal));
        }

        Capitulo capitulo10 = new Capitulo(10, "Episódio Final: O Desfecho de Reserva para Dois", 1001, 1003, cenasCap10);

        for (Fala fala : falasFinal) {
            bancoDeFalas.put(fala.getIdFala(), fala);
        }
        bancoDeCapitulos.put(capitulo10.getIdCapitulo(), capitulo10);

        return capitulo10;
    }

    // Métodos auxiliares de cálculo de afinidade
    private Secundario calcularMaiorAfinidade(Secundario... secundarias) {
        Secundario maior = secundarias[0];
        for (Secundario s : secundarias) {
            if (s.getAfinidade() > maior.getAfinidade()) {
                maior = s;
            }
        }
        return maior;
    }

    private boolean verificarEmpateOuPontuacaoInsuficiente(Secundario... secundarias) {
        int maiorPontuacao = 0;
        int contagemMaior = 0;

        for (Secundario s : secundarias) {
            if (s.getAfinidade() > maiorPontuacao) {
                maiorPontuacao = s.getAfinidade();
                contagemMaior = 1;
            } else if (s.getAfinidade() == maiorPontuacao && maiorPontuacao > 0) {
                contagemMaior++;
            }
        }
        // Considera empate se houver mais de uma com a pontuação máxima, ou se a pontuação for muito baixa (< 50)
        return contagemMaior > 1 || maiorPontuacao < 50;
    }
}