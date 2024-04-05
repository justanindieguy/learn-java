import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class MyReader {
  public static void main(String[] args) {
    String name = askCustomerName();
    Customer[] customers = readCustomers();

    for (Customer c : customers) {
      if (name.equalsIgnoreCase(c.getName())) {
        System.out.println(c);
      }
    }
  }

  private static Customer[] readCustomers() {
    try {
      FileInputStream fis = new FileInputStream("Customers");
      ObjectInputStream ois = new ObjectInputStream(fis);

      int length = ois.readInt();
      Customer[] customers = new Customer[length];

      for (int i = 0; i < length; i++) {
        customers[i] = (Customer) ois.readObject();
      }

      ois.close();
      fis.close();

      return customers;
    } catch (Exception e) {
      return new Customer[0];
    }
  }

  private static String askCustomerName() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter customer name: ");
    String name = sc.nextLine();

    sc.close();

    return name;
  }
}
