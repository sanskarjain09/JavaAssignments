import java.util.Scanner;
 
class ParameterRec{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Side1 length : ");
float side1 = input.nextFloat();
System.out.println("Enter the Side2 length : ");
float side2 = input.nextFloat();
System.out.println("Enter the Side3 length : ");
float side3 = input.nextFloat();
System.out.println("Enter the Side4 length : ");
float side4 = input.nextFloat();
System.out.println("parameter of the rectangle is :-" + (side1+side2+side3+side4));
input.close();
}
}
