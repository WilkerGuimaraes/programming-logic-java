public class AlunoPosGraduacao extends AlunoGraduacao {
    @Override
    public void informarAluno(String nome, String graduacao) {
        super.informarAluno(nome, graduacao);
    }

    public void informarAluno(String nome, String graduacao, String posGraduacao) {
        System.out.println(nome + " fez graduação em " + graduacao + " e está matriculado na pós-graduação em " + posGraduacao + ".");    }
}
