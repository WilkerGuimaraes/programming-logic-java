public class Carro {
    private String modelo;
    private String placa;
    private Fabricante fabricante;
    private Motor motor;
    private Pneu pneu;

    public Carro(String modelo, String placa, Fabricante fabricante, Motor motor, Pneu pneu) {
        this.modelo = modelo;
        this.placa = placa;
        this.fabricante = fabricante;
        this.motor = motor;
        this.pneu = pneu;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
}
