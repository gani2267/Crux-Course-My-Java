package crux_online;

import java.nio.file.FileSystemLoopException;
import java.util.Scanner;

public class if_elseif_ladder {

	public static void main(String[] args) {

		System.out.print("Enter your age : ");
		Scanner b = new Scanner(System.in);
		int age = b.nextInt();
		
		if(age>0) {
		if (age <= 11)
			System.out.println("you are child");
		else if (age <= 18)
			System.out.println("you are teenager");
		else if (age <= 60 && age>19)
			System.out.println("you are adult");
		else
			System.out.println("you are old");
		}
	}

}
