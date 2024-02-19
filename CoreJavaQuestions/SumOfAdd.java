import java.util.Scanner;
class SumOfAdd{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter A number");
int number = input.nextInt();
int i = 1;
int result = 0;
while(i<=number){
result += i;
i+=2;
}
System.out.println("Sum of odd number upto " + number +" is :- " + result);
input.close();
}}