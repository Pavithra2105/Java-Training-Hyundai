package Assigments;

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		int num;
		int lastdigit;
		int revnum=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		while(num>0) {
			lastdigit=num%10;
			num=num/10;
			revnum=revnum * 10 + lastdigit;
		}
		System.out.println("REVERSE OF NUMBER IS: " +revnum);  

	}
}
