import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    sc.close();

    String msg = howMany(n);
    System.out.println("howMany says: " + msg);
  }

  public static String howMany(int n) {
    return switch (n) {
      case 0 -> "No data!";
      case 1 -> {
        System.out.println("Case 1");
        yield "1 entry";
      }
      case 2 -> "2 entries";
      case 3, 4, 5 -> "There are less than 6 entries";
      default -> "Too many entries!";
    };
  }
}
