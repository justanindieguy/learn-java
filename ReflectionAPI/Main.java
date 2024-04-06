import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Product[] products = GenericScanner.start(Product.class, sc);

    for (Product p : products) {
      System.out.println(p);
    }

    Person[] persons = GenericScanner.start(Person.class, sc);

    for (Person p : persons) {
      System.out.println(p);
    }

    sc.close();
  }
}
