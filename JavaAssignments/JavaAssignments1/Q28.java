import java.util.Scanner;

class Q28{
int small(int a, int b){
if(a>b){
return b; 
}
else{
return a; 
}
}
int gcd(int a, int b){
Q28 obj = new Q28();
int small = obj.small(a,b);
int i = 1;
int result = 1;
while(i<=small){
if((a%i == 0) && (b%i == 0)){
result = i; 
}
i++;
}
return result;
} 
public static void main(String []args){
Scanner input = new Scanner(System.in);
Q28 obj = new Q28();
System.out.println("Enter the Number1 And Number2");
int number1 = input.nextInt(); 
int number2 = input.nextInt();
int result = obj.gcd(number1, number2);
System.out.println("GCD of number1 "+number1+" and number2 "+number2+" is :- "+result);
input.close();
}}