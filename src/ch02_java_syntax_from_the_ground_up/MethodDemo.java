package ch02_java_syntax_from_the_ground_up;

/**
 * MethodDemo
 */
public class MethodDemo {
  public static void main(String[] args) {

    System.out.println(max(1, 2, 3, 4, 5, 100, 7, 8, 9, 10));

  }

  public static int max(int first, int... rest) {
    int max = first;
    for (int i : rest) {
      if (i > max)
        max = i;
    }

    return max;
  }

}