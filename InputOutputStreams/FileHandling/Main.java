import java.io.File;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws Exception {
    listCurrentWorkingDirectory();

    File f = new File("Test.txt");
    f.setReadOnly();
  }

  private static void listCurrentWorkingDirectory() {
    File currentWorkingDirectory = new File(".");
    System.out.println("Is directory? " + currentWorkingDirectory.isDirectory());

    File[] list = currentWorkingDirectory.listFiles();

    System.out.println("Files in current working directory:");
    for (File f : list) {
      try {
        System.out.println(f.getName() + " " + f.getCanonicalPath());
      } catch (IOException e) {
        System.out.println(e);
      }
    }
  }
}
