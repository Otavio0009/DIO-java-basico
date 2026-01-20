package POO.ExemploEnum;

public enum EstadosBrasileiros {
    // Praiba, Pernabuco, Bahaia, Piauí e Rio Grabde do NOrte.
    PARIBA ("PB", "Paraíba", 25),
    PERNABUCO ("PE", "Pernabuco", 26),
    BHAIA ("BH", "Bahia", 29),
    PIAUI ("PI", "Piauí", 22),
    RIO_GRANDE_DO_NORTE ("RN", "Rio grande do norte", 24),
    MARANHAO ("MA", "Maranhão", 21),
    ALAGOAS ("AL", "Alagoas", 27) ;

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
