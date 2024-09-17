public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Wilker", 25);

        pessoa.setNome("Ryan");
        pessoa.setIdade(36);

        System.out.println(pessoa.toString());
    }
}
