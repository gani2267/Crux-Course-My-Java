package crux_online;

public class For_loop {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n=========================================");
		int j=0;
		for(;j<=5; j++) {
			System.out.print(j + " ");
		}
		
		System.out.println("\n=========================================");
		int k=0;
		for(;k<10;) {
			System.out.print(k + " ");
			k++;
		}
	}
}
