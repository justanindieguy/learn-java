import java.util.*;

public class ReadFromKeyboard {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String name;
    System.out.print("May I know your name? ");
    name = sc.nextLine();

    System.out.println("Welcome, " + name + "!");

    sc.close();
  }
}
