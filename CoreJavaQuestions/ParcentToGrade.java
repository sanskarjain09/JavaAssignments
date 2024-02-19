import java.util.Scanner;
class ParcentToGrade{
void parcentToGrade(String a){
switch(a){
case  "A":
System.out.println("Your parcetage is 81-100");
break;

case "B" :
System.out.println("Your parcetage is 71-80");
break;

case  "C":
System.out.println("Your parcetage is 61-70");
break;

case  "D":
System.out.println("Your parcetage is 51-60");
break;

default:
System.out.println("Enter correct Grade Btw A-D");

}
}

public static void main(String []arr){
ParcentToGrade obj = new ParcentToGrade();
Scanner input = new Scanner(System.in);
System.out.println("Enter your Grade ");
String parcent = input.next();
obj.parcentToGrade(parcent);
input.close();
}
}