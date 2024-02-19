import java.util.Scanner;
class Lcm{
int big(int n, int m){
if(n>m){
return n; 
}
else{
return m;
}
}

int small(int n, int m){
if(n<m){
return n; 
}
else{
return m;
}
} 
int lcm(int n, int m){
Lcm obj = new Lcm();
int big = obj.big(n,m);
int lcm = 0;
for(int i=1; i<obj.small(n, m); i++){
lcm = i*big;
if((lcm%n == 0)&&(lcm%m == 0)){
	return lcm;
}
}
return 0; 
}
public static void main(String []args){
Scanner input = new Scanner(System.in);
Lcm obj = new Lcm();
System.out.print("Enter Two Number To find LCM");
int number1 = input.nextInt();
int number2 = input.nextInt();
int lcm = obj.lcm(number1, number2);
System.out.println("The LCM is "+ lcm);
input.close();
}
}