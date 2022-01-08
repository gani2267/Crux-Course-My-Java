package Strings;

import java.util.Scanner;

public class Printing_all_substrings{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=1; j<=str.length(); j++) {
				if(i<j) {
				String a=str.substring(i,j);
				System.out.println(a);
				}
			}
		}
	}
}
