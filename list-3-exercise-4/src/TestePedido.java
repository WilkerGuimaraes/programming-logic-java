public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("José", 1275.29);
        Pedido pedido2 = new Pedido("Maria", 2093.19);
        Pedido pedido3 = new Pedido("João", 3084.25);

        System.out.println(pedido1.gerarPedido());
        System.out.println(pedido2.gerarPedido());
        System.out.println(pedido3.gerarPedido());
    }
}
