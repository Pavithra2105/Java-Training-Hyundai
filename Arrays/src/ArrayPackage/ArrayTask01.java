
//pending


package ArrayPackage;

import java.util.Scanner;

public class ArrayTask01 {

	public static void main(String[] args) {
		int n; 
		 double total = 0;

		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want : ");  
		n=sc.nextInt();  
		double[] array = new double[10];  
	
		for(int i=0; i<n; i++)  {  
		array[i]=sc.nextInt();  
		}  
		
		for(int i=0; i<array.length; i++){
        	total = total + array[i];
        }
         
        //average
		double average = total / array.length;
         
        System.out.println("Average : "+average);
		  

	}

}
