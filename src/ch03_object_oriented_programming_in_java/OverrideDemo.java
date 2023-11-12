package ch03_object_oriented_programming_in_java;

/**
 * OverrideDemo
 */
public class OverrideDemo {
  public static void main(String[] args) {

  }

}

class SportsCar extends Car {
  private double efficiency;

  public SportsCar(double topSpeed) {
    super(topSpeed, 50.0, 2);
    if (topSpeed > 200.0) {
      efficiency = 200.0 / topSpeed;
    } else {
      efficiency = 1.0;
    }
  }

  public double getEfficiency() {
    return efficiency;
  }

  @Override
  public double range() {
    return 100 * fuelTankCapacity * efficiency / LITRE_PER_100KM;
  }
}

class Car {
  public static final double LITRE_PER_100KM = 8.9;

  protected double topSpeed;

  protected double fuelTankCapacity;

  private int doors;

  public Car(double topSpeed, double fuelTankCapacity,
      int doors) {
    this.topSpeed = topSpeed;
    this.fuelTankCapacity = fuelTankCapacity;
    this.doors = doors;
  }

  public double getTopSpeed() {
    return topSpeed;
  }

  public int getDoors() {
    return doors;
  }

  public double getFuelTankCapacity() {
    return fuelTankCapacity;
  }

  public double range() {
    return 100 * fuelTankCapacity / LITRE_PER_100KM;
  }
}