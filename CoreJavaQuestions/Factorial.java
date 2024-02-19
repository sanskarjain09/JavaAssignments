import java.util.Scanner;
class Factorial{
int fact(int n){
int result = 1;
int i = 2;
if((n == 0) || (n == 1)){
return 1; 
}
while(i<=n){
result *= i;
i++;
}
return result; 
} 
public static void main(String []args){
Scanner input = new Scanner(System.in);
Factorial fact = new Factorial();
System.out.println("Enter A number");
int number = input.nextInt();
int result = fact.fact(number);
System.out.println("Factorial of number "+ number + " is "+ result);
input.close();
}}