package Recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a=sc.nextInt();
		
		int n=fib(a);
		System.out.print(n);
	}
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
		
	}

}
