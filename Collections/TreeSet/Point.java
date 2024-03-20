public class Point implements Comparable<Point> {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  @Override
  public int compareTo(Point p) {
    if (x != p.x) {
      return x - p.x;
    }

    return y - p.y;
  }
}
