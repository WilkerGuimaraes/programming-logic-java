public class Principal {
    public static void main(String[] args) {
        TipoMarcha tipoMarcha = new TipoMarcha("Automático");

        Marcha marcha = new Marcha("5", tipoMarcha);

        Fabricante fabricantePneu = new Fabricante("Michelin", "00.623.904/0001-73");
        Pneu pneu = new Pneu(18, 225, fabricantePneu);

        Fabricante fabricanteCarroceria = new Fabricante("Volkswagen", "1234567800019");
        Carroceria carroceria = new Carroceria("Fechada", fabricanteCarroceria);

        Motor motorCarro = new Motor(120, "CHS1234", 250);
        Carro carro = new Carro("Golf", "ABC1234", fabricanteCarroceria, motorCarro, pneu);


        Motor motorCaminhao = new Motor(220, "KJH8483", 360);
        Caminhao caminhao = new Caminhao("Cargo", "XYZ5678", true, motorCaminhao, pneu, carroceria, marcha, fabricanteCarroceria);

        System.out.println("Dados do carro:");
        System.out.println("Carro Modelo: " + carro.getModelo());
        System.out.println("Carro Placa: " + carro.getPlaca());

        System.out.println("\nDados do caminhão:");
        System.out.println("Caminhão Modelo: " + caminhao.getModelo());
        System.out.println("Caminhão Placa: " + caminhao.getPlaca());
        System.out.println("Caminhão Cabine Dupla: " + caminhao.isCabineDupla());
    }
}
