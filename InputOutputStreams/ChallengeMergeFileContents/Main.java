import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    String sourceOne = readFileContents("Source1.txt");
    String sourceTwo = readFileContents("Source2.txt");

    String fileName = "Destination.txt";
    writeFile(fileName, sourceOne, sourceTwo);
  }

  private static String readFileContents(String path) {
    try {
      FileReader fr = new FileReader(path);

      int x;
      StringBuilder sb = new StringBuilder();
      while ((x = fr.read()) != -1) {
        sb.append((char) x);
      }

      fr.close();
      return sb.toString();
    } catch (FileNotFoundException e) {
      System.out.println(e);
      return "";
    } catch (IOException e) {
      System.out.println(e);
      return "";
    }
  }

  private static void writeFile(String fileName, String... contents) {
    try {
      FileWriter fw = new FileWriter(fileName);

      for (String str : contents) {
        fw.write(addLineBreakIfNeeded(str));
      }

      fw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  private static String addLineBreakIfNeeded(String str) {
    if (str.charAt(str.length() - 1) != '\n') {
      return str + '\n';
    }

    return str;
  }
}
