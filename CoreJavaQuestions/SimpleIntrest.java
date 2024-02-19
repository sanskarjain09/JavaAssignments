import java.util.Scanner;

class SimpleIntrest{
public static void main(String []args){ 
Scanner input = new Scanner(System.in);
System.out.println("Enter the Principle Amount");
int principle = input.nextInt(); 
System.out.println("Enter the Rate");
float rate = input.nextFloat(); 
System.out.println("Enter the Time in year");
int time = input.nextInt(); 
Float si = 1/100f*principle*rate*time;
System.out.println("Simple Intrest is : " + si);
input.close();
}
}