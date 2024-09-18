public class VIP extends Ingresso {
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public double valorFinal() {
        return super.getValor() + this.adicional;
    }

    public void imprimirValor() {
        super.imprimirValor();
        System.out.println("Valor adicional: $" + this.adicional);
        System.out.println("Valor final: $" + valorFinal());
    }
}
