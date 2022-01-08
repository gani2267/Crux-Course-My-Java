package oops.inheritance;

public class C extends P{
	
//	@Override                   //yaha ye use nahi kiya ja sakta kyunki int method(fxn) nahi he
	int d=20; 
	int d2=200;
	
	@Override                                 //iska use dekh lo method(fxn) overriding me
	public void fun() {
		System.out.println("Printing fun of C");
	}
	
	public void fun2() {
		System.out.println("Printing fun2 of C");
	}

}
