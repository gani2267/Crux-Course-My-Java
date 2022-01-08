package Queue;


//this is pop efficient approach i.e. pop fxn takes place in constant time but other operation may take time
public class StackUsingTwoQueues2 {
	
	Queue q1=new Queue();
	Queue q2=new Queue();
	
	Queue primary=q1;
	Queue secondary=q2;
	
	public int size() {
		return primary.size();
	}
	
	public boolean isEmpty() {
		return primary.isEmpty();
	}
	
	
	//O(n)
	public void push(int a) throws Exception {
		if(primary.size()== primary.Default_Capacity) {
			throw new Exception("Stack is full");
		}
		
		secondary.enqueue(a);
		
		while(!primary.isEmpty()) {
			secondary.enqueue(primary.dequeue());
		}
		
		Queue temp=primary;
		primary=secondary;
		secondary=temp;
	}
	
	//O(1)
	public int pop() throws Exception {
		if(primary.size()==0) {
			throw new Exception("Stack is empty");
		}
		
		return primary.dequeue();
	}
	
	//O(1)
	public int top() throws Exception {
		if(primary.size()==0) {
			throw new Exception("Stack is empty");
		}
		
		return primary.getfront();
	}
	
	//O(n)
	public void display() {
		this.primary.display();
	}

}
