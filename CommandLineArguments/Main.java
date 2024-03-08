public class Main {
  public static double sumArgs(String[] args) {
    double sum = 0;

    for (String value : args) {
      if (value.matches("[0-9\\.]+")) {
        sum += Double.parseDouble(value);
      }
    }

    return sum;
  }

  public static void main(String[] args) {
    double sum = sumArgs(args);
    System.out.println("Total: " + sum);
  }
}
