import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MyWriter {
  public static void main(String[] args) throws Exception {
    Customer[] customers = new Customer[] {
        new Customer("John", "1234567890"),
        new Customer("Paul", "0987654321"),
        new Customer("Jane", "5903450290"),
    };

    FileOutputStream fos = new FileOutputStream("Customers");
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    oos.writeInt(customers.length);

    for (Customer c : customers) {
      oos.writeObject(c);
    }

    oos.close();
    fos.close();
  }
}
