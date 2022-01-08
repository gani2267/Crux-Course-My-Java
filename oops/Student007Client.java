package oops;

public class Student007Client {
	
	public static void main(String[] args) throws Exception {
		
		Student007 s1=new Student007();
		
		System.out.println("Hello alpha 1");
		try {
			System.out.println("Hello alpha 2");
			s1.setAge(-10);                     //also try it for +10
			System.out.println("Hello alpha 3");
		}catch(Exception e) {
			System.out.println("Hello alpha 4");
			System.out.println(s1.getAge());
		}
		
		
		System.out.println("================================");
		s1.setAge(-10);
		System.out.println(s1.getAge());
		System.out.println("Hello alpha 5");
	}

}
