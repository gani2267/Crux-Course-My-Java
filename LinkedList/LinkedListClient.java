package LinkedList;

public class LinkedListClient {

	public static void main(String[] args) throws Exception{
		
		LinkedList ll=new LinkedList();
		
		ll.addFirst(12);
		
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		
		ll.addFirst(0);
		ll.addFirst(33);
		ll.display();
		
		System.out.println(ll.KthNodeFromLast(2));
//		System.out.println();
//		System.out.println("1st element : "+ll.getFirst());
//		System.out.println("last element : "+ ll.getLast());
//		System.out.println("3 index (i.e. 4th element) : "+ ll.getAt(3));
		
		
//		ll.addAt(0, 50);
//		ll.display();
//		
//		ll.addAt(8, 222);
//		ll.display();
//		
//		ll.addAt(2, 32);
//		ll.display();
//		System.out.println(ll.getSize());
		
		
//		System.out.println(ll.removeFirst());
//		ll.display();
//		
//		System.out.println(ll.removeLast());
//		ll.display();
//		
//		System.out.println(ll.removeAt(1));
//		ll.display();
//		
//		System.out.println(ll.removeAt(0));
//		ll.display();
//		
//		System.out.println(ll.removeAt(ll.getSize()-1));
//		ll.display();
//		System.out.println();
		
		
//		ll.reverseData();
//		ll.display();
//		 
//		ll.reversePointers();
//		ll.display();
//		
//		System.out.println(ll.getSize());
//		System.out.println("Mid element : "+ll.getMid());
//		System.out.println("Mid element : "+ll.getMid2());
//		ll.removeLast();
//		System.out.println();
//		ll.display();
//		System.out.println(ll.getSize());
//		System.out.println("Mid element : "+ll.getMid());
//		System.out.println("Mid element : "+ll.getMid2());
		
		
	}

}
