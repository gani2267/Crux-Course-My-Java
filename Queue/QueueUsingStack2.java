package Queue;

import java.util.Stack;

public class QueueUsingStack2 {

	Stack<Integer> primary = new Stack();
	Stack<Integer> secondary = new Stack();
	
	//O(n)
	public void enqueue(int val) {

		while (!this.primary.isEmpty()) {
			this.secondary.add(this.primary.pop());
		}

		this.primary.add(val);

		while (!this.secondary.isEmpty()) {
			this.primary.add(this.secondary.pop());
		}

	}

	//O(1)
	public int dequeue() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("Queue is empty");
		}

		return this.primary.pop();
	}

	//O(1)
	public int getFront() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("Queue is empty");
		}

		return this.primary.peek();
	}

	//O(1)
	public int size() {
		return primary.size();
	}

	//O(1)
	public boolean isEmpty() {
		return this.size() == 0;
	}

	//O(n)
	public void display() {

		while (!this.primary.isEmpty()) {
			System.out.print(this.primary.peek() + " ");
			this.secondary.add(this.primary.pop());
		}
		
		while(!this.secondary.isEmpty()) {
			this.primary.add(this.secondary.pop());
		}
		
		System.out.println();
	}

}
