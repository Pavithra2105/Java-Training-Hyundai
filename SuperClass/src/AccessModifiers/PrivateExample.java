package AccessModifiers;

class PrivateClass {
	
	private String name;
	private void display() {
		System.out.println("Print the private member ="+name);
	}
	
	PrivateClass(String name){
		this.name = name;
		display();
		PrivateClass obj3 = new PrivateClass();
	}
	
	private PrivateClass() {
		System.out.println("Object is created");
	}
}

public class PrivateExample {

	public static void main(String[] args) {
		
		PrivateClass obj1 = new PrivateClass("manojkumar");	
		
	}

}
