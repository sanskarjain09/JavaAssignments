import java.util.Scanner;

class EvenOddCheck{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number");
int number = input.nextInt();
if((number % 2) == 0){
System.out.println("Number is Even");
}
else{
System.out.println("Number is Odd");
}
}
}