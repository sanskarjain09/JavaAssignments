class ConstructorOverloading1{
int a;
int b;

ConstructorOverloading1(){
int res = ConstructorOverloading1.sum();
System.out.println("the value of a and b is: " +a+" "+b + "  and res "+ res);

}
ConstructorOverloading1(int a){
System.out.println("the value of a and b is: " + a +" "+b);
}
ConstructorOverloading1(int a, int b){
System.out.println("the value of a and b is: " +a+" "+b);
}

static int sum(){
return 0;
}
}


class ConstructorOverloading{
public static void main(String []args){
ConstructorOverloading1 obj1 = new ConstructorOverloading1();
ConstructorOverloading1 obj2 = new ConstructorOverloading1(1);
ConstructorOverloading1 obj3 = new ConstructorOverloading1(1,2);

}
}