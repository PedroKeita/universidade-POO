public class Regular extends Aluno{

    public  Regular(int matricula) {
        super(matricula);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Aluno regular pagou a mensalidade");
    }
}


