package Patterns;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		
		System.out.print("Give input : ");
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