class Q14{

public static void main(String []p){
int n = Integer.parseInt(p[0]);
int counter = 1;

for(int i= 1; i<=n; i++){
for(int j=1; j<=i;j++){
System.out.print(counter + " ");
counter++;
}
System.out.println("");
}
}
}