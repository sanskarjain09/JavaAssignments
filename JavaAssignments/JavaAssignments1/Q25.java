import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number");
        int target = scanner.nextInt();

        boolean found = false;
        for (int guess = 1; guess <= 100; guess++) {
            if (guess == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + target + " found!");
        } else {
            System.out.println("Number " + target + " not found.");
        }
        scanner.close();
    }
}
