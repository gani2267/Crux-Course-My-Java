package Queue;

import java.util.LinkedList;

public class QueueUsingLL {           //queue using Linked list
	
	LinkedList<Integer> queue;
	
	public QueueUsingLL() {
		queue= new LinkedList<>();
	}
	
	public int size() {
		return this.queue.size();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void enqueue(int a) {
		queue.addLast(a);
	}
	
	public int dequeue() throws Exception {
		
		if(this.size()==0) {
			throw new Exception("Queue is empty");
		}
		
		return queue.removeFirst();
	}
	
	public int getFront() throws Exception {
		
		if(this.size()==0) {
			throw new Exception("Queue is empty");
		}
		
		return queue.getFirst();
	}
	
}
