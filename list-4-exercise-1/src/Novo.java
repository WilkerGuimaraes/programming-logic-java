public class Novo extends Imovel{
    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public double valorFinal() {
        return super.getPreco() + getAdicional();
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Valor adicional: $" + getAdicional());
        System.out.println("Valor final: $" + valorFinal());
    }
}
