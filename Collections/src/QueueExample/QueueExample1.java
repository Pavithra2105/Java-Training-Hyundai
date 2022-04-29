package QueueExample;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample1 {

	public static void main(String[] args) {
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("First");
		pq1.add("Second");
		pq1.add("Third");
		pq1.add("Fourth");
		pq1.add("Fifth");
		
		System.out.println(pq1);
		
		Iterator<String> itr = pq1.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(pq1.peek());
		System.out.println(pq1.peek());
		System.out.println(pq1.peek());
		System.out.println(pq1.element());
		System.out.println(pq1.poll());
		pq1.remove();      //remove from the queue
		System.out.println();
		System.out.println(pq1.peek());
		System.out.println(pq1.peek());
		System.out.println(pq1.element());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll()); 
		
	}

}
