package Function;

import java.util.Scanner;
import java.lang.Math;

public class Anybase_to_decimal {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num=s.nextInt();
		System.out.print("Enter the base : ");
		int base=s.nextInt();
		System.out.print("Enter base of ans : ");
		int ansBase=s.nextInt();
		
		
		int ans=anybase(num,base,ansBase);
		System.out.println("Ans is : "+ ans);
		
		
	}
	
	public static int anybase(int num1,int num1base,int num2base) {
		int num2=0;
		
		int b;
		int c=num1;
		int i=0;
		
		do {
			b=c%num2base;
			num2+=b*Math.pow(num1base, i);
			i++;
			c=c/num2base;
		}while(c!=0);
		
		return num2;
	}
}
