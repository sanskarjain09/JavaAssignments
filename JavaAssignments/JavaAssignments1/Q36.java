class Parent {
  public void display() {
    System.out.println("This is parent class.");
  }

  public void greet() {
    System.out.println("Hello!");
  }

  public void greet(String name) {
    System.out.println("Hello, " + name + "!");
  }
}

class Child extends Parent {
  @Override
  public void display() {
    System.out.println("This is child class.");
  }
}

public class Q36 {
  public static void main(String[] args) {
    Parent parent = new Parent();

    Child child = new Child();

    parent.greet();
    parent.greet("Alice");

    child.greet();
    child.greet("Bob");
  }
}
