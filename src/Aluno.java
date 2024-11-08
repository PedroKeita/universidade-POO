public class Aluno {
    private int matricula;

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade(){
    System.out.println(matricula+ "(aluno) pagou a mensalidade");
    }
}
