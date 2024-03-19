import java.util.List;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) {
    List<Integer> l = List.of(20, 10, 30, 5, 15, 3);

    // Min Priority Queue
    PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<>(l);

    System.out.println("Min Priority Queue:");
    System.out.println("Head: " + minPriorityQueue.peek());
    System.out.println(minPriorityQueue);

    minPriorityQueue.poll();
    System.out.println(minPriorityQueue);
    System.out.println();

    // Max Priority Queue
    PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(new MaxComparator());
    maxPriorityQueue.addAll(l);

    System.out.println("Max Priority Queue:");
    System.out.println("Head: " + maxPriorityQueue.peek());
    System.out.println(maxPriorityQueue);

    maxPriorityQueue.poll();
    System.out.println(maxPriorityQueue);
  }
}
