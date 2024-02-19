import java.util.Scanner;
class SumAndAvarageOf2DArray{
static void enterElements(int[][] arr){
Scanner input = new Scanner(System.in);
int i = 0;
while(i<arr.length){
System.out.println("Enter in Row :- "+(i+1));
int j = 0;
while(j<arr[0].length){
arr[i][j] = input.nextInt();
j++;
}
i++;
}
input.close();
}
static void sumAndAvarageOf2DArray(int [][] arr){
int sum = 0;
int i = 0;
for(i =0; i<arr.length; i++){
int j =0;
for(j=0; j<arr[0].length; j++){
sum+=arr[i][j];
}
}
int avarage = sum/(arr.length*arr[0].length);
System.out.println("Sum of all elements of the array is :- "+ sum+ " and avarage is :- "+avarage);
}


public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Size of 2D array :-");
int row = input.nextInt();
int column = input.nextInt();
int[][] arr= new int[row][column];
enterElements(arr);
sumAndAvarageOf2DArray(arr);
input.close();
}
}