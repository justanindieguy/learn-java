import java.io.FileOutputStream;
import java.io.PrintStream;

public class MyWrite {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("My.txt");
    PrintStream ps = new PrintStream(fos);

    Student s = new Student(10, "John", "CSE");

    ps.println(s.getRollNo());
    ps.println(s.getName());
    ps.println(s.getDept());

    ps.close();
    fos.close();
  }
}
