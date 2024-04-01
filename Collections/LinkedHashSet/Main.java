import java.util.LinkedHashSet;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

    lhs.add("A");
    lhs.add("C");
    lhs.add("E");
    lhs.add("K");
    lhs.add("B");
    lhs.add("G");

    // Duplicated value
    lhs.add("B");

    Iterator<String> itr = lhs.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
