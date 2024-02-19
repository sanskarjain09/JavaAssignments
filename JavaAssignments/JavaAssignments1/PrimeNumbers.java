class PrimeNumbers{
public static void main(String []a){
boolean res = true;
int range = Integer.parseInt(a[0]);


if(range>1){
for(int i = 2; i<=range; i++){
for(int j = 2; j<i; j++){
if(i%j == 0){
res = false;
}
}
if(res == true){
System.out.print(i+" " );
}
else{res=true;}
}
System.out.println("");
}
else if(range == 1){
System.out.println("1 Is not a valid range to find Prime Numbers ");
}
else{
System.out.println("Please Give a valid range");
}
}
}