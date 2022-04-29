package StrictTyping;

public class Method03 {

	public static void main(String[] args) {
		
		int[] a = { -23,-45,-12,-33,-77 };
		
		int[] num = {12, 23, 33, 64, 5, 6, 7};
	    
	    
	    
	    
		//display(a);
		//show(a);
		view(num);
	}
	
	static void display(int[] a) {
		for(int i: a) {
			System.out.println(i+" ");
		}
	}
	
	//finding largest element in a given array
	static void show(int[] a) {
		int max = a[0];  
		for (int i = 0; i < a.length; i++) { 
			if(a[i] > max)  
	         max = a[i];  
		}
		System.out.println("Largest element in a given array: " + max);  
		}
	
	//check an array
	static void view(int[]num ) {
		boolean i = false;
		
		int f = 5;
		  for (int n : num) {
		      if (n == f) {
		        i = true;
		        break;
		      }
		    }
		    
		    if(i)
		      System.out.println(f + " found.");
		    else
		      System.out.println(f + "  not found.");
		  }
	}

	 


