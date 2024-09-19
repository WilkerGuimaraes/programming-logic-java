import java.util.Scanner;

public class TesteEquipamento {
    public static void main(String[] args) {
        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro();
        Scanner scanner = new Scanner(System.in);

        equipamentoSonoro.liga();
        System.out.println("O equipamento sonoro está ligado! Volume ajustado para: " + equipamentoSonoro.getVolume());

        System.out.println("Digite um volume de 0 a 10:");
        short volume = scanner.nextShort();
        equipamentoSonoro.setVolume(volume);
        System.out.println("Volume atual: " + equipamentoSonoro.getVolume());

        System.out.println("Digite 1 para stereo ou 2 para mono:");
        int modo = scanner.nextInt();
        if (modo == 1) {
            equipamentoSonoro.stereo();
            System.out.println("Equipamento em modo stereo.");
        } else if (modo == 2) {
            equipamentoSonoro.mono();
            System.out.println("Equipamento em modo mono.");
        }

        equipamentoSonoro.desliga();
        System.out.println("Equipamento desligado.");
        scanner.close();
    }
}
