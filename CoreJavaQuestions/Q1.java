import java.util.Arrays;
class Q1{
static int[] sum(int[]nums,int target){
int n = nums.length;
for(int i = 0; i<n-1;i++){
for(int j = i+1; j<n; j++){

if(nums[i]+nums[j] == target){
return new int []{i,j};

}
}
}
return new int[]{};
}
public static void main(String []args){
int [] arr = {3,2,4} ;
int [] a= sum(arr, 6 );
System.out.println(Arrays.toString
(a));
}
}