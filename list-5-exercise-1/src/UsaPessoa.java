public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("José");
        pessoa1.setSobrenome("Manoel");

        Funcionario funcionario1 = new Funcionario("Leandro", "Charles", 2000);

        Professor professor1 = new Professor("Rita", "Cassia", 500);

        System.out.println("Nome completo da pessoa1: " + pessoa1.getNomeCompleto());
        System.out.println("Nome completo da pessoa2: " + funcionario1.getNomeCompleto());
        System.out.println("Nome completo da pessoa3: " + professor1.getNomeCompleto());

        System.out.println("-----------------------");

        System.out.println("Primeira parcela do salário da pessoa2: $" + funcionario1.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela do salário da pessoa2: $" + funcionario1.getSalarioSegundaParcela());

        System.out.println("-----------------------");

        System.out.println("Primeira parcela do salário da pessoa3: $" + professor1.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela do salário da pessoa3: $" + professor1.getSalarioSegundaParcela());
    }
}
