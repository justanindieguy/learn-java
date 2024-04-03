import java.io.CharArrayReader;

public class Reader {
  public static void main(String[] args) throws Exception {
    char[] c = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
    CharArrayReader cr = new CharArrayReader(c);

    int b;
    while ((b = cr.read()) != -1) {
      System.out.println((char) b);
    }

    cr.close();
  }
}
