import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true) {
      @Override
      protected boolean removeEldestEntry(Map.Entry<Integer, String> e) {
        return size() > 5;
      }
    };

    lhm.put(1, "A");
    lhm.put(2, "B");
    lhm.put(3, "C");
    lhm.put(4, "D");
    lhm.put(5, "E");

    String s = lhm.get(2);
    s = lhm.get(5);
    s = lhm.get(1);
    System.out.println("Most recently accessed: " + s);

    lhm.put(6, "F");

    // 3, C should not appear since it is the least accessed entry
    lhm.forEach((key, value) -> System.out.println(key + ", " + value));
  }
}
