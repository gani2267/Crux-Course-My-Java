package Recursion;

import java.util.Scanner;

public class Pattern_without_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		pattern(n,1,1);

	}
	
	public static void pattern(int n,int row,int col) {
	
		if(col>n) {
			return;
		}
		if(col>row) {
			System.out.println();
			pattern(n,row+1,1);
			return;
		}
		System.out.print("*");
		
		pattern(n,row,col+1);
	}
}
