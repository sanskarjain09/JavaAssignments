import java.util.Scanner;
class ReverseArray{

static void enterElements(int[] arr){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Elements in the array");
int i = 0;
while(i<arr.length){
arr[i] = input.nextInt();
i++;
}
input.close();}
static void reverseArray(int[] arr){
int i = (arr.length-1);
System.out.println("Reverse Order of the array :- ");
while(i>=0){
System.out.print(arr[i]+" ");
i--;
}
System.out.println("");

}
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Length of the array");
int n =input.nextInt();
int[] arr = new int[n];
enterElements(arr);
reverseArray(arr);
input.close();
}}




