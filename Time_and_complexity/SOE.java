package Time_and_complexity;

import java.util.*;

public class SOE {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter num upto which prime no you want : ");
		int n=sc.nextInt();
		
		soe(n);
	}
	
	public static void soe(int n) {
		
		boolean[] prime=new boolean[n+1];
		Arrays.fill(prime, true);		
		
		prime[0]=prime[1]=false;
		
		for(int i=2; i*i<=n; i++) {
			
			if(prime[i]==false) {
				continue;
			}
			
			for(int j=2; i*j<=n; j++) {
				prime[i*j]=false;
			}
		}
		
		for(int i=0; i<=n; i++) {
			if(prime[i]) {
				System.out.print(i+" ");
			}
		}
	}

}
