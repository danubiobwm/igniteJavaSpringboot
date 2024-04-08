package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    pessoa1.name = "John Doe";
    pessoa1.cpf = "123.456.789-10";
    pessoa1.idade = 30;

    String dadosDaPessoa = pessoa1.imprimirDadosDaPessoa();
    System.out.println(dadosDaPessoa);
  }
}