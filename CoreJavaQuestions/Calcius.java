import java.util.Scanner;

class Calcius{
public static void main(String []args){ 
Scanner input = new Scanner(System.in);
System.out.println("Enter the Temperature in Fahrenheit");
int fahrenheit = input.nextInt(); 
float calcium = ((fahrenheit-32)*5)/9;
System.out.println("Compound Intrest is : " + calcium);
}
}