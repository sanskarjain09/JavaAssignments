public class Q31 {
  public static void main(String[] args) {
      Employee employee1 = new Employee("John", 30, 3000);
      Employee employee2 = new Employee("Doe", 25, 4000);
      employee1.display();
      employee2.display();
  }
}

class Employee {
  private String name;
  private int age;
  private int salary;

  public Employee(String name, int age, int salary) {
      this.name = name;
      this.age = age;
      this.salary = salary;
  }

  public void display() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Salary: $" + salary);
      System.out.println();
  }
}
