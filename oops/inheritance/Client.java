package oops.inheritance;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("-----------------P instance and P reference--------------");
		P obj1=new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();
		
		System.out.println("\n-----------------C instance and P reference--------------");
		P obj2=new C();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
//		System.out.println(obj2.d2);                //This gives an error 
		System.out.println(((C)obj2).d2);
		obj2.fun();
		obj2.fun1();
		((C)obj2).fun2();
		
		System.out.println("\n-----------------P instance and C reference--------------");
//		C obj3=new P();     //This is not allowed in java
		
		System.out.println("\n-----------------C instance and C reference--------------");
		C obj4=new C();
		System.out.println(obj4.d);
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);                
		obj4.fun();
		obj4.fun1();
		obj4.fun2();
		System.out.println(((P)obj4).d);                
		((P)obj4).fun();                     // parent class ka function call nahi kiya ja sakta
		
	}

}
