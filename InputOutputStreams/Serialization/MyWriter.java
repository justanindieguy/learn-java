import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MyWriter {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("Student");
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    Student s = new Student(10, "John", "CSE");
    oos.writeObject(s);

    oos.close();
    fos.close();
  }
}
