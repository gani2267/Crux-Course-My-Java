package crux_online;

import java.util.Scanner;

public class Reversing {

	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		Scanner y=new Scanner(System.in);
		int n=y.nextInt();
		
		int c;
		int d=n;
		
		do {
			c=d%10;
			System.out.print(c);
			d=d/10;
		}while(d != 0);
	}

}
