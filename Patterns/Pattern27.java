package Patterns;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		
		System.out.print("Give input : ");
		Scanner y = new Scanner(System.in);
		int n=y.nextInt();
		
		int a=1;
		int b=n;
		
		for(int j=1; j<=n; j++) {
			int c=1;
			
			for (int i = 1; i < b; i++) {
				System.out.print(" \t");
			}

			for (int i = 1; i <= a; i++) {
				System.out.print(c+"\t");
				if(i<=a/2)
					c++;
				else
					c--;
			}
			System.out.println();
			
			a+=2;
			b--;
		}

	}

}
