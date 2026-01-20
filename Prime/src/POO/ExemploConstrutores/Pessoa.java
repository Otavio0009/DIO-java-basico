package POO.ExemploConstrutores;

public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String newEndereco) {
        endereco = newEndereco;
    }
}
