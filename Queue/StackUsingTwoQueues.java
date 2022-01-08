package Queue;

//push efficient method
public class StackUsingTwoQueues {
	
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
	
	//O(1)
	public void push(int a) throws Exception {
		if(primary.size()== primary.Default_Capacity) {
			throw new Exception("Stack is full");
		}
		
		primary.enqueue(a);
	}
	
	//O(n)
	public int pop() throws Exception {
		if(primary.size()==0) {
			throw new Exception("Stack is empty");
		}
		
		int a=this.primary.size();
		for(int i=1; i<a; i++) {
			secondary.enqueue(primary.getfront());
			primary.dequeue();
		}
		
		Queue temp=primary;
		primary=secondary;
		secondary=temp;
		
		int rv=secondary.getfront();
		secondary.dequeue();
		return rv;
	}
	
	//O(n)
	public int top() throws Exception {
		if(primary.size()==0) {
			throw new Exception("Stack is empty");
		}
		
		int a=this.primary.size();
		for(int i=1; i<a; i++) {
			secondary.enqueue(primary.getfront());
			primary.dequeue();
		}
		
		Queue temp=primary;
		primary=secondary;
		secondary=temp;
		
		int rv=secondary.getfront();
		primary.enqueue(secondary.dequeue());
		return rv;
	}
	
	//O(n)
	//not normal display of queue we have to use display reversed queue
	public void display() throws Exception {
		this.ReverseQueue(this.primary);
		this.primary.display(); 
		
		this.ReverseQueue(this.primary);
	}
	
    public static void ReverseQueue(Queue q) throws Exception {
		
		if(q.isEmpty()) {
			return ;
		}
		
		int a= q.dequeue();
		ReverseQueue(q);
		q.enqueue(a);
	}
	
}
