package VectorStringExample;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		
		Vector<String> vect1 = new Vector<String>();
		vect1.add("one");
		vect1.add("two");
		vect1.add("four");
		vect1.add("Three");
		System.out.println(vect1);
		
		Iterator<String> itr = vect1.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
