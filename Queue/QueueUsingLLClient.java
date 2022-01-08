package Queue;

public class QueueUsingLLClient {

	public static void main(String[] args)throws Exception {

		QueueUsingLL q = new QueueUsingLL();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);

		q.enqueue(60); // obviously will not give exception here

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.dequeue();
		
		q.enqueue(60);
		q.enqueue(70);
		
		while (!q.isEmpty()) {
			System.out.print(q.getFront() + " ");
			q.dequeue();
		}
		System.out.println();
	}

}
