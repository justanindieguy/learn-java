import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<Integer>(List.of(10, 20, 30));

    LinkedList<Integer> list2 = new LinkedList<Integer>(List.of(40, 50, 60));

    list1.addFirst(5);
    list1.addAll(list2);
    list1.set(list1.size() - 1, 100);
    list1.addLast(200);

    System.out.println("First element: " + list1.peekFirst());
    System.out.println("Last element: " + list1.peekLast());

    System.out.println(list1);
  }
}
