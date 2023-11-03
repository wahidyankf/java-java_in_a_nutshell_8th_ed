package ch02_java_syntax_from_the_ground_up;

/**
 * FlowControlDemo
 */
public class FlowControlDemo {
  public static void main(String[] args) {
    String username = Math.random() > 0.5 ? "John Doe" : null;

    if (username == null) {
      username = "John Doe";
    } else {
      System.out.println("username is not null");
    }
  }
}