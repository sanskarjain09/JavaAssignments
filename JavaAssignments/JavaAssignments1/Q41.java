interface BasicOperations {
  void addition(int a, int b);

  void subtraction(int a, int b);
}

interface AdvancedOperations {
  void multiplication(int a, int b);

  void division(int a, int b);
}

class Calculator implements BasicOperations, AdvancedOperations {

  public void addition(int a, int b) {
    System.out.println("Addition: " + (a + b));
  }

  public void subtraction(int a, int b) {
    System.out.println("Subtraction: " + (a - b));
  }

  public void multiplication(int a, int b) {
    System.out.println("Multiplication: " + (a * b));
  }

  public void division(int a, int b) {
    if (b != 0) {
      System.out.println("Division: " + ((float) a / b));
    } else {
      System.out.println("Cannot divide by zero.");
    }
  }
}

public class Q41 {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    calc.addition(10, 5);
    calc.subtraction(10, 5);

    calc.multiplication(10, 5);
    calc.division(10, 5);
    calc.division(10, 0);
  }
}
