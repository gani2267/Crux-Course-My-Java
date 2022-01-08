package Arrays;

public class DemoArray {

	public static void main(String[] args) {
		
		//declaring
		int[] arr=null;
		System.out.println(arr);
		
		//allocating space
		arr=new int [5];
		System.out.println(arr);
		
		System.out.print("Default values of arr : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.print("Updated values of arr : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		//using range based for loop (also known as inhanced for loop)
		System.out.print("Range based for loop (also known as inhanced for loop) : ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
	}

}
