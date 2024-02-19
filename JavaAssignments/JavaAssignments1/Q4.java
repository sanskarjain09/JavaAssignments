import java.util.Scanner;
class Q4{
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Two Numbers");
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println("Sum of number is "+ (a+b));
    input.close();
  }
}