package Queue;

public class Queue {                 //Queue using array

	private int[] data;
	private int size;
	private int front;

	public static final int Default_Capacity = 5;

	public Queue() {
		this(Default_Capacity);
	}

	public Queue(int capacity) {
		data = new int[capacity];
		front = 0;
		size = 0;
	}

	public void enqueue(int val) throws Exception {

		if (this.isFull()) {
			throw new Exception("Queue is full");
		}

		int idx = (this.front + this.size) % this.data.length;
		this.data[idx] = val;

		this.size++;
	}

	public int dequeue() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("Queue is empty");
		}

		int rv = data[front];
		data[front] = 0;

		this.size--;
		this.front = (this.front + 1) % this.data.length;

		return rv;
	}

	public int getfront() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("Queue is empty");
		}

		int rv = this.data[this.front];
		return rv;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == data.length;
	}

	public void display() {

		for (int i = 0; i < this.size; i++) {
			int idx = (this.front + i) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}

		System.out.println(".");
		System.out.println("----------------------");
	}

}
