import java.util.Scanner;

public class Q20B {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows");
    int rows = input.nextInt();
    for (int i = 1; i <= rows; i++) {

      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }

      for (int k = i; k <= rows; k++) {
        System.out.print(k + " ");
      }

      System.out.println();
    }
    for (int i = rows; i > 0; i--) {

      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }

      for (int k = i; k <= rows; k++) {
        System.out.print(k + " ");
      }

      System.out.println();
    }

    input.close();
  }
}
