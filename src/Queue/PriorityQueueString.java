package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueString {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();  
		q.add("Virat");  
		q.add("Rohit");  
		q.add("Dhoni");  
		q.add("Sachin");  
		q.add("Kapil");  
		System.out.println("head: " + q.element());  
		System.out.println("head:" +  q.peek());  
		System.out.println("q: " + q);
		System.out.println("iterating the queue elements:");  
		Iterator<String> iter= q.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			q.remove();  // Retrieves and removes the head of this queue, it throws an exception if  queue is empty. 
			System.out.println(q);
			q.poll();  //Retrieves and removes the head of this queue,or returns null if this queue is empty.
			System.out.println("after removing two elements:");  
			Iterator<String> itr2=q.iterator();  
			while(itr2.hasNext()){  
				System.out.println(itr2.next());  
			}  
	}

}
