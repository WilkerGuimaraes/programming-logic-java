import java.util.Scanner;

public class CalcularRendimento {
    public static void main(String[] args) {
        Poupanca contaPoupanca = new Poupanca();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo inicial na conta: R$" + contaPoupanca.getSaldo());

        System.out.println("Digite 1 para depositar ou digite 2 para sacar:");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o valor ao qual deseja depositar:");
            double deposito = scanner.nextDouble();
            contaPoupanca.depositar(deposito);
            System.out.println("Deposito realizado com sucesso! Valor atual da conta: R$" + contaPoupanca.getSaldo());

            System.out.println("Informe quantos dias este valor irá ficar no depósito:");
            int dias = scanner.nextInt();
            contaPoupanca.setDiaRendimento(dias);
            contaPoupanca.calcularRendimento();
            System.out.println("Valor atual da sua conta: R$" + contaPoupanca.getSaldo());
        } else if (opcao == 2) {
            System.out.println("Digite o valor do saque: R$");
            double saque = scanner.nextDouble();
            contaPoupanca.sacar(saque);
            System.out.println("Saque realizado com sucesso! Valor atual da conta: R$" + contaPoupanca.getSaldo());
        }

        scanner.close();
    }
}
