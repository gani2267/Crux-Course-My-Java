package crux_online;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		
		System.out.print("Enter two integers having space between them : ");
		
		Scanner y = new Scanner(System.in);
		int n = y.nextInt();
		int m = y.nextInt();

		int b, s;

		if (m > n) {
			b = m;
			s = n;
		} else {
			b = n;
			s = m;
		}

		int r;
		
		while (b%s !=0) {
			r = b % s;
			b = s;
			s = r;
		}

		System.out.println("HCF/DCM : " + s);

	}

}
