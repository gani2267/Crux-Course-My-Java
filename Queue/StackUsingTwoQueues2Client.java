package Queue;

public class StackUsingTwoQueues2Client {

	public static void main(String[] args) throws Exception {
		
		StackUsingTwoQueues2 q=new StackUsingTwoQueues2();
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
//		q.push(60);   //will give error
		
		q.display();
		
		System.out.println(q.size());
		System.out.println(q.top());
		q.display();
		System.out.println(q.pop());
		System.out.println(q.pop());
		
		q.display();
		
		while(!q.isEmpty()) {
			System.out.print(q.pop()+" ");
		}
		
//		System.out.println(q.top());    //will give error
	}

}
