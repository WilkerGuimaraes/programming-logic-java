public class Setor {
    private static int contagemSetores = 0;
    private int codigo;
    private String nome;

    public Setor(String nome) {
        this.codigo = ++contagemSetores;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
