package Recursion;

import java.util.ArrayList;

public class All_Indices {

	public static void main(String[] args) {
		
		int[] arr= {0,3,4,6,4,3,3,4,3,2,4,3,3,2};
		//          0 1 2 3 4 5 6 7 8 9 0 1 2 3
		
		int[] ans=AllIndices(arr,3);
		display(ans);
		
		
		System.out.println();
		System.out.println();
		
		//by recursion
		int[] ans2=ByRecursion(arr,3,0,0);
		display(ans2);
	}
	
	public static void display(int[] arr) {
		System.out.print("Elements in array are : ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] AllIndices(int[] arr,int n) {
		
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				list.add(i);
			}
		}
		
		int[] b=new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			b[i]=list.get(i);
		}
		
		return b;
	}

	public static int[] ByRecursion(int[] arr,int n,int i,int j) {
		if(i==arr.length) {
			int[] y=new int[j];
			return y;
		}
		
		int[] b=null;
		if(arr[i]==n) {
			b=ByRecursion(arr,n,i+1,j+1);
			b[j]=i;
		}else {
			b=ByRecursion(arr,n,i+1,j);
		}
		
		
		return b;
		
	}
}
