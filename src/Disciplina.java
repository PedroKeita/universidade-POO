public class Disciplina {
    private String codigo;
    private String nome;
    private String semestre;

    public Disciplina(String codigo, String nome, String semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSemestre() {
        return semestre;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}

