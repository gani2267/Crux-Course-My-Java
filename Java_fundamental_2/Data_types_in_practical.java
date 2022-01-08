package Java_fundamental_2;

public class Data_types_in_practical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		short sh=20;
		int in=30;
		long ln=40;
		
		//Part 1
		
//		b=sh;              //error
//		b=in;              //error
//		b=ln;              //error
		
		sh=b;
//		sh=in;             //error
//		sh=ln;             //error
		
		in=b;
		in=sh;
//		in=ln;             //error
		
		ln=b; 
		ln=sh;
		ln=in;
		
		
		//Part 2
		
		b=10;
		b=127;
//		b=128;             //error
		b=(byte)128;
		
		System.out.println(b);
		
		
		//Part 3
		
		in=1000000000;
//		in=10000000000;   //error
		
//		ln=10000000000;   //error
		ln=10000000000L;
		System.out.println(ln);
		
		
		//Part 4
		sh=32000;
		
		//Part 5
		
//		float f=5.5;      //error 
		float f=5.5f;
		double db=6.5;
		
		System.out.println(f);
		System.out.println(db);
		
		
		//Part 6
		
		f=5.8f;
//		in=f;             //error
		in=(int)f;
		System.out.println(in);
		
		f=5.8f;
		in=(int)Math.round(f);
		System.out.println(in);
		
		in=11;
		f=in;
		System.out.println(f);
		
		
		//part 7
		
		boolean a=true;
//		a=0;               //error not valid in java
//		a=1;               //error not valid in java
		
		if(a) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		a=!a;
		if(a) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		
		//Part 8
		
		char ch='a';
		ch=99;
		System.out.println(ch);
		
		ch=64000;
		System.out.println(ch);
		
		ch=99;
//		ch=ch+2;       //error
		ch=(char)(ch+2);
		System.out.println(ch);
		
		in=ch;
		System.out.println(in);
		
//		ch=68000;      //error
		ch=(char)68000;
		System.out.println(ch);
	}

}
