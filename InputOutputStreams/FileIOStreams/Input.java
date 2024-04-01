import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
  public static void main(String[] args) {
    try {
      FileInputStream fr = new FileInputStream("Test.txt");
      byte[] b = new byte[fr.available()];
      fr.read(b);

      System.out.println(new String(b));

      fr.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
