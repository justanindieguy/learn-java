import java.lang.reflect.Field;
import java.util.Scanner;

public class ProductReflection {
  public static Product[] requestFields() throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length: ");
    int length = sc.nextInt();
    sc.nextLine();

    Product[] products = new Product[length];

    for (int i = 0; i < length; i++) {
      Product p = new Product();
      Field[] fields = p.getClass().getDeclaredFields();

      for (Field f : fields) {
        System.out.print("Value of " + f.getName() + ": ");
        f.setAccessible(true);

        if (f.getType().equals(String.class)) {
          f.set(p, sc.nextLine());
        } else if (f.getType().equals(Integer.TYPE)) {
          f.set(p, sc.nextInt());
          sc.nextLine();
        }
      }

      products[i] = p;
    }

    sc.close();

    return products;
  }
}
