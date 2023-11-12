package ch03_object_oriented_programming_in_java;

/**
 * SealedClassDemo
 */
public class SealedClassDemo {

  public static void main(String[] args) {

  }
}

abstract sealed class Shape permits Circle, Rectangle {
  public abstract double area();
}

final class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }
}

final class Rectangle extends Shape {
  private double width;

  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double area() {
    return width * height;
  }
}
