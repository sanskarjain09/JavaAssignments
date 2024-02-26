class StaticMain{
static int a = 0;
StaticMain(){
a++;
}
StaticMain(int b){
a++;
}
void show(){
System.out.println("There is total "+a+" objects");
}
public static void main(String []aargs){
StaticMain obj1 = new StaticMain();
StaticMain obj2 = new StaticMain(3
);
obj1.show();
obj2.show();
}
}