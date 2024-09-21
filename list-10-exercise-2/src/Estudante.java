public class Estudante extends Pessoa {
    private String areaDeEstudo;

    public Estudante(String nome, String areaDeEstudo) {
        super(nome);
        this.areaDeEstudo = areaDeEstudo;
    }

    @Override
    public void getDescricao() {
        System.out.println("Estudante: " + super.getNome() + " | Área de estudo: " + areaDeEstudo);
    }
}
