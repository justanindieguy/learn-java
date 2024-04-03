import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("Test.txt");
      BufferedReader br = new BufferedReader(fr);

      System.out.print((char) br.read());
      System.out.print((char) br.read());
      System.out.print((char) br.read());
      br.mark(10);
      System.out.print((char) br.read());
      System.out.print((char) br.read());
      br.reset();
      System.out.print((char) br.read());
      System.out.print((char) br.read());
      System.out.println();

      System.out.println("String: " + br.readLine());
      System.out.println("String: " + br.readLine());

      fr.close();
      br.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
