package Recursion;

public class Checking_array_is_sorted_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,7,7,8,9};
		boolean b=check(arr,0);
		System.out.println("Sorted : "+b);

	}
	
	public static boolean check(int[] arr,int n) {
		boolean bool=true;
		
		if(n==(arr.length-1)) {
			return bool;
		}
		
		
		if(arr[n]<=arr[n+1]) {
			bool=check(arr,n+1);
		}else {
			bool=false;
		}
		
		return bool;
	}

}
