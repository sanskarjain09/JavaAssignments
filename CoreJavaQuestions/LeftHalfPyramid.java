import java.util.Scanner;
class LeftHalfPyramid{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a Number");
int number = input.nextInt();
input.close();
leftHalfPyramid(number); 
}
static void leftHalfPyramid(int n){
for(int j= n; j>0; j--){
for(int k= 1; k<=n; k++){
if(k>=j){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
System.out.print("\n");
}
}
}  