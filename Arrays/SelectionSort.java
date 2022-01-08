package Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {66,55,44,33,22};
		
		display(arr);
		SelectionSort(arr);
		System.out.println("After Selection Sort");
		display(arr);
	}
	
	public static void SelectionSort(int[] arr) {
		
		
		for(int i=0; i<(arr.length-1); i++) {
			int min=i;
			
			for(int j=i+1; j<(arr.length); j++) {
				
				if(arr[min]>arr[j]) {
					min=j;
				}
				
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
				
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
