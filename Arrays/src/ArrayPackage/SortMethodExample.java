package ArrayPackage;

public class SortMethodExample {

	public static void main(String[] args) {
		    int[] arr = new int[] { 5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754 };
		  int count = 0;
		    
		    for (int i = 0; i < arr.length; i++) 
		    {     
		        for (int j = i + 1; j < arr.length; j++) 
		        {  
		            int tmp = 0;                            
		            if (arr[i] > arr[j]) 
		            {           
		                tmp = arr[i];              
		                arr[i] = arr[j];            // Swaping .
		                arr[j] = tmp;
		            }
		            count++;
		        }
		    }
		           for (int i = 0; i < arr.length; i++) 
		           {     
		              System.out.print(arr[i]+" ");  
		           }
		           System.out.println();
		           System.out.println(count);
		   }
	  }

