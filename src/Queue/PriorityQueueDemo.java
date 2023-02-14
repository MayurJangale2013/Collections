package Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue <Integer> pq= new PriorityQueue<>();
		pq.add(2);
		pq.add(1);  // tip
		pq.add(5);
		pq.add(9);
		pq.add(8);
		pq.add(7);
		pq.add(6);
		System.out.println(pq);
		
		// Printing the top element of PriorityQueue
				System.out.println(pq.peek());
				// Printing the top element and removing it
				// from the PriorityQueue container
				System.out.println(pq.poll());
				System.out.println(pq);
				
				// Printing the top element again
				System.out.println(pq.peek());
				System.out.println(pq.poll());
			
				System.out.println(pq);

				System.out.println(pq.peek());
				System.out.println(pq.poll());
				System.out.println(pq);
				System.out.println(pq.poll());
				System.out.println(pq);
				System.out.println(pq.poll());
				System.out.println(pq);
				System.out.println(pq.poll());
				System.out.println(pq);
				System.out.println(pq.poll());
				System.out.println(pq);
				System.out.println(pq.poll());
				System.out.println(pq);
				
				
				System.out.println(pq.poll());
				System.out.println(pq);
	}

}
