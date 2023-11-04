package ch02_java_syntax_from_the_ground_up;

/**
 * FlowControlDemo
 */
public class FlowControlDemo {
  public static void main(String[] args) {
    String username = Math.random() > 0.5 ? "John Doe" : null;

    System.out.println("-----");

    if (username == null) {
      username = "John Doe";
    } else if (username == "Joe") {
      System.out.println("username is Joe");
    } else {
      System.out.println("username is not null");
    }

    System.out.println("-----");

    System.out.println("switch statement");

    int n = 10;

    switch (n) {
      case 1:
        System.out.println("n is 1");
        break;
      case 2:
        System.out.println("n is 2");
        break;
      default:
        System.out.println("n is not 1 or 2");
    }

    System.out.println("switch expression");

    String input = "y";

    boolean yesOrNo = switch (input) {
      case "y" -> true;
      case "Y" -> true;
      case "N" -> false;
      case "n" -> false;
      default -> throw new IllegalArgumentException("Y or N");
    };

    boolean yesOrNo2 = switch (input) {
      case "y", "Y" -> true;
      case "N", "n" -> false;
      default -> throw new IllegalArgumentException("Y or N");
    };

    System.out.println(yesOrNo);
    System.out.println(yesOrNo2);

    System.out.println("-----");

    System.out.println("> while loop");

    int count = 0;
    while (count < 5) {
      System.out.println(count);
      count++;
    }

    System.out.println("> do-while loop");

    count = 0;
    do {
      System.out.println(count);
      count++;
    } while (count < 5);

    System.out.println("> for loop");

    for (count = 0; count < 5; count++) {
      System.out.println(count);
    }

    System.out.println("--");

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    System.out.println("--");

    for (int i = 0, j = 0; i < 5; i++, j++) {
      System.out.println(i * j);
    }

    System.out.println("-----");

    System.out.println("for-each statement");

    int[] numbers = { 1, 2, 3, 4, 5 };
    for (int number : numbers) {
      System.out.println(number);
    }

  }

  boolean parseYesOrNoResponse(char response) {
    switch (response) {
      case 'y':
      case 'Y':
        return true;
      case 'n':
      case 'N':
        return false;
      default:
        throw new IllegalArgumentException("Illegal response");
    }
  }
}