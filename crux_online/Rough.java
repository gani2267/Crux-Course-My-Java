package crux_online;

import java.util.Scanner;
import java.util.*;


public class Rough {
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		
		int b;
		int n=1;
		
		for(int i=1; i<=n1; i++) {
			yo :
			b=(3*n+2);
			
			if(b%n2 !=0) {
				System.out.println(b);
			}else {
				n++;
				b=(3*n+2);
				
				if(b%n2 !=0) {
					System.out.println(b);
				}
			}
			n++;
		}

    }
}
