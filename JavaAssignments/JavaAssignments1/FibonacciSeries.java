

class FibonacciSeries{
public static void main(String []args){
int number = Integer.parseInt(args[0]);
fibonacciSeries(number);
}

public static void fibonacciSeries(int a){
int numberCount = 0;
if(a < 0) return;
numberCount = 1;
System.out.print("0 ");
if(a == 0) return;
numberCount = 2;
System.out.print("1 ");
if(a == 1) return;
int first = 0; int second = 1; 
while((first+second) <= a){
numberCount++;
int third = first+second;
System.out.print( third+ " ");
first = second;
second = third; 
}
System.out.println("\nNumbers Count = "+numberCount);
}
} 