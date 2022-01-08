package oops;

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println(sum(3, 2));
		System.out.println(sum(3, 2, 4));
		System.out.println(sum(3.3, 2.2));
	}

	public static int sum(int a, int b) {
		return 2;
	}

	public static int sum(int a, int b, int c) {
		return 3;
	}

	public static int sum(double a, double b) {
		return 211;
	}

	// Return type ke basis pe method(fxn) differ nahi kiya ja sakta
//	public static void sum(int a,int b) {
//		System.out.println(a+b);
//	}

}
