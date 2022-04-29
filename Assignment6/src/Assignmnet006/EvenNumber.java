package Assignmnet006;

public class EvenNumber {

	public static void main(String[] args) {
	 int sum = 0;
	 System.out.println("Even number between 10 to 50 :");
	 
	 for(int n=10;n<=50;n+=2) {
		 
		 System.out.println(n+" "); 
		 sum = sum+n;
	 }
	 System.out.println("Sum of Even number ="+sum); 
	 
	}
}
