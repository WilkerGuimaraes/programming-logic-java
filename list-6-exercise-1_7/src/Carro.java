public class Carro extends Veiculo {
    private double combustivel;

    public Carro() {
        super();
    }

    public Carro(String chassi, String tipo, double velocidadeMaxima, double combustivel) {
        super(chassi, tipo, velocidadeMaxima);
        this.combustivel = combustivel;
    }

    public void trocarOleo() {
        System.out.println("O veiculo " + getTipo() + " com chassi " + getChassi() + " trocou o óleo.");
    }
}
