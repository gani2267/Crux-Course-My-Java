package LinkedList;

public class LL_AsStackClient {
	
	public static void main(String[] args) throws Exception {
		
		LL_AsStack stack=new LL_AsStack();
		
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
		
		System.out.println(stack.size());
		
		System.out.println("\n=====================================");
		while(!stack.isEmpty()) {
			stack.display();
			stack.pop();
		}
		
//		stack.pop();     //will give error as stack become empty
		
	}

}
