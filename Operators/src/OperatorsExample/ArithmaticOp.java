package OperatorsExample;

import java.util.Scanner;

public class ArithmaticOp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value A =");
		int a = s.nextInt();
		System.out.println("Enter the value B =");
		int b = s.nextInt();
		int c = a + b;
		int d = a * b;
		int e = a - b;
		float f = a / b;
		double g = a % b;
		System.out.println("Addition of " +a+ " and " +b+ " is = "+c);
		System.out.println("Multiple of " +a+ " and " +b+ " is = "+d);
		System.out.println("Subtraction of " +a+ " and " +b+ " is = "+e);
		System.out.println("Division of " +a+ " and " +b+ " is = "+f);
		System.out.println("Modulo of "+a+ " and " +b+ " is = "+g);		
	}

}
