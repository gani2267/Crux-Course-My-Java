package oops;

public class FunctionWithVariableNoOfArgument {

	public static void main(String[] args) {
		
		System.out.println(sum(2,3,4,5,4,3,2,6));
		
		System.out.println(sum2("Hello",2,3,4,5,4,3,2,6));
		
		int[] arr= {1,2,3,4,3,2,2,2};
		System.out.println(sum(arr));
		System.out.println(sum2("Hello",arr));
		
	}

	public static int sum(int... arr) {

		int sum = 0;
		for (int i : arr) {
			sum += i;
		}

		return sum;
	}
	
//	public static int sum2(int...ar,double...vr) { }  //not valid two variable args
		
	
//	public static int sum2(int...ar,String str) { }  //not valid variable args	must be at last
	
	
	public static String sum2(String str,int...ar) { 
		
		int sum = 0;
		for (int i : ar) {
			sum += i;
		}

		return str+sum;
	}  
	
	
}
