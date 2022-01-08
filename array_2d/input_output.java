package array_2d;

import java.util.Scanner;

public class input_output {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int[][] b=takeInput();
		display(b);
		
		
	}
	
	public static int[][] takeInput() {
		System.out.print("Enter no of subarrays : ");
		int r=sc.nextInt();
		
		int[][] arr=new int [r][];
		
		for(int i=0; i<r; i++) {
			
		System.out.print("Enter no of element in subarray "+i+"th : ");
		int r1=sc.nextInt();
		
		arr[i]=new int [r1];
		}
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print("Enter "+i+"th and "+j+"th no in array : ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		return arr;
	}
	
	public static void display(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
