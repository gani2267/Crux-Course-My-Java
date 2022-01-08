package LinkedList;

public class LL_AsQueue {
	
	LinkedList queue;
	
	public LL_AsQueue() {
		queue=new LinkedList();
	}
	
	public int size() {
		return this.queue.getSize();
	}
	
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	public void enqueue(int val) {
		this.queue.addLast(val);
	}
	
	public int dequeue() throws Exception {
		
		if(this.size()==0) {
			throw new Exception("Queue is empty");
		}
		int rv= this.queue.removeFirst();
		return rv;
	}
	
	
    public int getFront() throws Exception {
		
		if(this.size()==0) {
			throw new Exception("Queue is empty");
		}
		int rv=this.queue.getFirst();
		return rv;
	}
    
    
    public void display() {
    	this.queue.display();
    }
	
}
