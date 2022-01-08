package oops.Generics;

public class BubbleSort {

	public static void main(String[] args) {
		
		cars[] a=new cars[5];
		a[0]=new cars(1000,400,"Red");
		a[1]=new cars(2000,200,"Yellow");
		a[2]=new cars(500,900,"Black"); 
		a[3]=new cars(300,30,"Grey");
		a[4]=new cars(700,60,"White");
		
		display(a);
		bubbleSort(a);
		display(a);
		
		Integer[] arrI= {2,34,2,3,43,2,1,6,4};
		bubbleSort(arrI);
		display(arrI);
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j < arr.length - 1-i; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {
					swap(arr, j, j + 1);
				}
			}
		}
		
	}

	public static <T> void swap(T[] arr, int a, int b) {
		T temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
    public static <T> void display(T[] arr) {
		
		for(T val : arr) {
			System.out.println(val + " ");
		}
		System.out.println();
	}

}
