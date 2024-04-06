import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericScanner {
  public static <T> T[] start(Class<T> genericClass, Scanner sc) {
    try {
      return startCapture(genericClass, sc);
    } catch (Exception e) {
      Logger.getLogger(GenericScanner.class.getName()).log(Level.SEVERE, null, e);
      return null;
    }
  }

  @SuppressWarnings("unchecked")
  private static <T> T[] startCapture(Class<T> genericClass, Scanner sc) throws Exception {
    System.out.print("Enter length: ");
    int length = sc.nextInt();
    sc.nextLine();

    T[] elements = (T[]) Array.newInstance(genericClass, length);

    for (int i = 0; i < length; i++) {
      T element = genericClass.getDeclaredConstructor().newInstance();
      Field[] fields = element.getClass().getDeclaredFields();

      for (Field f : fields) {
        System.out.print("Value of " + f.getName() + ": ");
        f.setAccessible(true);

        if (f.getType().equals(String.class)) {
          f.set(element, sc.nextLine());
        } else if (f.getType().equals(Long.class)) {
          f.set(element, sc.nextLong());
          sc.nextLine();
        } else if (f.getType().equals(Integer.TYPE)) {
          f.set(element, sc.nextInt());
          sc.nextLine();
        } else if (f.getType().equals(Double.TYPE)) {
          f.set(element, sc.nextDouble());
          sc.nextLine();
        } else if (f.getType().equals(Float.TYPE)) {
          f.set(element, sc.nextFloat());
          sc.nextLine();
        } else {
          System.out.println(f.getType().getSimpleName());
        }
      }

      elements[i] = element;
    }

    return elements;
  }
}
