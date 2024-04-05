import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class MyWriter {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("Student.txt");
    DataOutputStream dos = new DataOutputStream(fos);

    Student s = new Student(10, "John", "CSE");

    dos.writeInt(s.getRollNo());
    dos.writeUTF(s.getName());
    dos.writeUTF(s.getDept());

    fos.close();
    dos.close();
  }
}
