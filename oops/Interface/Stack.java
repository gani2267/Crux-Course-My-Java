package oops.Interface;

public class Stack implements StackI {

	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int sum(int a,int b) {         // we can add any method if we want
		System.out.println(StackI.size);
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
