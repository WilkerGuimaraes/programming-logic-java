public class Contas {
    public static void mostrarCalculo(OperacaoMatematica operacao, double a, double b) {
        double resultado = operacao.calcular(a, b);
        System.out.println("Resultado do cálculo: " + resultado);
    }
}
