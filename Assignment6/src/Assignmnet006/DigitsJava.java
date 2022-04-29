package Assignmnet006;

import java.util.Scanner;

public class DigitsJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");  
		int num = sc.nextInt();  
		  
        int a = 0, s = 0,b;  
        
        int n = num;  
        
        while(num > 0){                    
            a = num%10;  
            b=a*a*a;
            s = s + b;  
            num = num/10;  
        }  
        System.out.println("the cube of given number : "+s);
	}
}




