public class Driver{
int a = 9;
void show(){
System.out.println(a);
}
static void showw(){
Driver obj = new Driver();
obj.show();
}

public static void main(String []args){
Car myCar = new Car();
myCar.addFule(9);
myCar.start().drive();

showw();
}
}