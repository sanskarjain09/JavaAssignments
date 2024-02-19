class Armstrong{
public static void main(String []args){
int number = Integer.parseInt(args[0]); 
if(armstrong(number)){
System.out.println("Number " + number+ " is Armstrong");
}
else{
System.out.println("Number " +number+ " is not Armstrong");
}
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