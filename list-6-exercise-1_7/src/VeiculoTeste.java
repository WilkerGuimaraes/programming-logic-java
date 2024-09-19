public class VeiculoTeste {
    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta("123ABC", "Moutain Bike", 30.0, 6);
        Bicicleta bicicleta2 = new Bicicleta("456DEF", "Road Bike", 40.0, 7);
        Bicicleta bicicleta3 = new Bicicleta("789GHI", "Bike", 60.0, 5);

        Carro carro1 = new Carro("LK384HU45", "SUV", 180, 50);
        Carro carro2 = new Carro("TU85JK59M", "Sport", 200, 40);

        bicicleta1.ajustar();
        bicicleta1.limpar();
        bicicleta2.ajustar();
        bicicleta2.limpar();
        bicicleta3.ajustar();
        bicicleta3.limpar();

        System.out.println("\n");
        carro1.ajustar();
        carro1.limpar();
        carro2.ajustar();
        carro2.limpar();

        System.out.println("\n");
        bicicleta1.aumentarMarcha(5);
        bicicleta2.aumentarMarcha(3);
        bicicleta3.aumentarMarcha(4);

        System.out.println("\n");
        carro1.incrementarVeloc(120);
        carro2.incrementarVeloc(130);

        System.out.println("\n");
        carro1.trocarOleo();
        carro2.trocarOleo();

        System.out.println("Total de veículos criados: " + Veiculo.getCount());

    }
}
