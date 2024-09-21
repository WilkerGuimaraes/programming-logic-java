public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];

        pessoas[0] = new Estudante("João", "Ciência da computação");
        pessoas[1] = new Empregado("Maria", 5000);

        for (Pessoa pessoa : pessoas) {
            pessoa.getDescricao();
        }
    }
}
