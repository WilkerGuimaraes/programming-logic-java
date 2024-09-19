import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);

        carro.liga();
        System.out.println("O carro está ligado!");
        System.out.println("Sua velocidade é de: " + carro.getVelocidade() + "km/h.");
        System.out.println("Sua quilometragem atual é de: " + carro.getQuilometragem() + "km.");

        System.out.println("Insira a velocidade do carro:");
        int velocidade = scanner.nextInt();
        carro.setVelocidade(velocidade);
        System.out.println("Velocidade atual do carro: " + carro.getVelocidade() + "km/h");

        System.out.println("Insira a quilometragem do carro:");
        int quilometragem = scanner.nextInt();
        carro.setQuilometragem(quilometragem);
        System.out.println("Quilometragem atual do carro: " + carro.getQuilometragem() + "km percorridos.");

        carro.desliga();
        System.out.println("Carro desligado!");
        System.out.println("Velocidade após desligar: " + carro.getVelocidade() + "km/h.");
        System.out.println("Quilometragem após desligar: " + carro.getQuilometragem() + "km.");

        scanner.close();

    }
}
