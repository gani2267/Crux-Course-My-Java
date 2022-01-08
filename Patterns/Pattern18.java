package Patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		
		System.out.print("Give input : ");
		int n;
		Scanner y = new Scanner(System.in);
		n = y.nextInt();
		
		if(n>0 && (n%2 !=0)) {
			int a=1;
			int b=n/2;
			for(int i=1; i<=n; i++) {
				
				for(int j=1; j<=b; j++) {
					System.out.print(" ");
				}
				
				for(int j=1; j<=a; j++) {
					System.out.print("*");
				}
				
				for(int j=1; j<=b; j++) {
					System.out.print(" ");
				}
				
				System.out.println();
				if(i<=n/2) {
					a+=2;b--;
				}else {
					a-=2;b++;
				}
			}
		}
	}

}
