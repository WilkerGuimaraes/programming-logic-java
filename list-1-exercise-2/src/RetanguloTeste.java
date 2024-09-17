public class RetanguloTeste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(8);
        retangulo.setLargura(13);

        System.out.println(retangulo.calcularPerimetro());
        System.out.println(retangulo.calcularArea());
    }
}
