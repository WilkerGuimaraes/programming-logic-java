public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Roberta", "Rua F, 456", "98989-5555", 101, 3000.00, 5, 15000.00, 7);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: R$" + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor das Vendas: R$" + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário Líquido (com Comissão): R$" + vendedor.calcularSalario());
    }
}
