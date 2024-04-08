package primeirasAulas;
import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
  public static void main(String[] args) {
    Set<Integer> numeros = new HashSet<>();
    // Adicionando elementos no conjunto
    numeros.add(10);
    numeros.add(20);
    numeros.add(30);
    numeros.add(40);

    System.out.println("Tamanho: " + numeros.size());

    for (Integer element : numeros){
      System.out.println("Os numeros são:" + element);
    }
  }
}
