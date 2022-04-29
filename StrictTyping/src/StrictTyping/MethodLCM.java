package StrictTyping;

import java.util.Scanner;

public class MethodLCM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Number :");
		int a = s.nextInt();
		System.out.println("Enter the second Number :");
		int b = s.nextInt();
		System.out.println("LCM of two numbers = "+Lcm(a,b));
	}

	 static int Lcm(int a, int b) {
		int lcm = 0;int temp = 0, temp1;
		temp =(a>b)? a:b;
		if((lcm % a == 0) && ( lcm % b == 0)){
			 lcm = temp;
		}
		for(int i=1; i<=a && i<= b;i++) {
			temp1 = temp * i;
			if((temp1 % a == 0) && (temp1 % b == 0)) {
				lcm = temp1;
				break;
			}
		}
		return lcm;
		
	}

}
