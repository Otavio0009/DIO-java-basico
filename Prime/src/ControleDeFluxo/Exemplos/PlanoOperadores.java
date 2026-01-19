package ControleDeFluxo.Exemplos;

public class PlanoOperadores {
    public static void main(String[] args) {
    /*Porém um cenário que adequar o uso de switc/case para melhorar nosso algoritimo seria conforme ilustração abaixo: 
    O sistema terá 03 palnos: BASIC, MIDIA, TURBO
    BASICO: 100 minutos de ligação
    MIDIA: 100 minutos de ligação + Whats e Instagram grástis
    TURBO: 100 minutos de ligação + Whats e Instagram gráts + 5gb Youtube*/

    String plano = "M";

    switch (plano) {
        case "T":{
            System.out.println("5Gb Youtube");
            break;
        }

        case "M": {
            System.out.println("Whats e Instagram grátes");
            break;
        }

        case "B":{
            System.out.println("100 minutos de ligaçaõ");
            break;
        }
    }
    }
}
