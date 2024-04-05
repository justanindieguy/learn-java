import java.io.RandomAccessFile;

public class Main {
  public static void main(String[] args) throws Exception {
    RandomAccessFile rf = new RandomAccessFile("Data.txt", "rw");
    // byte[] b = new byte[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };

    System.out.println((char) rf.read());
    System.out.println((char) rf.read());
    System.out.println((char) rf.read());

    rf.write('d');
    System.out.println((char) rf.read());

    rf.skipBytes(3);
    System.out.println((char) rf.read());

    rf.seek(3);
    System.out.println((char) rf.read());
    System.out.println("File pointer position: " + rf.getFilePointer());

    rf.seek(rf.getFilePointer() + 2);
    System.out.println((char) rf.read());

    rf.close();
  }
}
