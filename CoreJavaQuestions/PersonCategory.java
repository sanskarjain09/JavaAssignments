import java.util.Scanner;
class PersonCategory{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter Your Age");
int age = input.nextInt();
if(age<13){System.out.println("Child");}
else if(age<20){System.out.println("Teen ");}
else if(age<60){System.out.println("Adult");}
else if(age>=60){System.out.println("Senior");}
input.close();
}}
