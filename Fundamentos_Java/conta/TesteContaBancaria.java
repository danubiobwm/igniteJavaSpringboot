package conta;

public class TesteContaBancaria {

public static void main(String[] args) {
  ContaBancaria contaBancaria1 = new ContaBancaria();

  contaBancaria1.setNumero("123");
  contaBancaria1.setTitular("Danubio");
  contaBancaria1.setSaldo( 2000 );

  contaBancaria1.depositar(50);
  contaBancaria1.sacar(100);
}
}
