package oops;

public class animal {
	int age;
	String name;
	
	public animal() {
		System.out.println("This is default constructor without any argument");
	}
	
	public animal(int age) {
		System.out.println("This is constructor with one argument");
		this.age=age;
	}
	
	//above code for constructor with one agrument can be written as below
//	public animal(int y) {
//		System.out.println("This is constructor with one argument");
//		age=y;
//	}
	
	public animal(int age,String name) {
		System.out.println("This is constructor with Two argument");
		this.age=age;
		this.name=name;
	}

}
