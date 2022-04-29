package Assignmnet006;

import java.util.Scanner;

public class PefectSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = s.nextInt();
		int flag = 0;
		for(int i = 1 ; i<num/2; i++) {
			if(num / i == i) {
				if(num % i == 0) {
					System.out.println(" perfect square !");
					flag = 1;
					break;
				} 
			}
		}if(flag == 0) {
			System.out.println("it is not perfect square");
		}
		
	}


}
