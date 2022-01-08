package CB_practice;

import java.util.*;

public class CB_numbers {
	
	static Scanner sc=new Scanner(System.in);
	static int[] arr= {2,3,5,7,11,13,17,19,23,29};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=sc.nextInt();
		String str=sc.next();
		boolean[] bool=new boolean[n];
		
		int count=0;
//		int f=0; int l=1;
		
		for(int l=1; l<=str.length(); l++) {
			for(int f=0; f<=(str.length()-l); f++) {
				
				int e=l+f;
				
				if(isprimer(Long.valueOf(str.substring(f,e))) && visited(bool,f,e-1)) {
					count++;
					for(int i=f; i<e; i++) {
						bool[i]=true;
					}
				}
				
			}
		}
		System.out.println(count);
	}
	
	public static boolean isprimer(long n) {
		
		if(n==0 || n==1) {
			return false;
		}
		for(int i=0; i<arr.length; i++) {
			if(n==arr[i]) {
				return true;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(n%arr[i]==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean visited(boolean[] bool, int f,int e) {
		
		for(int i=f; i<=e ; i++) {
			if(bool[i]) {
				return false;
			}
		}
		
		return true;
	}

}
