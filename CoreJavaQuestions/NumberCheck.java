import java.util.Scanner;
 
class NumberCheck{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter A number to check");
int number = input.nextInt(); 
if(number == 0){
System.out.println("Exact Zero");}
else if(number > 0){
System.out.println("Positive");
}
else{
System.out.println("Negative");
}
}
}