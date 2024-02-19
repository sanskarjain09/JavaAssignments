import java.util.Scanner;

class Fibonacci{
int fibonacci(int a){

if(a == 0){
return 0;
}
if(a == 1){
return 1;
}
int first = 0;
int second = 1;
for(int i = 2; i<=a; i++ ){
int temp = second;
second = first+second;
first = temp;
}
return second;
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
Fibonacci obj = new Fibonacci();
System.out.println("Enter the Number");
int number = input.nextInt();
int result = obj.fibonacci(number);
System.out.println("Fibonacci number at "+number+" is "+ result);
}} 