package crux_online;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		
		int n;
		Scanner y=new Scanner(System.in);
		n=y.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
