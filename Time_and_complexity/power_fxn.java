package Time_and_complexity;

public class power_fxn {

	public static void main(String[] args) {
		
		//pow fxn algo is better for use
		
		int a=72;
		long start=System.currentTimeMillis();
		int ans=power(a,7);
		long end=System.currentTimeMillis();
		System.out.println(ans);
		System.out.println("Time taken by O(n) fxn : "+(end-start));
		
		System.out.println("==================================");
		
		start=System.currentTimeMillis();
		int ans2=pow(a,7);
		end=System.currentTimeMillis();
		System.out.println(ans2);
		System.out.println("Time taken by O(log n) fxn : "+(end-start));
		

	}
	
	public static int power(int x,int n) {
		
		int ans=1;
		for(int i=1; i<=n; i++) {
			ans=ans*x;
		}
		return ans;
	}
	
	public static int pow(int x,int n) {
		
		if(n==0) {
			return 1;
		}
		
		int ans;
		if(n%2 !=0) {
			ans=pow(x,n/2)*pow(x,n/2)*x;
		}
		else {
			ans=pow(x,n/2)*pow(x,n/2);
		}
		return ans;
	}

}
