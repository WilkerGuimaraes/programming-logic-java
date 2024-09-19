public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("José");
        pessoa1.setSobrenome("Manoel");

        Funcionario pessoa2 = new Funcionario();
        pessoa2.setNome("Leandro");
        pessoa2.setSobrenome("Charles");
        pessoa2.setMatricula(6789);
        pessoa2.setSalario(2000);

        Professor pessoa3 = new Professor("Rita", "Cassia", 2345, 500);

        System.out.println("Nome completo da pessoa1: " + pessoa1.getNomeCompleto());
        System.out.println("Nome completo da pessoa2: " + pessoa2.getNomeCompleto());
        System.out.println("Nome completo da pessoa3: " + pessoa3.getNomeCompleto());

        System.out.println("\nSalário da pessoa2 (Funcionário):");
        System.out.println("Primeira parcela: $" + pessoa2.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela: $" + pessoa2.getSalarioSegundaParcela());

        System.out.println("\nSalário da pessoa3 (Professor):");
        System.out.println("Primeira parcela: $" + pessoa3.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela: $" + pessoa3.getSalarioSegundaParcela());
    }
}
