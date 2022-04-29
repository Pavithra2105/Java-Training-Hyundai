package Exception;

class ThrowsExp{
	void m() throws ArithmeticException{
		throw new ArithmeticException("I am an Exception");
	}
	void n() throws ArithmeticException{
		m();
	}
		void p() {
			try {
				n();
			}catch(Exception e) {
				System.out.println("Handeled Exception ");
			}
		
	}
}

public class ThrowsExceptions {

	public static void main(String[] args) {
		ThrowsExp th = new ThrowsExp();
		th.p();
		System.out.println("Hii bye");

	}

}
