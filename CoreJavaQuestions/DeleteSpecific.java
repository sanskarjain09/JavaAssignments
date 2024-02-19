import java.util.Scanner;
class DeleteSpecific{

public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Length of the array");
int n =input.nextInt();
int[] arr = new int[n];
int[] result = deleteSpecific(arr);
showArray(result);
}
static void showArray(int [] arr){
int i = 0;
while(i<arr.length){
System.out.print(arr[i] + " ");
i++;
}
System.out.println("");
}
static int[] deleteSpecific(int[] arr){
enterElements(arr);
Scanner input = new Scanner(System.in);
System.out.println("Enter the Element That you want to Delete");
int target = input.nextInt();
int [] newArr = new int[arr.length-1];
int i = 0;
int j = 0;
boolean result = false;
while(i<arr.length){
if((arr[i]!=target)||result){
newArr[j] = arr[i];
j++;
}
if((arr[i] == target)&&(!result)){
result = true;
}
i++;
}
return newArr;
}
static void enterElements(int[] arr){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Elements in the array");
int i = 0;
while(i<arr.length){
arr[i] = input.nextInt();
i++;
}

}}