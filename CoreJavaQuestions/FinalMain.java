final class FinalMain{
static void show(){
System.out.println("I am final class hence not be inherited by another class");
}

public static void main(String []args){
FinalMain obj = new FinalMain();
obj.show();
}
}

//class A extends FinalMain{
//public static void main(String []args){
//FinalMain.show();
//System.out.println("I am final class hence not be inherited by another class");
//}
//}

