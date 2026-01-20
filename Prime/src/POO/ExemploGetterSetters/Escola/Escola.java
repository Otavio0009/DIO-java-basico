package POO.ExemploGetterSetters.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno otavio = new Aluno();

        otavio.nome = "Otávio";
        otavio.idade = 19;

        System.out.println("O aluno " + otavio.nome + " tem " + otavio.idade + " anos");
    }
}
