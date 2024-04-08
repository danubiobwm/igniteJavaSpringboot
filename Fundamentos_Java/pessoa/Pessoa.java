package pessoa;

public class Pessoa {
  private String name;
  private String cpf;
  private int idade;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  String imprimirDadosDaPessoa(){
    return "o nome da pessoa é " + name +
    "a Idade é " +idade + "CPF é: " + cpf;
  }
}