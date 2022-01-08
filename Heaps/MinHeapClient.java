package Heaps;

import java.util.ArrayList;

public class MinHeapClient {

	public static void main(String[] args) {
		
		MinHeap heap=new MinHeap();
		
		heap.add(10);   heap.display();
		heap.add(20);   heap.display();
		heap.add(30);   heap.display();
		heap.add(5);   heap.display();
		heap.add(15);   heap.display();
		heap.add(25);   heap.display();
		heap.add(02);   heap.display();
		
		System.out.println("==================");
		System.out.println("removing : " + heap.remove());
		heap.display();
		System.out.println("removing : " + heap.remove());
		heap.display();
		System.out.println("removing : " + heap.remove());
		heap.display();
		
		
		
//		//creating sorted arraylist from heap.
//		System.out.println("==================================");
//		ArrayList<Integer> arr=new ArrayList<>();
//		while(!heap.isEmpty()) {
//			arr.add(heap.remove());
//		}
//		
//		System.out.println("Sorted ArrayList : " + arr);
		
		
	}

}
