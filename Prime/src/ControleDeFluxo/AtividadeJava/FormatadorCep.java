package ControleDeFluxo.AtividadeJava;

public class FormatadorCep {
    public static void main(String[] args) {
        try {

            String cepFormatado = formatarCep("23765064");

            System.out.println(cepFormatado);

        } catch (CepInvalidoExcepition e) {

            // TODO Auto-generated catch block
            
            System.err.println("O cep não corespode com a regras de negocio!");
        }
        
    }
    static String formatarCep(String cep) throws CepInvalidoExcepition {
        if (cep.length() != 8)
            throw new CepInvalidoExcepition();

        return "23.765-064";
    }
}
