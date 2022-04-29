package GenericPackage;

import java.util.*;
public class GenericExample {

	public static void main(String[] args) {
		
		//@SuppressWarnings("unchecked");
		List<Integer>list1 = new ArrayList<Integer>();
		
		list1.add(345);
     // list1.add("Amar");  //gives error based on generics
		
		list1.add(-23);
		list1.add(0);
	//	list1.add();        // cannot be null
		
		System.out.println();
		
		int x = list1.get(1);
		System.out.println(x);
		
		
		for(int i: list1) {
			System.out.println(i);
		}
		
		List list2 = new ArrayList();
		list2.add(10);
		list2.add("Sangeeta");
		list2.add("10");	
		
		String s = (String) list2.get(1);
		System.out.println(s);
		
		System.out.println();
		int i = (int) list2.get(1);
		System.out.println(i);
		
		System.out.println();
		i = (int) list2.get(0);
		System.out.println(i);
		
		System.out.println();
		s = (String) list2.get(0);
		System.out.println(s);
		
	}

}
