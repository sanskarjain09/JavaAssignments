abstract class Q40 {

  abstract int sum(int a, int b);

  abstract float sum(float a, float b);

  public static void main(String[] args) {
    Q40 obj = new Implementation();
    int intSum = obj.sum(5, 3);
    System.out.println("Sum of integers: " + intSum);

    float floatSum = obj.sum(5.5f, 3.3f);
    System.out.println("Sum of floats: " + floatSum);
  }
}

class Implementation extends Q40 {

  int sum(int a, int b) {
    return a + b;
  }

  float sum(float a, float b) {
    return a + b;
  }
}
