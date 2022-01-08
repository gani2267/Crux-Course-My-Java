package oops;

public class animalClient {

	public static void main(String[] args) {
		
		animal A=new animal();
		System.out.println(A.name);
		System.out.println(A.age);
		System.out.println("======================================");
		
		animal B=new animal(25);
		System.out.println(B.name);
		System.out.println(B.age);
		System.out.println("======================================");
		
		animal C=new animal(25,"Tiger");
		System.out.println(C.name);
		System.out.println(C.age);
		System.out.println("======================================");

	}

}
