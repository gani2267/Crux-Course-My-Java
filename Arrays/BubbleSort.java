package Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {66,55,44,33,22};
		
		display(arr);
		BubbleSort(arr);
		System.out.println("After Bubble Sort");
		display(arr);

	}
	
	public static void BubbleSort(int[] arr) {
		
		for(int i=0; i<(arr.length-1); i++) {
			for(int j=0; j<(arr.length-1-i); j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
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
