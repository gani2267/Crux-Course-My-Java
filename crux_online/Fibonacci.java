package crux_online;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.print("Enter positive number : ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		System.out.println("Fibonacci series upto that no is : ");
		int a = 0, b = 1;
		int c;
		int i = 0;

		while (i <= n) {
			System.out.print(a+" ");
			c = a + b;
			a = b;
			b = c;
			i++;
		}
	}

}
