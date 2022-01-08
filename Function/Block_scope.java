package Function;

public class Block_scope {
	
	public static void main(String[] args) {
		
		{
			int a=20;
			System.out.println(a);
		}
//		System.out.println(a);           //error a is not in scope
		
		if(true) {
			int b=12;
			System.out.println(b);
		}
//		System.out.println(b);           //error b is not in scope
	}

}
