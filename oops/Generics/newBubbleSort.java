package oops.Generics;

import java.util.Comparator;

public class newBubbleSort {
	
public static void main(String[] args) {
		
		car[] a=new car[5];
		a[0]=new car(1000,400,"Red");
		a[1]=new car(2000,200,"Yellow");
		a[2]=new car(500,900,"Black");
		a[3]=new car(300,30,"Grey");
		a[4]=new car(700,60,"White"); 
		
		display(a);
		
		System.out.println("increasing order of speed");
		bubbleSort(a,new CarSpeedComparator());
		display(a);
		
		System.out.println("increasing order of price");
		bubbleSort(a,new CarPriceComparator());
		display(a);
		
		System.out.println("increasing order of colour (i.e. in lexigonal oreder)");
		bubbleSort(a,new CarColourComparator());
		display(a);
		
//		Integer[] arrI= {2,34,2,3,43,2,1,6,4};
//		bubbleSort(arrI);
//		display(arrI);
	}
	
	
    public static <T> void bubbleSort(T[] arr, Comparator<T> v) {

		
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j < arr.length - 1-i; j++) {

				if (v.compare(arr[j],arr[j+1]) > 0) {
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
