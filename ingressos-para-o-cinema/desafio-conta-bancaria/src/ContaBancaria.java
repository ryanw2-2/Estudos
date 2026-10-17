public class ContaBancaria {
    private String nome;
    private static int proximoNumero = 10000000;
    private int numeroDaConta;
    private double saldo;
    private double chequeEspecialOriginal;
    private double chequeEspecial;
    private double debitoPendenteChequeEspecial;

    public ContaBancaria(String nome, double saldo)
    {
        this.nome = nome;
        this.numeroDaConta = ++proximoNumero;
        this.saldo = saldo;
        if (saldo <= 500)
        {
            this.chequeEspecial = 50;
            this.chequeEspecialOriginal = 50;
        }
        else {
            this.chequeEspecial = saldo / 2;
            this.chequeEspecialOriginal = saldo / 2;

        }
    }
    public String getNome() {
        return this.nome;
    }

    public int getNumeroDaConta()
    {
        return this.numeroDaConta;
    }
    public double getSaldo()
    {
        return this.saldo;
    }
    public boolean estaUsandoChequeEspecial()
    {
        return debitoPendenteChequeEspecial > 0;
    }

    public void depositarDinheiro(double valor){
        if (this.debitoPendenteChequeEspecial != 0)
        {
            if (valor - this.debitoPendenteChequeEspecial >= 0)
            {
                this.saldo += valor - this.debitoPendenteChequeEspecial;
                this.debitoPendenteChequeEspecial = 0;
                this.chequeEspecial = chequeEspecialOriginal;
            }
            else
            {
                this.debitoPendenteChequeEspecial = this.debitoPendenteChequeEspecial - valor;
            }
        }
        else {
            this.saldo += valor;
        }
    }

    private void atualizarChequeEspecial(double valorUsado){
        this.debitoPendenteChequeEspecial += valorUsado * 1.2;
        this.chequeEspecial -= valorUsado;
    }
    private boolean verificarPossibilidadeSaquePagamento(double valor){
        double novoSaldo = saldo - valor;
        if (novoSaldo >= 0)
        {
            this.saldo = novoSaldo;
            return true;
        }
        else {
            double valorUsadoCheque = Math.abs(novoSaldo);
            if (chequeEspecial - valorUsadoCheque < 0)
            {
                return false;
            }
            else {
                novoSaldo = -novoSaldo;
                atualizarChequeEspecial(novoSaldo);
                this.saldo = 0;
                return true;
            }
        }
    }
    public boolean sacarDinheiro(double valor){
        return verificarPossibilidadeSaquePagamento(valor);
    }
    public boolean pagarBoleto(double valor) {
        return verificarPossibilidadeSaquePagamento(valor);
    }
}
