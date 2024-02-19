import java.util.Scanner;

class MultiplicationTable{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter A number");
int number = input.nextInt();
System.out.println("Multiplication table of number " + number +" is :-");
int i = 1;
while(i<11){
System.out.println(number + " * " + i +" = "+ number*i);
i++;
}
input.close();
}}