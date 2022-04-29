package Assignmnet006;

import java.util.Scanner;

public class LCMTwo {

	public static void main(String[] args) {
		int x, y ,z;   
		int temp;
		int small;
		int LCM = 0;
		int i;
		Scanner sc = new Scanner(System.in);    
		System.out.print("Enter the first number: ");    
		x = sc.nextInt();    
		System.out.print("Enter the second number: ");   
		y = sc.nextInt(); 
		
		if(x>y) {
			temp = x;
		}else {
			temp = y;
		}
		
		if(x<y) {
			small = x;
		}else {
			small = y;
		}
		int big = temp;
		for( i = 1; i<small; i++) {
			temp = big*i;
			if(temp%small ==0) {
				LCM = temp;
				break;
			}
		}
		System.out.println("LCM of three number " +LCM);

	}

}
