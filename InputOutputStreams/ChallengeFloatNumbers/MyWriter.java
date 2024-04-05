import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class MyWriter {
  public static void main(String[] args) throws Exception {
    float[] list = new float[] { 10.5f, 2.9f, 6.4f, 3.7f };

    FileOutputStream fos = new FileOutputStream("Data.txt");
    DataOutputStream dos = new DataOutputStream(fos);

    dos.writeInt(list.length);

    for (float f : list) {
      dos.writeFloat(f);
    }

    dos.close();
    fos.close();
  }
}
