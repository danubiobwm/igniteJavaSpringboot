public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!" + "\n");

    int dadoInt = 10;
    double dadoDouble = 3.5;
    String dadoString = "Hello World!";
    float dadoFloat = 1.0f;
    long dadoLong = 23334455665345344l;
    boolean dadoBool = false;

    System.out.println("Valor de Variaveis");
    System.out.println(dadoInt);
    System.out.println(dadoDouble + "\n");
    System.out.println(dadoString);
    System.out.println(dadoFloat);
    System.out.println(dadoLong);
    System.out.println(dadoBool);

    // if else
    if(dadoInt == 13){
      System.out.println("dado tipo inteiro e igual a 10");
    }else{
      System.out.println("dado tipo inteiro Não é igual a 10");
    }

  }
}