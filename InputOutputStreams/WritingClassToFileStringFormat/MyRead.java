import java.io.BufferedReader;
import java.io.FileReader;

public class MyRead {
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("My.txt");
    BufferedReader br = new BufferedReader(fr);

    Student s = new Student();
    s.setRollNo(Integer.parseInt(br.readLine()));
    s.setName(br.readLine());
    s.setDept(br.readLine());

    br.close();
    fr.close();

    System.out.println(s);
  }
}
