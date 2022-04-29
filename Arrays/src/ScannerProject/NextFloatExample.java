package ScannerProject;

import java.util.Scanner;

public class NextFloatExample {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a float number = ");
		float salary = s.nextFloat();
		System.out.println("Salary ="+salary);
		
		s.close();
	}

}
