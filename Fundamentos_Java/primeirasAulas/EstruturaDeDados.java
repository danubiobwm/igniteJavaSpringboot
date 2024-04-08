package primeirasAulas;

import java.util.ArrayList;
import java.util.List;


public class EstruturaDeDados {

public static void main(String[] args) {
  List<String> nomes = new ArrayList<>(); //Lista encadeada
  nomes.add("Joao");
  nomes.add("Maria");
  nomes.add("Bruna");
  nomes.add("Danubio");

  System.out.println(nomes);
  //System.out.println(nomes.get(2));//Acessando o elemento no ind


  // for (String nome : nomes) {
  //   System.out.println(nome);

  // }

  nomes.forEach(nome -> System.out.println(nome)); //Usando lambda para percorrer a lista

}//main

}//class