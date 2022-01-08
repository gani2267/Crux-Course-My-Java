package LinkedList;

public class LinkedList {

	class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public int getSize() {
		return this.size;
	}

	// O(n)
	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// O(1)
	public void addLast(int a) {

		Node nn = new Node();
		nn.data = a;

		if (this.size == 0) {

			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {

			this.tail.next = nn;
			this.tail = this.tail.next;
			size++;
		}
	}

	// O(1)
	public void addFirst(int a) {

		Node nn = new Node();
		nn.data = a;

		if (this.size >= 1) {
			nn.next = head;
			this.head = nn;
			this.size++;
		} else {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
	}

	// O(1)
	public int getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}
		return this.head.data;
	}

	// O(1)
	public int getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}
		return this.tail.data;
	}

	// O(n)
	public int getAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	// is getNodeAt fxn ko private banaya he taki bahar se node me change na kara
	// jaye
	// ye fxn likha he kyunki LinkedList ke bakike kuch fxn ispe dependent he
	// O(n)
	private Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp;
	}

	// inserting node at an index
	// O(n)
	public void addAt(int idx, int a) throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			this.addFirst(a);
		} else if (idx == this.size) {
			this.addLast(a);
		} else {
			Node nn = new Node();
			nn.data = a;

			Node y = this.getNodeAt(idx - 1);
			Node z = y.next;
			y.next = nn;
			nn.next = z;
			this.size++;
		}
	}

	// O(1)
	public int removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = head.next;
			this.size--;
		}

		return rv;
	}

	// O(n)
	public int removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		int rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sizem2 = this.getNodeAt(size - 2);
			this.tail = sizem2;
			this.tail.next = null;
			this.size--;
		}

		return rv;
	}

	// O(n)
	public int removeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		int rv;
		if (idx == 0) {
			return this.removeFirst();
		} else if (idx == this.size - 1) {
			return this.removeLast();
		} else {

			Node nm1 = this.getNodeAt(idx - 1);
			Node n = nm1.next;
			rv = n.data;

			nm1.next = n.next;
			this.size--;

		}

		return rv;
	}

	// data reverses and pointers remains same (Method 1 of reversing data)
	public void reverseData() throws Exception {

		int left = 0;
		int right = this.size - 1;

		while (left < right) {

			Node ln = this.getNodeAt(left);
			Node rn = this.getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;
		}

	}

	// data remains same but pointers reverses (Method 2 of reversing data)
	public void reversePointers() {

		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}

		// swap head and tail
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;
	}

	//getMid using getSize fxn
	public int getMid() throws Exception {
		if (this.size % 2 != 0) {
			return this.getAt(this.size / 2);
		}
		
		return this.getAt((this.size-1)/2);
	}
	
	//getMid without using getSize fxn
	//O(n)
	public int getMid2(){
		
		Node speed=this.head;
		Node doubleSpeed=this.head;
		
		while(doubleSpeed.next != null  && doubleSpeed.next.next !=null) {
			speed=speed.next;
			doubleSpeed=doubleSpeed.next.next;
		}
		
		return speed.data;
	}
	
	
	//we can't use size fxn and size variable
    //O(n) honi chahiye
	public int KthNodeFromLast(int k) throws Exception {
		
		if(k<=0 || k>this.size) {
			throw new Exception("Invalid value of k");
		}
		
		Node slow=this.head;
		Node fast=this.head;
		
		for(int i=1; i<=k; i++) {
			fast=fast.next;
		}
		
		while(fast != null) {
			slow=slow.next;
			fast=fast.next;
		}
		
		return slow.data;
	}
	
	
}
