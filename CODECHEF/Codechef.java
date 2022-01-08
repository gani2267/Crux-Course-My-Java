package CODECHEF;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int arr[] = new int[5];
		
		for (int i = 0; i < t; i++) {
			int dr=0;
			int in=0,en=0;
			
			for (int j = 0; j < 5; j++) {
				arr[j] = sc.nextInt();
				if(arr[j]==0) {
					dr++;
				}else if(arr[j]==1) {
					in++;
				}else if(arr[j]==2){
					en++;
				}
			}
			
			if(en == in) {
				System.out.println("DRAW");
			}else if(in > en) {
				System.out.println("INDIA");
			}else {
				System.out.println("ENGLAND");
			}
			
		}
	}
}