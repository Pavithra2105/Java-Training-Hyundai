
/*read the array of integer from the key word and find the bigest element*/

package ControlStatement;

import java.util.Scanner;

public class Assignfour {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the size ="); //size of an array
		int size = s.nextInt();
		
		
		int []num = new int[size];

		 for(int i=0; i<size ; i++) {
			 System.out.println("Enter the elements = "+i); //elements of an array
			 num[i]=s.nextInt();	
			 
	}
		int arr = num[0];
		
		
		for(int i=0;i<num.length;i++) {
			   if(num[i] > arr) {  //finding which is largest
	               arr = num[i];
	        }  
		}
		System.out.println("Largest element present in given array: " + arr); 
}
}

