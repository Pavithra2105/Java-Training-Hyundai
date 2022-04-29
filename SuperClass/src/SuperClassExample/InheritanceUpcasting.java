package SuperClassExample;

class Parent{
	
	int a = 10;
	void display() {
		System.out.println(a);
	}
}

class Child extends Parent {
	int b = 50;
	void display1() {
		System.out.println(b);
	}
}

public class InheritanceUpcasting {

	public static void main(String[] args) {
		
		Parent ch1 = new Child();              //upcasting
		System.out.println(ch1.a+"in main");
		//System.out.println(ch1.b);
		
		ch1.display();   //method
		//ch1.display1();
		
		//Child p1 = new Parent();	           //downcasting

	}

}
