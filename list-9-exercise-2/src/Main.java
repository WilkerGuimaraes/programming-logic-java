public class Main {
    public static void main(String[] args) {
        AlunoEscola[] alunos = new AlunoEscola[3];

        alunos[0] = new AlunoEscola();
        alunos[1] = new AlunoGraduacao();
        alunos[2] = new AlunoPosGraduacao();

        System.out.println("Lista de alunos:");
        alunos[0].informarAluno("José");
        ((AlunoGraduacao) alunos[1]).informarAluno("Maria", "Engenharia");
        ((AlunoPosGraduacao) alunos[2]).informarAluno("João", "Medicina", "Gestão Hospitalar");
    }
}
