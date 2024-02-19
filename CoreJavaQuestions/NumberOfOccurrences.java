import java.util.Scanner;
class NumberOfOccurrences{
void enterElements(int [] arr){
Scanner input = new Scanner(System.in);
int i = 0;
System.out.println("Enter the elements in the Array");
while(i<arr.length){
arr[i] = input.nextInt();
i++;
}
}

static void numberOfOccurrences(int [] arr){
Scanner input = new Scanner(System.in);
NumberOfOccurrences obj = new NumberOfOccurrences();
obj.enterElements(arr);
System.out.println("Enter Element to Find Occurrences");
int target = input.nextInt();
int occurrences = 0;
int i = 0;
while(i<arr.length){
if(arr[i] == target){
occurrences++;
}
i++;
}
System.out.println("Occurrences of number "+ target +" is : "+occurrences);
}

public static void main(String []s){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Length of the Array");
int n = input.nextInt();
int [] arr = new int[n];
numberOfOccurrences(arr);
}}