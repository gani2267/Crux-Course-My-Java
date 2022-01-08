package crux_online;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		System.out.print("Enter positive number less than 8 : ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		switch(n){
			case 1:
				System.out.println("Monday");break;
			case 2:
				System.out.println("Tuesday");break;
			case 3:
				System.out.println("Wednesday");break;
			case 4:
				System.out.println("Thursday");break;
			case 5:
				System.out.println("Friday");break;
			case 6:
				System.out.println("Saturday");break;
			case 7:
				System.out.println("Sunday");break;
			default:
				System.out.println("wrong input");
		}
	}

}
