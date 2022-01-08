package oops.inheritance;

import oops.StackUsingArray;

public class DyanamicStack extends StackUsingArray {

	public DyanamicStack() throws Exception {
		this(Default_Capacity);
	}

	public DyanamicStack(int capacity) throws Exception {
		super(capacity);
	}

	@Override
	public void push(int value) throws Exception {
		if (this.size() == this.data.length) {
			int[] arr = new int[2 * this.data.length];
			
			for(int i=0; i<this.size(); i++) {
				arr[i]=this.data[i];
			}
			this.data=arr; 
		}
		
		super.push(value);
	}
}
