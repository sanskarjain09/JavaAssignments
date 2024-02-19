import java.util.Scanner;
class Palindrome{
public static void main(String []args){
Scanner input = new  Scanner(System.in);
System.out.println("Enter a number ");
int number = input.nextInt();
if(palindrome(number)){System.out.println("Number "+ number +" is a palindrome number");}
else{System.out.println("Number "+ number +" is not a palindrome number");}
}

static boolean palindrome(int a){
int result = 0;
int r;
int temp = a; 
while(a>0){
r = a%10;
result += r;
a/=10;
if(a>0){result*=10;} 
}
if(result == temp){return true;}
else{return false;}
}
}
