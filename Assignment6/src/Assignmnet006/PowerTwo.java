package Assignmnet006;

import java.util.Scanner;

public class PowerTwo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value A =");
		int A = s.nextInt();
		System.out.println("Enter the value B =");
		int B = s.nextInt();
		
	    long result = 1;

	    while (B != 0) {
	      result *= A;
	      --B;
	    }

	    System.out.println("A to the power of B is  = " + result);

	}

}
