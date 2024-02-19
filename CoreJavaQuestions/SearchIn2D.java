import java.util.Scanner;
class SearchIn2D{

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

static void searchIn2D(int[][] arr, int target){
for(int i=0; i<arr.length; i++){
for(int j=0; j<arr[0].length;j++){
if(arr[i][j] == target){
System.out.println("Taget Element : " + target + " is found at row "+(i+1) +" and at column "+(j+1));
return;
}
}
}
System.out.println("Item not Found");
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Size of 2D array :-");
int row = input.nextInt();
int column = input.nextInt();
int[][] arr= new int[row][column];
enterElements(arr);
System.out.println("Enter the target element to search");
int target = input.nextInt();
searchIn2D(arr, target);
input.close();
}
}