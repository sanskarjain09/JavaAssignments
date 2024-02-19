import java.util.Scanner;

class Q22 {
  int sumOfDigit(int n) {
    int sum = 0;
    while (n > 0) {
      int reminder = n % 10;
      sum += reminder;
      n /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Q22 sd = new Q22();
    System.out.println("Enter the Number");
    int number = input.nextInt();
    int result = sd.sumOfDigit(number);
    System.out.println("Sum of digits of the number " + number + " is " + result);
    input.close();
  }
}