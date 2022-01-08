package Strings;

import java.util.Scanner;

public class SB_to_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking input of StringBuilder (s to sb conversion is used)
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb);
		
		//sb to s conversion
		String s=sb.toString();
		System.out.println(s);
	}

}
