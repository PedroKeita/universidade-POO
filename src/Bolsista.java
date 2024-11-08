public class Bolsista extends Aluno{

    public  Bolsista(int matricula) {
        super(matricula);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Aluno Bolsista pagou a mensalidade com desconto");
    }
}