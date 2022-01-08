package Function;

public class simple_things {
	public static void main(String[] args) {
		
		addition();
		addition1(50,13);
		
		int k=addition2();
		System.out.println(k);
		
		System.out.println(addition3(33,12));
		
		int c=12; int d=34;
		System.out.println(addition3(c,d));
		
	}
	
	//function without parameter and without return type
	public static void addition() {
		int a=10;
		int b=5;
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	//function with parameter but no return type
	public static void addition1(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	
	//function without parameter with return type
	public static int addition2() {
		int a=10;
		int b=5;
		int sum=a+b;
		
		return sum;
	}
	
	//function with parameter with return type
	public static int addition3(int a,int b) {
		int sum=a+b;
		return sum;
	}
}
