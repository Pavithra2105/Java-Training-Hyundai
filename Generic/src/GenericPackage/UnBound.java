package GenericPackage;

import java.util.*;

public class UnBound {
	
	public static void display(List<?> list) {
		for(Object o:list) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		System.out.println("Displaying the Integer values");
		display(l1);
		
		List<String> l2 = Arrays.asList("Rama", "Bhama", "Shama");
		System.out.println("Displaying the String values");
		display(l2);
		
		List<Double> l3 = Arrays.asList(1.23,1.34,3.45);
		System.out.println("Displaying the Double values");
		display(l3);

	}

}
