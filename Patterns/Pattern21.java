package Patterns;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {

		System.out.print("Give input : ");
		int n;
		Scanner y = new Scanner(System.in);
		n = y.nextInt();

		int b = (2 * n - 3);

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= b; j++) {
				System.out.print(" ");
			}

			if (b == -1) {
				for (int j = 1; j < i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();

			b -= 2;
		}

	}

}
