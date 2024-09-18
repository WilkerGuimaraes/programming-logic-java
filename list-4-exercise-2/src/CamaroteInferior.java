public class CamaroteInferior extends VIP {
    private String endereco;

    public CamaroteInferior(double valor, double adicional, String endereco) {
        super(valor, adicional);
        this.endereco = endereco;
    }

    public void imprimirEndereco() {
        System.out.println("Endereço do Camarote Inferior: " + this.endereco);
    }
}
