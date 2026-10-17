public final class MeiaEntrada extends Ingresso {
    public MeiaEntrada(Ingresso ingresso)
    {
        super(
                ingresso.getValor(),
                ingresso.getNomeDoFilme(),
                ingresso.getLegendadoOuDublado()
        );
    }
    @Override
    public double valorReal() {
        return this.getValor() / 2;
    }

}
