import java.util.Map;
import java.util.HashMap;

public class Colecao {
  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();
    notas.put("Ana", 9);
    notas.put("Bruna", 10);
    notas.put("Maria", 6);
    notas.put("Raquel", 7);

   var nota = notas.get("Ana"); // Buscar a nota de Ana
   System.out.println("Buscar a nota de Ana: "+ nota); // Imprimir a nota


   for(Map.Entry<String,Integer> entry : notas.entrySet()){
    String key = entry.getKey();
    Integer value = entry.getValue();
     System.out.println("Nome: " + key + "|" + " Nota: " + value);
   }

   if (notas.containsValue(6)) {
     System.out.println("\nExiste alguém com a nota 6!");
   } else {
    System.out.println("\n Não Existe alguém com a nota 6!");
   }
  }
}
//On new Year´s day, each person gets older