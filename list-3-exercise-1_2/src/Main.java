public class Main {
    public static void main(String[] args) {
        Setor setor1 = new Setor("Administração");
        Setor setor2 = new Setor("Contabilidade");
        Setor setor3 = new Setor("T.I.");

        Funcionario funcionario1 = new Funcionario("José", 25, 4200, setor3);
        Funcionario funcionario2 = new Funcionario("Maria", 21, 3800, setor1);
        Funcionario funcionario3 = new Funcionario("João", 28, 3400, setor2);

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
    }
}
