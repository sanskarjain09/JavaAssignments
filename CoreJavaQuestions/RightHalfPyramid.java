import java.util.Scanner;
class RightHalfPyramid{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a Number");
int number = input.nextInt();
rightHalfPyramid(number); 
}
static void rightHalfPyramid(int n){
for(int j= 0; j<n; j++){
for(int k= 0; k<=j; k++){
System.out.print("* ");
}
System.out.print("\n");
}
}
}  