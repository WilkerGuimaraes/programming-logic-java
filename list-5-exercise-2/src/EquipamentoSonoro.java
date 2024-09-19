public class EquipamentoSonoro extends Equipamento {
    private short volume;
    private boolean stereo;

    public EquipamentoSonoro() {
        this.volume = 0;
        this.stereo = false;
    }

    public void mono() {
        this.stereo = true;
    }

    public void stereo() {
        this.stereo = false;
    }

    @Override
    public void liga() {
        super.liga();
        this.volume = 5;
    }

    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("O volume precisa estar entre 0 e 10.");
        }
    }

    public boolean isStereo() {
        return stereo;
    }

    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }
}
