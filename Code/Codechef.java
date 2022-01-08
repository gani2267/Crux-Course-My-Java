package Code;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			process();
		}
		
	}
	private static void process() {
		String s1=sc.next();
		String s2=sc.next();
		
		int[] ar1 = new int[27];
		int[] ar2 = new int[27];
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)>='a' && s2.charAt(i)<='z') {
				int idx = (int) (s2.charAt(i)-'a');
				ar1[idx]++;
			}
		}
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
				int idx = (int) (s1.charAt(i)-'a');
				ar1[idx]=0;
			}
		}
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int flag=0;
		for(int i=0; i<ar1.length; i++) {
			if(ar1[i]>0) {
				System.out.print(alpha.charAt(i));
				flag++;
			}
		}
		if(flag==0) {
			System.out.println(-1);
		}
		
	}
}
