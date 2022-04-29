package Abstraction;

interface Cooking{
	void breakfast();
	void lunch();
	void dinner();
	
	static void Staticmethod() {
		System.out.println("I am a static method");
	}
}
class Vegmeal implements Cooking{
	public void breakfast() {
		System.out.println("Cook dosa , idli , upuma");
	}

	@Override
	public void lunch() {
		System.out.println("Cook briyani , spl meals , varity rice");
	}

	@Override
	public void dinner() {
		System.out.println("Cook chapathi ,  parota , fried rice");
	}	
}
public class InterFaceExample {

	public static void main(String[] args) {
		Vegmeal obj = new Vegmeal();
		obj.breakfast();
		obj.lunch();
		obj.dinner();
	}
}
