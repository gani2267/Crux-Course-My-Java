package Strings;

public class String_Performance {

	public static void main(String[] args) {
	
		long start=System.currentTimeMillis();
		
//		appendString(100000);
		//Play on off with string and string builder and feel speed
		appendStringBuilder(100000);
		
		long end=System.currentTimeMillis();
		
		System.out.println(end-start);  //output will be in millisecond
		//1000 millisecond=1 sec
		
		

	}
	
	public static void appendString(int n) {
		
		String s="";
		
		for(int i=1; i<=n; i++) {
			s=s+i;
		}
	}
	
    public static void appendStringBuilder(int n) {
		
		StringBuilder sb=new StringBuilder("");
		
		for(int i=1; i<=n; i++) {
			sb.append(i);
		}
	}

}
