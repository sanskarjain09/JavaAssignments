import java.util.Scanner;
class DayName{
void dayName(int n){
switch(n){
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednsday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Enter A valid Number");
}
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Number of the day From 1 to 7");
int number = input.nextInt();
DayName obj = new DayName();
obj.dayName(number);
input.close();
}
}