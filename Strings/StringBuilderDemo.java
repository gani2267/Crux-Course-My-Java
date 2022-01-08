package Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello");
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(1));
		
		//update
		sb.setCharAt(2, 'w');
		System.out.println("Updated : "+sb);
		
		//insert
		System.out.println();
		sb.insert(2, "a");
		System.out.println("Inserted 1 : "+sb);
		sb.insert(4, "bc");
		System.out.println("Inserted 2 : "+sb);
		
		StringBuilder s=new StringBuilder("Hello");
		s.insert(5, "lmn");
		System.out.println("Inserted 3 : "+s);
		
		//append
		System.out.println();
		s.append("xyz");
		System.out.println("Appended : "+s);
		
		//delete
		s.deleteCharAt(2);
		System.out.println("After deletion : "+s);
		s.delete(2, 5);
		System.out.println("After deletion : "+s);
	}

}
