public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Wilker");
        pessoa.setIdade(25);

        System.out.println(pessoa.toString());
    }
}
