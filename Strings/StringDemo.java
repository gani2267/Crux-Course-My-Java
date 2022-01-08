package Strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String str="Hello";
		String s1="Bye";
		
		//part 2
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		
		//part 3
		System.out.println("\npart 3 : ");
		System.out.println(str.substring(2,4));
		String a=str.substring(2,4);
		System.out.println(a);
		System.out.println(str.substring(2,5));
		System.out.println(str.substring(3,3));
		System.out.println(str.substring(0,3));
		System.out.println(str.substring(3));
		
		//part 4
		System.out.println("\npart 4 : ");
		String s3=str+s1;
		String s4=s1.concat(str);
		
		System.out.println(s3);
		System.out.println(s4);
		
		//part 5
		System.out.println("\npart 5 : ");
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("El"));
		
		String b="lo";
		System.out.println(str.indexOf(b));
		
		//part 6
		System.out.println("\npart 6 : ");
		System.out.println(str.startsWith("he"));
		System.out.println(str.startsWith("He"));
		
		//part 7
		System.out.println("\npart 7 : ");
		s1="Hello";
		String s2=s1;
		s3="Hello";
		
		s4=new String("Hello");
		
		System.out.println((s1==s2)+" "+(s1.equals(s2)));
		System.out.println((s1==s3)+" "+(s1.equals(s3)));
		System.out.println((s1==s4)+" "+(s1.equals(s4)));
	}

}
