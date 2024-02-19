class SwapWithoutThird{
public static void main(String []a){

int a1 = Integer.parseInt(a[0]);
int b = Integer.parseInt(a[1]);

System.out.println("Before Swaping A is "+ a1 + " And B is "+ b);
a1 = a1 + b;
b = a1 - b;
a1 = a1 - b;
System.out.println("Before Swaping A is "+ a1 + " And B is "+ b);
}}
