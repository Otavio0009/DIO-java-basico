package ControleDeFluxo;
public class ControleDeFluxo {
   /*
   Controle de fluxo é a bilidade de ajustar maneira como um program realiza suas tarefas.
   Por meio de instruções especiais, chamadas de comandos, essas especiais, chamadasde comandos,
   essas tersfas podem ser execultadas seletivamente, repetidamente ou excepicionalmente. */
   
   // Classificações:

   // Estruturas condionais: if-else, switch-case
   // Estrutura de repetição: for-while, do-while
   // Estrutura de exceções: try-catch-finally, throw

    // Estruturas condicionais

    /*
    A Estrutura Condicional possibilita a escolha de um grupo de ações e comportamnetos a serem execultados
    quando determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser Simples ou Composta.*/

    // Condicionais Composta

    /*
    Alumas vezes o nosso programa deverá seguir mais de uma jornada de execução condionado a uma regra de negócio,
    estecenário é denominado Estrutura Condicional Composta. */

    // Quando tiver mais de uma estrução dentro de um a condicional cria-se um bloco "{}"
    // ex:
    /*
    if(valor < saldo){
        saldo -= valor
        System.out.println("Novo saldo" + saldo);
    } else
        System.out.println("Saldo insuficiente"); */

    
    /*Em um controle de fluxo condicinal, nem sempre nos limitamos ao se(if) e senão(else), podemos ter uma terceira,
    quarta ou inúmeras condições.*/

    //CONdição ternária
    /*Como vimos em operadores, podemos abreviar nosso algorítmico condicional refatorando com o conceito de operadores ternários. 
    Em Java, os símbolos ? e : são usados em conjunto para formar o operador condicional ternário.
    Este operador oferece uma forma abreviada de escrever uma instrução if-else simples em uma única linha de código.  
    A "?" == if e o ":" == else e se tiver mais de um ":" == else if e o ultimo sempre será é quivalete ao else */

    //Switch Case
    /*A estrutura switch compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente,
    executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado,
    acrescentamos o camando break no final de cada bloco de código. O camando break, quando execultado, encerra execução da estrutura onde ele se encontra */

    // Estrutura de repetição
    /*Laços de repetição, também conhecido como laços de iteração ou simplesmente loops, são comandos que permitem itreção de código, ou seja,
    que comandos presentes no bloco sejam repetidos diversas vezes. */

    // For
    /*O comando for (na tradução literal para língua portuguesa "para") permite que uma variável contadora seje testada e incrementada a cada iteração,
    sendo essas informações definidas na chamada do comando. O comado for recebe como entrada um variavel contadora, a condição e o valor de incrementarão. */

    // Estrutura do controle de fluxo for
    /*for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
    {
        //comando que séra execultado até que a expressão de validação torne-se falsa
    } */

    // Também usamos o comtrle de fluxo for para interagir sobre arrays e coleções

    // For Each
    /*O uso do for / each está fortemente relacionado com um cenário onde contenha um array ou coleção, e assim, a interação é baseada aos elementos da coleção */

    // break e continue
    /*Break significa quebrar, para, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente.
    Continue, como o nome diz, ele "continua" o laço. O comando break interrompe o lçao, já o continue iterrompe somente a iteração atual. */

    //While

    /*O laço while (na tradução literal para o prtugues sigifica "enquato") determina que enquanto uma condição for valída, o bloco de códgo será executado.
    O laço while testa a condição antes de execultar o código, logo, cas a condição seja inváçida no primeiro teste o bloco nem será executado. */

    // Estrutura de sintaxe do while

    /*while (expressão boolean de validação){
        //Comando que será executado até que a expressão de validação torne-se falso
    } */

    //Do While

    /*O laço do / while (natradução literal "faça... enquanto"), assim como o laço while,
    considera que enquanto uma determinada condição for válida o bloco de código será execultado.
    Entretanto, do / while testa a cindição após execultar o código, sendo assim,
    mesmo qua a condição seja consederada inaválida no primeiro teste o bloco será execultado pelo menos uma vez. */

    //Estrutura de sintaxe do while
    /*do {
        // comando que será executado até que a expressão de validação torne-se falsa
    }
    
    while (expressão boolean de validação); */

    //Estruturas excepcionais

    // Exceções
    /*Ao execultar o código Java, diferentes erros podem acontercer: erros de codificação feitos pelo progrmador,
    erros devido entrada errada ou de imprevistos.
    Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro.
    O termo para isso é: Java lançará uma exceção (jogará um erro).
    De forma interpretativa em java, um erro é algo irreparável, aaplicação trava ou é encerrada drasticamente.
    Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero,
    querer abrir um arquivo que não existe, abrir uma conexão dde bamco com usuário ou senha inválida.
    Todos estes cenários e os demais não são erros mas sim fluxo não previstos pela aplicação.
    É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos de Tratamento de Exceções. */

    //Conhecendo algumas exceções já mapeadas
    /*A linguagem Java dispõe de uma vasta lista de classes que representam exceções.
    | Nome                           |                                         Causa|
    ------------------------------------------------------------------------------
     java.lang.NullPointerException | Quando tentamos
                                   |  obter alguma informação de uma variável nula.
    -------------------------------------------------------------------------------
    java.lang.ArithmeticException  | Quando tentamos dividir um valor por zero
    ------------------------------------------------------------------------------
    java.sql.SQLException         | Quando existe algum erro relacionado a
                                  | interação com base de dados
    -----------------------------------------------------------------------------
    java.io.FileNotFoundException | Quando tentamos ler ou escrver em um arquivo
                                  | que não existe.
    ----------------------------------------------------------------------------- */

    //Tratamento de exceções
    /*E qunado inevitavelmente ocorrer uma exceção ? Como nós desenvolvedores podemos ajustar o nosso algoritimo para amenizar o ocorrido?
    
    A instrução try permite que vocÊ defina umbloco de códifopara ser testado quando a erros enquanto está sendo executado
    
    A instrução catch permite definir um bloco de código a ser executado caso ocorra um erro no bloco try.
    
    A instrução finally permite definir bloco de código a ser execultado independente de ocorrer um erro ou não.
    As palavar-chaves try e catch vêm em pares. */

    //Estrutura de bloco rty e ctch

    /*try{
        // bloco de código conforme esperado
    } catch(Excepition e){
        // permite saber qual exceção bloco de código que podem acontecer em caso de um fluxo não previsto 
    } */

    //Hierarquia das exceção

    /*A linguagem Jva dispõe de ums variedade de classes que representam excweções, e estas classes são organizadas em uma hieraraquia
    denominadas Checked and Uncheked Exceptions ou Exceções Checadas e Não Cheacads */

    //Exceções customizadas
    /*Nós podemos criar nossas próprias excsçõesbasedas em regrasde negócio e assim melhor direcionar quem for utilizar os recursos
    desenvovidos no projeto: 
    Imagina que como regra de negócio, para formatar um cep necessita sempre de ter 8 dígtos, caso contrário lançará uma exceção que
    denomina,os de CeplnvalidoExcepition */
}
