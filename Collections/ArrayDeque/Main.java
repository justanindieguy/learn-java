import java.util.ArrayDeque;

public class Main {
  public static void main(String[] args) {
    ArrayDeque<Integer> dq = new ArrayDeque<>();

    dq.addLast(10);
    dq.addLast(20);
    dq.addLast(30);
    System.out.println(dq);

    dq.removeFirst();
    System.out.println(dq);

    ArrayDeque<Integer> stack = new ArrayDeque<>();

    stack.addFirst(10);
    stack.addFirst(20);
    stack.addFirst(30);
    System.out.println(stack);

    stack.removeFirst();
    System.out.println(stack);
  }
}
