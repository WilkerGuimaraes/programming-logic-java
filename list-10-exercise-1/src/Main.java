public class Main {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        Contas.mostrarCalculo(soma, 412, 125);

        OperacaoMatematica subtracao = new Subtracao();
        Contas.mostrarCalculo(subtracao, 500, 167);
    }
}
