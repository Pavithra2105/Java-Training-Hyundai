package Exception;

public class ExceptionExample {

	public static void main(String[] args) {
		int a = 50;
		int b = 0;
		
		try {
		System.out.println(a/b);    //unchecked exception - the compiler cannot make out
									//giveArithmatic Exception.
		System.out.println("All are safe");    //this statement will not be executed if exception

	}catch(ArithmeticException e) {
		System.out.println("I am in catch block");
	}
		
		System.out.println("All are safe");
	}
}
