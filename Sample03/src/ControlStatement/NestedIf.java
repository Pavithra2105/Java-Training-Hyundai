package ControlStatement;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.println("Enter any number =");
		num1 = s.nextInt();
		
		if(num1>10) {
			System.out.println("number is grater than 10");
		 if(num1>100) {
				System.out.println("number is grater than 100");
		 if(num1>1000) {
					System.out.println("number is grater than 1000");
				}
		 }
		}
	}
}

