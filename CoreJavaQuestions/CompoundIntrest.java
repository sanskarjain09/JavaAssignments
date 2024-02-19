import java.util.Scanner;

class CompoundIntrest{
public static void main(String []args){ 
Scanner input = new Scanner(System.in);
System.out.println("Enter the Principle Amount");
int principle = input.nextInt(); 
System.out.println("Enter the Rate");
float rate = input.nextFloat(); 
System.out.println("Enter the Time in year");
int time = input.nextInt(); 
double si = principle * Math.pow((1+rate/100), time);
System.out.println("Compound Intrest is : " + (si-principle));
}
}