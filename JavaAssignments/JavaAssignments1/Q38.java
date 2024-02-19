import java.util.Scanner;

class ThreeDObject {

  public double wholeSurfaceArea() {
    return 0.0;
  }

  public double volume() {
    return 0.0;
  }
}

class Box extends ThreeDObject {
  private double length, width, height;

  public Box(double l, double w, double h) {
    length = l;
    width = w;
    height = h;
  }

  @Override
  public double wholeSurfaceArea() {
    return 2 * (length * width + width * height + height * length);
  }

  @Override
  public double volume() {
    return length * width * height;
  }
}

class Cube extends ThreeDObject {
  private double side;

  public Cube(double s) {
    side = s;
  }

  @Override
  public double wholeSurfaceArea() {
    return 6 * side * side;
  }

  @Override
  public double volume() {
    return side * side * side;
  }
}

class Cylinder extends ThreeDObject {
  private double radius, height;

  public Cylinder(double r, double h) {
    radius = r;
    height = h;
  }

  @Override
  public double wholeSurfaceArea() {
    return 2 * Math.PI * radius * (radius + height);
  }

  @Override
  public double volume() {
    return Math.PI * radius * radius * height;
  }
}

class Cone extends ThreeDObject {
  private double radius, height;

  public Cone(double r, double h) {
    radius = r;
    height = h;
  }

  @Override
  public double wholeSurfaceArea() {
    double l = Math.sqrt(radius * radius + height * height);
    return Math.PI * radius * (radius + l);
  }

  @Override
  public double volume() {
    return (Math.PI * radius * radius * height) / 3;
  }
}

public class Q38 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Choose the type of 3D object:");
    System.out.println("1. Box");
    System.out.println("2. Cube");
    System.out.println("3. Cylinder");
    System.out.println("4. Cone");
    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        System.out.println("Enter dimensions of the box (length, width, height):");
        double l = scanner.nextDouble();
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        Box box = new Box(l, w, h);
        System.out.println("Volume of the box: " + box.volume());
        System.out.println("Whole surface area of the box: " + box.wholeSurfaceArea());
        break;
      case 2:
        System.out.println("Enter the side of the cube:");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Volume of the cube: " + cube.volume());
        System.out.println("Whole surface area of the cube: " + cube.wholeSurfaceArea());
        break;
      case 3:
        System.out.println("Enter the dimensions of the cylinder (radius, height):");
        double r = scanner.nextDouble();
        double cyHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(r, cyHeight);
        System.out.println("Volume of the cylinder: " + cylinder.volume());
        System.out.println("Whole surface area of the cylinder: " + cylinder.wholeSurfaceArea());
        break;
      case 4:
        System.out.println("Enter the dimensions of the cone (radius, height):");
        double radius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(radius, coneHeight);
        System.out.println("Volume of the cone: " + cone.volume());
        System.out.println("Whole surface area of the cone: " + cone.wholeSurfaceArea());
        break;
      default:
        System.out.println("Invalid choice.");
    }

    scanner.close();
  }
}
