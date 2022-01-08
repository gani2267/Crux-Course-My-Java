package oops;

public class Person {
	String name;
	int age;                        // this is default access classifier
	
	public int roll_no;            //pakage ke bahar use karke dekho ise
	private int reg_no;           
	
	public int getReg_no() {
		return this.reg_no;
	}
	
	void setReg_no(int reg_no) {
		this.reg_no=reg_no;
	}
	
	private int testing;                //below is created by using shrotcut of getters and setters
	public int getTesting() {
		return testing;
	}

	public void setTesting(int testing) {
		this.testing = testing;
	}
}
