package crux_online;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		
		int i=1;
		System.out.print("Enter a number : ");
		Scanner yo=new Scanner(System.in);
		int num=yo.nextInt();
		
		//multiplication table
		System.out.println("Multiplication table of "+num+" is : ");
		while(i<=10) {
			System.out.print((num*i)+" ");
			i++;
		}
		
		//sum upto num
		System.out.print("\n"+ "Sum of numbers upto "+ num + " is : ");
		i=1;
		int sum=0;
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		//using ternary operator
		System.out.print("\nGiven number is ");
		System.out.println((num%2==0)? "even":"odd");
		
		
		//prime num or not
		int prime=0;
		i=2;
		while(i<num) {
			if(num%i==0)
				prime++;
			i++;
		}
		
		if(prime==0)
			System.out.println("\nGiven number is prime");
		else
			System.out.println("\nGiven number is not prime");
		
	}

}
