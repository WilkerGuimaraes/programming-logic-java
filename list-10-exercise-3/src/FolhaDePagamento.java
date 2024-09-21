public class FolhaDePagamento {
    public static void main(String[] args) {
        Empregado[] empregados = new Empregado[3];

        empregados[0] = new PorHora("João", 35, 8);
        empregados[1] = new PorComissao("Maria", 10000);
        empregados[2] = new PorHoraEComissao("João", 30, 8, 8000);

        for (Empregado empregado : empregados) {
            empregado.printPay();
        }
    }
}
