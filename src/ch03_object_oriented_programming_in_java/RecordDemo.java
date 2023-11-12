package ch03_object_oriented_programming_in_java;

/**
 * RecordDemo
 */
public class RecordDemo {

  public static void main(String[] args) {

    Point p = new Point(2.0, -3.5);

    // res: Point[x=2.0, y=-3.5]
    System.out.println(p);

    // res: 2.0
    System.out.println(p.x());
    // res: -3.5
    System.out.println(p.y());

  }
}

record Point(double x, double y) {
  // to set default value
  public Point(double x) {
    this(x, 0.0);
  }

  // compact constructor provides validation
  public Point {
    if (Double.isNaN(x) || Double.isNaN(y)) {
      throw new IllegalArgumentException("Illegal NaN");
    }
  }
}