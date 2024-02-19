class Parent {
  int num = 10;

  void display() {
    System.out.println("This is parent class.");
  }
}

class Child extends Parent {
  int num = 20;

  void display() {
    System.out.println("This is child class.");
  }

  void accessVariables() {
    System.out.println("Value of num in parent class: " + super.num);

    System.out.println("Value of num in child class: " + num);
  }

  void callParentMethod() {
    super.display();

    display();
  }
}

public class Q39 {
  public static void main(String[] args) {
    Child obj = new Child();
    obj.accessVariables();
    System.out.println();
    obj.callParentMethod();
  }
}
