class Swap{
public static void main(String []args){
int number1 = 5;
int number2=6;
System.out.println("Before swap");
System.out.println("value of Number1 = " + number1);
System.out.println("value of Number2 = " + number2);
int temp =  number1;
number1 = number2;
number2 = temp;
System.out.println("After swap");
System.out.println("value of Number1 = " + number1);
System.out.println("value of Number2 = " + number2);
}
}