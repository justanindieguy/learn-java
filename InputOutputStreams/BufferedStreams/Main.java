import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("Test.txt");
      BufferedInputStream bis = new BufferedInputStream(fis);

      System.out.println("FileInputStream mark supported: " + fis.markSupported());
      System.out.println("BufferedInputStream mark supported: " + bis.markSupported());

      int b;
      while ((b = bis.read()) != -1) {
        System.out.print((char) b);
      }

      fis.close();
      bis.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
