import java.util.List;

public class Main {
  static List l;

  @SuppressWarnings({ "deprecation", "unchecked" })
  public static void main(String[] args) {
    Child c = new Child();
    c.display();

    OldClass oc = new OldClass();
    oc.show(); // <- Deprecated

    l.add(10);

    MyClass mc = new MyClass();
  }
}
