import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    //Getters
    public String getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos turma" +codigo+ ":");
        for (Aluno aluno : alunos) {
            System.out.println("#" + aluno.getNome());
        };
    }


}


