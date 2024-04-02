
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    String fileContent = readFileContent("Source.txt");
    System.out.println(fileContent);
    writeFile(fileContent.toLowerCase(), "Copy.txt");
  }

  private static String readFileContent(String path) {
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

  private static void writeFile(String content, String fileName) {
    try {
      FileWriter fw = new FileWriter(fileName);
      fw.write(content);
      System.out.println(fileName + " created successfully!");
      fw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
