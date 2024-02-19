import java.util.Scanner;

class Prime{
boolean isPrime(int a){
int j;
for(j = 2; j<=(a/2);j++){
if(a%j == 0){
return false;
}
}
return true;
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter A number");
int number = input.nextInt();
Prime obj = new Prime();
boolean result = obj.isPrime(number);
if(result){
System.out.println( number+ " Is a prime number");
}
else{
System.out.println( number+ " Is not a prime number");
}
}}