import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyReader {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("Student");
    ObjectInputStream ois = new ObjectInputStream(fis);

    Student s = (Student) ois.readObject();
    System.out.println(s);

    ois.close();
    fis.close();
  }
}
