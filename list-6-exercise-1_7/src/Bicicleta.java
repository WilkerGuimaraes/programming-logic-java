public class Bicicleta extends Veiculo {
    private int nrMarchas;

    public Bicicleta() {
        super();
    }

    public Bicicleta(String chassi, String tipo, double velocidadeMaxima, int nrMarchas) {
        super(chassi, tipo, velocidadeMaxima);
        this.nrMarchas = nrMarchas;
    }

    public void aumentarMarcha(int valor) {
        this.nrMarchas += valor;
        double incremento = ((double) nrMarchas / getVelocidadeMaxima()) * 100;
        super.incrementarVeloc((int) incremento);
    }
}
