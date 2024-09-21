public class SubClass extends SuperClass{
    private int n2;

    public SubClass(int n1, int n2) {
        super(n1);
        this.n2 = n2;
    }

    @Override
    public void imprimirNumero() {
        System.out.println("Valor de n2: " + this.n2);
    }
}
