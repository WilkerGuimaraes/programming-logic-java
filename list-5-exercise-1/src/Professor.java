public class Professor extends Funcionario {
    public Professor(String nome, String sobrenome, double salario) {
        super(nome, sobrenome, salario);
    }

    @Override
    public double getSalarioPrimeiraParcela() {
        return super.getSalario();
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }
}
