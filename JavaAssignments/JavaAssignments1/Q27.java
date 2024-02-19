import java.util.Scanner;

public class Q27 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[10];
    System.out.println("Enter 10 numbers:");
    for (int i = 0; i < 10; i++) {
      numbers[i] = scanner.nextInt();
    }
    int highest = numbers[0];
    int lowest = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > highest) {
        highest = numbers[i];
      }
      if (numbers[i] < lowest) {
        lowest = numbers[i];
      }
    }
    System.out.println("Highest number: " + highest);
    System.out.println("Lowest number: " + lowest);

    scanner.close();
  }
}
