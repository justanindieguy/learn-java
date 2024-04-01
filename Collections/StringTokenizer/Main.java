import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("./Data.txt");
    byte[] b = new byte[fis.available()];
    fis.read(b);

    String data = new String(b);

    fis.close();

    // String data = "name=Vijay address=delhi country=india dept=cse";

    StringTokenizer stk = new StringTokenizer(data, ",");

    String s;
    ArrayList<Integer> numbers = new ArrayList<>();

    while (stk.hasMoreTokens()) {
      s = stk.nextToken();
      numbers.add(Integer.valueOf(s));
    }

    System.out.println(numbers);
  }
}
