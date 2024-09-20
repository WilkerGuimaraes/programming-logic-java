public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("José");
        fornecedor.setEndereco("Rua A, 123");
        fornecedor.setTelefone("98989-0000");
        fornecedor.setValorCredito(2468.80);
        fornecedor.setValorDivida(1234.99);
        double saldo = fornecedor.obterSaldo();
        System.out.println("Dados do fornecedor:");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor do crédito: R$" + fornecedor.getValorCredito());
        System.out.println("Valor da dívida: R$" + fornecedor.getValorDivida());
        System.out.println(String.format("Saldo: R$%.2f", saldo));
    }
}
