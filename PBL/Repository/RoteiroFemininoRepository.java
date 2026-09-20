import java.util.ArrayList;
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

    // ================= CAPÍTULO 1 =================
    private void carregarCapitulo1() {
        List<Cena> cenasCap1 = new ArrayList<>();

        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "As portas do Reserva para Dois estão abertas! O único lugar onde o amor é o prato principal, mas a reserva... ah, essa precisa ser conquistada. No programa de hoje, " + prota.getNome() + " entra na nossa sala VIP e fica de frente para o nosso exigente grupo de solteiras. O objetivo? Usar todo o seu charme, lábia e coração para sair daqui com o convite para o encontro perfeito. Será que ela consegue encantar alguém a tempo?", "Apresentador", null, true, 2));
        falasCena1.add(new Fala(2, "Com vocês, a nossa solteira da noite: " + prota.getNome() + "! Ela é aquela garota focada, que passa o dia inteiro imersa em projetos, resolvendo problemas e tentando manter a vida funcionando bem. O problema? Ela esqueceu que o amor não tem um código exato e muito menos segue um manual de instruções! Cansada de ver a nossa amiga pedindo pizza todo fim de semana e presa numa rotina inquebrável, os próprios amigos dela roubaram o celular dela e a inscreveram no nosso programa como um verdadeiro agora ou nunca! E para a nossa surpresa... ela topou o desafio!\nVamos conhecer quem vai avaliar a nossa jogadora!", "Apresentador", null, true, 3));
        falasCena1.add(new Fala(3, "E para abrir o nosso painel de hoje temos uma mulher que sabe exatamente o que é lutar pelo primeiro lugar! Apresento a vocês a incrível Ângela!", "Apresentador", null, true, 4));
        falasCena1.add(new Fala(4, "Acostumada a superar limites desde os oito anos de idade, ela é uma atleta de pentatlo que já brilhou nos maiores campeonatos mundiais. Mas, depois de alcançar o auge, a Ângela decidiu fazer uma pausa estratégica no esporte para focar no seu maior desafio até agora: encontrar um amor de verdade. Fica aqui um segredinho dos bastidores para você, " + prota.getNome() + ": por mais que ela seja durona na pista, a Ângela tem pavor de água funda ou de mar aberto.", "Apresentador", null, true, 5));
        falasCena1.add(new Fala(5, "Nascida no interior, nossa solteira é apaixonada pela vida ao ar livre e troca qualquer tapete vermelho por um bom pôr do sol na natureza. Hoje, ela divide sua energia ensinando natação para crianças. Mas não se engane, " + prota.getNome() + "! Por trás da doçura de professora, existe a garra de uma competidora internacional. Será que você tem o ritmo e o espírito livre necessários para acompanhar essa mulher?", "Apresentador", null, true, 6));
        falasCena1.add(new Fala(6, "Para ocupar a próxima cadeira do nosso painel, nós trouxemos o verdadeiro significado de alta-costura para o Reserva para Dois! Preparem-se para o charme de Mônica!", "Apresentador", null, true, 7));
        falasCena1.add(new Fala(7, "Com passaporte carimbado nas capitais mais badaladas do mundo e dupla nacionalidade, dividindo o coração entre o Brasil e a Itália, ela é estilista de uma agência de modelos renomadíssima. Depois de brilhar lá fora, Mônica está de volta ao Brasil com um objetivo claro: injetar as raízes e a essência do nosso país em suas próximas obras-primas.", "Apresentador", null, true, 8));
        falasCena1.add(new Fala(8, "Agora que já desfez as malas de grife e se estabilizou por aqui, ela procura o único detalhe que falta na sua coleção: um par romântico à altura! Apaixonada pela selva de pedra, pelo asfalto e pela vida noturna agitada, ela quer alguém que tenha fôlego para acompanhá-la em festas, desfiles e eventos VIPs. E aí, " + prota.getNome() + "? Você tem a elegância e a energia necessárias para desfilar no tapete vermelho ao lado dessa mulher?", "Apresentador", null, true, 9));
        falasCena1.add(new Fala(9, "E para provar que a atração não é apenas uma questão de química, mas sim de física, a nossa próxima solteira tem uma mente brilhante e um perfil muito diferente! Apresento a vocês a nossa campeã das Olimpíadas de Física: Marcia!", "Apresentador", null, true, 10));
        falasCena1.add(new Fala(10, "Trabalhando nos laboratórios de uma empresa de tecnologia de ponta focada em física quântica, ela passa os dias desvendando os maiores mistérios do universo. Mas vou contar um segredinho nosso, " + prota.getNome() + "... a Marcia não queria estar aqui. O lugar favorito dela no mundo é o conforto e o silêncio da sua própria casa, e ela foi literalmente obrigada pela família a sair do sofá e vir participar do nosso programa!", "Apresentador", null, true, 11));
        falasCena1.add(new Fala(11, "Ela não está impressionada com holofotes ou jantares barulhentos, e para ela, o amor ainda é uma equação sem solução. E aí? Você tem o intelecto e a paciência necessários para provar a essa mulher que sair de casa hoje à noite foi a melhor escolha que ela (ou a família dela) poderia ter feito?", "Apresentador", null, true, 12));
        falasCena1.add(new Fala(12, "E para completar o nosso painel com um toque de romance e sensibilidade, trazemos uma mulher cuja própria vida parece ter saído das páginas de um clássico! Com vocês, a encantadora Gabriela!", "Apresentador", null, true, 13));
        falasCena1.add(new Fala(13, "Batizada em uma linda homenagem à literatura pelos seus pais, ela herdou não apenas o nome famoso, mas uma paixão inabalável pelas palavras. Nossa solteira é escritora e tem o dom de enxergar o mundo de forma poética, valorizando a beleza nas pequenas coisas do dia a dia. Ah, e um detalhe curioso sobre ela que vazou na produção: Gabriela tem um medo obsessivo de que seu estilo soe comercial demais, o que a faz quebrar a cabeça e até queimar rascunhos inteiros. E tem mais: se existe algo que ganha o coração dela mais rápido do que um bom livro, são os animais, sua verdadeira paixão!", "Apresentador", null, true, 14));
        falasCena1.add(new Fala(14, "Mas não se iluda achando que será fácil conquistá-la com palavras vazias: para ganhar o coração dessa Gabriela, o seu romance vai precisar ter muito cravo e canela!", "Apresentador", null, true, 15));
        falasCena1.add(new Fala(15, "Ela veio ao Reserva para Dois procurando alguém que saiba ler nas entrelinhas e que não tenha medo de viver um romance digno de cinema — ou melhor, de literatura. E aí, " + prota.getNome() + "? Você tem a sensibilidade e o vocabulário necessários para se tornar a protagonista do próximo capítulo da vida dessa escritora?", "Apresentador", null, true, -1));

        Cena cena1 = new Cena(1, "studio", "trilha_apresentacao.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(15);
        cenasCap1.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        falasCena2.add(new Fala(1, "Atenção, audiência! O nosso restaurante está oficialmente de portas abertas. As nossas quatro solteiras já estão em seus lugares no painel, e agora chegou a hora da verdade para a nossa convidada. Bem-vindos à nossa primeira dinâmica da temporada: A Degustação às Cegas!", "Apresentador", null, true, 2));
        falasCena2.add(new Fala(2, prota.getNome() + ", agora você vai se apresentar melhor. Eu vou te fazer três perguntas fundamentais para testar o seu paladar romântico. Cada resposta sua vai ser avaliada em tempo real pelas nossas juradas. Será que você vai conseguir conquistar uma reserva... ou vai fazer o nosso painel pedir a conta mais cedo?", "Apresentador", null, true, 3));

        Secundario angela = new Secundario("Ângela", 1, 30, 6);
        Secundario monica = new Secundario("Mônica", 2, 30, 10);
        Secundario marcia = new Secundario("Márcia", 3, 30, 8);
        Secundario gabriela = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesD1 = List.of(
            new Opcoes(1, "Eu adoraria fugir da cidade. Uma trilha de manhã cedo terminando com um piquenique surpresa no topo de uma montanha.", "Uma escolha aventureira!", Map.of(angela, 3), 1, 0, false),
            new Opcoes(2, "Acho que o luxo mora na cidade. Um jantar em um bistrô sofisticado, seguido por uma festa VIP para brindarmos a noite toda.", "Classe e sofisticação!", Map.of(monica, 3), 1, 0, false),
            new Opcoes(3, "Sinceramente? Ficar em casa. Pedir uma comida excelente, colocar roupas confortáveis e maratonar um bom documentário ou filme de ficção científica.", "Ousado!", Map.of(marcia, 3), 1, 0, false),
            new Opcoes(4, "Um passeio no fim da tarde por uma cidade histórica, parando em um café literário e, quem sabe, brincando com alguns cachorros de rua pelo caminho.", "Romântico à moda antiga!", Map.of(gabriela, 3), 1, 0, false),
            new Opcoes(5, "Ah, qualquer lugar serve. Eu sou uma pessoa fácil de lidar, deixo a pessoa escolher o que quiser.", "Falta de atitude!", Map.of(angela, -2), 1, 2, true)
        );
        falasCena2.add(new Dialogo(3, "Muito bem, " + prota.getNome() + ", vamos começar a esquentar os motores da nossa cozinha! Para o nosso 'Prato de Entrada', eu quero saber: como seria o seu encontro ideal?", "Apresentador", null, false, opcoesD1, 4));

        List<Opcoes> opcoesD2 = List.of(
            new Opcoes(1, "Aproveito o silêncio. Ficar ouvindo a chuva bater na janela...", "Paz no imprevisto!", Map.of(marcia, 4), 1, 0, false),
            new Opcoes(2, "Eu escrevo um bilhete romântico improvisado...", "Romantismo!", Map.of(gabriela, 4), 1, 0, false),
            new Opcoes(3, "Chuva não me assusta! Eu a desafio para uma corrida...", "Muita energia!", Map.of(angela, 4), 1, 0, false),
            new Opcoes(4, "Eu chamo um carro de aplicativo de luxo...", "Plano B!", Map.of(monica, 4), 1, 0, false),
            new Opcoes(5, "Eu provavelmente ficaria de mau humor...", "Sem reservas!", Map.of(angela, -2), 1, 2, true)
        );
        falasCena2.add(new Dialogo(4, "Vamos para o nosso 'Prato Principal': imagine que o encontro deu errado e começou a chover muito. Como você salva a noite?", "Apresentador", null, false, opcoesD2, 5));

        List<Opcoes> opcoesD3 = List.of(
            new Opcoes(1, "Procuro alguém ambicioso, que tenha uma vida badalada...", "Dupla de poder!", Map.of(monica, 5), 1, 0, false),
            new Opcoes(2, "Estou em busca de um amor épico...", "Amor clássico!", Map.of(gabriela, 5), 1, 0, false),
            new Opcoes(3, "Quero alguém que não me force a ser o centro...", "Maturidade!", Map.of(marcia, 5), 1, 0, false),
            new Opcoes(4, "Quero um companheiro que me desafie...", "Aventura!", Map.of(angela, 5), 1, 0, false),
            new Opcoes(5, "Não sei direito ainda...", "Desculpa fraca!", Map.of(angela, -2), 1, 2, true)
        );
        falasCena2.add(new Dialogo(5, "Para fechar, a 'Sobremesa'! O que você realmente busca em um parceiro?", "Apresentador", null, false, opcoesD3, 6));
        falasCena2.add(new Fala(6, "E com essa sobremesa, a nossa cozinha encerra os pedidos desta rodada! No próximo bloco, vamos para os encontros individuais.", "Apresentador", null, true, -1));

        Cena cena2 = new Cena(2, "Studio", "trilha_jantar.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(6);
        cenasCap1.add(cena2);

        Capitulo capitulo1 = new Capitulo(1, "Estreia", 1, 2, cenasCap1);
        bancoDeCapitulos.put(1, capitulo1);
    }

    private void carregarCapitulo2() {
        List<Cena> cenasCap2 = new ArrayList<>();

        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "O jogo esquentou, Brasil! O palco ficou pequeno demais para as emoções de hoje, então decidimos mandar a nossa solteira direta para a ação. Começa agora a nossa rodada de encontros individuais!", "Apresentador", null, true, 2));
        falasCena1.add(new Fala(2, "E para estrear essa fase com o pé direito — ou melhor, nas alturas — " + prota.getNome() + " terá o seu primeiro encontro com a nossa imparável atleta, Ângela!", "Apresentador", null, true, 3));
        falasCena1.add(new Fala(3, "A nossa produção preparou um cenário perfeito para testar os limites dessa dupla: um circuito de arvorismo radical no meio da natureza!", "Apresentador", null, true, 4));

        Secundario angela = new Secundario("Ângela", 1, 30, 6);

        List<Opcoes> opcoesD1 = List.of(
            new Opcoes(1, "Desespero nenhum, eu adoro um desafio!", "Desafio aceito", Map.of(angela, 3), 1, 0, false),
            new Opcoes(2, "Foi intenso, mas a vista compensou.", "Boa vista", Map.of(angela, 1), 1, 0, false),
            new Opcoes(3, "Só tentei não olhar para baixo.", "Medo de altura", Map.of(angela, -1), 1, 0, false),
            new Opcoes(4, "Achei meio exagerado.", "Exagerado", Map.of(angela, -3), 1, 1, true)
        );
        falasCena1.add(new Dialogo(4, "Uau, conseguimos! Qual foi o seu nível de desespero lá no meio daquela subida?", "Ângela", angela, false, opcoesD1, 5));

        List<Opcoes> opcoesD2 = List.of(
            new Opcoes(1, "Ter você ali torcendo foi o empurrão que faltava.", "Treinadora", Map.of(angela, 1), 1, 0, false),
            new Opcoes(2, "Foi culpa daquele equipamento de segurança...", "Culpa do equipamento", Map.of(angela, -1), 1, 0, false),
            new Opcoes(3, "Eu travei porque a produção ficou gritando no ponto.", "Ponto eletrônico", Map.of(angela, -3), 1, 1, true),
            new Opcoes(4, "Tática milenar do pânico controlado!", "Pânico controlado", Map.of(angela, 3), 1, 0, false)
        );
        falasCena1.add(new Dialogo(5, "Teve uma hora ali na fenda principal que você travou bonito. Vai admitir que precisou de ajuda?", "Ângela", angela, false, opcoesD2, 6));

        List<Opcoes> opcoesD3 = List.of(
            new Opcoes(1, "Só a pressão das obrigações.", "Pressão", Map.of(angela, -3), 1, 1, true),
            new Opcoes(2, "Conhecer histórias novas e viver momentos.", "Histórias", Map.of(angela, 1), 1, 0, false),
            new Opcoes(3, "Eu gosto da minha rotina planejada.", "Rotina", Map.of(angela, -1), 1, 0, false),
            new Opcoes(4, "A sensação de me superar e evoluir.", "Superação", Map.of(angela, 3), 1, 0, false)
        );
        falasCena1.add(new Dialogo(6, "O que te tira da sua zona de conforto de verdade quando você acorda?", "Ângela", angela, false, opcoesD3, 7));
        falasCena1.add(new Fala(7, "De repente, o tempo vira e algumas gotas começam a cair. Ângela estende a mão.", "Narrador", null, true, 8));

        List<Opcoes> opcoesD4 = List.of(
            new Opcoes(1, "Que falta de organização da equipe!", "Reclamação", Map.of(angela, -1), 1, 0, false),
            new Opcoes(2, "A gente enrola a produção! A vista é nossa.", "Curtição", Map.of(angela, 3), 1, 0, false),
            new Opcoes(3, "Acho melhor a gente começar a descer por segurança.", "Segurança", Map.of(angela, 1), 1, 0, false),
            new Opcoes(4, "Minha roupa vai ficar encharcada!", "Roupa molhada", Map.of(angela, -3), 1, 1, true)
        );
        falasCena1.add(new Dialogo(8, "Ih, o clima resolveu testar a gente. O que a gente faz?", "Ângela", angela, false, opcoesD4, 9));
        falasCena1.add(new Fala(9, "A chuva aperta um pouquinho, e vocês começam a juntar os equipamentos.", "Narrador", null, true, 10));

        List<Opcoes> opcoesD5 = List.of(
            new Opcoes(1, "Eu me diverti muito, de verdade.", "Divertido", Map.of(angela, 1), 1, 0, false),
            new Opcoes(2, "Foi sensacional. No próximo encontro, eu escolho a arena!", "Desafio futuro", Map.of(angela, 3), 1, 0, false),
            new Opcoes(3, "Eu queria muito te impressionar hoje.", "Impressão", Map.of(angela, -1), 1, 0, false),
            new Opcoes(4, "É tudo parte do roteiro para o público.", "Roteiro", Map.of(angela, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(10, "Você gostou do passeio, ou só topou escalar pra não ficar mal na TV?", "Ângela", angela, false, opcoesD5, -1));

        Cena cena1 = new Cena(1, "arvorismo", "trilha_esporte.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(10);
        cenasCap2.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        Secundario angelaC2 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC2 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC2 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC2 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesFotoC2 = List.of(
            new Opcoes(1, "Selfie no topo da parede, rosto suado, sorrindo e mostrando os músculos", "", Map.of(angelaC2, 3), 1, 0, false),
            new Opcoes(2, "Foto conceitual apenas dos equipamentos de escalada com filtro preto e branco", "", Map.of(monicaC2, 3), 1, 0, false),
            new Opcoes(3, "Foto macro de um inseto ou da textura da madeira da plataforma, sem pessoas", "", Map.of(marciaC2, 3), 1, 0, false),
            new Opcoes(4, "Foto espontânea das nuvens de chuva se formando no horizonte com o sol", "", Map.of(gabrielaC2, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(1, "Escolha uma foto para postar:", "Sistema", null, false, opcoesFotoC2, 2));

        List<Opcoes> opcoesLegendaC2 = List.of(
            new Opcoes(1, "A gravidade tentou, mas hoje eu venci! Que venha o próximo desafio.", "", Map.of(angelaC2, 3), 1, 0, false),
            new Opcoes(2, "Aventuras ao ar livre são ótimas, mas confesso que já estou sentindo falta de um ar-condicionado e uma taça de champanhe.", "", Map.of(monicaC2, 3), 1, 0, false),
            new Opcoes(3, "O silêncio lá de cima foi a melhor parte. É fascinante como a física da escalada depende de tanta distribuição de peso perfeita.", "", Map.of(marciaC2, 3), 1, 0, false),
            new Opcoes(4, "Às vezes, a gente precisa subir o mais alto possível para enxergar o que realmente importa. Um encontro para ficar na memória.", "", Map.of(gabrielaC2, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Escolha uma legenda:", "Sistema", null, false, opcoesLegendaC2, 3));
        falasCena2.add(new Fala(3, "Publicado com sucesso!", "Sistema", null, true, -1));

        Cena cena2 = new Cena(2, "social_media", "trilha_leve.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap2.add(cena2);

        Capitulo capitulo2 = new Capitulo(2, "Encontro nas Alturas", 1, 2, cenasCap2);
        bancoDeCapitulos.put(2, capitulo2);
    }

    private void carregarCapitulo3() {
        List<Cena> cenasCap3 = new ArrayList<>();
        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Ufa! O segundo encontro muda completamente de ritmo. Hoje é dia de mergulhar no universo da escritora Gabriela!", "Apresentador", null, true, 2));
        falasCena1.add(new Fala(2, "A produção preparou uma tarde em um sebo literário antigo. Silêncio no set!", "Apresentador", null, true, 3));

        Secundario gabriela = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesD1 = List.of(
            new Opcoes(1, "Compartilhar a mesma história do passado dá arrepio.", "História passada", Map.of(gabriela, 3), 1, 0, false),
            new Opcoes(2, "É um ótimo esconderijo do barulho.", "Refúgio", Map.of(gabriela, 1), 1, 0, false),
            new Opcoes(3, "Prefiro ler tudo no leitor digital.", "Digital", Map.of(gabriela, -1), 1, 0, false),
            new Opcoes(4, "Para mim tem cheiro de mofo e poeira.", "Rinite", Map.of(gabriela, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(3, "Cada livro aqui foi lido por dezenas de pessoas. Você consegue sentir isso?", "Gabriela", gabriela, false, opcoesD1, 4));

        List<Opcoes> opcoesD2 = List.of(
            new Opcoes(1, "Algo sobre ciências ou matemática.", "Ciências", Map.of(gabriela, -1), 1, 0, false),
            new Opcoes(2, "Uma biografia sobre alguém rico e famoso.", "Biografia", Map.of(gabriela, -3), 1, 2, true),
            new Opcoes(3, "Um mistério bem construído.", "Mistério", Map.of(gabriela, 1), 1, 0, false),
            new Opcoes(4, "Um romance clássico, com cartas escritas à mão.", "Romance clássico", Map.of(gabriela, 3), 1, 0, false)
        );
        falasCena1.add(new Dialogo(4, "Se você pudesse levar uma história para casa hoje, qual gênero procuraria?", "Gabriela", gabriela, false, opcoesD2, 5));

        List<Opcoes> opcoesD3 = List.of(
            new Opcoes(1, "Eu seguro a caneta, não acredito em destino.", "Livre arbítrio", Map.of(gabriela, -1), 1, 0, false),
            new Opcoes(2, "O universo é um caos e tentamos sobreviver.", "Caos", Map.of(gabriela, -3), 1, 2, true),
            new Opcoes(3, "O destino nos coloca na página, nós decidimos o final.", "Destino e escolha", Map.of(gabriela, 3), 1, 0, false),
            new Opcoes(4, "Acredito que tudo acontece por um motivo.", "Motivo", Map.of(gabriela, 1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(5, "A nossa história já está escrita nas estrelas, ou somos nós que seguramos a caneta?", "Gabriela", gabriela, false, opcoesD3, 6));
        falasCena1.add(new Fala(6, "Um raio cai lá fora e as luzes se apagam. Gabriela segura seu braço assustada.", "Narrador", null, true, 7));

        List<Opcoes> opcoesD4 = List.of(
            new Opcoes(1, "Vou pedir duas velas e transformar num encontro à luz de velas.", "Luz de velas", Map.of(gabriela, 3), 1, 0, false),
            new Opcoes(2, "Eu ligo a lanterna do celular.", "Lanterna", Map.of(gabriela, 1), 1, 0, false),
            new Opcoes(3, "Vou reclamar com a produção pelo gerador!", "Reclamação", Map.of(gabriela, -1), 1, 0, false),
            new Opcoes(4, "Você tem medo do escuro? Não estamos num filme de terror.", "Sem medo", Map.of(gabriela, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(7, "O escuro absoluto me deixa ansiosa... O que a gente faz agora?", "Gabriela", gabriela, false, opcoesD4, 8));

        List<Opcoes> opcoesD5 = List.of(
            new Opcoes(1, "Foi um pouco parado demais para mim.", "Parado", Map.of(gabriela, -3), 1, 1, true),
            new Opcoes(2, "Fiquei com medo de quebrar o clima literário.", "Medo", Map.of(gabriela, -1), 1, 0, false),
            new Opcoes(3, "Foi muito relaxante e revigorante.", "Relaxante", Map.of(gabriela, 1), 1, 0, false),
            new Opcoes(4, "Eu encontrei poesia em você.", "Poesia", Map.of(gabriela, 3), 1, 0, false)
        );
        falasCena1.add(new Dialogo(8, "Me diz a verdade: esse encontro te entediou, ou você conseguiu enxergar esse lugar como eu?", "Gabriela", gabriela, false, opcoesD5, -1));

        Cena cena1 = new Cena(1, "sebo", "trilha_romance.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(8);
        cenasCap3.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        Secundario angelaC3 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC3 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC3 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC3 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesLivroC3 = List.of(
            new Opcoes(1, "Guia de Escalada e Sobrevivência", "", Map.of(angelaC3, 3), 1, 0, false),
            new Opcoes(2, "Historia da Alta Costura", "", Map.of(monicaC3, 3), 1, 0, false),
            new Opcoes(3, "Fisica Quantica para Iniciantes", "", Map.of(marciaC3, 3), 1, 0, false),
            new Opcoes(4, "Antologia Poetica", "", Map.of(gabrielaC3, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(1, "Escolha foto de um livro pra postar:", "Sistema", null, false, opcoesLivroC3, 2));

        List<Opcoes> opcoesLegendaC3 = List.of(
            new Opcoes(1, "Ler sobre grandes aventuras e otimo, mas vive-las na pratica sempre vai ser o meu estilo favorito.", "", Map.of(angelaC3, 3), 1, 0, false),
            new Opcoes(2, "O vintage nunca sai de moda. O cafe perfeito, a iluminacao perfeita, o estilo perfeito. O bom gosto mora nos pequenos detalhes.", "", Map.of(monicaC3, 3), 1, 0, false),
            new Opcoes(3, "A melhor parte desse lugar nem sao os livros, e o silencio absoluto. A prova de que a paz e o isolamento recarregam qualquer bateria.", "", Map.of(marciaC3, 3), 1, 0, false),
            new Opcoes(4, "Entre tantas paginas e historias perdidas no tempo, a minha favorita estava sentada bem na minha frente. Um encontro inesquecivel.", "", Map.of(gabrielaC3, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Escolha uma legenda:", "Sistema", null, false, opcoesLegendaC3, 3));
        falasCena2.add(new Fala(3, "Postado com sucesso!", "Sistema", null, true, -1));

        Cena cena2 = new Cena(2, "social_media_sebo", "trilha_leve.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap3.add(cena2);

        Capitulo capitulo3 = new Capitulo(3, "Entre Páginas e Poesia", 1, 2, cenasCap3);
        bancoDeCapitulos.put(3, capitulo3);
    }

    private void carregarCapitulo4() {
        List<Cena> cenasCap4 = new ArrayList<>();
        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Atenção, Brasil! O encontro de hoje é com a nossa cientista, Marcia, no Museu de Tecnologia fechado só para eles.", "Apresentador", null, true, 2));
        falasCena1.add(new Fala(2, prota.getNome() + " vai passar a noite em um ambiente tranquilo e silencioso.", "Apresentador", null, true, 3));

        Secundario marcia = new Secundario("Márcia", 3, 30, 8);

        List<Opcoes> opcoesD1 = List.of(
            new Opcoes(1, "É um alívio ter paz para conversar sem gritar.", "Paz", Map.of(marcia, 3), 1, 0, false),
            new Opcoes(2, "Até que é interessante para focar nas exposições.", "Foco", Map.of(marcia, 1), 1, 0, false),
            new Opcoes(3, "Parece que o museu está fechado e invadimos.", "Invasão", Map.of(marcia, -1), 1, 0, false),
            new Opcoes(4, "Acho meio deprimente, falta gente.", "Deprimente", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(3, "Ter que disputar espaço com multidões me daria dor de cabeça. O que acha?", "Marcia", marcia, false, opcoesD1, 4));

        List<Opcoes> opcoesD2 = List.of(
            new Opcoes(1, "A previsibilidade da lógica evitaria conflitos.", "Lógica", Map.of(marcia, 3), 1, 0, false),
            new Opcoes(2, "Eu adoro entender como a lógica funciona.", "Funcionamento", Map.of(marcia, 1), 1, 0, false),
            new Opcoes(3, "Acho meio frio, emoções não são álgebra.", "Frio", Map.of(marcia, -1), 1, 0, false),
            new Opcoes(4, "Nossa, que tédio agir como um robô.", "Robô", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(4, "Não seria ótimo se o comportamento das pessoas fosse claro como um circuito?", "Marcia", marcia, false, opcoesD2, 5));

        List<Opcoes> opcoesD3 = List.of(
            new Opcoes(1, "Relacionamento exige compatibilidade real e dados.", "Dados", Map.of(marcia, 3), 1, 0, false),
            new Opcoes(2, "Emoções importam, mas bom senso também.", "Equilíbrio", Map.of(marcia, 1), 1, 0, false),
            new Opcoes(3, "Se a gente sente algo forte, tem que se jogar.", "Impulso", Map.of(marcia, -1), 1, 0, false),
            new Opcoes(4, "Você analisa demais, o amor é caótico.", "Caos", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(5, "Acredito que na vida real até o amor precisa passar por um filtro racional. O que acha?", "Marcia", marcia, false, opcoesD3, 6));
        falasCena1.add(new Fala(6, "De repente, um grupo barulhento de patrocinadores chega para um coquetel surpresa.", "Narrador", null, true, 7));

        List<Opcoes> opcoesD4 = List.of(
            new Opcoes(1, "Tem uma sala menor no segundo andar, vamos sair de fininho.", "Esconderijo", Map.of(marcia, 3), 1, 0, false),
            new Opcoes(2, "Quer que eu peça para segurarem o grupo?", "Ajuda", Map.of(marcia, 1), 1, 0, false),
            new Opcoes(3, "Vamos ficar aqui no nosso canto.", "Canto", Map.of(marcia, -1), 1, 0, false),
            new Opcoes(4, "Bora lá se enturmar com o pessoal!", "Muvuca", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(7, "O barulho está insuportável... O que a gente faz?", "Marcia", marcia, false, opcoesD4, 8));

        List<Opcoes> opcoesD5 = List.of(
            new Opcoes(1, "Eu trocaria qualquer festa por essa paz interior.", "Paz interior", Map.of(marcia, 3), 1, 0, false),
            new Opcoes(2, "Fez bem para desacelerar a cabeça.", "Desacelerar", Map.of(marcia, 1), 1, 0, false),
            new Opcoes(3, "Foi legal, valeu a experiência nova.", "Experiência", Map.of(marcia, -1), 1, 0, false),
            new Opcoes(4, "Agora toparia ir pra um barzinho animado.", "Barzinho", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(8, "É difícil achar alguém que entenda que não preciso de música alta. Como foi?", "Marcia", marcia, false, opcoesD5, -1));

        Cena cena1 = new Cena(1, "museu", "trilha_tecnologia.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(8);
        cenasCap4.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        Secundario angelaC4 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC4 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC4 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC4 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesFotoC4 = List.of(
            new Opcoes(1, "Uma pilha ou bateria estilizada com o desenho de um raio no meio", "", Map.of(angelaC4, 3), 1, 0, false),
            new Opcoes(2, "Um crachá com um cordão elegante escrito Acesso VIP", "", Map.of(monicaC4, 3), 1, 0, false),
            new Opcoes(3, "Um microchip processador classico", "", Map.of(marciaC4, 3), 1, 0, false),
            new Opcoes(4, "Uma lampada vintage com o filamento interno no formato de um coracao", "", Map.of(gabrielaC4, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(1, "Escolha um icone:", "Sistema", null, false, opcoesFotoC4, 2));

        List<Opcoes> opcoesLegendaC4 = List.of(
            new Opcoes(1, "Pausa na correria so pra recarregar a bateria. Mal posso esperar para as novas aventuras do reality.", "", Map.of(angelaC4, 3), 1, 0, false),
            new Opcoes(2, "Ter um museu inteiro fechado so pra nos e o tipo de exclusividade que eu valorizo. O cenario perfeito, sem filas e com muito estilo.", "", Map.of(monicaC4, 3), 1, 0, false),
            new Opcoes(3, "A melhor invencao da humanidade ainda e o silencio. Uma noite incrivel, focada no que importa, longe de qualquer interferencia externa.", "", Map.of(marciaC4, 3), 1, 0, false),
            new Opcoes(4, "No meio de tantas maquinas e circuitos frios, e incrivel como a verdadeira faisca ainda vem de uma boa conversa.", "", Map.of(gabrielaC4, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Escolha uma legenda:", "Sistema", null, false, opcoesLegendaC4, 3));
        falasCena2.add(new Fala(3, "Publicado com sucesso!", "Sistema", null, true, -1));

        Cena cena2 = new Cena(2, "social_media_museu", "trilha_leve.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap4.add(cena2);

        Capitulo capitulo4 = new Capitulo(4, "Lógica e Silêncio", 1, 2, cenasCap4);
        bancoDeCapitulos.put(4, capitulo4);
    }

    private void carregarCapitulo5() {
        List<Cena> cenasCap5 = new ArrayList<>();
        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Boa noite, Brasil! Hoje a " + prota.getNome() + " vai direto para a cobertura em um encontro com a glamourosa Mônica!", "Apresentador", null, true, 2));
        falasCena1.add(new Fala(2, "Um ambiente exclusivo e drinks assinados. A Mônica é exigente e busca excelência. Preparada?", "Apresentador", null, true, 3));

        Secundario monica = new Secundario("Mônica", 2, 30, 10);

        List<Opcoes> opcoesD1 = List.of(
            new Opcoes(1, "Estar no topo com serviço excelente é o mínimo.", "Topo", Map.of(monica, 3), 1, 0, false),
            new Opcoes(2, "Muito bonito, decoração e clima ótimos.", "Bonito", Map.of(monica, 1), 1, 0, false),
            new Opcoes(3, "Simples também me agradaria sem problemas.", "Simples", Map.of(monica, -1), 1, 0, false),
            new Opcoes(4, "Acho um exagero gastar à toa para foto.", "Exagero", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(3, "A energia da cidade e a exclusividade aqui em cima... O que acha do cenário?", "Mônica", monica, false, opcoesD1, 4));

        List<Opcoes> opcoesD2 = List.of(
            new Opcoes(1, "No topo, liderando bons projetos com ambição.", "Ambição", Map.of(monica, 3), 1, 0, false),
            new Opcoes(2, "Quero estabilidade e carreira sólida.", "Estabilidade", Map.of(monica, 1), 1, 0, false),
            new Opcoes(3, "Só quero ter paz e pagar contas em dia.", "Paz", Map.of(monica, -1), 1, 0, false),
            new Opcoes(4, "Focar demais em sucesso estraga a pessoa.", "Sem foco", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(4, "Para mim, sucesso é construir um nome forte. Onde quer estar daqui a anos?", "Mônica", monica, false, opcoesD2, 5));

        List<Opcoes> opcoesD3 = List.of(
            new Opcoes(1, "Quem aceita qualquer coisa vive de qualquer jeito. Critérios importam.", "Critérios", Map.of(monica, 3), 1, 0, false),
            new Opcoes(2, "Depende da situação, é bom relaxar às vezes.", "Relaxar", Map.of(monica, 1), 1, 0, false),
            new Opcoes(3, "Sou bem desencanada com detalhes.", "Desencanado", Map.of(monica, -1), 1, 0, false),
            new Opcoes(4, "Frescura pura estressar a cabeça com futilidade.", "Frescura", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(5, "Eu sou extremamente exigente com tudo ao meu redor. Você também busca o melhor?", "Mônica", monica, false, opcoesD3, 6));

        List<Opcoes> opcoesD4 = List.of(
            new Opcoes(1, "Penso em cada detalhe, imagem abre portas.", "Detalhes", Map.of(monica, 3), 1, 0, false),
            new Opcoes(2, "Gosto de estar bem vestida sem exageros.", "Básico", Map.of(monica, 1), 1, 0, false),
            new Opcoes(3, "Só visto o que é confortável para mim.", "Conforto", Map.of(monica, -1), 1, 0, false),
            new Opcoes(4, "Roupa serve só para cobrir o corpo.", "Roupa simples", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(6, "A forma como nos vestimos transmite cartão de visitas. Você pensa nisso?", "Mônica", monica, false, opcoesD4, 7));

        List<Opcoes> opcoesD5 = List.of(
            new Opcoes(1, "Se for para ter sua companhia, o sofá pode esperar.", "Companhia", Map.of(monica, 3), 1, 0, false),
            new Opcoes(2, "Gosto de sair, mas equilíbrio é a chave.", "Equilíbrio", Map.of(monica, 1), 1, 0, false),
            new Opcoes(3, "Sou mais caseira, um evento por mês basta.", "Caseiro", Map.of(monica, -1), 1, 0, false),
            new Opcoes(4, "Já estou louca para ir para casa descansar.", "Cansado", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(7, "Realmente se identifica com eventos ou o sofá vai acabar ganhando?", "Mônica", monica, false, opcoesD5, -1));

        Cena cena1 = new Cena(1, "cobertura", "trilha_luxo.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(7);
        cenasCap5.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        Secundario angelaC5 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC5 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC5 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC5 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesFotoC5 = List.of(
            new Opcoes(1, "Um alvo de dardos", "", Map.of(angelaC5, 3), 1, 0, false),
            new Opcoes(2, "Uma taca de Martini com uma azeitona ou cereja no fundo", "", Map.of(monicaC5, 3), 1, 0, false),
            new Opcoes(3, "A fachada simplificada de uma casa", "", Map.of(marciaC5, 3), 1, 0, false),
            new Opcoes(4, "Um guardanapo de pano luxuoso com uma pequena frase escrita a mao", "", Map.of(gabrielaC5, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(1, "Escolha um objeto:", "Sistema", null, false, opcoesFotoC5, 2));

        List<Opcoes> opcoesLegendaC5 = List.of(
            new Opcoes(1, "O lugar e chic, mas a verdadeira diversao comecou quando a gente achou a area de jogos. Mira calibrada e pronto para o proximo round.", "", Map.of(angelaC5, 3), 1, 0, false),
            new Opcoes(2, "Noites no topo da cidade exigem a melhor companhia. Brindando ao sucesso, a estetica impecavel e aos bons momentos.", "", Map.of(monicaC5, 3), 1, 0, false),
            new Opcoes(3, "De volta a base, depois de um dia longo.", "", Map.of(marciaC5, 3), 1, 0, false),
            new Opcoes(4, "Ate mesmo no lugar mais agitado do mundo, tudo o que importa e a poesia de um bom olhar e uma conversa que faz o tempo parar.", "", Map.of(gabrielaC5, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Escolha uma legenda:", "Sistema", null, false, opcoesLegendaC5, 3));
        falasCena2.add(new Fala(3, "Publicado com sucesso!", "Sistema", null, true, -1));

        Cena cena2 = new Cena(2, "social_media_cobertura", "trilha_leve.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap5.add(cena2);

        Capitulo capitulo5 = new Capitulo(5, "Alta-Costura e Alta Sociedade", 1, 2, cenasCap5);
        bancoDeCapitulos.put(5, capitulo5);
    }

    private void carregarCapitulo6() {
        List<Cena> cenasCap6 = new ArrayList<>();
        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "E as câmeras não param! Solteira convocada para missões especiais nos bastidores.", "Apresentador", null, true, 2));

        Secundario angelaC6 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC6 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC6 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC6 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesD1 = List.of(
            new Opcoes(1, "Garrafa térmica metálica de treino.", "", Map.of(angelaC6, 3), 1, 0, false),
            new Opcoes(2, "Caderno de couro com rascunhos.", "", Map.of(gabrielaC6, 3), 1, 0, false),
            new Opcoes(3, "HD externo com capa.", "", Map.of(marciaC6, 3), 1, 0, false),
            new Opcoes(4, "Nécessaire de grife.", "", Map.of(monicaC6, 3), 1, 0, false),
            new Opcoes(5, "Agenda corporativa genérica.", "", Map.of(angelaC6, -1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(2, "Decisão 1: Salvar um Item Pessoal.", "Sistema", null, false, opcoesD1, 3));

        List<Opcoes> opcoesD2 = List.of(
            new Opcoes(1, "Tênis esportivo antigo.", "", Map.of(angelaC6, -3), 1, 1, true),
            new Opcoes(2, "Livro de poesia clássica.", "", Map.of(gabrielaC6, -3), 1, 1, true),
            new Opcoes(3, "Manual técnico impresso.", "", Map.of(marciaC6, -3), 1, 1, true),
            new Opcoes(4, "Revista de moda de luxo.", "", Map.of(monicaC6, -3), 1, 1, true),
            new Opcoes(5, "Bloco de notas simples.", "", Map.of(angelaC6, -1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(3, "Decisão 2: Descartar um Item.", "Sistema", null, false, opcoesD2, 4));

        List<Opcoes> opcoesD3 = List.of(
            new Opcoes(1, "Smartwatch com GPS.", "", Map.of(angelaC6, 3), 1, 0, false),
            new Opcoes(2, "Caneta tinteiro clássica.", "", Map.of(gabrielaC6, 3), 1, 0, false),
            new Opcoes(3, "Luminária de mesa articulada.", "", Map.of(marciaC6, 3), 1, 0, false),
            new Opcoes(4, "Lenço de seda bordado.", "", Map.of(monicaC6, 3), 1, 0, false),
            new Opcoes(5, "Fone bluetooth padrão.", "", Map.of(angelaC6, -1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(4, "Decisão 3: Comprar um Presente na Loja.", "Sistema", null, false, opcoesD3, 5));

        List<Opcoes> opcoesD4 = List.of(
            new Opcoes(1, "Ver a Ângela se soltar...", "", Map.of(angelaC6, 3), 1, 0, false),
            new Opcoes(2, "A conexão da Gabriela...", "", Map.of(gabrielaC6, 3), 1, 0, false),
            new Opcoes(3, "O silêncio confortável entre a Marcia...", "", Map.of(marciaC6, 3), 1, 0, false),
            new Opcoes(4, "A Mônica e a protagonista...", "", Map.of(monicaC6, 3), 1, 0, false),
            new Opcoes(5, "Torço muito pelo casal...", "", Map.of(angelaC6, -1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(5, "Decisão 4: Salvar Mensagem de Amor.", "Sistema", null, false, opcoesD4, -1));

        Cena cena1 = new Cena(1, "camarim", "trilha_decisao.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(5);
        cenasCap6.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        falasCena2.add(new Fala(1, "Para fechar, teste de atenção no telão!", "Apresentador", null, true, 2));

        List<Opcoes> opcoesQuiz = List.of(
            new Opcoes(1, "Tem pavor de água funda e mar aberto, apesar de dar aulas de natação em piscinas rasas.", "", Map.of(angelaC6, 5), 1, 0, false),
            new Opcoes(2, "É incapaz de segurar o choro ao assistir a comédias românticas clichês na TV.", "", Map.of(marciaC6, 5), 1, 0, false),
            new Opcoes(3, "Começou a carreira gerindo um brechó online escondida dos pais no quarto de casa.", "", Map.of(monicaC6, 5), 1, 0, false),
            new Opcoes(4, "Possui um medo obsessivo de que seu estilo acabe parecendo comercial demais.", "", Map.of(gabrielaC6, 5), 1, 0, false),
            new Opcoes(5, "Tem uma tatuagem secreta de um código binário antigo na nuca que fez escondida aos dezessete anos.", "", Map.of(angelaC6, -5, monicaC6, -5, marciaC6, -5, gabrielaC6, -5), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Selecione o fato verídico correspondente:", "Apresentador", null, false, opcoesQuiz, 3));
        falasCena2.add(new Fala(3, "Decisões tomadas! Reta final a seguir.", "Apresentador", null, true, -1));

        Cena cena2 = new Cena(2, "telao_camarim", "trilha_tenso.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap6.add(cena2);

        Capitulo capitulo6 = new Capitulo(6, "O Bastidor e o Filtro de Decisões", 1, 2, cenasCap6);
        bancoDeCapitulos.put(6, capitulo6);
    }

    private void carregarCapitulo7() {
        List<Cena> cenasCap7 = new ArrayList<>();

        Secundario angelaC7 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC7 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC7 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC7 = new Secundario("Gabriela", 4, 30, 4);

        List<Fala> falasCena1Facil = new ArrayList<>();
        falasCena1Facil.add(new Fala(1, "Olá! Sejam bem-vindos a mais um episódio de reserva para dois. Hoje o nosso programa está mais que especial porque serão vocês, isso mesmo, vocês aí da plateia, que irão ditar o rumo da nossa participante. Apresento a vocês o nosso quadro Gabarito do amor! Roda a vinheta!", "Apresentador", null, true, 2));
        falasCena1Facil.add(new Fala(2, "Nesse quadro a " + prota.getNome() + " irá abrir o seu coração e responder perguntas pessoais feitas pelos nossos telespectadores. Será que ela será capaz de passar na prova mais difícil da sua vida: o vestibular do amor?", "Apresentador", null, true, 3));

        List<Opcoes> opcoesAngelaFacil = List.of(
            new Opcoes(1, "Aceito o desafio na hora! Entro na brincadeira e aproveito para mostrar que também gosto de competir.", "Competitivo", Map.of(angelaC7, 20), 1, 0, false),
            new Opcoes(2, "Recuso imediatamente e digo que não tenho interesse nenhum em esportes ou atividades físicas.", "Sem interesse", Map.of(angelaC7, 0), 1, 0, false),
            new Opcoes(3, "Aceito o desafio, mas começo a me exibir e transformar a competição em uma disputa séria demais.", "Exibido", Map.of(angelaC7, -20), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(3, "FASE 1: O GABARITO DELAS (SINTONIA)\n\nPergunta número um, direto para o gabarito da Ângela, nossa atleta competitiva que ama esportes e a vida ao ar livre.\n\nÂngela te convida para passar o dia em uma trilha e, no meio do caminho, propõe um desafio: quem chegar primeiro ao topo da montanha. O que você faz?", "Apresentador", angelaC7, false, opcoesAngelaFacil, 4));

        List<Opcoes> opcoesMonicaFacil = List.of(
            new Opcoes(1, "Escolho um lugar especial e apresento a ela um prato brasileiro que acredito que combine com seus gostos, lembrando das coisas que ela já contou sobre si.", "Atencioso", Map.of(monicaC7, 20), 1, 0, false),
            new Opcoes(2, "Digo que tanto faz o restaurante e deixo que ela escolha tudo sozinha, sem me preocupar muito.", "Desinteressado", Map.of(monicaC7, 0), 1, 0, false),
            new Opcoes(3, "Escolho o restaurante mais barato possível e reclamo do preço sempre que ela demonstra interesse em experimentar alguma coisa.", "Mão de vaca", Map.of(monicaC7, -20), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(4, "Segunda pergunta desta fase, direcionada para Mônica, nossa estilista elegante, irônica e acostumada à vida agitada.\n\nDurante o encontro, Mônica comenta que ainda não conhece muito bem a culinária brasileira e demonstra curiosidade para experimentar algo diferente. Como você reage?", "Apresentador", monicaC7, false, opcoesMonicaFacil, 5));

        List<Opcoes> opcoesMarciaFacil = List.of(
            new Opcoes(1, "Percebo o desconforto e pergunto tranquilamente se ela prefere procurar um lugar mais reservado, sem pressioná-la a conversar.", "Compreensivo", Map.of(marciaC7, 20), 1, 0, false),
            new Opcoes(2, "Tento fazer com que ela se solte à força, fazendo várias perguntas e dizendo que ela precisa parar de ser tão tímida.", "Invasivo", Map.of(marciaC7, -20), 1, 2, true),
            new Opcoes(3, "Fico irritada com o silêncio e começo a reclamar que ela está tornando o encontro estranho e que deveria se esforçar mais para conversar.", "Impaciente", Map.of(marciaC7, 0), 1, 0, false)
        );
        falasCena1Facil.add(new Dialogo(5, "Agora chegamos à terceira pergunta, direcionada para Márcia, nossa brilhante campeã de olimpíadas de Física, conhecida por ser tímida, direta e pouco acostumada a situações sociais.\n\nDurante o encontro, vocês chegam a um restaurante bastante movimentado. Márcia parece desconfortável com a quantidade de pessoas e fica mais quieta do que o normal. O que você faz?", "Apresentador", marciaC7, false, opcoesMarciaFacil, 6));

        List<Opcoes> opcoesGabrielaFacil = List.of(
            new Opcoes(1, "Paro com ela para ajudar o cachorro, procurando uma forma segura de encontrar o dono ou encaminhá-lo para receber ajuda.", "Solidário", Map.of(gabrielaC7, 20), 1, 0, false),
            new Opcoes(2, "Digo que não temos nada a ver com aquilo e sugiro que simplesmente continuemos o encontro.", "Indiferente", Map.of(gabrielaC7, 0), 1, 0, false),
            new Opcoes(3, "Começo a fazer piadas sobre a situação e digo que ela está exagerando por se preocupar tanto com um animal desconhecido.", "Insensível", Map.of(gabrielaC7, -20), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(6, "Última pergunta, direto para o gabarito da Gabriela, nossa escritora descontraída, gentil e apaixonada por literatura e animais.\n\nDurante o encontro, vocês encontram um cachorro perdido na rua. Gabriela imediatamente demonstra preocupação e quer ajudar o animal. O que você faz?", "Apresentador", gabrielaC7, false, opcoesGabrielaFacil, 7));

        List<Opcoes> opcoesP5Facil = List.of(
            new Opcoes(1, "Sou totalmente sincera, assumo meus erros do passado de forma madura e mostro que mudei.", "Maduro", Map.of(angelaC7, 5, monicaC7, 5, marciaC7, 5, gabrielaC7, 5), 1, 0, false),
            new Opcoes(2, "Minto ou mudo de assunto dizendo que passado é passado, apenas para não me expor.", "Evasivo", Map.of(angelaC7, -5, monicaC7, -5, marciaC7, -5, gabrielaC7, -5), 1, 2, true),
            new Opcoes(3, "Falo muito mal da minha ex, jogando toda a culpa do término nas costas dela.", "Ressentido", Map.of(angelaC7, -5, monicaC7, -5, marciaC7, -5, gabrielaC7, -5), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(7, "FASE 2: O RAIO-X DELA (A HORA DO JULGAMENTO)\n\nApresentador: Agora o jogo vira completamente! Vamos para as duas perguntas sobre o comportamento e a personalidade da nossa protagonista.\n\nPergunta número cinco, sobre o seu passado amoroso. Você está no segundo encontro com uma garota e ela te pergunta detalhadamente por que o seu último relacionamento sério terminou. O que você faz?", "Apresentador", null, false, opcoesP5Facil, 8));

        List<Opcoes> opcoesP6Facil = List.of(
            new Opcoes(1, "Posto com orgulho, afinal se estou namorando não tenho absolutamente nada a esconder do mundo.", "Orgulhoso", Map.of(angelaC7, 20, monicaC7, 20, marciaC7, 20, gabrielaC7, 20), 1, 0, false),
            new Opcoes(2, "Recuso categoricamente, dizendo que prefiro manter minha vida amorosa cem por cento privada e longe da internet.", "Privativo", Map.of(angelaC7, -10, monicaC7, -10, marciaC7, -10, gabrielaC7, -10), 1, 2, true),
            new Opcoes(3, "Enrolo por semanas e acabo postando apenas nos Melhores Amigos dos stories para pouquíssimas pessoas verem.", "Discreto", Map.of(angelaC7, -10, monicaC7, -10, marciaC7, -10, gabrielaC7, -10), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(8, "Apresentador: Chegamos à sexta e última pergunta do jogo! Decisiva para o seu destino.\n\nVocê começa a namorar sério e o seu par te pede para postar uma foto de vocês dois juntos no feed para oficializar a relação. Qual é a sua atitude real?", "Apresentador", null, false, opcoesP6Facil, 9));
        
        falasCena1Facil.add(new Fala(9, "É isso, pessoal! Chegamos ao fim do nosso quadro. Esperamos vocês no nosso próximo programa para acompanharem o desfecho dessa aventura. Até mais!", "Apresentador", null, true, -1));

        Cena cena1Facil = new Cena(1, "gabarito_amor_facil", "trilha_decisao.mp3", falasCena1Facil, 2);
        cena1Facil.setIdPrimeiraFala(1);
        cena1Facil.setIdUltimaaFala(9);
        cenasCap7.add(cena1Facil);

        List<Fala> falasCena1Dificil = new ArrayList<>();
        falasCena1Dificil.add(new Fala(1, "Olá! Sejam bem-vindos a mais um episódio de reserva para dois. Hoje o nosso programa está mais que especial porque serão vocês, isso mesmo, vocês aí da plateia, que irão ditar o rumo da nossa participante. Apresento a vocês o nosso quadro Gabarito do amor! Roda a vinheta!", "Apresentador", null, true, 2));
        falasCena1Dificil.add(new Fala(2, "Nesse quadro a " + prota.getNome() + " irá abrir o seu coração e responder perguntas pessoais feitas pelos nossos telespectadores. Será que ela será capaz de passar na prova mais difícil da sua vida: o vestibular do amor?", "Apresentador", null, true, 3));

        List<Opcoes> opcoesAngelaDificil = List.of(
            new Opcoes(1, "Aceito o desafio na hora! Entro na brincadeira e aproveito para mostrar que também gosto de competir.", "Competitivo", Map.of(angelaC7, 20), 1, 0, false),
            new Opcoes(2, "Recuso imediatamente e digo que não tenho interesse nenhum em esportes ou atividades físicas.", "Sem interesse", Map.of(angelaC7, -20), 1, 2, true),
            new Opcoes(3, "Aceito o desafio, mas começo a me exibir e transformar a competição em uma disputa séria demais.", "Exibido", Map.of(angelaC7, -20), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(3, "FASE 1: O GABARITO DELAS (SINTONIA) - MODO DIFÍCIL\n\nPergunta número um, direto para o gabarito da Ângela, nossa atleta competitiva que ama esportes e a vida ao ar livre.\n\nÂngela te convida para passar o dia em uma trilha e, no meio do caminho, propõe um desafio: quem chegar primeiro ao topo da montanha. O que você faz?", "Apresentador", angelaC7, false, opcoesAngelaDificil, 4));

        List<Opcoes> opcoesMonicaDificil = List.of(
            new Opcoes(1, "Escolho um lugar especial e apresento a ela um prato brasileiro que acredito que combine com seus gostos, lembrando das coisas que ela já contou sobre si.", "Atencioso", Map.of(monicaC7, 20), 1, 0, false),
            new Opcoes(2, "Digo que tanto faz o restaurante e deixo que ela escolha tudo sozinha, sem me preocupar muito.", "Desinteressado", Map.of(monicaC7, -20), 1, 2, true),
            new Opcoes(3, "Escolho o restaurante mais barato possível e reclamo do preço sempre que ela demonstra interesse em experimentar alguma coisa.", "Mão de vaca", Map.of(monicaC7, -20), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(4, "Segunda pergunta desta fase, direcionada para Mônica, nossa estilista elegante, irônica e acostumada à vida agitada.\n\nDurante o encontro, Mônica comenta que ainda não conhece muito bem a culinária brasileira e demonstra curiosidade para experimentar algo diferente. Como você reage?", "Apresentador", monicaC7, false, opcoesMonicaDificil, 5));

        List<Opcoes> opcoesMarciaDificil = List.of(
            new Opcoes(1, "Percebo o desconforto e pergunto tranquilamente se ela prefere procurar um lugar mais reservado, sem pressioná-la a conversar.", "Compreensivo", Map.of(marciaC7, 20), 1, 0, false),
            new Opcoes(2, "Tento fazer com que ela se solte à força, fazendo várias perguntas e dizendo que ela precisa parar de ser tão tímida.", "Invasivo", Map.of(marciaC7, -20), 1, 2, true),
            new Opcoes(3, "Fico irritada com o silêncio e começo a reclamar que ela está tornando o encontro estranho e que deveria se esforçar mais para conversar.", "Impaciente", Map.of(marciaC7, -20), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(5, "Agora chegamos à terceira pergunta, direcionada para Márcia, nossa brilhante campeã de olimpíadas de Física, conhecida por ser tímida, direta e pouco acostumada a situações sociais.\n\nDurante o encontro, vocês chegam a um restaurante bastante movimentado. Márcia parece desconfortável com a quantidade de pessoas e fica mais quieta do que o normal. O que você faz?", "Apresentador", marciaC7, false, opcoesMarciaDificil, 6));

        List<Opcoes> opcoesGabrielaDificil = List.of(
            new Opcoes(1, "Paro com ela para ajudar o cachorro, procurando uma forma segura de encontrar o dono ou encaminhá-lo para receber ajuda.", "Solidário", Map.of(gabrielaC7, 20), 1, 0, false),
            new Opcoes(2, "Digo que não temos nada a ver com aquilo e sugiro que simplesmente continuemos o encontro.", "Indiferente", Map.of(gabrielaC7, -20), 1, 2, true),
            new Opcoes(3, "Começo a fazer piadas sobre a situação e digo que ela está exagerando por se preocupar tanto com um animal desconhecido.", "Insensível", Map.of(gabrielaC7, -20), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(6, "Última pergunta, direto para o gabarito da Gabriela, nossa escritora descontraída, gentil e apaixonada por literatura e animais.\n\nDurante o encontro, vocês encontram um cachorro perdido na rua. Gabriela imediatamente demonstra preocupação e quer ajudar o animal. O que você faz?", "Apresentador", gabrielaC7, false, opcoesGabrielaDificil, 7));

        List<Opcoes> opcoesP5Dificil = List.of(
            new Opcoes(1, "Sou totalmente sincera, assumo meus erros do passado de forma madura e mostro que mudei.", "Maduro", Map.of(angelaC7, 5, monicaC7, 5, marciaC7, 5, gabrielaC7, 5), 1, 0, false),
            new Opcoes(2, "Minto ou mudo de assunto dizendo que passado é passado, apenas para não me expor.", "Evasivo", Map.of(angelaC7, -15, monicaC7, -15, marciaC7, -15, gabrielaC7, -15), 1, 2, true),
            new Opcoes(3, "Falo muito mal da minha ex, jogando toda a culpa do término nas costas dela.", "Ressentido", Map.of(angelaC7, -15, monicaC7, -15, marciaC7, -15, gabrielaC7, -15), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(7, "FASE 2: O RAIO-X DELA (A HORA DO JULGAMENTO) - MODO DIFÍCIL\n\nApresentador: Pergunta número cinco, sobre o seu passado amoroso. Você está no segundo encontro com uma garota e ela te pergunta detalhadamente por que o seu último relacionamento sério terminou. O que você faz?", "Apresentador", null, false, opcoesP5Dificil, 8));

        List<Opcoes> opcoesP6Dificil = List.of(
            new Opcoes(1, "Posto com orgulho, afinal se estou namorando não tenho absolutamente nada a esconder do mundo.", "Orgulhoso", Map.of(angelaC7, 20, monicaC7, 20, marciaC7, 20, gabrielaC7, 20), 1, 0, false),
            new Opcoes(2, "Recuso categoricamente, dizendo que prefiro manter minha vida amorosa cem por cento privada e longe da internet.", "Privativo", Map.of(angelaC7, -15, monicaC7, -15, marciaC7, -15, gabrielaC7, -15), 1, 2, true),
            new Opcoes(3, "Enrolo por semanas e acabo postando apenas nos Melhores Amigos dos stories para pouquíssimas pessoas verem.", "Discreto", Map.of(angelaC7, -15, monicaC7, -15, marciaC7, -15, gabrielaC7, -15), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(8, "Apresentador: Chegamos à sexta e última pergunta do jogo! Decisiva para o seu destino no modo difícil.\n\nVocê começa a namorar sério e o seu par te pede para postar uma foto de vocês dois juntos no feed para oficializar a relação. Qual é a sua atitude real?", "Apresentador", null, false, opcoesP6Dificil, 9));
        
        falasCena1Dificil.add(new Fala(9, "É isso, pessoal! Chegamos ao fim do nosso quadro. Esperamos vocês no nosso próximo programa para acompanharem o desfecho dessa aventura. Até mais!", "Apresentador", null, true, -1));

        Cena cena1Dificil = new Cena(2, "gabarito_amor_dificil", "trilha_decisao.mp3", falasCena1Dificil, 2);
        cena1Dificil.setIdPrimeiraFala(1);
        cena1Dificil.setIdUltimaaFala(9);
        cenasCap7.add(cena1Dificil);

        List<Fala> falasCena2Angela = new ArrayList<>();
        falasCena2Angela.add(new Fala(1, "Ufa, o dia foi extremamente desgastante. Se as coisas continuarem dessa forma, posso acabar cometendo algum erro que leve o público a me odiar.", prota.getNome(), null, true, 2));
        falasCena2Angela.add(new Fala(2, "[Ângela pega um energético e senta ao seu lado]\n\nOi... Como você está? Esse programa tem sido uma maratona, não é?", "Ângela", null, true, 3));
        falasCena2Angela.add(new Fala(3, "Tem sido sim... E parece que quanto mais eu corro, mais longe fico da meta. Acho que não vou agradar o público... nem nenhuma de vocês. Acho que vou desistir.", prota.getNome(), null, true, 4));
        falasCena2Angela.add(new Fala(4, "Qual é? O que te faz pensar assim? Você já percorreu um longo caminho para chegar até aqui.", "Ângela", null, true, 5));
        falasCena2Angela.add(new Fala(5, "Não sei... Não tenho confiança. Estou me sentindo pressionada e acho que não vou ser capaz de ser uma boa candidata.", prota.getNome(), null, true, 6));
        falasCena2Angela.add(new Fala(6, "Eu imagino que não seja fácil. Eu me sentia de forma parecida no atletismo. O medo de falhar às vezes era maior que a vontade de continuar.", "Ângela", null, true, 7));
        falasCena2Angela.add(new Fala(7, "[Ela tira um pequeno pingente do pescoço.]\n\nMas não pense que você já está fora da pista só porque está sem fôlego.", "Ângela", null, true, 8));
        falasCena2Angela.add(new Fala(8, "[Ela entrega o pingente a ela.]\n\nToma. Ele era o meu amuleto da sorte nas competições difíceis. Talvez possa servir para você também.", "Ângela", null, true, -1));

        Cena cena2Angela = new Cena(3, "cafe_angela", "trilha_emocionante.mp3", falasCena2Angela);
        cena2Angela.setIdPrimeiraFala(1);
        cena2Angela.setIdUltimaaFala(8);
        cenasCap7.add(cena2Angela);

        Capitulo capitulo7 = new Capitulo(7, "O Gabarito do Amor", 1, 3, cenasCap7);
        bancoDeCapitulos.put(7, capitulo7);
    }

    private void carregarCapitulo8() {
        List<Cena> cenasCap8 = new ArrayList<>();

        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Olá, telespectadores! Sejam bem-vindos ao Plantão Reserva para dois, o seu canal de notícias do reality de romance mais famoso dos últimos tempos.", "Apresentador", null, true, 2));
        falasCena1.add(new Fala(2, "No noticiário de hoje, temos novidades sobre nossos participantes, atualizações de suas carreiras e, claro, uma informação exclusiva que promete movimentar os bastidores do programa.", "Apresentador", null, true, 3));
        falasCena1.add(new Fala(3, "Para começar, vamos revelar o paradeiro das nossas garotas.", "Apresentador", null, true, 4));
        falasCena1.add(new Fala(4, "Ângela acaba de assumir o cargo de técnica da equipe juvenil de natação. Apesar de ainda não conhecermos os novos competidores, uma coisa é certa: ela pretende treiná-los para chegar ao topo.", "Apresentador", null, true, 5));
        falasCena1.add(new Fala(5, "A participante Gabriela estará presente na Feira Literária Municipal. Ela estará em uma roda literária lendo clássicos do Jorge Amado. Entre as obras selecionadas estará o livro “Gabriela” que inspirou seu nome.", "Apresentador", null, true, 6));
        falasCena1.add(new Fala(6, "Mônica estará na Semana de Moda lançando uma prévia da sua coleção chamada “brasilidades” que promete revolucionar a moda mundial.", "Apresentador", null, true, 7));
        falasCena1.add(new Fala(7, "E Marcia estará na abertura do evento +Física, onde apresentará seu artigo sobre o futuro da física quântica.", "Apresentador", null, true, -1));

        Cena cena1 = new Cena(1, "plantao_noticias", "trilha_noticiario.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(7);
        cenasCap8.add(cena1);

        List<Fala> falasCena2Angela = new ArrayList<>();
        falasCena2Angela.add(new Fala(1, "Além dessas notícias, recebemos um furo impactante. A participante Ângela surgiu no programa matinal aroma do café trazendo alegações polêmicas envolvendo o nosso protagonista! Sobre o " + prota.getNome() + " ela disse:\n\n\"Ele dizia que gostava de competição, mas quando percebeu que não conseguia acompanhar meu ritmo, começou a agir como se competir comigo fosse uma coisa ruim.\"", "Apresentador", null, true, 2));
        falasCena2Angela.add(new Fala(2, "Com essa notícia terminamos o nosso plantão. Não deixe de nos seguir nas redes sociais para mais. Até breve!", "Apresentador", null, true, 3));
        falasCena2Angela.add(new Fala(3, "O jogador pega o celular para responder aos comentários dos telespectadores e tentar contornar a situação nas redes sociais.", "Sistema", null, true, -1));

        Cena cena2Angela = new Cena(2, "plantao_fofoca", "trilha_tenso.mp3", falasCena2Angela, 6);
        cena2Angela.setIdPrimeiraFala(1);
        cena2Angela.setIdUltimaaFala(3);
        cenasCap8.add(cena2Angela);

        List<Fala> falasCena2Monica = new ArrayList<>();
        falasCena2Monica.add(new Fala(1, "Além dessas notícias, recebemos um furo impactante. A participante Mônica surgiu no programa matinal aroma do café trazendo alegações polêmicas envolvendo o nosso protagonista! Sobre o " + prota.getNome() + " ela disse:\n\n\"Ele parecia interessado em mim durante o programa, mas depois percebi que tudo parecia muito calculado. Ele só demonstrava interesse quando sabia que aquilo poderia aumentar a pontuação dele.\"", "Apresentador", null, true, 2));
        falasCena2Monica.add(new Fala(2, "Com essa notícia terminamos o nosso plantão. Não deixe de nos seguir nas redes sociais para mais. Até breve!", "Apresentador", null, true, 3));
        falasCena2Monica.add(new Fala(3, "O jogador pega o celular para responder aos comentários dos telespectadores e tentar contornar a situação nas redes sociais.", "Sistema", null, true, -1));

        Cena cena2Monica = new Cena(3, "plantao_fofoca", "trilha_tenso.mp3", falasCena2Monica, 6);
        cena2Monica.setIdPrimeiraFala(1);
        cena2Monica.setIdUltimaaFala(3);
        cenasCap8.add(cena2Monica);

        List<Fala> falasCena2Gabriela = new ArrayList<>();
        falasCena2Gabriela.add(new Fala(1, "Além dessas notícias, recebemos um furo impactante. A participante Gabriela surgiu no programa matinal aroma do café trazendo alegações polêmicas envolvendo o nosso protagonista! Sobre o " + prota.getNome() + " ela disse:\n\n\"Ele sabia exatamente o que deveria falar para parecer uma pessoa gentil e sensível. Depois de um tempo, comecei a me perguntar se ele realmente pensava aquilo ou se só estava dizendo o que eu queria ouvir.\"", "Apresentador", null, true, 2));
        falasCena2Gabriela.add(new Fala(2, "Com essa notícia terminamos o nosso plantão. Não deixe de nos seguir nas redes sociais para mais. Até breve!", "Apresentador", null, true, 3));
        falasCena2Gabriela.add(new Fala(3, "O jogador pega o celular para responder aos comentários dos telespectadores e tentar contornar a situação nas redes sociais.", "Sistema", null, true, -1));

        Cena cena2Gabriela = new Cena(4, "plantao_fofoca", "trilha_tenso.mp3", falasCena2Gabriela, 6);
        cena2Gabriela.setIdPrimeiraFala(1);
        cena2Gabriela.setIdUltimaaFala(3);
        cenasCap8.add(cena2Gabriela);

        List<Fala> falasCena2Marcia = new ArrayList<>();
        falasCena2Marcia.add(new Fala(1, "Além dessas notícias, recebemos um furo impactante. A participante Márcia surgiu no programa matinal aroma do café trazendo alegações polêmicas envolvendo o nosso protagonista! Sobre o " + prota.getNome() + " ela disse:\n\n\"Ele dizia respeitar meu espaço, mas eu sentia que estava sempre esperando alguma coisa de mim. Às vezes, parecia que meu silêncio incomodava.\"", "Apresentador", null, true, 2));
        falasCena2Marcia.add(new Fala(2, "Com essa notícia terminamos o nosso plantão. Não deixe de nos seguir nas redes sociais para mais. Até breve!", "Apresentador", null, true, 3));
        falasCena2Marcia.add(new Fala(3, "O jogador pega o celular para responder aos comentários dos telespectadores e tentar contornar a situação nas redes sociais.", "Sistema", null, true, -1));

        Cena cena2Marcia = new Cena(5, "plantao_fofoca", "trilha_tenso.mp3", falasCena2Marcia, 6);
        cena2Marcia.setIdPrimeiraFala(1);
        cena2Marcia.setIdUltimaaFala(3);
        cenasCap8.add(cena2Marcia);

        List<Fala> falasCena3 = new ArrayList<>();
        falasCena3.add(new Fala(1, "Depois do plantão não paro de receber notificações… se eu não souber administrar estou perdido.", prota.getNome(), null, true, 2));
        falasCena3.add(new Fala(2, "No celular:\n\n- Exibir notificações...", "Sistema", null, true, 3));
        falasCena3.add(new Fala(3, "Parece que todo mundo tem alguma coisa para dizer. Melhor pensar bem antes de responder…", prota.getNome(), null, true, 4));

        List<Opcoes> opcoesP1 = List.of(
            new Opcoes(1, "\"Ela está claramente tentando me prejudicar porque não aceitou ser eliminada. Não vou levar a sério alguém assim.\"", "Defensivo", Map.of(), 1, -4, false),
            new Opcoes(2, "\"Entendo que ela tenha se sentido assim. Posso explicar o meu lado, mas não quero transformar isso em uma briga.\"", "Diplomático", Map.of(), 1, 2, false),
            new Opcoes(3, "\"Não acho que eu prive ficar me justificando. Quem assistiu ao programa pode tirar suas próprias conclusões.\"", "Neutro", Map.of(), 1, 0, false),
            new Opcoes(4, "\"Se ela não gostou de mim, o problema é dela. Não vou perder meu tempo tentando agradar ninguém.\"", "Arrogante", Map.of(), 1, -2, false)
        );
        falasCena3.add(new Dialogo(4, "COMENTÁRIO DO PÚBLICO:\n\n\"Depois de ouvir o que ela falou, você não acha que deveria se explicar melhor? Afinal, a imagem que ela passou de você não foi muito boa.\"", "Público", null, false, opcoesP1, 5));

        List<Opcoes> opcoesP2 = List.of(
            new Opcoes(1, "\"Eu prefiro não responder. Algumas coisas que aconteceram entre nós devem permanecer entre nós.\"", "Reservado", Map.of(), 1, 0, false),
            new Opcoes(2, "\"Se eu estivesse fingindo, provavelmente teria escolhido alguém muito mais fácil de conquistar.\"", "Irônico", Map.of(), 1, -2, false),
            new Opcoes(3, "\"Ela está falando isso porque não conseguiu ganhar. É muito conveniente me chamar de falso depois que saiu.\"", "Agressivo", Map.of(), 1, -4, false),
            new Opcoes(4, "\"Eu estava aqui para conhecer alguém, então é claro que pensei no jogo. Mas isso não significa que meus sentimentos fossem falsos.\"", "Sincero", Map.of(), 1, 2, false)
        );
        falasCena3.add(new Dialogo(5, "COMENTÁRIO DO PÚBLICO:\n\n\"Ela disse que você só estava fingindo interesse para continuar no programa. Você realmente gostava dela ou estava apenas jogando?\"", "Público", null, false, opcoesP2, 6));

        Secundario monicaC8 = new Secundario("Mônica", 2, 30, 10);
        List<Opcoes> opcoesP3 = List.of(
            new Opcoes(1, "“Eu não sei se me adaptaria completamente, mas acho que poderia aprender a acompanhar o ritmo dela.”", "Esforçado", Map.of(monicaC8, 2), 1, 0, false),
            new Opcoes(2, "“Eu adoraria conhecer esse lado da vida dela e descobrir novos lugares e experiências ao lado dela.”", "Entusiasmado", Map.of(monicaC8, 4), 1, 0, false),
            new Opcoes(3, "“Acho que cada um pode continuar vivendo do seu jeito, mesmo estando em um relacionamento.”", "Independente", Map.of(monicaC8, 0), 1, 0, false),
            new Opcoes(4, "“Ela parece viver ocupada demais. Talvez precisasse desacelerar antes de pensar em um relacionamento.”", "Crítico", Map.of(monicaC8, -2), 1, 0, false)
        );
        falasCena3.add(new Dialogo(6, "“Mônica já viajou pelo mundo e tem uma rotina bastante agitada. Você acha que conseguiria se adaptar ao estilo de vida dela?”", "Público", null, false, opcoesP3, 7));

        Secundario angelaC8 = new Secundario("Ângela", 1, 30, 6);
        List<Opcoes> opcoesP4 = List.of(
            new Opcoes(1, "“Talvez eu não acompanhe sempre, mas gosto de pessoas que me desafiam a sair da zona de conforto.”", "Desafiador", Map.of(angelaC8, 4), 1, 0, false),
            new Opcoes(2, "“Eu tentaria acompanhar. Acho que seria divertido viver essas experiências com ela.”", "Diverte-se", Map.of(angelaC8, 2), 1, 0, false),
            new Opcoes(3, "“Não sei se conseguiria acompanhar, mas também não vejo isso como um problema.”", "Neutro", Map.of(angelaC8, 0), 1, 0, false),
            new Opcoes(4, "“Sinceramente, acho que ela deveria aprender a diminuir um pouco esse espírito competitivo.”", "Desanimado", Map.of(angelaC8, -2), 1, 0, false)
        );
        falasCena3.add(new Dialogo(7, "“Ângela é conhecida pelo espírito competitivo. Você acha que conseguiria acompanhar o ritmo dela?”", "Público", null, false, opcoesP4, 8));

        Secundario marciaC8 = new Secundario("Márcia", 3, 30, 8);
        List<Opcoes> opcoesP5 = List.of(
            new Opcoes(1, "“Eu tentaria ajudá-la a se soltar, mesmo que precisasse insistir um pouco.”", "Insistente", Map.of(marciaC8, -2), 1, 0, false),
            new Opcoes(2, "“Eu respeitaria o jeito dela e deixaria que ela se sentisse confortável para se abrir no próprio ritmo.”", "Respeitoso", Map.of(marciaC8, 4), 1, 0, false),
            new Opcoes(3, "“Acho que eu precisaria de um tempo para entender melhor como ela gosta de interagir.”", "Cauteloso", Map.of(marciaC8, 2), 1, 0, false),
            new Opcoes(4, "“I don't mind.”", "Indiferente", Map.of(marciaC8, 0), 1, 0, false)
        );
        falasCena3.add(new Dialogo(8, "“Márcia é uma pessoa mais reservada e não parece se sentir muito confortável em situações sociais. Como você lidaria com isso?”", "Público", null, false, opcoesP5, 9));

        Secundario gabrielaC8 = new Secundario("Gabriela", 4, 30, 4);
        List<Opcoes> opcoesP6 = List.of(
            new Opcoes(1, "“Acho que sim. Gosto de pessoas que conseguem transformar coisas simples em momentos especiais.”", "Romântico", Map.of(gabrielaC8, 4), 1, 0, false),
            new Opcoes(2, "“Eu tentaria conhecer melhor esse lado dela. Acho que temos muito a descobrir um sobre o outro.”", "Curioso", Map.of(gabrielaC8, 2), 1, 0, false),
            new Opcoes(3, "“Não sei se temos exatamente o mesmo jeito, mas acredito que diferenças também podem funcionar.”", "Pragmático", Map.of(gabrielaC8, 0), 1, 0, false),
            new Opcoes(4, "“Acho que ela leva algumas coisas simples a sério demais. Eu provavelmente não teria muita paciência para isso.”", "Impaciente", Map.of(gabrielaC8, -2), 1, 0, false)
        );
        falasCena3.add(new Dialogo(9, "“Gabriela é conhecida por ser uma pessoa descontraída, apaixonada por literatura e por animais. Você acha que conseguiria acompanhar esse jeito tão leve e, ao mesmo tempo, profundo de enxergar a vida?”", "Público", null, false, opcoesP6, 10));

        falasCena3.add(new Fala(10, "Espero que essas respostas não piorem as coisas… é melhor eu ir dormir e me preparar para a final do programa.", prota.getNome(), null, true, -1));

        Cena cena3 = new Cena(6, "quarto_protagonista", "trilha_calma.mp3", falasCena3);
        cena3.setIdPrimeiraFala(1);
        cena3.setIdUltimaaFala(10);
        cenasCap8.add(cena3);

        Capitulo capitulo8 = new Capitulo(8, "Plantão Reserva para Dois", 1, 6, cenasCap8);
        bancoDeCapitulos.put(8, capitulo8);
    }

    private void carregarCapitulo9() {
        List<Cena> cenasCap9 = new ArrayList<>();

        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Olá, fãs de Reserva para Dois! Finalmente chegamos ao momento mais esperado: a grande final!\n\nHoje, nossas competidoras irão dar suas considerações finais sobre o nosso protagonista.", "Apresentador", null, true, 2));
        falasCena1.add(new Fala(2, "Mas atenção: neste momento, cada participante terá a liberdade de decidir se deseja continuar nessa história ou apertar o botão de desistência.\n\nEnfim, vamos começar as considerações das nossas meninas!", "Apresentador", null, true, 3));

        falasCena1.add(new Fala(3, "“Participar do Reserva para Dois foi uma experiência diferente de tudo que eu já vivi. Tive momentos divertidos, conheci pessoas incríveis e saio daqui levando várias experiências comigo. Mas acho que algumas coisas poderiam ter sido melhores durante a minha trajetória.”", "Ângela", null, true, 4));
        falasCena1.add(new Fala(4, "“Participar do Reserva para Dois foi uma experiência muito diferente do que eu imaginava. No começo, eu encarava tudo quase como uma competição, mas, com o tempo, percebi que estava vivendo algo que ia muito além disso. Acho que essa foi uma das experiências mais marcantes que já tive.”", "Ângela", null, true, 5));

        falasCena1.add(new Fala(5, "“Confesso que entrar em um reality como esse foi uma experiência curiosa. Conheci pessoas diferentes, vivi situações que provavelmente não teria vivido fora daqui e até tive algumas surpresas pelo caminho. No fim, acho que minha trajetória poderia ter sido um pouco mais interessante.”", "Mônica", null, true, 6));
        falasCena1.add(new Fala(6, "“Eu não sabia exatamente o que esperar quando entrei no programa. Entre encontros, desafios e algumas situações inesperadas, acabei encontrando muito mais inspiração do que imaginava. Acho que vou levar boas lembranças dessa experiência, tanto pessoal quanto profissionalmente.”", "Mônica", null, true, 7));

        falasCena1.add(new Fala(7, "“Quando entrei aqui, achei que seria difícil lidar com tantas pessoas e com toda essa exposição. Acho que minhas expectativas não estavam completamente erradas. Foi uma experiência complicada em alguns momentos e não sei se faria tudo novamente.”", "Márcia", null, true, 8));
        falasCena1.add(new Fala(8, "“Quando entrei no programa, eu tinha certeza de que seria uma perda de tempo. Mas, analisando tudo agora, percebo que estava errada. Acabei enfrentando situações que normalmente evitaria e descobri que talvez consiga me adaptar melhor do que imaginava.”", "Márcia", null, true, 9));

        falasCena1.add(new Fala(9, "“Acho que essa experiência teve capítulos bons e outros que eu preferiria reescrever. Conheci pessoas interessantes e vivi situações que provavelmente vão render algumas histórias no futuro. Mas nem toda história precisa ter o final que imaginamos.”", "Gabriela", null, true, 10));
        falasCena1.add(new Fala(10, "“Se eu tivesse que transformar essa experiência em um livro, provavelmente seria daqueles que a gente não consegue largar até chegar ao último capítulo. Foram muitos acontecimentos, algumas surpresas e, principalmente, histórias que vou guardar comigo depois que tudo isso terminar.”", "Gabriela", null, true, 11));

        falasCena1.add(new Fala(11, "Essas foram as considerações finais das nossas meninas.\n\nAgora, chegou a hora de vocês tomarem a decisão final!\n\nDepois dos comerciais, vamos descobrir quem continuará ao lado de " + prota.getNome() + " e quem decidiu deixar essa história para trás. Não saiam daí! Até logo!", "Apresentador", null, true, -1));

        Cena cena1 = new Cena(1, "palco_final", "trilha_final.mp3", falasCena1);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(11);
        cenasCap9.add(cena1);

        Capitulo capitulo9 = new Capitulo(9, "A Grande Final", 1, 1, cenasCap9);
        bancoDeCapitulos.put(9, capitulo9);
    }

    private void carregarCapitulo10() {
        List<Cena> cenasCap10 = new ArrayList<>();

        List<Fala> falasCenaA = new ArrayList<>();
        falasCenaA.add(new Fala(1, "Olá, telespectadores! O programa reserva para dois finalmente chegou a sua grande final! Isso mesmo, hoje as nossas competidoras irão escolher se querem ou não embarcar nesse romance.", "Apresentador", null, true, 2));
        falasCenaA.add(new Fala(2, "Para isso, elas irão optar entre apertar o botão da desistência ou se envolver com o nosso protagonista " + prota.getNome(), "Apresentador", null, true, 3));
        falasCenaA.add(new Fala(3, "Me diga aí, como estão suas expectativas para esse grande momento?", "Apresentador", null, true, 4));

        List<Opcoes> opcoesExpectativaA = List.of(
            new Opcoes(1, "“Eu estou empolgado. Acredito que causei uma boa impressão”", "Empolgado", Map.of(), 1, 0, false),
            new Opcoes(2, "“Eu estou apreensivo, sinto que eu poderia ter tido uma melhor participação”.", "Apreensivo", Map.of(), 1, 0, false)
        );
        falasCenaA.add(new Dialogo(4, "Escolha sua expectativa:", "Sistema", null, false, opcoesExpectativaA, 5));

        falasCenaA.add(new Fala(5, "Ok, vamos ver agora o que as garotas acham disso.\n\nApós a contagem regressiva, apertem ou não o botão. 1, 2, 3 e…..já\n\n*Angela aperta o botão*", "Apresentador", null, true, 6));
        falasCenaA.add(new Fala(6, "Vejam só! Parece que o " + prota.getNome() + " deu match com a participante Ângela…\n\nFale, querida, o que motivou a sua escolha?", "Apresentador", null, true, 7));
        falasCenaA.add(new Fala(7, "“Você conseguiu acompanhar meu ritmo de um jeito que eu não esperava. Tive momentos que vou levar comigo, e percebi que gosto de ter você por perto. Ainda quero viver muita coisa ao seu lado e descobrir até onde essa história pode chegar.”", "Ângela", null, true, 8));
        falasCenaA.add(new Fala(8, "Maravilha! E você, " + prota.getNome() + " o que acha?", "Apresentador", null, true, 9));

        List<Opcoes> opcoesRespostaA = List.of(
            new Opcoes(1, "“Era exatamente o que eu esperava. A nossa conexão ao longo do programa estava evidente e sinto que os encontros serão promissores”", "Confiante", Map.of(), 1, 0, false),
            new Opcoes(2, "“Não era o que eu esperava, mas acredito que poderemos formar uma ótima dupla”", "Pragmático", Map.of(), 1, 0, false)
        );
        falasCenaA.add(new Dialogo(9, "Escolha sua resposta:", "Sistema", null, false, opcoesRespostaA, 10));

        falasCenaA.add(new Fala(10, "Que ótimo! Muito obrigada pela participação! Vocês acabaram de ganhar uma reserva de luxo para o restaurante O Sabor do Amor na Itália! Isso mesmo! Espero que aproveitem a viagem para construir uma boa relação e passear bastante!\n\nEnfim, agradeço ao público pela atenção… não deixem de nos acompanhar nas próximas edições! Até mais!", "Apresentador", null, true, -1));

        Cena cenaA = new Cena(1, "final_angela", "trilha_vitoria.mp3", falasCenaA);
        cenaA.setIdPrimeiraFala(1);
        cenaA.setIdUltimaaFala(10);
        cenasCap10.add(cenaA);

        List<Fala> falasCenaB = new ArrayList<>();
        falasCenaB.add(new Fala(1, "Olá, telespectadores! O programa reserva para dois finalmente chegou a sua grande final! Isso mesmo, hoje as nossas competidoras irão escolher se querem ou não embarcar nesse romance.", "Apresentador", null, true, 2));
        falasCenaB.add(new Fala(2, "Para isso, elas irão optar entre apertar o botão da desistência ou se envolver com o nosso protagonista " + prota.getNome(), "Apresentador", null, true, 3));
        falasCenaB.add(new Fala(3, "Me diga aí, como estão suas expectativas para esse grande momento?", "Apresentador", null, true, 4));

        List<Opcoes> opcoesExpectativaB = List.of(
            new Opcoes(1, "“Eu estou empolgado. Acredito que causei uma boa impressão”", "Empolgado", Map.of(), 1, 0, false),
            new Opcoes(2, "“Eu estou apreensivo, sinto que eu poderia ter tido uma melhor participação”.", "Apreensivo", Map.of(), 1, 0, false)
        );
        falasCenaB.add(new Dialogo(4, "Escolha sua expectativa:", "Sistema", null, false, opcoesExpectativaB, 5));

        falasCenaB.add(new Fala(5, "Ok, vamos ver agora o que as garotas acham disso.\n\nApós a contagem regressiva, apertem ou não o botão. 1, 2, 3 e…..já\n\n*Marcia aperta o botão*", "Apresentador", null, true, 6));
        falasCenaB.add(new Fala(6, "Vejam só! Parece que o " + prota.getNome() + " deu match com a participante Marcia…\n\nFale, querida, o que motivou a sua escolha?", "Apresentador", null, true, 7));
        falasCenaB.add(new Fala(7, "“Eu não sou muito boa em falar sobre o que sinto. Mas, com você, percebi que consigo me sentir confortável sendo eu mesma. Gosto da sua companhia e quero continuar descobrindo o que existe entre nós.\n\nVocê conseguiu acompanhar meu ritmo de um jeito que eu não esperava. Tive momentos que vou levar comigo, e percebi que gosto de ter você por perto. Ainda quero viver muita coisa ao seu lado e descobrir até onde essa história pode chegar.”", "Márcia", null, true, 8));
        falasCenaB.add(new Fala(8, "Maravilha! E você, " + prota.getNome() + " o que acha?", "Apresentador", null, true, 9));

        List<Opcoes> opcoesRespostaB = List.of(
            new Opcoes(1, "“Era exatamente o que eu esperava. A nossa conexão ao longo do programa estava evidente e sinto que os encontros serão promissores”", "Confiante", Map.of(), 1, 0, false),
            new Opcoes(2, "“Não era o que eu esperava, mas acredito que poderemos formar uma ótima dupla”", "Pragmático", Map.of(), 1, 0, false)
        );
        falasCenaB.add(new Dialogo(9, "Escolha sua resposta:", "Sistema", null, false, opcoesRespostaB, 10));

        falasCenaB.add(new Fala(10, "Que ótimo! Muito obrigada pela participação! Vocês acabaram de ganhar uma reserva de luxo para o restaurante O Sabor do Amor na Itália! Isso mesmo! Espero que aproveitem a viagem para construir uma boa relação e passear bastante!\n\nEnfim, agradeço ao público pela atenção… não deixem de nos acompanhar nas próximas edições! Até mais!", "Apresentador", null, true, -1));

        Cena cenaB = new Cena(2, "final_marcia", "trilha_vitoria.mp3", falasCenaB);
        cenaB.setIdPrimeiraFala(1);
        cenaB.setIdUltimaaFala(10);
        cenasCap10.add(cenaB);

        List<Fala> falasCenaC = new ArrayList<>();
        falasCenaC.add(new Fala(1, "Olá, telespectadores! O programa reserva para dois finalmente chegou a sua grande final! Isso mesmo, hoje as nossas competidoras irão escolher se querem ou não embarcar nesse romance.", "Apresentador", null, true, 2));
        falasCenaC.add(new Fala(2, "Para isso, elas irão optar entre apertar o botão da desistência ou se envolver com o nosso protagonista " + prota.getNome(), "Apresentador", null, true, 3));
        falasCenaC.add(new Fala(3, "Me diga aí, como estão suas expectativas para esse grande momento?", "Apresentador", null, true, 4));

        List<Opcoes> opcoesExpectativaC = List.of(
            new Opcoes(1, "“Eu estou empolgado. Acredito que causei uma boa impressão”", "Empolgado", Map.of(), 1, 0, false),
            new Opcoes(2, "“Eu estou apreensivo, sinto que eu poderia ter tido uma melhor participação”.", "Apreensivo", Map.of(), 1, 0, false)
        );
        falasCenaC.add(new Dialogo(4, "Escolha sua expectativa:", "Sistema", null, false, opcoesExpectativaC, 5));

        falasCenaC.add(new Fala(5, "Ok, vamos ver agora o que as garotas acham disso.\n\nApós a contagem regressiva, apertem ou não o botão. 1, 2, 3 e…..já\n\n*Gabriela aperta o botão*", "Apresentador", null, true, 6));
        falasCenaC.add(new Fala(6, "Vejam só! Parece que o " + prota.getNome() + " deu match com a participante Gabriela…\n\nFale, querida, o que motivou a sua escolha?", "Apresentador", null, true, 7));
        falasCenaC.add(new Fala(7, "“Eu acho que algumas pessoas aparecem na nossa vida e acabam deixando uma história que a gente não quer terminar. Você se tornou alguém importante para mim, e eu gosto do que construímos juntos. Quero descobrir quais serão os próximos capítulos dessa história.”", "Gabriela", null, true, 8));
        falasCenaC.add(new Fala(8, "Maravilha! E você, " + prota.getNome() + " o que acha?", "Apresentador", null, true, 9));

        List<Opcoes> opcoesRespostaC = List.of(
            new Opcoes(1, "“Era exatamente o que eu esperava. A nossa conexão ao longo do programa estava evidente e sinto que os encontros serão promissores”", "Confiante", Map.of(), 1, 0, false),
            new Opcoes(2, "“Não era o que eu esperava, mas acredito que poderemos formar uma ótima dupla”", "Pragmático", Map.of(), 1, 0, false)
        );
        falasCenaC.add(new Dialogo(9, "Escolha sua resposta:", "Sistema", null, false, opcoesRespostaC, 10));

        falasCenaC.add(new Fala(10, "Que ótimo! Muito obrigada pela participação! Vocês acabaram de ganhar uma reserva de luxo para o restaurante O Sabor do Amor na Itália! Isso mesmo! Espero que aproveitem a viagem para construir uma boa relação e passear bastante!\n\nEnfim, agradeço ao público pela atenção… não deixem de nos acompanhar nas próximas edições! Até mais!", "Apresentador", null, true, -1));

        Cena cenaC = new Cena(3, "final_gabriela", "trilha_vitoria.mp3", falasCenaC);
        cenaC.setIdPrimeiraFala(1);
        cenaC.setIdUltimaaFala(10);
        cenasCap10.add(cenaC);

        List<Fala> falasCenaD = new ArrayList<>();
        falasCenaD.add(new Fala(1, "Olá, telespectadores! O programa reserva para dois finalmente chegou a sua grande final! Isso mesmo, hoje as nossas competidoras irão escolher se querem ou não embarcar nesse romance.", "Apresentador", null, true, 2));
        falasCenaD.add(new Fala(2, "Para isso, elas irão optar entre apertar o botão da desistência ou se envolver com o nosso protagonista " + prota.getNome(), "Apresentador", null, true, 3));
        falasCenaD.add(new Fala(3, "Me diga aí, como estão suas expectativas para esse grande momento?", "Apresentador", null, true, 4));

        List<Opcoes> opcoesExpectativaD = List.of(
            new Opcoes(1, "“Eu estou empolgado. Acredito que causei uma boa impressão”", "Empolgado", Map.of(), 1, 0, false),
            new Opcoes(2, "“Eu estou apreensivo, sinto que eu poderia ter tido uma melhor participação”.", "Apreensivo", Map.of(), 1, 0, false)
        );
        falasCenaD.add(new Dialogo(4, "Escolha sua expectativa:", "Sistema", null, false, opcoesExpectativaD, 5));

        falasCenaD.add(new Fala(5, "Ok, vamos ver agora o que as garotas acham disso.\n\nApós a contagem regressiva, apertem ou não o botão. 1, 2, 3 e…..já\n\n*Mônica aperta o botão*", "Apresentador", null, true, 6));
        falasCenaD.add(new Fala(6, "Vejam só! Parece que o " + prota.getNome() + " deu match com a participante Mônica…\n\nFale, querida, o que motivou a sua escolha?", "Apresentador", null, true, 7));
        falasCenaD.add(new Fala(7, "“Eu não costumo me abrir facilmente, e acho que você conseguiu chegar mais perto de mim do que eu imaginava. Gosto da nossa relação, das coisas que descobrimos juntos e, principalmente, de quem eu sou quando estou com você. Quero continuar vivendo isso.”", "Mônica", null, true, 8));
        falasCenaD.add(new Fala(8, "Maravilha! E você, " + prota.getNome() + " o que acha?", "Apresentador", null, true, 9));

        List<Opcoes> opcoesRespostaD = List.of(
            new Opcoes(1, "“Era exatamente o que eu esperava. A nossa conexão ao longo do programa estava evidente e sinto que os encontros serão promissores”", "Confiante", Map.of(), 1, 0, false),
            new Opcoes(2, "“Não era o que eu esperava, mas acredito que poderemos formar uma ótima dupla”", "Pragmático", Map.of(), 1, 0, false)
        );
        falasCenaD.add(new Dialogo(9, "Escolha sua resposta:", "Sistema", null, false, opcoesRespostaD, 10));

        falasCenaD.add(new Fala(10, "Que ótimo! Muito obrigada pela participação! Vocês acabaram de ganhar uma reserva de luxo para o restaurante O Sabor do Amor na Itália! Isso mesmo! Espero que aproveitem a viagem para construir uma boa relação e passear bastante!\n\nEnfim, agradeço ao público pela atenção… não deixem de nos acompanhar nas próximas edições! Até mais!", "Apresentador", null, true, -1));

        Cena cenaD = new Cena(4, "final_monica", "trilha_vitoria.mp3", falasCenaD);
        cenaD.setIdPrimeiraFala(1);
        cenaD.setIdUltimaaFala(10);
        cenasCap10.add(cenaD);

        List<Fala> falasCenaE = new ArrayList<>();
        falasCenaE.add(new Fala(1, "[PLANTÃO EXTRAORDINÁRIO]\n\nOlá, telespectadores.", "Apresentador", null, true, 2));
        falasCenaE.add(new Fala(2, "Interrompemos nossa programação para trazer uma notícia inesperada sobre o futuro de Reserva para Dois.", "Apresentador", null, true, 3));
        falasCenaE.add(new Fala(3, "Infelizmente, apesar de todos os esforços da produção, o programa não conseguiu alcançar a audiência esperada nesta temporada.", "Apresentador", null, true, 4));
        falasCenaE.add(new Fala(4, "Após uma queda significativa no interesse do público, a produção tomou uma decisão difícil:\n\nReserva para Dois está oficialmente cancelado antes da grande final.", "Apresentador", null, true, 5));
        falasCenaE.add(new Fala(5, "O desempenho e a postura de " + prota.getNome() + " ao longo do programa acabaram contribuindo para a perda de interesse dos telespectadores.", "Apresentador", null, true, 6));
        falasCenaE.add(new Fala(6, "Lamentamos o ocorrido e agradecemos a todos que acompanharam o programa durante esta temporada.", "Apresentador", null, true, 7));
        falasCenaE.add(new Fala(7, "Esperamos reencontrá-los em uma próxima edição, com novas histórias, novos participantes e, quem sabe, um protagonista capaz de conquistar o público.", "Apresentador", null, true, 8));
        falasCenaE.add(new Fala(8, "Eu agradeço a atenção de todos.\n\nAté a próxima!", "Apresentador", null, true, -1));

        Cena cenaE = new Cena(5, "plantao_cancelamento", "trilha_triste.mp3", falasCenaE);
        cenaE.setIdPrimeiraFala(1);
        cenaE.setIdUltimaaFala(8);
        cenasCap10.add(cenaE);

        List<Fala> falasCenaF = new ArrayList<>();
        falasCenaF.add(new Fala(1, "Olá, telespectadores! O programa reserva para dois finalmente chegou a sua grande final! Isso mesmo, hoje as nossas competidoras irão escolher se querem ou não embarcar nesse romance.", "Apresentador", null, true, 2));
        falasCenaF.add(new Fala(2, "Para isso, elas irão optar entre apertar o botão da desistência ou se envolver com o nosso protagonista " + prota.getNome(), "Apresentador", null, true, 3));
        falasCenaF.add(new Fala(3, "Me diga aí, como estão suas expectativas para esse grande momento?", "Apresentador", null, true, 4));

        List<Opcoes> opcoesExpectativaF = List.of(
            new Opcoes(1, "“Eu estou empolgado. Acredito que causei uma boa impressão”", "Empolgado", Map.of(), 1, 0, false),
            new Opcoes(2, "“Eu estou apreensivo, sinto que eu poderia ter tido uma melhor participação”.", "Apreensivo", Map.of(), 1, 0, false)
        );
        falasCenaF.add(new Dialogo(4, "Escolha sua expectativa:", "Sistema", null, false, opcoesExpectativaF, 5));

        falasCenaF.add(new Fala(5, "Ok, vamos ver agora o que as garotas acham disso.\n\nApós a contagem regressiva, apertem ou não o botão. 1, 2, 3 e…..já\n\n*Ninguém aperta o botão*", "Apresentador", null, true, 6));
        falasCenaF.add(new Fala(6, "Eita! Todas desistiram do nosso participante… me digam, o que aconteceu?", "Apresentador", null, true, 7));
        falasCenaF.add(new Fala(7, "Ângela: Ele não soube priorizar nenhuma de nós.", "Ângela", null, true, 8));
        falasCenaF.add(new Fala(8, "Gabriela: Isso mesmo… ele foi muito indeciso para um participante de um reality show tão disputado.", "Gabriela", null, true, 9));
        falasCenaF.add(new Fala(9, "Mônica: Faltou esforço. Ele deveria ter sido mais atencioso.", "Mônica", null, true, 10));
        falasCenaF.add(new Fala(10, "Márcia: Eu sabia que iria perder meu tempo aqui…", "Márcia", null, true, 11));
        falasCenaF.add(new Fala(11, "Eita… mas que situação…\nDessa forma a nossa equipe agradece " + prota.getNome() + " e deseja mais sorte para a próxima vez.\n\nÉ isso, terminamos por aqui o nosso programa. Obrigada por nos acompanhar até aqui e desculpe pelo desfecho um tanto desastroso.\n\nVejo vocês na próxima edição!", "Narrador", null, true, -1));

        Cena cenaF = new Cena(6, "final_ninguem", "trilha_triste.mp3", falasCenaF);
        cenaF.setIdPrimeiraFala(1);
        cenaF.setIdUltimaaFala(11);
        cenasCap10.add(cenaF);

        Capitulo capitulo10 = new Capitulo(10, "A Grande Decisão", 1, 6, cenasCap10);
        bancoDeCapitulos.put(10, capitulo10);
    }
}