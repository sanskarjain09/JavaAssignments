import java.util.Scanner;
class MonthName{
void monthName(int n){
switch(n){
case 1:
System.out.println("January");
break;
case 2:
System.out.println("Fabrury");
break;
case 3:
System.out.println("March");
break;
case 4:
System.out.println("Aprail");
break;
case 5:
System.out.println("May");
break;
case 6:
System.out.println("June");
break;
case 7:
System.out.println("July");
break;
case 8:
System.out.println("August");
break;
case 9:
System.out.println("September");
break;
case 10:
System.out.println("October");
break;
case 11:
System.out.println("November");
break;
case 12:
System.out.println("December");
break;
default:
System.out.println("Enter A valid Number");
}
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Number of the day From 1 to 12");
int number = input.nextInt();
MonthName obj = new MonthName();
obj.monthName(number);
input.close();
}
}