package crux_online;

import java.util.Scanner;

public class Taking_input_with_if_else {

	public static void main(String[] args) {
		
		System.out.print("Enter an interger : ");
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		
		System.out.println(n);
		if(n%2==0)
			System.out.println("given no is even");
		else
			System.out.println("given no is odd");
		
	}

}
