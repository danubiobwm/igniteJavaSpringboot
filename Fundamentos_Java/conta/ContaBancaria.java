package conta;

public class ContaBancaria {

  private String numero;
  private String titular;
  private double saldo;

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  void depositar(double valor) {
    if (valor > 0) {
      saldo = saldo + valor;
      System.out.println("Depósito realizado com sucesso!");
      System.out.println("Saldo atual:" + saldo);
    } else {
      System.out.println("O valor de depósito é inválido");
    }
  }

  void sacar(double valor){
    if (valor > 0  && valor <= saldo) {
      saldo = saldo - valor;
      System.out.println("Saque realizado com sucesso!");
      System.out.println( "Saque de R$: " + valor + "Saldo atual R$" + saldo);
    }
    else{
      System.out.println("Saldo insuficiente ou valor inválido.");
    }
  }
}
