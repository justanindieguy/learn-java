public class Main {
  public static void show(int... values) {
    for (int value : values) {
      System.out.println(value);
    }
  }

  public static void printProductsList(int listNumber, String... products) {
    String entry = listNumber + ".- ";

    for (int i = 0; i < products.length; i++) {
      if (i < products.length - 1) {
        entry += products[i] + ", ";
        continue;
      }

      entry += products[i] + ".";
    }

    System.out.println(entry);
  }

  public static void main(String args[]) {
    show(10, 20, 30, 40, 50);

    String products[] = { "meat", "apples", "cheese", "milk" };
    printProductsList(1, products);
    printProductsList(2, "soap", "shampoo", "toothpaste", "razor");

    int a = 13;
    System.out.printf("%d\n", a);
  }
}
