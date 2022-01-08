package oops.Generics;

public class Demo {

	public static void main(String[] args) {
		
		int[] arri= {2,34,2,3,43,2,1,6,4};
		Integer[] arrI= {2,34,2,3,43,2,1,6,4};
		String[] arrs= {"Hello","Indid","Delhi","CB"};
		char[] arrc= {'d','e','w','a','c'};
		Character[] arrC= {'d','e','w','a','c'};
		
//		display(arri);         //will give the error
		display(arrI);
		display(arrs);
//		display(arrc);         //will give the error
		display(arrC);
		
		cars[] c=new cars[5];
		for(int i=0; i<5; i++) {
			c[i]=new cars(200+i,10+i,"yo"+i);
		}
		display(c);
	}
	
	public static <T> void display(T[] arr) {
		
		for(T val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
