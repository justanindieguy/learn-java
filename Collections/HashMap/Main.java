import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    HashMap<Integer, String> hm = new HashMap<>(
        Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

    hm.put(4, "E");
    hm.put(6, "G");

    searchKey(hm);

    System.out.println("HashMap key-value pairs:");
    System.out.println(hm);
  }

  private static void searchKey(HashMap<Integer, String> hm) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter key: ");
    int key = sc.nextInt();
    sc.close();

    if (hm.containsKey(key)) {
      System.out.println("HashMap contains key " + key + " with value: " + hm.get(key));
    } else {
      System.out.println("HashMap does not contain key");
    }

    System.out.println();
  }
}
