public class Q42 {

  final int MAX_VALUE = 100;

  final void display() {
    System.out.println("This is a final method.");
  }

  public static void main(String[] args) {
    Q42 obj = new Q42();

    System.out.println("Max value: " + obj.MAX_VALUE);

    obj.display();
  }
}
