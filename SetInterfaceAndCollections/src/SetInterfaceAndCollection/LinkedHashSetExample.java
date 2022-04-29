package SetInterfaceAndCollection;

import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
   LinkedHashSet<String> clr = new LinkedHashSet<String>();
		
		Set clr1 = new LinkedHashSet<String>();
		
		LinkedHashSet<String> clr2 = new LinkedHashSet();
		
		LinkedHashSet clr3 = new LinkedHashSet<String>();
		
		clr.add("Green");
		clr.add("Blue");
		clr.add("Yellow");
		clr.add("Red");
		clr.add("Green");
		clr.add("Blue");
		clr.add("Brown");
		//just try different purpose
		clr.add(null);
		clr.add("");
		clr.add("Purple");
		
		
		System.out.println(clr);
		
	 for(String i : clr){
			System.out.println(i);
		}
	 
	 clr.remove("Green");
	 System.out.println("After Deleting...............");
	 
	 for(String i: clr) {
		 System.out.println(i);
	 }
	}

}


