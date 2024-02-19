import java.util.Scanner;

public class Q28C {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the percentage: ");
    double percentage = scanner.nextDouble();

    char grade = calculateGrade(percentage);

    System.out.println("Grade: " + grade);

    scanner.close();
  }

  public static char calculateGrade(double percentage) {
    if (percentage >= 90) {
      return 'A';
    } else if (percentage >= 80) {
      return 'B';
    } else if (percentage >= 70) {
      return 'C';
    } else if (percentage >= 60) {
      return 'D';
    } else if (percentage >= 40) {
      return 'E';
    } else {
      return 'F';
    }
  }
}
