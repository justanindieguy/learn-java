public class Main {
  public static void main(String[] args) {
    Super s = new Sub();
    s.methodOne();
    s.methodTwo();

    // Can't call this method since it is not defined in Super class
    // s.methodThree();
  }
}
