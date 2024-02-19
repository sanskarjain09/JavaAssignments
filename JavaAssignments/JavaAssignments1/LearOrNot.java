class LearOrNot{
public static void main(String []a){
int a1 = Integer.parseInt(a[0]);

if(a1%400 == 0){
System.out.println("Leap Year");
}
else if((a1%100 != 0) && (a1%4 == 0)){
System.out.println("Leap Year");
}
else{
System.out.println("Not a Leap Year");
}
}}