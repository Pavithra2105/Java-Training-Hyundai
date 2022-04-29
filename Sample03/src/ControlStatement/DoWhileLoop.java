
//DO WHILE LOOP CONSTRACT

package ControlStatement;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter the number :");
        int x = in.nextInt();
        
        System.out.println("\nThe factors of the " + x + " are: ");
        
        //using Do while
		do {
			if (x % i == 0) {
                System.out.print(i + " ");
            }
			++i;  
		}while (i<=x);
	}
}
