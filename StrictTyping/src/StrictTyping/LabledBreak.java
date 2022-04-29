package StrictTyping;

public class LabledBreak {

	public static void main(String[] args) {
		 int i = 0;
		 int j = 0;
		 
		// loop1:                  //label - loop1
		 for( i=0; i < 5; i++) {
			 for(j =0; j <5;j++) {
				 if(j==3) {
					 break;  //loop1
				 }
				 System.out.println("i= "+i+" j= "+j);
			 }
		 }
		 System.out.println("Out of the loop");
	}

}
