package POO.ExemploConstrutores;

public interface SistemaCadastro {
    public static void main(String[] args) {
        Pessoa otavio = new Pessoa("Otávio", "811-634-400-06");

        otavio.setEndereco("RUA DAS MARIS");
        
        System.out.println(otavio.getNome() + " - " + otavio.getCpf());
    }
}
