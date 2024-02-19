public class Q30 {
  public static void main(String[] args) {
    Person person1 = new Person("Alice", 25);
    Person person2 = new Person("Bob");

    person1.display();
    person2.display();

    Employee employee1 = new Employee("John", 3000);
    Employee employee2 = new Employee("Doe", 4000);
    Employee.displayTotal();
  }
}

class Person {
  private String name;
  private int age;
  public Person() {
    name = "";
    age = 18;
  }
  public Person(String name) {
    this.name = name;
    this.age = 18;
  }
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

class Employee {
  private static int empNo = 0;
  private String name;
  private int salary;
  private static int totalSalary = 0;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
    empNo++;
    totalSalary += salary;
  }

  public static void displayTotal() {
    System.out.println("Total employees: " + empNo);
    System.out.println("Total salary: " + totalSalary);
  }
}
