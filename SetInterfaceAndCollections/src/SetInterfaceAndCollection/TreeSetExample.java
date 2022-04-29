package SetInterfaceAndCollection;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> clr = new TreeSet<String>();
		
        TreeSet clr1 = new TreeSet<String>();
		
        TreeSet<String> clr2 = new TreeSet();
		
        TreeSet clr3 = new TreeSet<String>();
		
		clr.add("Green");
		clr.add("Blue");
		clr.add("Yellow");
		clr.add("Red");
		clr.add("Green");
		clr.add("Blue");
		clr.add("Brown");
		//just try different purpose
		//clr.add(null);
		clr.add("");
		clr.add("Purple");
		clr.add("Orange");
		clr.add("Violet");
		clr.add("Indigo");
		clr.add("Pink");
		clr.add("Teal");
		
		
		System.out.println(clr);
		
	 for(String i : clr){
			System.out.println(i);
		}
	 
//	 clr.remove("Green");
//	 System.out.println("After Deleting...............");
//	 
//	 for(String i: clr) {
//		 System.out.println(i);
//	 }

	}

}
