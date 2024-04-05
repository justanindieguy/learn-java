import java.io.ByteArrayInputStream;

public class Input {
  public static void main(String[] args) throws Exception {
    byte[] b = new byte[] { 'a', 'b', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
    ByteArrayInputStream bis = new ByteArrayInputStream(b);

    String str = new String(bis.readAllBytes());
    System.out.println(str);

    bis.close();
  }
}
