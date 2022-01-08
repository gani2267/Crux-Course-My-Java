package CB_practice;

import java.util.*;
public class Measuring_factorials_of_big_integers {
	
    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		fac(n);
	    
	}	
    
    public static void fac(int n) {
    	int[] ans=new int[1500];
    	ans[0]=1;
    	
    	int arrused=1;
    	for(int i=2; i<=n; i++) {
    		arrused=process(i,ans,arrused);
    	}
    	
    	display(ans,arrused);
    	
    }
    
    public static int process(int n,int[] arr,int arrused) {
    	
    	int hatachya=0;
    	
    	for(int i=0; i<arrused ; i++) {
    		
    		int product=arr[i]*n+hatachya;
    		
    		arr[i]=product%10;
    		
    		hatachya=product/10;
    		
    	}
    	
    	while(hatachya!=0) {
    		
    		arr[arrused]=hatachya%10;
    		hatachya=hatachya/10;
    		arrused++;
    	}
    	return arrused;
    }
    
    public static void display(int[] arr,int arrused) {
    	
    	for(int i=arrused-1; i>=0; i--) {
    		System.out.print(arr[i]);
    	}
    }
    
    
}
