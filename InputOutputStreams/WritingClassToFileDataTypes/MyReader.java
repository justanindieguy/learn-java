import java.io.DataInputStream;
import java.io.FileInputStream;

public class MyReader {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("Student.txt");
    DataInputStream dis = new DataInputStream(fis);

    Student s = new Student();
    s.setRollNo(dis.readInt());
    s.setName(dis.readUTF());
    s.setDept(dis.readUTF());

    dis.close();
    fis.close();

    System.out.println(s);
  }
}
