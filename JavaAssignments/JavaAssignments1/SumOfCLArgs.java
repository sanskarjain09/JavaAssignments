class SumOfCLArgs{
public static void main(String []p){
int sum = 0;
int i = 0;
while(i<p.length){
sum+=Integer.parseInt(p[i]);
i++;
}
System.out.println("Sum in :- "+sum);
}
}