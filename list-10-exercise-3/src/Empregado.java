public abstract class Empregado {
    private String name;

    public Empregado(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printPay();

    public abstract double getPay();
}
