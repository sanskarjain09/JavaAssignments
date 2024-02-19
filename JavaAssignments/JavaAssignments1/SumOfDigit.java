import java.util.Scanner;
class SumOfDigit{
int sumOfDigit(int n){
int sum = 0; 
while(n>0){
int reminder = n%10;
sum+=reminder;
n/=10;
}
return sum;
} 
public static void main(String []args){
Scanner input = new Scanner(System.in);
SumOfDigit sd = new SumOfDigit();
System.out.println("Enter the Number");
int number = input.nextInt();
int result = sd.sumOfDigit(number);
System.out.println("Sum of digits of the number " + number + " is " + result); 
}}