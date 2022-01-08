package Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] arr= {88,11,44,99,33};
		
		display(arr);
		InsertionSort(arr);
		System.out.println("After Insertion Sort");
		display(arr);
	}
	
	public static void InsertionSort(int[] arr) {
		
		for(int counter=1; counter<arr.length; counter++) {
			int val=arr[counter];
			
			for(int j=(counter-1); j>=0; j--) {
				if(arr[j]>val) {
					arr[j+1]=arr[j];
					arr[j]=val;
				}
				
			}
		}
	}
	
	public static void display(int[] arr) {
		System.out.print("Elements in array are : ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
