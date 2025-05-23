public class Main {
    public static void main(String[] args) {
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autMax = consumoMedio * capacidadeTanque;
        double autAtu = consumoMedio * combustivelAtual;

        System.out.println("Autonomia máxima do veículo: " + autMax);
        System.out.println("Autonomia ATUAL do veículo: " + autAtu);

        if(distanciaViagem < autAtu){
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        }else{
            System.out.println("Voce não tem vombustivel suficiente");
        }


        System.out.println("O lucas é zika");

    }
}