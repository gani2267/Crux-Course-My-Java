package Java_fundamental_2;

import java.util.Scanner;

public class taking_input_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		
		System.out.println(ch);
		if(ch>64 && ch<=90) {
			System.out.println("Capital letter");
		}else if(ch>=97 && ch<=122){
			System.out.println("Small letter");
		}else
			System.out.println("Invalid input");
		
		if(ch>='A' && ch<='Z') {
			System.out.println("Capital letter");
		}else if(ch>='a' && ch<='z'){
			System.out.println("Small letter");
		}else
			System.out.println("Invalid input");
	}

}
