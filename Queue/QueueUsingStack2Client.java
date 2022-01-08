package Queue;

public class QueueUsingStack2Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        QueueUsingStack2 q=new QueueUsingStack2();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.display();
		q.enqueue(60);      // will not give exception as queue and stack are dyanamic
		
		q.display();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.display();
		
		q.enqueue(60);
		q.display();
		q.enqueue(70);
		q.display();
		
		System.out.println(q.size());
		System.out.println(q.getFront());
		q.display();

	}

}
