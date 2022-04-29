package ControlStatement;

import java.util.Scanner;

public class ElseIfState {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage marks :");
		double num = scan.nextDouble();
		scan.close();
		if(num >= 90){
			System.out.println("Grade A");
		}else if(num < 90){
			if(num >= 80) {
				System.out.println("Grade B");
			}	
		else if(num < 80){
			if(num >= 70) {
				System.out.println("Grade C");
			}
		else if(num < 70){
			if(num >= 60) {
				System.out.println("Grade D");
			}
		else if(num < 60){
			if(num >= 50) {
				System.out.println("Grade E");
			}
		else if(num < 50){
			if(num >= 40) {
				System.out.println("Grade F");
			}else {
			System.out.println("Failed!");
		     }
	      }
	    }
	  }
    }
  }
}
}
