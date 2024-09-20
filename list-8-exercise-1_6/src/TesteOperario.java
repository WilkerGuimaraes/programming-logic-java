public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Ana", "Rua D, 321", "98989-3333", 301, 2500.00, 5, 10000.00, 5);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: R$" + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor da Produção: R$" + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário Líquido (com Comissão): R$" + operario.calcularSalario());
    }
}
