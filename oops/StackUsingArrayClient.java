package oops;

public class StackUsingArrayClient {

	public static void main(String[] args) throws Exception {
		
		StackUsingArray stack=new StackUsingArray(5);
		
		for(int i=1; i<=5; i++) {
			stack.push(i*10);
			stack.display();
		}
		
//		stack.push(60);   // will give error as stack is full
		
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
