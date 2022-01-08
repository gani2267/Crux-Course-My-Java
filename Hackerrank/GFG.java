package Hackerrank;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

class GFG {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());

		while (t-- > 0) {
			long N = Long.parseLong(sc.next());
			Solutio T = new Solutio();
			System.out.println(T.smallestK(N));
		}
	}
}// } Driver Code Ends

//User function Template for Java

class Solutio {

	String smallestK(long n) {
		// Write your code here
		// Write your code here
		long a = n;
		String str = "";
		
		if(a>=0 && a<=9) {
			return a+"";
		}
		
		for(int i=9; i>=2; i--) {
			if(a % i ==0) {
				str +=i;
				a=a/i;
			}
			if(a==1) {
				break;
			}
		}
		
		String ans="";
		for(int i=str.length()-1; i>=0; i--) {
			ans += str.charAt(i);
		}
		
		return ans;
	}

}
