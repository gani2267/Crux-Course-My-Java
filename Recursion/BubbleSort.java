package Recursion;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {66,55,44,33,22};
		BubbleSort(arr,0,arr.length-1);
		
		display(arr);
		
	}
	
	public static void BubbleSort(int[] arr,int i,int j){
		if(j==0) {
			return;
		}
		
		if(i<j) {
		  if(arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		  }
		  BubbleSort(arr,i+1,j);
		  return;
		}
		
		BubbleSort(arr,0,j-1);
		
	}
	
	public static void display(int[] arr) {
		System.out.print("Elements in array are : ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
