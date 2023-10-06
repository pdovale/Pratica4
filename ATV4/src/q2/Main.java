package q2;

public class Main {
    public static void main(String[] args) {
        Contacorrente cc = new Contacorrente();
        cc.depositar(1200.20);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500.50);
        cp.sacar(25);

        GeradorExtratos gerador = new GeradorExtratos();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }
}
