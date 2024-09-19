public class Motor {
    private int potencia;
    private String chassi;
    private int torque;

    public Motor(int potencia, String chassi, int torque) {
        this.potencia = potencia;
        this.chassi = chassi;
        this.torque = torque;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getChassi() {
        return chassi;
    }

    public int getTorque() {
        return torque;
    }
}
