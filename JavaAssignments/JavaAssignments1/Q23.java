import java.util.Scanner;
public class Q23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter DA percentage: ");
        double daPercentage = scanner.nextDouble();
        System.out.print("Enter HRA percentage: ");
        double hraPercentage = scanner.nextDouble();
        double da = (daPercentage / 100) * basicSalary;
        double hra = (hraPercentage / 100) * basicSalary;
        double grossSalary = basicSalary + da + hra;
        System.out.println("Gross Salary: " + grossSalary);
        scanner.close();
    }
}
