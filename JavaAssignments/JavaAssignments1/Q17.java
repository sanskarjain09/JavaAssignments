import java.util.Scanner;

public class Q17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Number of Rows");
    int rows = input.nextInt();
    
      for (int i = rows; i >0; i--) {

          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println(); 
      }
      input.close();
  }
}
