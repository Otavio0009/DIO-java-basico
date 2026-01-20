package POO.ExemploGetterSetters02.Escola;

public record Escola() {
    public static void main(String[] args) {
        Aluno otavio = new Aluno();

        otavio.setNome("Otávio");
        otavio.setIdade(20);

        System.out.println("O aluno " + otavio.getNome() + " tem " + otavio.getIdade() + " anos");
    }
}
