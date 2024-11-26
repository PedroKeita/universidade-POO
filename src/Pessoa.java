public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String cpf,String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    //~Getters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    //Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerAniversario() {
        this.idade ++;

    }
}

