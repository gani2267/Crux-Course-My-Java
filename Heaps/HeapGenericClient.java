package Heaps;

import oops.Generics.cars;

public class HeapGenericClient {

	public static void main(String[] args) {
		
		cars[] a=new cars[5];
		a[0]=new cars(1000,400,"Red");
		a[1]=new cars(2000,200,"Yellow");
		a[2]=new cars(500,900,"Black"); 
		a[3]=new cars(300,30,"Grey");
		a[4]=new cars(700,60,"White");
		
		HeapGeneric<cars> heapg = new HeapGeneric<>();
		heapg.add(a[0]);
		heapg.add(a[1]);
		heapg.add(a[2]);
		heapg.add(a[3]);
		heapg.add(a[4]);
		
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		

	}

}
