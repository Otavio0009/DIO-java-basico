package POO.ExemploPilaresPOO;

public class Autodromo {
    public static void main(String[] args) {
        Carros audi = new Carros();

        audi.setChassi("999999");
        audi.ligar();


        Moto mt_09 = new Moto();

        mt_09.ligar();
        mt_09.setChassi("918227");

        
    }
}
