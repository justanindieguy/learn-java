
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    copyFileContents("Source.txt", "Copy.txt");
  }

  private static void copyFileContents(String sourcePath, String fileName) {
    try {
      FileReader fr = new FileReader(sourcePath);
      FileWriter fw = new FileWriter(fileName);

      int currentByte;
      while ((currentByte = fr.read()) != -1) {
        // If currentCharacter is upperCase letter
        if (currentByte >= 65 && currentByte <= 120) {
          fw.write(currentByte + 32);
        } else {
          fw.write(currentByte);
        }
      }

      fr.close();
      fw.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
