public class Pneu {
    private int diametro;
    private int medidas;
    private Fabricante fabricante;

    public Pneu(int diametro, int medidas, Fabricante fabricante) {
        this.diametro = diametro;
        this.medidas = medidas;
        this.fabricante = fabricante;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getMedidas() {
        return medidas;
    }
}
