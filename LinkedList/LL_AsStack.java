package LinkedList;

public class LL_AsStack {
	
    LinkedList stack;
	
	public LL_AsStack() {
		stack=new LinkedList();
	}
	
	public int size() {
		return this.stack.getSize();
	}
	
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	public void push(int val) {
		this.stack.addFirst(val);
	}
	
	public int pop() throws Exception {
		
		if(this.size()==0) {
			throw new Exception("Stack is empty");
		}
		
		return this.stack.removeFirst();
	}
	
	public int top() throws Exception {
		
		if(this.size()==0) {
			throw new Exception("Stack is empty");
		}
		
		return this.stack.getFirst();
	}
	
	public void display() throws Exception {
		this.stack.display();
	}

}
