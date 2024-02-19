class SwapUsingThird{
public static void main(String []a){

int a1 = Integer.parseInt(a[0]);
int b = Integer.parseInt(a[1]);
int temp; 

System.out.println("Before Swaping A is "+ a1 + " And B is "+ b);

temp = a1;
a1 = b;
b = temp;

System.out.println("Before Swaping A is "+ a1 + " And B is "+ b);
}
}