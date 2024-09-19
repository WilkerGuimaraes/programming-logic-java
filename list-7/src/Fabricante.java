public class Fabricante {
    private String nome;
    private String cnpj;

    public Fabricante(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
