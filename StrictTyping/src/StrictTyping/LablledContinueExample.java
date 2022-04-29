package StrictTyping;

public class LablledContinueExample {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(j==3) {
					continue;
					//break;
				}
				System.out.println("i ="+i+"j="+j);
				
			}
			System.out.println("Again");
			
		}
		System.out.println("demo");

	}

}
