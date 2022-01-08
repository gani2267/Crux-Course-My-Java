package Recursion;

public class First_occarance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,2,4,5,2,4,3};
		int n=yo(arr,4,0);
		System.out.println("First occarance of your num is at index : "+n);
		
		int m=last(arr,4,0);
		System.out.println("last occarance of your num is at index : "+m);
	}
	
	public static int yo(int[] arr,int a,int n) {
		int b=-1;
		if(n>=(arr.length-1)) {
			return -1;
		}else if(arr[n]==a) {
			b=n;
		}else {
			b=yo(arr,a,n+1);
		}
		
		return b;
	}
	
	public static int last(int[] arr,int a,int n) {
		int b=-1;
		if(n>=(arr.length-1)) {
			return -1;
		}else if(arr[n]==a) {
			b=last(arr,a,n+1);
			if(b==-1) {
				b=n;
			}
		}else {
			b=last(arr,a,n+1);
		}
		
		return b;
	}
}
