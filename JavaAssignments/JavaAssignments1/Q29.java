public class Q29 {
  private int number;
  private String text;
  public Q29() {
      number = 0;
      text = "Default text";
  }
  public void display() {
      System.out.println("Number: " + number);
      System.out.println("Text: " + text);
  }

  public static void main(String[] args) {
      Q29 object = new Q29();
      object.display();
  }
}
