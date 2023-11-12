package ch03_object_oriented_programming_in_java;

/**
 * StaticInitializerDemo
 */
public class StaticInitializerDemo {

  public static void main(String[] args) {

    // res: 500
    System.out.println(TrigCircle.sines.length);
  }
}

// We can draw the outline of a circle using trigonometric functions
// Trigonometry is slow, though, so we precompute a bunch of values
class TrigCircle {
  // Here are our static lookup tables and their own initializers
  static final int NUMPTS = 500;
  static double sines[] = new double[NUMPTS];
  static double cosines[] = new double[NUMPTS];

  // Here's a static initializer that fills in the arrays
  static {
    double delta_x = (Math.PI / 2) / (NUMPTS - 1);

    for (int i = 0; i < NUMPTS; i++) {
      double x = i * delta_x;
      sines[i] = Math.sin(x);
      cosines[i] = Math.cos(x);
    }
  }
  // The rest of the class is omitted...
}
