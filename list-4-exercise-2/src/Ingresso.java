public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void imprimirValor() {
        System.out.println("Valor do ingresso: " + this.valor);
    }
}
