public class AlunoGraduacao extends AlunoEscola {
    @Override
    public void informarAluno(String nome) {
        super.informarAluno(nome);
    }

    public void informarAluno(String nome, String graduacao) {
        System.out.println(nome + " está matriculado no curso de " + graduacao + " da graduação.");    }
}
