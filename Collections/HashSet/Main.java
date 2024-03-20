import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>(20, 0.5f);

    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(10);

    System.out.println("Elements in HashSet:");
    hs.forEach(x -> System.out.println(x));

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter key: ");
    int k = sc.nextInt();

    System.out.println("HashSet contains " + k + ": " + hs.contains(k));

    sc.close();
  }
}
