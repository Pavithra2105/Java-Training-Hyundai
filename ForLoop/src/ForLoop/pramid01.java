package ForLoop;

import java.util.Scanner;

public class pramid01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many rows you need ?");
		int row = s.nextInt();
		s.close();
	      for(int i=0; i<row; i++)
	      {
	         for(int space=i; space<row; space++)
	            System.out.print(" ");
	         for(int j=0; j<(i+1); j++)
	            System.out.print("*");
	         System.out.print("\n");
	      }
	}

}
