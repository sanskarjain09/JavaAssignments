class One{
void show(){
System.out.println("This is Funtion of Parent Class");
}
}

class Override extends One{
void show(){
super.show();
System.out.println("overrided");
}
public static void main(String []args){
Override obj = new Override();
obj.show();
}
}
