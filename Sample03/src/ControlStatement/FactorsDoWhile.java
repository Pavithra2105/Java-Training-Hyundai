package ControlStatement;

import java.util.Scanner;

public class FactorsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int i = 1;
       

        System.out.println("Enter the number 1:");
        int x = in.nextInt();
        
        System.out.println("\nThe factors of the " + x + " are: ");
        while (i<= x) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
            ++i;
        }
        System.out.print("\n");
	}

}
