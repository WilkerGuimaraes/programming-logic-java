public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimirDados() {
        System.out.println("Endereço: " + this.endereco + " | Preço: $" + this.preco);
    }
}
