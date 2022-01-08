package DP;

public class Fibbonacci {

	public static void main(String[] args) {
		
		int n= 1000000000;
//		System.out.println(fibRec(n));
//		System.out.println(fibTD(n,new int[n+1]));
//		System.out.println(fibBU(n));
		System.out.println(fibBUSE(n));
	}
	
	// TC=Time Complexity and SC=Space Complexity
	// TD=TopDownDP , BU=BottomUpDP , BUSE=BottomUpSpaceEfficientDP
	
	// TC = O(2^n)    , SC = Rec Ext space
	public static int fibRec(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		return fibRec(n-1)+fibRec(n-2);
	}
	
	// Tc = O(n)  , SC =O(n) + Rec ext space
	public static int fibTD(int n,int[] arr) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		if(arr[n]!=0) {
			return arr[n];
		}
		
		int ans = fibTD(n-1,arr)+fibTD(n-2,arr);
		arr[n]=ans;
		
		return ans;
	}
	
	// TC=O(n) and SC=O(n)
	public static int fibBU(int n) {
		
		int[] arr = new int[n+1];
		arr[0]=0; arr[1]=1;
		
		for(int i=2; i<=n; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		return arr[n];
	}
	
	// TC=O(n) and SC=O(1)
	public static int fibBUSE(int n) {
		
		int[] arr = new int[2];
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2; i<=n; i++) {
			int sum = arr[0]+arr[1];
			arr[0] = arr[1];
			arr[1] = sum;
		}
		
		return arr[1];
	}
}
