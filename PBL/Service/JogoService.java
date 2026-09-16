public class JogoService {
    
    private Protagonista protagonista;
    private JogoService service;
    private JogoRepository repository;
    private Capitulo capitulo;

    public JogoService(JogoRepository repository, Capitulo capitulo, JogoService service, Protagonista protagonista) {
        this.repository = repository;
        this.capitulo=capitulo;
        this.service=service;
        this.protagonista=protagonista;
    }

    public iniciarpersonagem(Protagonista protagonista,JogoService service){
        Protagonista prota=new Protagonista();
        prota.setopcaoEscolhida(service.escolherOpcao());
        prota.setidRoupa(service.escolherRoupa());
        prota.setidElenco(service.escolherElenco());
        return prota;
    }


    public void iniciarNovoJogo() {
        this.protagonista = iniciarpersonagem();

        int idPrimeiroCapitulo = 1;
        Capitulo primeiroCap = repository.buscarPorId(idPrimeiroCapitulo);
        iniciarCapitulo(primeiroCap); 
    }

public void iniciarCapitulo(int idCapitulo) {

        Capitulo capitulo = repository.buscarPorId(idCapitulo);

        if (capitulo != null) {
            capitulo.setFinalizado(false);
            exibirInicioCapitulo(capitulo);
        }
        else{
            exibirMensagemErro("Iniciando capítulo: " + capitulo.getTitulo());
    }
        }


    public String obterCreditos() {
        return "\n--- Créditos ---\nDesenvolvido por:\n Camili Carneiro\n Yarlley Fernandes \n Ano: 2026\n";
    }

    public void processarImpacto(Secundario solteira, int pontosBase) {
    int valorFinal = pontosBase;

    if (pontosBase < 0) {
        valorFinal = pontosBase - (solteira.getExigencia() / 2);
    }

    solteira.incrementarAfinidade(valorFinal);
}

public void processarJogada(Dialogo dialogo, int escolhaDoJogador) {
    int pontosBase = dialogo.getPontuacaoDaEscolha(escolhaDoJogador);
    
    Secundario solteira = dialogo.getSolteiraAlvo();
    
    if (solteira != null) {
        int pontosFinais = pontosBase;
        if (pontosBase < 0) {
            pontosFinais = pontosBase - (solteira.getExigencia() / 2);
        }
        
        solteira.incrementarAfinidade(pontosFinais);
    }
}


}