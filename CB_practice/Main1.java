package CB_practice;

import java.util.*;
public class Main1 {
    public static void main(String args[]) {
    	
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int c;
    	int a=n-1;
    	int d=-1;
    
    	for(int i=1; i<=n; i++) {
    		
    		if(i==1 || i==n) {
    			for(int j=1; j<n; j++) {
    				System.out.print(" ");
    			}
    			System.out.print(1);
    		}
    		else {
    			
    			if(n/2>=(i-1)) {a-=2; c=i; d+=2;}
    			else {a+=2;   c=n-i+1; d-=2;}
    			
    			for(int j=1; j<=a; j++) {
    				System.out.print(" ");
    			}
    			for(int j=c; j>0; j--) {
    				System.out.print(j);
    			}for(int j=1; j<=d; j++) {
    				System.out.print(" ");
    			}for(int j=1; j<=c; j++) {
    				System.out.print(j);
    			}
    			
    		}
    		System.out.println();
    	}
 }
}