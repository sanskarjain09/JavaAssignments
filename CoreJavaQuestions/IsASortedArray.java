import java.util.Scanner;
class IsASortedArray{
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Length Of the array");
int n =input.nextInt();
int[] arr = new int[n];
boolean result = isASortedArray(arr, n);
if(result){System.out.println("This is a sorted array");}
else{System.out.println("This is not a sorted array");}
input.close();
}
static boolean isASortedArray(int [] arr, int n){
enterElements(arr, n);
int i = 0;

while(i<n){
int j = i+1;
while(j<n){
if(arr[i]>arr[j]){
return false;
}
j++;
}
i++;
}
return true;
}
static void enterElements(int[] arr, int n){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Elements in the array");
int i = 0;
while(i<n){
arr[i] = input.nextInt();
i++;
}
input.close();
}
}