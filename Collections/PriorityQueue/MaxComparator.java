import java.util.Comparator;

public class MaxComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer a, Integer b) {
    return b - a;
  }
}
