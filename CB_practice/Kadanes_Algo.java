package CB_practice;

public class Kadanes_Algo {

	public static void main(String[] args) {
		
		int[] arr= {-2,-3,4,-1,-2,1,5,-4};
		
		int ans=kadanes_algo(arr);
		System.out.print("Maximum subarray sum : "+ans);

	}
	
	public static int kadanes_algo(int[] arr){
		   
		   int ans=Integer.MIN_VALUE;
		   int j=0;
		   
		   for(int i=0; i<arr.length; i++) {
			   
			   j=j+arr[i];
			   
			   if(j>ans) {
				  ans=j;
			   }
			   
			   if(j<0) {
				   j=0;
			   }
		   }
		   
		   return ans;
	   }

}
