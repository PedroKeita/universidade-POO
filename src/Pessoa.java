public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerAniversario() {
        this.idade += 1;

    }
}

