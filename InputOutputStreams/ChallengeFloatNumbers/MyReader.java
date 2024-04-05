import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Arrays;

public class MyReader {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("Data.txt");
    DataInputStream dis = new DataInputStream(fis);

    int length = dis.readInt();
    float[] list = new float[length];

    for (int i = 0; i < length; i++) {
      list[i] = dis.readFloat();
    }

    System.out.println(Arrays.toString(list));

    dis.close();
    fis.close();
  }
}
