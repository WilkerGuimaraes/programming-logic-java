public class Funcionario {
    private static int matriculaAtual = 0;

    private int matricula;
    private String nome;
    private int idade;
    private double salario;
    private Setor setor;

    public Funcionario(String nome, int idade, double salario, Setor setor) {
        this.matricula = ++matriculaAtual;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String toString() {
        return "Matrícula: " + this.matricula + " | Nome: " + this.nome + " | Idade: " + this.idade + " | Salário: " + this.salario + " | Setor: " + this.setor.getCodigo() + "-" + this.setor.getNome();
    }
}
