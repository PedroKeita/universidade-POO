public class Main {
    public static void imprimirInformacoesTurma(Turma turma) {
        System.out.println("Informações da Turma:");
        System.out.println("Código: " + turma.getCodigo());
        System.out.println("Disciplina: " + turma.getDisciplina().getNome());
        System.out.println("Professor: " + turma.getProfessor().getNome());
        turma.listarAlunos();
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("== Questão 1: Classes e Objetos ==");
        Disciplina disciplina1 = new Disciplina("MAT659", "Matemática Discreta", "2024.2");
        Disciplina disciplina2 = new Disciplina("POO245", "Programação Orientada a Objetos", "2024.1");
        Disciplina disciplina3 = new Disciplina("CAL245", "Cálculo 1", "2024.2");
        System.out.println("Disciplinas criadas com sucesso!");
        System.out.println();

        System.out.println("== Questão 2: Encapsulamento e Métodos ==");
        Regular aluno1 = new Regular("794.585.470-24", "Pedro Lucas", 19, "2024561");
        System.out.println("Antes do aniversário: " + aluno1.getIdade());
        aluno1.fazerAniversario();
        System.out.println("Após o aniversário: " + aluno1.getIdade());
        System.out.println();

        System.out.println("== Questão 3: Herança e Polimorfismo ==");
        Regular aluno2 = new Regular("097.171.210-79", "João Maria José", 23, "2023661");
        Bolsista aluno3 = new Bolsista("316.201.370-46", "Fulano Ciclano", 32, "2024721", 75);
        Professor professor = new Professor("674.507.920-87", "Rubens", 34, "Centro de Ciência e Tecnologia");
        Visitante visitante1 = new Visitante("076.131.480-68", "Paulinho", 55);
        Visitante visitante2 = new Visitante("658.948.070-26", "Mariazinha", 37);
        System.out.println("Professor, alunos e visitantes criados com sucesso!");
        System.out.println();

        aluno1.pagarMensalidade();
        aluno2.pagarMensalidade();
        aluno3.pagarMensalidade();
        professor.darAula();
        System.out.println();

        System.out.println("== Questão 4: Associação e Composição ==");
        Turma turma1 = new Turma("TURMA-3421", disciplina1, professor);
        Turma turma2 = new Turma("TURMA-7582", disciplina2, professor);
        Turma turma3 = new Turma("TURMA-0993", disciplina3, professor);

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);

        turma3.adicionarAluno(aluno3);

        System.out.println("Turmas criadas e alunos matriculados com sucesso!");
        System.out.println();

        imprimirInformacoesTurma(turma1);
        imprimirInformacoesTurma(turma2);
        imprimirInformacoesTurma(turma3);
    }
}
