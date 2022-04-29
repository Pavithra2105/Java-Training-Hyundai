package ArrayPackage;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		 int[] array1 = {1,2,3,4};
			    int[] array2 = {3,4,5,6,7};
			  
			    int length = array1.length + array2.length;
			    System.out.println("First Array is: ");
			    for (int i = 0; i < array1.length; i++) {
			      System.out.print(" " + array1[i]);
			    }
			    System.out.println(" ");
			    System.out.println("Second Array is: ");
			    for (int i = 0; i < array2.length; i++) {
			      System.out.print(" " + array2[i]);
			    }
			    
			    int[] result = new int[length];
			    int position = 0;
			    
			    for (int element: array1) {
			      result[position] = element;
			      position++;
			    }
			    
			    for (int element: array2) {
			      result[position] = element;
			      position++;
			    }
			    System.out.println(" merging two arrays is: ");
			    System.out.println(Arrays.toString(result));    
	}

}
