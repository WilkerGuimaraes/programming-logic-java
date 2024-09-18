public class Usado extends Imovel {
    private double desconto;

    public Usado(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double valorFinal() {
        return super.getPreco() + getDesconto();
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Valor do desconto: $" + getDesconto());
        System.out.println("Valor final: $" + valorFinal());
    }
}
