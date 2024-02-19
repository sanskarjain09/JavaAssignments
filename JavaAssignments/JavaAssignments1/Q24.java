import java.util.Scanner;

public class  Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }
        average = (double) sum / 10;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        sum = 0;

        System.out.println("\nUsing while loop:");
        int count = 0;
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
            count++;
        }
        average = (double) sum / 10;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        sum = 0;
        count = 0;
        System.out.println("\nUsing do-while loop:");
        do {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
            count++;
        } while (count < 10);
        average = (double) sum / 10;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
