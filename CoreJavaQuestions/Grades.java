import java.util.Scanner;

class Grades{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter you Parcentage");
float percentage = input.nextFloat();
if(percentage>90){
System.out.println("A grade");
}
else if(percentage>75){
System.out.println("B grade");
}
else if(percentage>60){
System.out.println("C grade");
}
else if(percentage>30){
System.out.println("D grade");
}
else{
System.out.println("Failed");
}
}} 