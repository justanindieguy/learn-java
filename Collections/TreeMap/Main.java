import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) {
    TreeMap<Integer, String> tm = new TreeMap<>(
        Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

    tm.put(4, "E");
    tm.put(6, "G");

    searchKey(tm);

    System.out.println("TreeMap key-value pairs:");
    System.out.println(tm);

    Entry<Integer, String> e = tm.firstEntry();
    System.out.println("First entry: " + e);
    System.out.println("Entry key: " + e.getKey());
    System.out.println("Entry value: " + e.getValue());
  }

  private static void searchKey(TreeMap<Integer, String> tm) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter key: ");
    int key = sc.nextInt();
    sc.close();

    if (tm.containsKey(key)) {
      System.out.println("TreeMap contains key " + key + " with value: " + tm.get(key));
    } else {
      System.out.println("Closest smaller key value: " + tm.floorEntry(key).getValue());
      System.out.println("Closest greater key value: " + tm.ceilingEntry(key).getValue());
    }

    System.out.println();
  }
}
