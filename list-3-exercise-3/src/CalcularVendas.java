public class CalcularVendas {
    public static void main(String[] args) {
        Vendas venda = new Vendas();

        int valorInicial = 100;

        System.out.println("Resultado com desconto de 10%: " + venda.calcularTaxaDeDesconto(valorInicial));

        venda.obterTaxaDeDesconto(1);

        int valorInicial2 = 100;

        System.out.println("Resultado com desconto de 30%: " + venda.calcularTaxaDeDesconto(valorInicial2));
    }
}
