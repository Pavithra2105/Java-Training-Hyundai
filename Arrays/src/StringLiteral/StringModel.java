package StringLiteral;

public class StringModel {

	public static void main(String[] args) {
		String s = "Sir Isaac Newton Discovered the laws of motion";
		 
        int count = 0; 
        int startform = 0;
            
      for(;;) {
    	  int index = s.indexOf('e',startform);
    	  
    	  if(index>0) {
    		  
    		  count++;
    		  startform  = index+1;
    	  }
    	  else {
    		  break;
    	  }
      }
        System.out.println(count);
            }                
	}

