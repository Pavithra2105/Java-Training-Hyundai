package ControlStatement;

public class ExtendedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,12,34,56,76};
		
		//normal for loop
		for(int i=0; i<5; i++) {
			System.out.print(arr1[i]+" ");	
		}
		System.out.print("\n");
		
		//extended for loop (iterated method)
		for(int elements : arr1) {
			System.out.print(elements+" ");
		}
	}

}
