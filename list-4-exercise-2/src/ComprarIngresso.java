import java.util.Scanner;

public class ComprarIngresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite 1 para ingresso normal ou digite 2 para ingresso VIP:");
        int tipoVIP = scanner.nextInt() ;

        if (tipoVIP == 1) {
            System.out.println("Informe o valor do ingresso:");
            double valorIngresso = scanner.nextDouble();

            Ingresso ingressoNormal = new Normal(valorIngresso);
            ingressoNormal.imprimirValor();
        } else if (tipoVIP == 2) {
            System.out.println("Digite 1 para o camarote superior ou digite 2 para o camarote inferior:");
            int camarote = scanner.nextInt();

            if (camarote == 1) {
                System.out.println("Informe o valor do ingresso:");
                double valorIngresso = scanner.nextDouble();

                System.out.println("Digite o valor adicional:");
                double adicional = scanner.nextDouble();

                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(valorIngresso, adicional);
                System.out.println("Camarote Superior:");
                camaroteSuperior.imprimirValor();
            } else if (camarote == 2) {
                System.out.println("Informe o valor do ingresso:");
                double valorIngresso = scanner.nextDouble();

                System.out.println("Digite o valor adicional:");
                double adicional = scanner.nextDouble();

                scanner.nextLine();

                System.out.println("Digite o endereço:");
                String endereco = scanner.nextLine();

                CamaroteInferior camaroteInferior = new CamaroteInferior(valorIngresso, adicional, endereco);
                System.out.println("Camarote Inferior:");
                camaroteInferior.imprimirEndereco();
                camaroteInferior.imprimirValor();
            } else {
                System.out.println("Opção inválida! Programa encerrado.");
            }
        } else {
            System.out.println("Opção inválida! Programa encerrado.");
        }
        scanner.close();
    }
}
