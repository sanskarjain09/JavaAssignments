import java.util.Scanner;
class MargeArray{
static void enterElements(int [] arr){
Scanner input = new Scanner(System.in);
System.out.println("Enter Elements in the Array :- ");
int i = 0;
while(i<arr.length){
arr[i] = input.nextInt();
i++;
}
input.close();
}
static void showArray(int[] arr){
int i = 0;
while(i<arr.length){
System.out.print(arr[i] + " ");
i++;
}
System.out.println("");
}
static int[] margeArray(int [] arr, int [] arr2){
int totalLength = arr.length+arr2.length;
int[] newArray = new int[totalLength];
int i =0;
int j=0;
while(j<totalLength){
if(j<arr.length){
newArray[j] = arr[j];
}
if(j>=arr.length){
newArray[j] = arr2[i];
i++;
}
j++;
}
return newArray;
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Length of Array 1 and Array 2 :-");
int arr1Length = input.nextInt();
int arr2Length = input.nextInt();
int[] array1 = new int[arr1Length];
int[] array2 = new int[arr2Length];
enterElements(array1);
enterElements(array2);
int[] margeResult = margeArray(array1, array2);
showArray(margeResult);
input.close();
}}