package q2;

public class Contacorrente implements Conta2 {
    private double saldo;
    private double taxaOperacao = 0.45;

    public void depositar(double valor) {
        this.saldo += valor - taxaOperacao;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void sacar (double valor) {
        this.saldo -= valor + taxaOperacao;
    }
}
