public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("João", "Rua C, 789", "98686-0202", 652936, 2400.00, 5, 200);
        System.out.println("Dados do administrador:");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do setor: " + administrador.getCodigoSetor());
        System.out.println("Salário base: R$" + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de custo: R$" + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido (com Comissão): R$" + administrador.calcularSalario());
    }
}
