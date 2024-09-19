public class Carroceria {
    private String tipoCarroceria;
    private Fabricante fabricante;

    public Carroceria(String tipoCarroceria, Fabricante fabricante) {
        this.tipoCarroceria = tipoCarroceria;
        this.fabricante = fabricante;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }
}
