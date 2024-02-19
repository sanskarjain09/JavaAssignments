public class Q33 {
  private static int staticVariable = 0;
  private int instanceVariable;

  public static void staticMethod() {
    System.out.println("Static method called.");
  }

  public void instanceMethod() {
    System.out.println("Instance method called.");
  }

  public Q33(int instanceVariable) {
    this.instanceVariable = instanceVariable;
  }

  public static void main(String[] args) {
    System.out.println("Accessing static variable using class name: " + Q33.staticVariable);
    Q33.staticMethod();
    Q33 obj = new Q33(42);
    System.out.println("Accessing instance variable using object: " + obj.instanceVariable);
    obj.instanceMethod();
  }
}
