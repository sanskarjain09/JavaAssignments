import java.util.Scanner;

public class Q19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows");
    int rows = input.nextInt();
    for (int i = 1; i <= rows; i++) {

      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }

      for (int k = i; k <= rows; k++) {
        System.out.print("* ");
      }

      System.out.println();
    }
    input.close();
  }
}
