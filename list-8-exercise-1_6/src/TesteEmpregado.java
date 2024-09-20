public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Maria", "Rua B, 456", "98787-0101", 135123, 1800.00, 5);
        System.out.println("Dados do empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do setor: " + empregado.getCodigoSetor());
        System.out.println("Salário base: R$" + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário Líquido (com Comissão): R$" + empregado.calcularSalario());
    }
}
