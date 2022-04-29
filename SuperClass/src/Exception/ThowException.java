package Exception;

class ThrowExp{
public static void checkage(int age) {
		if(age>=18) {
			System.out.println("Eligible for voting");
		}else {
			throw new ArithmeticException("Not Eligible for voting !");
		}
	}
}
public class ThowException {

	public static void main(String[] args) {
		
		try {
			ThrowExp.checkage(18);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Thanks for  voting !");
	}

}
