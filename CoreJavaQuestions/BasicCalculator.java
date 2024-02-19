import java.util.Scanner;
class BasicCalculator{
void basicCalculator(int m, int n , String a){
switch(a){
case "+":
System.out.println("Addition is :- "+ (m+n));
break;
case "-":
System.out.println("Substraction is :- "+(m-n));
break;
case "*":
System.out.println("Multiplication is :- "+(m*n));
break;
case "/":
System.out.println("Division :- "+(m/n));
break;
case "%":
System.out.println("Remainder :- "+(m%n));
break;
default:
System.out.println("Select Correct Operator");
}
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Number1 and Number2 and Operator (+, -, *, /, %(For remainder)");
int number1 = input.nextInt();
int number2 = input.nextInt();
String operator = input.next();

BasicCalculator obj = new BasicCalculator();
obj.basicCalculator(number1, number2, operator);
}
}