package ForLoop;

import java.util.Scanner;

public class Pramid {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many rows you want =");
		int rows = s.nextInt();
		s.close();
	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }

	}

}
