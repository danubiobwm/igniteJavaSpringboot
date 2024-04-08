package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    pessoa1.setName( "John Doe");
    pessoa1.setCpf("123.456.789-10");
    pessoa1.setIdade(30);

    String dadosDaPessoa = pessoa1.imprimirDadosDaPessoa();
    System.out.println(dadosDaPessoa);

    Professor prof = new Professor();
    prof.setName("Prof");
    prof.setCpf("123.456.789-10");
    prof.setIdade(23);
    prof.setSalario(13000);

    String dadosprof = prof.imprimirDadosDaPessoa();
    System.out.println(dadosprof);

    Aluno aluno = new Aluno();
    aluno.setName( "John Doe");
    aluno.setCpf("123.456.789-10");
    aluno.setIdade(10);
    aluno.setMatricula("12");
    String dadosaluno = aluno.imprimirDadosDaPessoa();
    System.out.println(dadosaluno);





  }
}