package chxx_extra_labs;

public class SealedClassDemo {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    double circleArea = circle.getArea();
    System.out.println("Circle Area: " + circleArea);

    Rectangle rectangle = new Rectangle(4, 6);
    double rectangleArea = rectangle.getArea();
    System.out.println("Rectangle Area: " + rectangleArea);

    Triangle triangle = new Triangle(3, 8);
    double triangleArea = triangle.getArea();
    System.out.println("Triangle Area: " + triangleArea);

    System.out.println(calculateArea(triangle));
  }

  public static double calculateArea(Shape s) {
    return switch (s.getClass().getSimpleName()) {
      case Circle c -> c.getArea();
      case Rectangle r -> r.getArea();
      case Triangle t -> t.getArea();
      default -> throw new IllegalArgumentException("Unexpected value: " + s.getClass().getSimpleName());
    };
  }
}

sealed class Shape permits Circle, Rectangle, Triangle {
}

final class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
}

final class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }
}

final class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getArea() {
    return 0.5 * base * height;
  }
}
