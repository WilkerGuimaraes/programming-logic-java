public class Carro extends Transporte {
    private int quilometragem;

    public Carro() {
        super();
        this.quilometragem = 0;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        if (quilometragem >= 0 && quilometragem <= 999999) {
            this.quilometragem = quilometragem;
        } else {
            if (quilometragem < 0) {
                System.out.println("A quilometragem não pode ser negativa.");
            } else if (quilometragem > 999999) {
                System.out.println("O valor inserido excedeu o limite de quilometragem de  999999.");
            }
        }
    }

    @Override
    public void setVelocidade(int velocidade) {
        if (velocidade >= 0 && velocidade <= 200) {
            super.setVelocidade(velocidade);
        } else {
            System.out.println("A velocidade do carro precisa estar entre 0 e 200.");
        }
    }
}
