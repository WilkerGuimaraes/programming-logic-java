public class Funcionario extends Pessoa {
    private static int contador = 0;
    private int matricula;
    private double salario;

    public Funcionario(String nome, String sobrenome, double salario) {
        super(nome, sobrenome);
        this.matricula = ++contador;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioPrimeiraParcela() {
        return this.salario * 0.6;
    }

    public double getSalarioSegundaParcela() {
        return this.salario * 0.4;
    }
}
