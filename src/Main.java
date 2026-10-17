public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50, "Cara de Barro", "Dublado");
        MeiaEntrada meiaEntrada = new MeiaEntrada(ingresso);
        IngressoFamilia ingressoFamilia2 = new IngressoFamilia(ingresso, 2);
        IngressoFamilia ingressoFamilia3 = new IngressoFamilia(ingresso, 3);
        IngressoFamilia ingressoFamilia5 = new IngressoFamilia(ingresso,5);

        System.out.println("Nome do Filme: " + meiaEntrada.getNomeDoFilme());
        System.out.println("Valor do ingresso: " + meiaEntrada.getValor());
        System.out.println("Legendado ou Dublado: " + meiaEntrada.getLegendadoOuDublado());
        System.out.println("Ingresso: " + ingresso.valorReal());
        System.out.println("Meia entrada: " + meiaEntrada.valorReal());
        System.out.println("Ingresso família para" + ingressoFamilia2.getQtdPessoas() + "pessoas: " + ingressoFamilia2.valorReal());
        System.out.println("Ingresso família para" + ingressoFamilia3.getQtdPessoas() + "pessoas: " + ingressoFamilia3.valorReal());
        System.out.println("Ingresso família para" + ingressoFamilia5.getQtdPessoas() + "pessoas: " + ingressoFamilia5.valorReal());

    }
}
