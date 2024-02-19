import java.util.Scanner;

public class Q3R {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter five numbers:");

    double sum = 0;
    for (int i = 0; i < 5; i++) {
      System.out.print("Number " + (i + 1) + ": ");
      double number = scanner.nextDouble();
      sum += number;
    }

    double average = sum / 5;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);

    scanner.close();
  }
}
