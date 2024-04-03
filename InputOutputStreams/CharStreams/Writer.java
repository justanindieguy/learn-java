import java.io.CharArrayWriter;
import java.util.Arrays;

public class Writer {
  public static void main(String[] args) throws Exception {
    CharArrayWriter cw = new CharArrayWriter();

    cw.write('a');
    cw.write('b');
    cw.write('c');

    String str = "def";
    cw.write(str);

    System.out.println(cw.toString());

    char[] chars = cw.toCharArray();
    System.out.println(Arrays.toString(chars));

    cw.close();
  }
}
