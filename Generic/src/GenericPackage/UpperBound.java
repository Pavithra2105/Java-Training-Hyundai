package GenericPackage;

import java.util.*;
import java.lang.*;
public class UpperBound {
	
	static double add(ArrayList<? extends Number > num) {
		
		double sum = 0;
		for(Number n:num) {
			sum = sum+n.intValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		System.out.println("displaying the sum ="+add(l1));
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add((int) 30.0);
		l2.add((int) 40.0);
		System.out.println("displaying the sum ="+add(l2));

	}

}
