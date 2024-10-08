public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    public double getSalarioPrimeiraParcela() {
        return this.salario * 0.6;
    }

    public double getSalarioSegundaParcela() {
        return this.salario * 0.4;
    }
}
