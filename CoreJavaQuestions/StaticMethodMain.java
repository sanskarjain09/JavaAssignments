class StaticMethodMain{
static void show(){
System.out.println("Hello i am static method and can be called by without any object or by class name ");
}
public static void main(String []args){
StaticMethodMain obj1;
StaticMethodMain obj = new StaticMethodMain();
//obj.show();
StaticMethodMain.show();
}
}