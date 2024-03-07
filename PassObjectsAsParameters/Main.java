public class Main {
  // Returning primitive value.
  public static int max(int x, int y) {
    return x > y ? x : y;
  }

  // Returning object from method.
  public static String getUserName(String email) {
    int atSignIdx = email.indexOf("@");
    String username = email.substring(0, atSignIdx);

    return username;
  }

  public static void updateObject(int arr[]) {
    if (arr.length == 0) {
      return;
    }

    // Reference to the object, actual value in memory will be updated.
    arr[0] = 25;
  }

  public static void updatePrimitive(int x, int value) {
    // Value in memory won't be updated for primitive types.
    x = value;
  }

  public static void main(String args[]) {
    int numbers[] = { 2, 3, 4, 5, 6 };

    updateObject(numbers);
    System.out.println("New value: " + numbers[0]); // Output: "New value: 25"

    int x = 10;
    updatePrimitive(x, 20);
    System.out.println("New primitive value: " + x); // Output: "New primitive value: 20"

    int a = 10, b = 15, c;
    c = max(a, b);
    System.out.println("Maximum value: " + c);

    String email = "calcetin.izquierdo@gmail.com";
    System.out.println("Username: " + getUserName(email));
  }
}
