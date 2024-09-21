public class PorHoraEComissao extends PorHora implements Commission {
    private double sales;

    public PorHoraEComissao(String name, double valorHora, int numHora, double sales) {
        super(name, valorHora, numHora);
        this.sales = sales;
    }

    @Override
    public void setVendas(double sales) {
        this.sales = sales;
    }

    @Override
    public void printPay() {
        System.out.println("Pagamento para " + this.getName() + " por hora e comissão: R$" + this.getPay());
    }

    @Override
    public double getPay() {
        return super.getPay() + this.sales * COMMISION_RATE;
    }
}
