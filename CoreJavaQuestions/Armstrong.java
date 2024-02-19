import java.util.Scanner;
class Armstrong{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Number to Check Armstrong");
int number = input.nextInt(); 
if(armstrong(number)){
System.out.println("Number " + number+ " is Armstrong");
}
else{
System.out.println("Number " +number+ " is not Armstrong");
}
input.close();
} 
static boolean armstrong(int a){
int result = 0; 
int temp = a; 
while(a>0){
int r = a%10;
a/=10;
result += r*r*r;
}
if(result == temp){
return true;
}
else{
return false; 
}

} 

} 