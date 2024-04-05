public class MyClass {
  @SafeVarargs
  private <T> void show(T... args) {
    for (T x : args) {
      System.out.println(x);
    }
  }
}
