//Stack works internally in this manner

package oops.GenericClass;

import java.util.ArrayList;

public class StackUsingArrayGeneric<T> {

	protected ArrayList<T> data;
	protected int top;
	
	public static final int Default_Capacity=10;
	
	public StackUsingArrayGeneric()throws Exception{
		this(Default_Capacity);               //gives control to below fxn
	}
	
    public StackUsingArrayGeneric(int capacity) throws Exception {
    	if(capacity<1) {
    		throw new Exception("Invalid capacity");
    	}
    	
//    	T[] a=new T[capacity];       // in java generic array cannot be created
    	ArrayList<T> a=new ArrayList<>();
    	this.data=a;
    	this.top=-1;
	}
    
    public int size() {
    	return this.top+1;
    }
    
    public boolean isEmpty() {
    	return (this.size()==0);
    }
    
    public void push(T value) throws Exception{
    	if(this.size()==this.data.size()) {
    		throw new Exception("Stack is full");
    	}
    	
    	this.top++;
    	this.data.set(this.top+1, value);
    }
    
    public T pop() throws Exception{
    	if(this.size()==0) {
    		throw new Exception("Stack is Empty");
    	}
    	
    	T rv=this.data.get(this.top);
    	this.data.set(this.top, null);
    	this.top--;
    	
    	return rv;
    }
    
    public T top() throws Exception{
    	if(this.size()==0) {
    		throw new Exception("Stack is Empty");
    	}
    	
    	T rv=this.data.get(this.top);
    	return rv;
    }
    
    public void display() {
    	for(int i=this.top; i>=0; i--) {
    		System.out.print(this.data.get(i)+", ");
    	}
    	System.out.println("End");
    }
    
    
    
}
