import java.util.Scanner;


class MaxMinOfArray{
void enterElements(int [] arr){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Elements of the array");
int i =0;
while(i<arr.length){
arr[i] = input.nextInt();
i++;
}
}
static int[] maxMinOfArray(int [] arr){
MaxMinOfArray obj = new MaxMinOfArray();
obj.enterElements(arr);
int max = arr[0];
int min = arr[0];
for(int i = 1; i<(arr.length); i++){
if(max<arr[i]){
max = arr[i];
}
if(min>arr[i]){
min = arr[i];
}
}
int[] newArray = {max, min};
return newArray;
}
public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Length of the ");
int n = input.nextInt();
int [] arr = new int[n];
int[] result =  maxMinOfArray(arr);
System.out.println("Maximum value in array is "+result[0]+" And Minimum value in array is "+result[1]);
}
}