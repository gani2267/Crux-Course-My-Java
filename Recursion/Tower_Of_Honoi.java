package Recursion;

public class Tower_Of_Honoi {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		
		toh(n,"source","Target","Helper");
		System.out.println("Number of steps : "+ count);
		
	}
	
	public static void toh(int n,String source,String target,String helper) {
		if(n==0) {
			return;
		}
		
		toh(n-1,source,helper,target);
		System.out.println("Move "+n+"th disc from "+source+" to "+target);
		count++;
		toh(n-1,helper,target,source);
		
	

	}

}
