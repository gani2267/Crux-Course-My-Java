package CB_practice;

import java.util.Scanner;

public class RecursionSubsequence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		rs(str,0,str.length());
		System.out.print("\n"+(int)Math.pow(2, str.length()));
		

	}
	
	public static void rs(String s,int i,int j) {
		
		if(j==0) {
			return ;
		}
		char a=s.charAt(i);
		StringBuilder sb=new StringBuilder(s);
		
		sb.deleteCharAt(i);
		s=sb.toString();
		rs(s,i,j-1);
		if(j==1) {
		System.out.print(s+" ");
		}
		
		sb.insert(i,a);
		s=sb.toString();
		rs(s,i+1,j-1);
		if(j==1) {
		System.out.print(s+" ");
		}
		
	}

}
