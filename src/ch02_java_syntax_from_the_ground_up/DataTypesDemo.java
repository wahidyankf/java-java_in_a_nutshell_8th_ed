package ch02_java_syntax_from_the_ground_up;

/**
 * DataTypesDemo
 */
public class DataTypesDemo {

  public static void main(String[] args) {
    // res: Infinity
    System.out.println(1.0 / 0.0);
    // res: -Infinity
    System.out.println(-1.0 / 0.0);
    // res: -0.0
    System.out.println(-1.0 / (1.0 / 0.0));
    // res: NaN
    System.out.println(0.0 / 0.0);

    // instance of
    System.out.println("-----");

    // res: true
    System.out.println("string" instanceof String);
    // res: true
    System.out.println("" instanceof Object);
    // res: false
    System.out.println(null instanceof String);

    Object o = new int[] { 1, 2, 3 };
    // res: true
    System.out.println(o instanceof int[]);
    // res: false
    System.out.println(o instanceof byte[]);
    // res: true
    System.out.println(o instanceof Object);

    System.out.println("-----");

    var obj = new AccountB();

    if (obj instanceof AccountB) {
      System.out.println("object is an instance of Account");
      obj.printSomething();
    } else {
      System.out.println("object is not an instance of Account");

      // still compiled
      obj.printSomething();
    }

    if (obj instanceof AccountB a) {
      System.out.println("object is an instance of Account");
      a.printSomething();
    } else {
      System.out.println("object is not an instance of Account");
    }

    enum Color {
      RED, GREEN, BLUE
    }

    System.out.println(Color.BLUE);
    System.out.println(Color.GREEN);

  }
}

class AccountB {
  void printSomething() {
    System.out.println("Account");
  }
}