abstract class AbstractClass{
abstract void show();
}

class AbstractClassMain extends AbstractClass{
void show(){
System.out.println("Hi This is A Abstract Function of AbstractClass Class And Defined in AbstractClassMain Class ");
}
public static void main(String []args){
AbstractClassMain obj = new AbstractClassMain();
obj.show();
}
}