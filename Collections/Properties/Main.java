import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
  public static void main(String[] args) {
    Properties p = new Properties();

    // p.setProperty("Brand", "Huawei");
    // p.setProperty("Processor", "Ryzen 5");
    // p.setProperty("OS", "Windows 11");
    // p.setProperty("Model", "Matebook 16");

    // try {
    // p.storeToXML(new FileOutputStream("./MyData.xml"), "Laptop");
    // } catch (IOException e) {
    // System.out.println("Can't save: " + e);
    // }

    try {
      p.load(new FileInputStream("./MyData.txt"));
      System.out.println(p);
    } catch (IOException e) {
      System.out.println("Can't read: " + e);
    }
  }
}
