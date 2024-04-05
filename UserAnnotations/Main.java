import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
  public static void main(String[] args) throws Exception {
    Cat myCat = new Cat("Stella");
    Dog myDog = new Dog("Jerry");

    System.out.println("Cat:");
    checkIfItIsImportant(myCat);
    checkMethods(myCat);
    checkFields(myCat);

    System.out.println("Dog:");
    checkIfItIsImportant(myDog);
  }

  private static <T> void checkIfItIsImportant(T someClass) {
    boolean isImportant = someClass.getClass().isAnnotationPresent(VeryImportant.class);

    if (isImportant) {
      System.out.println("This thing is very important!");
    } else {
      System.out.println("This thing is NOT very important...");
    }
  }

  private static <T> void checkMethods(T object) throws Exception {
    Method[] methods = object.getClass().getDeclaredMethods();

    for (Method method : methods) {
      boolean runImmediately = method.isAnnotationPresent(RunImmediately.class);

      if (runImmediately) {
        RunImmediately annotation = method.getAnnotation(RunImmediately.class);
        int times = annotation.times();

        for (int i = 0; i < times; i++) {
          method.invoke(object);
        }
      }
    }
  }

  private static <T> void checkFields(T object) throws Exception {
    Field[] fields = object.getClass().getDeclaredFields();

    for (Field field : fields) {
      boolean isImportantString = field.isAnnotationPresent(ImportantString.class);

      if (isImportantString) {
        Object objectValue = field.get(object);

        if (objectValue instanceof String stringValue) {
          System.out.println(stringValue);
        }
      }
    }
  }
}
