package Patterns;

import java.util.Scanner;

public class Pattern32 {
	
	public static void main(String[] args){
		
		System.out.print("Give input : ");
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		
		int b=2*n-1;
		int a=1;
		
		for(int i=1; i<=b; i++) {
			
			for(int j=1; j<=(2*a-1); j++) {
				if(j%2 != 0)
					System.out.print(a+"\t");
				if(j%2==0)
					System.out.print("*\t");
			}
			
			System.out.println();
			
			if(i<n)
				a++;
			else
				a--;
		}
	}
}
