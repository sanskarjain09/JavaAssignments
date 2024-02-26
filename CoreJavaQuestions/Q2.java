class Q2 {
    public static boolean isPalindrome(int x) {
        int res = 0;
	int temp = x;
      while(x>0){
	int b = x%10;

          res += b;

          x = x/10;
          if(x>0){
              res*=10;
          }
          
      }  
      if(res == temp){
          return true;
      }
      else{
          return false;
      }
    }
public static void main(String []a)
{
System.out.println(isPalindrome(121));
}
}