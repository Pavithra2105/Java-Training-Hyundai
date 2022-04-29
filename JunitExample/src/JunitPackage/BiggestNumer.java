package JunitPackage;

import org.junit.Test;

public class BiggestNumer {
	
	int temp, size;
    int array[] = {10, 20, 25, 63, 96, 57};
    
    @Test
	public void BiggestNumber() {
		size = array.length;
		for(int i = 0; i<size; i++ ){
	        for(int j = i+1; j<size; j++){
	           if(array[i]>array[j]){
	              temp = array[i];
	              array[i] = array[j];
	              array[j] = temp;
	           }
	        }
	     }
	     System.out.println("Third largest element is:: "+array[size-1]);	 
	}
}
