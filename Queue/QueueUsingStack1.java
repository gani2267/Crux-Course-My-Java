package Queue;

import java.util.Stack;

//Enqueue efficient
public class QueueUsingStack1 {

	Stack<Integer> primary = new Stack();
	Stack<Integer> secondary = new Stack();
	
	//O(1)
	public void enqueue(int val) {
		this.primary.add(val);
	}
	
	//O(n)
	public int dequeue() throws Exception {
		
		if(this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		
		while(!this.primary.isEmpty()) {
			this.secondary.add(this.primary.pop());
		}
		
		int rv=this.secondary.pop();
		while(!this.secondary.isEmpty()) {
			this.primary.add(this.secondary.pop());
		}
		
		return rv;
	}
	
	//O(n)
     public int getFront() throws Exception {
    	 
    	 if(this.isEmpty()) {
 			throw new Exception("Stack is Empty");
 		}
		
    	 while(!this.primary.isEmpty()) {
 			this.secondary.add(this.primary.pop());
 		}
		
		int rv=this.secondary.peek();
		while(!this.secondary.isEmpty()) {
			this.primary.add(this.secondary.pop());
		}
		
		return rv;
	}
	
   //O(1)
	public int size() {
		return this.primary.size();
	}
	
	//O(1)
	public boolean isEmpty() {
		return this.primary.size()==0;
	}
	
	//O(n)
	public void display() {
		while(!this.primary.isEmpty()) {
			this.secondary.add(this.primary.pop());
		}
		
		while(!this.secondary.isEmpty()) {
			System.out.print(this.secondary.peek()+" ");
			this.primary.add(this.secondary.pop());
		}
		
		System.out.println();
	}
	
}
