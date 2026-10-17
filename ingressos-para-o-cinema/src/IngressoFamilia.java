public final class IngressoFamilia extends Ingresso {
    private final int qtdPessoas;

    public IngressoFamilia(Ingresso ingresso, int qtdPessoas)
    {
        super(
                ingresso.getValor(),
                ingresso.getNomeDoFilme(),
                ingresso.getLegendadoOuDublado()
        );
        this.qtdPessoas = qtdPessoas;
    }
    public double getQtdPessoas() {
        return qtdPessoas;
    }

    @Override
    public double valorReal() {
        if (this.qtdPessoas > 3){
           return (this.getValor() * this.qtdPessoas) * 0.95;
        }
        else {
            return this.getValor() * qtdPessoas;
        }
    }

}
