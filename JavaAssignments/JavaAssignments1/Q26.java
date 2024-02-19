import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of numbers");
        int a = input.nextInt();
        int[] numbers = new int[a];
        System.out.println("Enter number of array");
        for (int i = 0; i < a; i++) {
            numbers[i] = input.nextInt();
        }
        printOddAndEven(numbers);
        input.close();
    }

    public static void printOddAndEven(int[] arr) {
        System.out.println("Even numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("\nOdd numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

    }
}
