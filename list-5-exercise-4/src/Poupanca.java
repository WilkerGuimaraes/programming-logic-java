public class Poupanca extends Conta {
    private int diaRendimento;

    public Poupanca() {
        super();
        this.diaRendimento = 1;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        if (diaRendimento >= 1 && diaRendimento <= 31) {
            this.diaRendimento = diaRendimento;
        } else {
            System.out.println("Dia de rendimento inválido. Deve estar entre 1 e 31.");
        }
    }

    public void calcularRendimento() {
        double saldoAtual = getSaldo();
        double rendimento = saldoAtual * (this.diaRendimento * 0.01);
        depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado no período de " + this.diaRendimento + "dia(s).");
    }
}
