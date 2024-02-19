import java.util.Scanner;
class BitwiseEvenOddCheck{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number");
int number = input.nextInt();
if((number & 1) == 1){
System.out.println("Number " + number + " is Odd");
}
else{
System.out.println("Number " + number + " is Even");
}
}}