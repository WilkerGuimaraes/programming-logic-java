public class PorHora extends Empregado {
    private double valorHora;
    private int numHora;

    public PorHora(String name, double valorHora, int numHora) {
        super(name);
        this.valorHora = valorHora;
        this.numHora = numHora;
    }

    @Override
    public void printPay() {
        System.out.println("Pagamento para " + this.getName() + " que é pago por hora trabalhando por um dia: R$" + this.getPay());
    }

    @Override
    public double getPay() {
        return this.numHora * this.valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumHora() {
        return numHora;
    }

    public void setNumHora(int numHora) {
        this.numHora = numHora;
    }
}
