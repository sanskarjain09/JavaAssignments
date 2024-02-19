import java.util.Scanner;
class DigonalsSum{
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
static void digonalsSum(int[][] arr){
int sum=0,i=0;
for(i=0;i<arr.length;i++){
int j = 0;
for(j=0; j<arr[0].length; j++){
if(i == j){
sum+=arr[i][j];
}
}
}
System.out.println("Sum of two Digonals of Square Matric is :- "+sum);
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Size of Square Matrix array :-");
int row = input.nextInt();
int[][] arr= new int[row][row];
enterElements(arr);
digonalsSum(arr);
input.close();
}}