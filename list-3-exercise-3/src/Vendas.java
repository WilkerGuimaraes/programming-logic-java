public class Vendas {
    public static double desconto = 0.3;

    public Vendas() {
    }

    public void obterTaxaDeDesconto(int valor) {
        if (valor == 1) {
            desconto = 0.1;
        }
    }

    public double calcularTaxaDeDesconto(double valorInicial) {
        return valorInicial * (1 - desconto);
    }
}
