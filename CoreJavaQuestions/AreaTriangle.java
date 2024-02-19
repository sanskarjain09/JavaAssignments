import java.util.Scanner;

class AreaTriangle{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the base length");
float base = input.nextFloat();
System.out.println(base); 
System.out.println("Enter the Hight length");
float hight = input.nextFloat(); 
System.out.println(hight);
float area = 1/2f * base * hight;
System.out.println("Enter the Area of the Triangle is : " + area);
}
}