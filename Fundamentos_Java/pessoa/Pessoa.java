package pessoa;

public class Pessoa {
  String name;
  String cpf;
  int idade;

  String imprimirDadosDaPessoa(){
    return "o nome da pessoa é " + name +
    "a Idade é " +idade + "CPF é: " + cpf;
  }
}