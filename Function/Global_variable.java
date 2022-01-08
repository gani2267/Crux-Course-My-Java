package Function;

public class Global_variable {
	
	public static int val=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		int val=200;
		System.out.println(val);
		System.out.println(Global_variable.val);
		
		System.out.println(fxn(100));
	}
	
	public static int fxn(int a) {
		int sum=a+val;
		return sum;
	}
	
	

}
