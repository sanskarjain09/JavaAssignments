public class Q32 {
  private int number;

  public Q32(int number) {
      this.number = number;
  }

  public void display() {
      System.out.println("Number: " + this.number); 
  }

  public static void main(String[] args) {
      Q32 obj = new Q32(42);
      obj.display();
  }
}
