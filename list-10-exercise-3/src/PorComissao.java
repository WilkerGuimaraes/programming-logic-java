public class PorComissao extends Empregado implements Commission {
    private double sales;

    public PorComissao(String name, double sales) {
        super(name);
        this.sales = sales;
    }

    @Override
    public void setVendas(double sales) {
        this.sales = sales;
    }

    @Override
    public void printPay() {
        System.out.println("Pagamento para " + this.getName() + " por comissão: R$" + getPay());
    }

    @Override
    public double getPay() {
        return this.sales * COMMISION_RATE;
    }
}
