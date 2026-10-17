public class Program {
    public static void Main(String[] args)
    {
        ContaBancaria conta = new ContaBancaria("João", 1000);

        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.sacarDinheiro(1200);

        System.out.println("Usando cheque especial? " + conta.estaUsandoChequeEspecial());

        conta.depositarDinheiro(240);

        System.out.println("Usando cheque especial? " + conta.estaUsandoChequeEspecial());

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
