import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Main {
  public static void main(String[] args) {
    mergeFiles("Source1.txt", "Source2.txt", "Destination.txt");
  }

  private static void mergeFiles(String fileOnePath, String fileTwoPath, String fileName) {
    try {
      FileInputStream fis1 = new FileInputStream(fileOnePath);
      FileInputStream fis2 = new FileInputStream(fileTwoPath);
      SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

      FileOutputStream fos = new FileOutputStream(fileName);

      int x;
      while ((x = sis.read()) != -1) {
        fos.write(x);
      }

      fis1.close();
      fis2.close();
      fos.close();
      sis.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
