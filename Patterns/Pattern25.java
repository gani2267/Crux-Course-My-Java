package Patterns;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		
		System.out.print("Give input : ");
		Scanner y = new Scanner(System.in);
		int n=y.nextInt();
		
		int a=1;
		int b=n;
		int c=1;
		
		for(int j=1; j<=n; j++) {
			
			
			for (int i = 1; i < b; i++) {
				System.out.print("\t");
			}

			for (int i = 1; i <= a; i++) {
				System.out.print(c+"\t");c++;
			}
			System.out.println();
			
			a+=2;
			b--;
		}

	}

}
