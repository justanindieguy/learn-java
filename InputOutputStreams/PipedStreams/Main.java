import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
  public static void main(String[] args) throws Exception {
    PipedInputStream pis = new PipedInputStream();
    PipedOutputStream pos = new PipedOutputStream();

    pis.connect(pos);

    Producer p = new Producer(pos);
    Consumer c = new Consumer(pis);

    p.start();
    c.start();
  }
}
