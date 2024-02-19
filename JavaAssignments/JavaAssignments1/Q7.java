class Q7{
static int fact(int a){
if((a==1) || (a == 0)){return 1;}
int fact = 1;
for(int i =2; i<=a; i++){
fact*=i;
}
return fact;
}
public static void main(String []a){
int a1 = Integer.parseInt(a[0]);
System.out.println("factorial is : "+ fact(a1));
}}