import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<Integer>(
        List.of(10, 10, 20));

    ArrayList<Integer> list2 = new ArrayList<Integer>(
        List.of(50, 60, 70, 80, 90));

    list1.add(0, 10);
    list1.addAll(list2);

    System.out.println(list1);

    // Get element at index i
    System.out.println("Element at 5th index: " + list1.get(5));
    System.out.println("Element at last index: " + list1.get(list1.size() - 1));

    System.out.println("First index of 10: " + list1.indexOf(10));
    System.out.println("Last index of 10: " + list1.lastIndexOf(10));

    // Get index of element, if not found -1
    System.out.println("Index of 70: " + list1.indexOf(70));
    System.out.println("Index of 100: " + list1.indexOf(100));

    // Check if an element is present in the list
    System.out.println("Contains 50? " + list1.contains(50));
    System.out.println("Contains 25? " + list1.contains(25));

    // Update an element at a given index
    list1.set(list1.size() - 1, 100);
    System.out.println(list1);

    // Iterating over an ArrayList
    forLoop(list1);
    forEach(list1);
    iteratorLoop(list1);
    lambdaTraversing(list1);

    // Print only the elements greater than 60
    list1.forEach((x) -> show(x));
    System.out.println();
  }

  static <T> void forLoop(ArrayList<T> l) {
    System.out.println("For loop:");

    for (int i = 0; i < l.size(); i++) {
      System.out.print(l.get(i) + " ");
    }

    System.out.println();
  }

  static <T> void forEach(ArrayList<T> l) {
    System.out.println("For-each loop:");

    for (T el : l) {
      System.out.print(el + " ");
    }

    System.out.println();
  }

  static <T> void iteratorLoop(ArrayList<T> l) {
    System.out.println("Iterator loop:");

    for (ListIterator<T> it = l.listIterator(); it.hasNext();) {
      T el = it.next();
      System.out.print(el + " ");
    }

    System.out.println();
  }

  static <T> void lambdaTraversing(ArrayList<T> l) {
    System.out.println("Lambda traversing:");

    l.forEach(el -> System.out.print(el + " "));
    System.out.println();
  }

  static void show(int n) {
    if (n > 60) {
      System.out.print(n + " ");
    }
  }
}
