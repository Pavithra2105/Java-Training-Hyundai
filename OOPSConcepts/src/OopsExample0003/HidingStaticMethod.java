package OopsExample0003;

class One {
	
	static void display() {
		System.out.println("I am not Hiding");
	}
	
	int add(int a,int b) {
		return a+b;
	}
}
class Two extends One{
	
	static void display() {
	System.out.println("I am Hiding the static method of super class");
	}
	double add(double a, double b,int c) {
		return a+b+c;
	}
	int add(int a,int b) {
		return a+b+10;
	}
}

public class HidingStaticMethod {

	public static void main(String[] args) {
		One.display();
		Two.display();
		
		Two t1 = new Two();
		System.out.println(t1.add(12.3, 23.1 ,4));
		System.out.println(t1.add(5,4));
		

	}

}
