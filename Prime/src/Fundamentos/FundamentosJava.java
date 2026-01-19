package Fundamentos;
/**
 * ==========================================================
 * Fundamentos completos da linguagem Java
 * ==========================================================
 * Aborda:
 * - Sintaxe
 * - Anatomia das classes
 * - Tipos e variáveis
 * - Todos os operadores
 * - Métodos
 * - Escopo
 * - Palavras reservadas
 * - JavaDoc
 * - Execução no terminal
 * - Argumentos da linha de comando
 * - Objeto String (completo)
 *
 * @author Otávio
 * @version 1.0
 * @since 2026
 */
public class FundamentosJava {

    // ==========================================================
    // VARIÁVEIS DE CLASSE (ESCOPO GLOBAL)
    // ==========================================================
    static final String LINGUAGEM = "Java";
    static int contadorGlobal = 0;

    /**
     * Método principal (ponto de entrada do programa)
     *
     * @param args argumentos recebidos pelo terminal
     */
    public static void main(String[] args) {

        // ======================================================
        // TIPOS PRIMITIVOS
        // ======================================================
        byte tipoByte = 1;
        short tipoShort = 10;
        int tipoInt = 100;
        long tipoLong = 1000L;

        float tipoFloat = 1.5f;
        double tipoDouble = 2.75;

        char tipoChar = 'J';
        boolean tipoBoolean = true;

        // ======================================================
        // OBJETOS (TIPOS NÃO PRIMITIVOS)
        // ======================================================
        String nome = "Otávio";
        String sobrenome = new String("Carmo");

        // ======================================================
        // OPERAÇÕES COM STRING (CRIAÇÃO E CONCATENAÇÃO)
        // ======================================================
        String nomeCompleto = nome + " " + sobrenome;
        String fraseFormatada = String.format(
                "Nome: %s | Linguagem: %s",
                nomeCompleto,
                LINGUAGEM
        );

        // ======================================================
        // MÉTODOS DO OBJETO STRING
        // ======================================================
        int tamanho = nomeCompleto.length();
        char primeiraLetra = nomeCompleto.charAt(0);
        String maiusculo = nomeCompleto.toUpperCase();
        String minusculo = nomeCompleto.toLowerCase();
        String substring = nomeCompleto.substring(0, 6);

        boolean contem = nomeCompleto.contains("Carmo");
        boolean igual = nome.equals("Otávio");
        boolean igualIgnoreCase = nome.equalsIgnoreCase("otávio");
        int comparacao = nome.compareTo("Otávio");

        String textoComEspacos = "   Java é poderoso   ";
        String textoTrim = textoComEspacos.trim();
        String textoSubstituido = textoTrim.replace("Java", "JDK");

        boolean vazio = "".isEmpty();
        boolean branco = "   ".isBlank();

        char[] arrayChar = nome.toCharArray();
        String numeroTexto = String.valueOf(tipoInt);
        int textoParaNumero = Integer.parseInt("200");

        // ======================================================
        // STRING MUTÁVEL
        // ======================================================
        StringBuilder sb = new StringBuilder();
        sb.append("Aprendendo ");
        sb.append(LINGUAGEM);
        sb.append(" com StringBuilder");

        String resultadoBuilder = sb.toString();

        // ======================================================
        // TODOS OS OPERADORES
        // ======================================================

        // Aritméticos
        int soma = tipoInt + 10;
        int subtracao = tipoInt - 10;
        int multiplicacao = tipoInt * 2;
        int divisao = tipoInt / 2;
        int resto = tipoInt % 3;

        // Unários
        int positivo = +tipoInt;
        int negativo = -tipoInt;
        tipoInt++;
        tipoInt--;

        // Relacionais
        boolean maior = tipoInt > 50;
        boolean menor = tipoInt < 200;
        boolean maiorIgual = tipoInt >= 100;
        boolean menorIgual = tipoInt <= 100;
        boolean igualRelacional = tipoInt == 100;
        boolean diferente = tipoInt != 50;

        // Lógicos
        boolean operadorAnd = tipoBoolean && maior;
        boolean operadorOr = tipoBoolean || menor;
        boolean operadorNot = !tipoBoolean;

        // Atribuição
        tipoInt += 10;
        tipoInt -= 5;
        tipoInt *= 2;
        tipoInt /= 2;
        tipoInt %= 2;

        // Bitwise
        int bitAnd = 5 & 3;
        int bitOr = 5 | 3;
        int bitXor = 5 ^ 3;
        int bitNot = ~5;

        // Shift
        int shiftLeft = 5 << 1;
        int shiftRight = 5 >> 1;
        int shiftUnsigned = 5 >>> 1;

        // Ternário
        String status = tipoBoolean ? "Ativo" : "Inativo";

        // instanceof
        boolean ehString = nome instanceof String;

        // ======================================================
        // ARGUMENTOS DO TERMINAL
        // ======================================================
        String argumento0 = args.length > 0 ? args[0] : "Sem argumento";

        // ======================================================
        // SAÍDA NO TERMINAL
        // ======================================================
        System.out.println(fraseFormatada);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Primeira letra: " + primeiraLetra);
        System.out.println("Maiúsculo: " + maiusculo);
        System.out.println("Minúsculo: " + minusculo);
        System.out.println("Substring: " + substring);
        System.out.println("Contém 'Carmo': " + contem);
        System.out.println("CompareTo: " + comparacao);
        System.out.println("Trim: " + textoTrim);
        System.out.println("Replace: " + textoSubstituido);
        System.out.println("StringBuilder: " + resultadoBuilder);
        System.out.println("Status: " + status);
        System.out.println("Instanceof String: " + ehString);
        System.out.println("Argumento recebido: " + argumento0);

        contadorGlobal++;
    }

    /**
     * Método com retorno
     *
     * @param texto texto recebido
     * @return texto formatado
     */
    public static String mensagem(String texto) {
        return "Mensagem: ".concat(texto);
    }

    // Palavras Chaves

    /*
    public, class, static, final, void, int, double, boolean,
    return, new, instanceof, true, false
    */

    // como usar no terminal
    
    /*
    javac FundamentosJava.java
    java FundamentosJava Olá
    */
}

