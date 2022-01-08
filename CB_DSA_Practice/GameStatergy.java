package CB_DSA_Practice;

import java.util.Scanner;

public class GameStatergy {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] arr=takeInput1D();
		int ans=gameStatergy(arr,0,arr.length-1);
		
		System.out.println(ans);
	}
	
	public static int[] takeInput1D() {
		
		int size=sc.nextInt();
		int [] arr=new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static int gameStatergy(int[] arr,int lo,int hi) {
		
		if(lo>hi) {
			return 0;
		}
		
		int sum1=arr[lo]+Math.min(gameStatergy(arr,lo+2,hi), gameStatergy(arr,lo+1,hi-1));
		int sum2=arr[hi]+Math.min(gameStatergy(arr,lo,hi-2), gameStatergy(arr,lo+1,hi-1));
		int sum=Math.max(sum1, sum2);
		
		return sum;
	}
	
	
}
