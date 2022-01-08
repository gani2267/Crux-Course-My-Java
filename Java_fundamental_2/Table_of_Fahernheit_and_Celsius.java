package Java_fundamental_2;

public class Table_of_Fahernheit_and_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;

		for(int i=0; i<=300; i+=20) {
			c=(int)((5.0/9)*(i-32));
			System.out.println(i+"\t"+c);
		}
	}

}
