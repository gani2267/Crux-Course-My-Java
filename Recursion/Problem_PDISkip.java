package Recursion;

public class Problem_PDISkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);
	}
	
	public static void fun(int n) {
		if(n<=0) {
			return;
		}
		System.out.println(n);
		fun(n-2);
		if((n-1)>0) {
			System.out.println(n-1);
		}
	}

}
