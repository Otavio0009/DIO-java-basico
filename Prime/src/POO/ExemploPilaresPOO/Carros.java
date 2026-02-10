package POO.ExemploPilaresPOO;

public class Carros extends Veiculo {
    public void ligar() {

        confereCambio();
        confereCombustivel();

        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("CONFERINDO CONBUSTIVEL");   
    }

    private void confereCambio() {
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}
