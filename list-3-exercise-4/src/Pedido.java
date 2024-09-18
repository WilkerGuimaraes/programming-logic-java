import java.util.Date;

public class Pedido {
    private static int numero = 0;
    private int contador;
    private Date data;
    private String cliente;
    private double valor;

    public Pedido(String cliente, double valor) {
        this.contador = ++numero;
        this.data = new Date();
        this.cliente = cliente;
        this.valor = valor;
    }

    public String gerarPedido() {
        return "Pedido Nº: " + this.contador + " | Data: " + this.data + " | Cliente: " + this.cliente + " | Valor: $" + this.valor;
    }
}
