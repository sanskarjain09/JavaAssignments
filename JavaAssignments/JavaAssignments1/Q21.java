import java.util.Scanner;

class Q21 {
  int reverseDigits(int a) {
    int result = 0;
    while (a > 0) {
      int temp = a % 10;
      result += temp;
      a /= 10;
      if (a > 0) {
        result *= 10;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Number");
    int number = input.nextInt();
    Q21 obj = new Q21();
    int result = obj.reverseDigits(number);
    System.out.println("Reverse of the number " + number + " is " + result);
    input.close();
  }
}