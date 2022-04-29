package sample2;

import java.util.ArrayList;

public class Array03{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> num = new ArrayList<Float>();
		num.add((float) 90.5);
	    num.add((float) 56.4);
	    num.add((float) 45.65);
	    num.add((float) 22.6);
	    num.add((float) 11.61);
	    num.add((float) 4.13);
	   
	    System.out.println(num);
	    num.remove(2);
	    num.remove(4);
	    num.remove(0);
	    System.out.println(num); 
	}
}
