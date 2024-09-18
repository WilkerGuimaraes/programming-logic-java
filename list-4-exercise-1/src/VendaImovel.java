import java.util.Scanner;

public class VendaImovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o endereço do imóvel: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o preço base do imóvel: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite 1 para imóvel novo ou 2 para imóvel usado:");
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            System.out.println("Digite o valor adicional para o imóvel novo:");
            double adicional = scanner.nextDouble();

            Novo imovelNovo = new Novo(endereco, preco, adicional);
            imovelNovo.imprimirDados();
        } else if (tipo == 2) {
            System.out.println("Digite o valor do desconto para o imóvel:");
            double desconto = scanner.nextDouble();

            Usado imovelUsado = new Usado(endereco, preco, desconto);
            imovelUsado.imprimirDados();
        } else {
            System.out.println("Opção inválida! Tente novamente.");
        }

        scanner.close();
    }
}
