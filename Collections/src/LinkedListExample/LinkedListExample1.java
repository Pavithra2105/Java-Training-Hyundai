package LinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		
		LinkedList<String>  Llist1 = new LinkedList<String>();
		Llist1.add("Mercedes");
		Llist1.add("Lucy");
		Llist1.add("suma");
		System.out.println(Llist1);
		
		Iterator<String> itr = Llist1.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
