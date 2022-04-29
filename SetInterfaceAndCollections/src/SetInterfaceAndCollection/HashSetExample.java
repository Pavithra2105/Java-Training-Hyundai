package SetInterfaceAndCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> clr = new HashSet<String>();
		
		Set clr1 = new HashSet<String>();
		
		HashSet<String> clr2 = new HashSet();
		
		HashSet clr3 = new HashSet<String>();
		
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
		
		System.out.println(clr);
		
	 for(String i : clr){
			System.out.println(i);
		}
	}

}
