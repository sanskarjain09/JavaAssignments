import java.util.Scanner;
class SumOfArray{
void enterElements(int[]a){
Scanner input = new Scanner(System.in);
int i =0;
System.out.println("Enter The Elements Of the Array");
while(i< a.length){
a[i] = input.nextInt();
i++;
}
}
static int sumOfElements(int [] arr){
SumOfArray obj = new SumOfArray();
obj.enterElements(arr);
int sum = 0;
int i =0;
while(i<arr.length){
sum+=arr[i];
i++;
}
return sum;
}
public static void main(String []args){
//int [] arr1 = {1,2,35,52,1};
//System.out.println(arr1) ; //output & doubt [I@517cd4b
Scanner input = new Scanner(System.in);
//System.out.println("Enter the Size of the Array");
//int n = input.nextInt();
//int[] arr = new int[n];
//int sum = sumOfElements(arr);
//System.out.println("Sum of Element of given array is :- [ "+sum+" ]");
}}