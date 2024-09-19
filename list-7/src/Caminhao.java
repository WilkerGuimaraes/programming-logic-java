public class Caminhao {
    private String modelo;
    private String placa;
    private boolean cabineDupla;
    private Motor motor;
    private Pneu pneu;
    private Carroceria carroceria;
    private Marcha marcha;
    private Fabricante fabricante;

    public Caminhao(String modelo, String placa, boolean cabineDupla, Motor motor, Pneu pneu, Carroceria carroceria, Marcha marcha, Fabricante fabricante) {
        this.modelo = modelo;
        this.placa = placa;
        this.cabineDupla = cabineDupla;
        this.motor = motor;
        this.pneu = pneu;
        this.carroceria = carroceria;
        this.marcha = marcha;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isCabineDupla() {
        return cabineDupla;
    }
}
