import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Output {
  public static void main(String[] args) throws Exception {
    ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
    bos.write('a');
    bos.write('b');
    bos.write('c');
    bos.write('d');

    bos.writeTo(new FileOutputStream("Output.txt"));

    bos.close();
  }
}
