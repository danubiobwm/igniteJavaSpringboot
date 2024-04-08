package pessoa;

public class Aluno extends Pessoa{

    private String Matricula;

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }


    String imprimirDadosDaPessoa(){
        return "você é Aluno";
    }
}
