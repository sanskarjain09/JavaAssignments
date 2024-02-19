import java.util.Scanner;
class GreatestOfThree{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.print("Enter number1");
int number1 = input.nextInt(); 
System.out.print("Enter number2");
int number2 = input.nextInt();
System.out.print("Enter number3");
int number3 = input.nextInt();

if(number1>number2){
if(number1>number3){
System.out.println("Number 1 is Greater :- "+ number1);
}
else{
System.out.println("Number 3 is Greater :- "+ number3);
}
}
else{
if(number2>number3){
System.out.println("Number 2 is greatest :-"+ number2);
}
else{
System.out.println("Number 3 is Greater :- "+ number3);
}
}
}
}