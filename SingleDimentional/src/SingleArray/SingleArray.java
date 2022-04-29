package SingleArray;

import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of an Array =");
		int size = s.nextInt();
		
		
		int []num = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements =");
			num[i] = s.nextInt();
		}
		System.out.println("the array of " +size+ "  elements are  =");
		for(int y:num) {
			System.out.println(y);
		}
		s.close();

	}

}
