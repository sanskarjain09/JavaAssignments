import java.util.Scanner;

class Q5 {
  void greaterOfThree(int a, int b, int c) {
    if (a > b) {
      if (a > c) {
        System.out.println("a is greater :- " + a);
      } else {
        System.out.println("c is greater :- " + c);
      }
    } else {
      if (b > c) {
        System.out.println("b is greater :- " + b);
      } else {
        System.out.println("c is greater :- " + c);
      }
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Three Numbers");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    Q5 obj = new Q5();
    obj.greaterOfThree(a, b, c);
    input.close();
  }
}