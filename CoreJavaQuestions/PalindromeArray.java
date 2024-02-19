import java.util.Scanner;
class PalindromeArray{
void enterElements(int[] arr){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Elements Of the Array :- ");
int i = 0;
while(i<arr.length){
arr[i] = input.nextInt();
i++;
}
}

static boolean palindromeArray(int[] arr){
int i = 0;
int j = (arr.length)-1;
while(i<arr.length){
if(arr[i] != arr[j]){
return false;
}
i++;
j--;
}
return true;
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the Number of elements You want to insert in array :- ");
int n = input.nextInt();
int[] arr = new int[n];
PalindromeArray obj = new PalindromeArray();
obj.enterElements(arr);
boolean result = palindromeArray(arr);
if(result){System.out.println("Inserted Array is a Palindrome Array");}
else{System.out.println("Inserted Array is not a Palindrome Array");}
}
}