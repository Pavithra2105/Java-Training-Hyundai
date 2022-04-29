package Assignmnet006;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		 int sum = 0;  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");  
		int n = sc.nextInt();  
		while(n > 0)  
		{  
		   
		int d = n % 10;  
		sum = sum + d;  
		n = n/ 10;  
		}  
	
		System.out.println("the sum of digits of given number : "+sum); 

	}

}
