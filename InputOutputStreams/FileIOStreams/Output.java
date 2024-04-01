import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("Test.txt");
      String str = "Learn Java programming";
      byte[] b = str.getBytes();

      fos.write(b);

      fos.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
