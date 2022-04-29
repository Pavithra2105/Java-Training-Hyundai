package SuperClassExample;

public class ExceptionExample {
	public static void main(String[] args) {	
		int a = 50;
		int b = 0;
		
		try {
		System.out.println("dividing a by b:");
		System.out.println(a/b);              // the program ended here * terminated due to exception
		}catch(Exception e){                  //Exception catch in the catch block
			System.out.println("Sorry divid by zero is not allowed !"); 
	}
		System.out.println("Thanks , bye for now");
	}
}
