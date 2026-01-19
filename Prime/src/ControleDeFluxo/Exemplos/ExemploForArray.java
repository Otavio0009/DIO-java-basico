package ControleDeFluxo.Exemplos;

public class ExemploForArray {

    public static void main(String[] args) {

        //Em arrays o indice inicia em  0 = "ZERO"
        String alunos[] = {"OTÁVIO", "HUDSON", "HELIO", "DINARA", "LINDALVA"};

        for (int x = 0; x < alunos.length; x ++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
}