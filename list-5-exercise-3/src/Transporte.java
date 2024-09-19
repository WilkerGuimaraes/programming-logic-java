public class Transporte {
    private boolean ligado;
    private int velocidade;

    public Transporte() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public void liga() {
        this.ligado = true;
    }

    public void desliga() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            System.out.println("A velocidade não pode ser negativa.");
        }
    }
}
