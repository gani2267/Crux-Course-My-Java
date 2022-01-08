package Arrays;

import java.util.Scanner;

public class ArrayOps {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] a=TakeInput();
		
		display(a);
		
	}
	
	public static int[] TakeInput() {
		System.out.print("Enter size of array : ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.print("Enter elements in array giving spaces : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		return arr;
	}
	
	public static void display(int[] arr) {
		System.out.print("Elements in array are : ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
