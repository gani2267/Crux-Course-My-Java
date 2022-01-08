package oops.inheritance;

import oops.StackUsingArray;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        StackUsingArray stack=new DyanamicStack(5);
		
		for(int i=1; i<=5; i++) {
			stack.push(i*10);
			stack.display();
		}
		
		stack.push(60);   // will not give error as stack is Dyanamic now
		stack.push(70);
		stack.push(80);
		
		
		System.out.println(stack.top());
		stack.display();
		System.out.println(stack.top());
		
		stack.pop();
		stack.display();
		System.out.println(stack.top());
		
		System.out.println("\n=====================================");
		while(!stack.isEmpty()) {
			stack.display();
			stack.pop();
		}
		
//		stack.pop();     //will give error as stack become empty
		

	}

}
