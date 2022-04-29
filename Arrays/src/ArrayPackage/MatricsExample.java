package ArrayPackage;

public class MatricsExample {

	public static void main(String[] args) {
		
		int a[][]={{11,22,33},{44,45,36},{7,8,9}};    
		int b[][]={{17,52,18},{38,16,1},{25,14,7}};    
		    
		  
		int c[][]=new int[3][3];    
		    
		   
		for(int i=0;i<3;i++){    
		       for(int j=0;j<3;j++){  
			
		c[i][j]=a[i][j]+b[i][j];  
		
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();   
		}    

	}

}
