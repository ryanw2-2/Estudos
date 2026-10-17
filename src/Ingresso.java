public sealed class Ingresso permits MeiaEntrada, IngressoFamilia {
    private final double valor;
    private final String nomeDoFilme;
    private final String legendadoOuDublado;

    public Ingresso(double valor, String nomeDoFilme, String legendadoOuDublado)
    {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.legendadoOuDublado = legendadoOuDublado;
    }
    public double getValor() {
        return valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public String getLegendadoOuDublado() {
        return legendadoOuDublado;
    }

    public double valorReal()
    {
        return this.valor;
    }

}
