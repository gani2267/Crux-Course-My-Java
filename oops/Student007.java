package oops;

public class Student007 {
	
	private String name;
	private int age;
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) throws Exception {
		
		if(age<0) {
			throw new Exception("Age can't be negative");
		}
		this.age=age;
	}

}
