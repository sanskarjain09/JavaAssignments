import java.util.Scanner;
class ReverseRightHalfPyramid{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a Number");
int number = input.nextInt();
reverseRightHalfPyramid(number); 
input.close();
}
static void reverseRightHalfPyramid(int n){
for(int j= n; j>0; j--){
for(int k= 0; k<j; k++){
System.out.print("* ");
}
System.out.print("\n");
}
}
}  