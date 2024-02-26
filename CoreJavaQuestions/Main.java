abstract class Two{
static void disp(){
System.out.println("This is a Abstract Class Static Method And Call it without Inheritance ");
}

void show(){
System.out.println("This is a Abstract Class Method");
}

}

class Main extends Two{
public static void main(String []args){
Two.disp();
Main obj = new Main();
Two obj = new Main();
obj.show();
}
}