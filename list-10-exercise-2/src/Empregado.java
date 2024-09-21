public class Empregado extends Pessoa {
    private double salario;

    public Empregado(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void getDescricao() {
        System.out.println("Empregado(a): " + super.getNome() + " | Salário: R$" + salario);
    }

    public void atualizarSalario(double porPercentual) {
        salario += salario * porPercentual / 100;
    }
}
