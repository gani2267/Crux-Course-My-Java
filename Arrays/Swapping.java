package Arrays;

public class Swapping {
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		
		int i=0,j=2;
		
		System.out.println(arr[i]+" "+arr[j]);
		
		swap1(arr[i],arr[j]);                   //simple call value
		System.out.println(arr[i]+" "+arr[j]);
		
		swap2(arr,i,j);                         //arr means address
		System.out.println(arr[i]+" "+arr[j]);
		
		System.out.println();
		int[] other={100,200,300};
		System.out.println(arr[0]+" "+other[0]);
		System.out.println(arr+" "+other);
		swap3(arr,other);
		System.out.println(arr[0]+" "+other[0]);
		System.out.println(arr+" "+other);
		
	}
	
	public static void swap1(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void swap2(int[] yo,int a,int b) {
		int temp=yo[a];
		yo[a]=yo[b];
		yo[b]=temp;
	}
	
	public static void swap3(int[] a, int[] b) {
		int[] temp=a;
		a=b;
		b=temp;
	}
}
