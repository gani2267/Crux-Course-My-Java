package Patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {

		System.out.print("Give input : ");
		int n;
		Scanner y = new Scanner(System.in);
		n = y.nextInt();
		
		int b = n / 2, a = 1;

		if (n > 1 && (n % 2 != 0)) {
			for (int j = 1; j <= n; j++) {

				for (int i = 1; i <= b; i++) {
					System.out.print("*");
				}

				for (int i = 1; i <= a; i++) {
					System.out.print(" ");
				}

				for (int i = 1; i <= b; i++) {
					System.out.print("*");
				}

				System.out.println();
				if(j<=n/2) {
					b--;a+=2;
				}else {
					b++;a-=2;
				}
			}
			
		} else
			System.out.println("invalid intput");
	}

}
