class GreaterInThree{
public static void main(String []a){

int a1 = Integer.parseInt(a[0]);
int b = Integer.parseInt(a[1]);
int c = Integer.parseInt(a[2]);
if(a1>b){
if(a1>c){
System.out.println(a1);
}
else{
System.out.println(c);
}
}
else{
if(b>c){
System.out.println(b);
}
else{
System.out.println(c);
}
}
}}