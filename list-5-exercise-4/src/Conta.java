public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo > 0) {
            this.saldo -= valor;
        } else {
            System.out.println("O seu saldo está vazio.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
