package AccessModifiers;
import DefaultPackage.*;                           //default

public class MainMethod {

	public static void main(String[] args) {
		MainMethod m2 = new MainMethod();
		m2.add(23,73);                             //default access only with in the same package
		m2.subtract(50,27);						 //default access only with in the same package
	}

}
