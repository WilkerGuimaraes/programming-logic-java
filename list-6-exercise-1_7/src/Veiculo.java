public class Veiculo {
    private String chassi;
    private String tipo;
    private double velocidadeMaxima;
    private static int count;

    public Veiculo() {
    }

    public Veiculo(String chassi, String tipo, double velocidadeMaxima) {
        this.chassi = chassi;
        this.tipo = tipo;
        this.velocidadeMaxima = velocidadeMaxima;
        count++;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Veiculo.count = count;
    }

    public void limpar() {
        System.out.println("O veículo " + getTipo() + " com chassi " + getChassi() + " está sendo limpo.");
    }

    public void ajustar() {
        System.out.println("O veículo " + getTipo() + " com chassi " + getChassi() + " está sendo ajustado.");
    }

    public void incrementarVeloc(int valor) {
        this.velocidadeMaxima += valor;
        System.out.println("O veículo " + getTipo() + " com chassi " + getChassi() + " agora tem a " + getVelocidadeMaxima() + "km/h de velocidade.");
    }
}
