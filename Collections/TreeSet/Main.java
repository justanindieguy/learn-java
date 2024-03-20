import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    TreeSet<Integer> ts = new TreeSet<>(
        List.of(10, 30, 50, 70, 10, 40));

    ts.add(25);

    System.out.println("Integer TreeSet:");
    System.out.println(ts);

    searchInput(ts);
    System.out.println();

    TreeSet<Point> points = new TreeSet<>();
    points.add(new Point(1, 1));
    points.add(new Point(5, 5));
    points.add(new Point(5, 2));

    System.out.println("Point TreeSet:");
    System.out.println(points);
  }

  private static void searchInput(TreeSet<Integer> ts) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter key: ");
    int key = sc.nextInt();

    int value = ts.ceiling(key);

    if (value == key) {
      System.out.println(value + " is present in TreeSet");
    } else {
      System.out.println("Closest smaller value: " + ts.floor(key));
      System.out.println("Closest greater value: " + value);
    }

    sc.close();
  }
}
