package ch02_java_syntax_from_the_ground_up;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * ClassesAndObjectsDemo
 */
public class ClassesAndObjectsDemo {

  public static void main(String[] args) {
    System.out.println("constructor demo");

    Account a = new Account("John Doe", 100.0, 12345);

    LocalDateTime d = LocalDateTime.now();

    Set<String> words = new HashSet<>();

    System.out.println(a);
    System.out.println(d);
    System.out.println(words);

    System.out.println("-----");
    System.out.println("using an object");

    double b = a.balance;
    b = 200.0;

    System.out.println("b: " + b);
    System.out.println("a.balance: " + a.balance);

    a.balance = a.balance + 10.0;
    System.out.println(a.balance);

    System.out.println("-----");

    System.out.println("class type");

    Class<?> typeInt = int.class;
    Class<?> typeIntArray = int[].class;
    Class<?> typeAccount = Account.class;

    System.out.println(typeInt);
    System.out.println(typeIntArray);
    System.out.println(typeAccount);

    // res: true
    System.out.println(typeAccount == a.getClass());

    int[] primes = { 2, 3, 5, 7, 11, 13 };

    try {
      System.out.println(primes[100]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught: " + e);
    }

    int[] primesCopyTarget = new int[primes.length];

    System.arraycopy(primes, 0, primesCopyTarget, 0, primes.length);

    for (int i : primesCopyTarget) {
      System.out.println(i);
    }

    System.out.println("-----");
    System.out.println("equality and identity");

    System.out.println("it will not print if we use ==, because it compares the identity of the object");

    String letter = "o";
    String s = "hello";
    String t = "hell" + letter;
    // not printing
    if (s == t)
      System.out.println("equal");

    byte[] aByte = { 1, 2, 3 };
    byte[] bByte = (byte[]) aByte.clone();
    // not printing
    if (aByte == bByte)
      System.out.println("equal");

    System.out.println("but it will print if we use equals(), because it compares the value of the object");
    if (s.equals(t))
      System.out.println("equal");
    if (aByte.equals(bByte))
      System.out.println("equal");

    System.out.println(aByte.equals(bByte));

    for (byte c : aByte) {
      System.out.println(c);
    }
    for (byte c : bByte) {
      System.out.println(c);
    }

  }

}

class Account {
  public String name;
  public double balance;
  public int accountId;

  public Account(String name, double openingBalance, int id) {
    this.name = name;
    this.balance = openingBalance;
    this.accountId = id;
  }

}