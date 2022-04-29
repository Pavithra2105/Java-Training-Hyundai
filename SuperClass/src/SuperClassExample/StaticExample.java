package SuperClassExample;

class StaticProgram {
	int num1;
	static int num2;
	
	StaticProgram(){
		num1 = 10;
		num2 = 10;
		schange();
		System.out.println(num1+" "+num2);
	}
	
	void Change() {
		num1 = 100;
		num2 = 100;
		System.out.println("Change static variable through non-static method");
		System.out.println(num1+" "+num2);
		schange();
	}
	
	static void schange() {
		System.out.println("Calling non-static method in a static method - not possible");
		//num1 = 200;
		System.out.println("Change static variable through non-static method");
		num2 = 200;
		
		//System.out.println(num1+" "+num2);
		//System.out.println("Calling non-static method in a static method - not possible");
		//change
		System.out.println(num2);
	}
}

public class StaticExample {
		
	
	public static void main(String[] args) {
		
		StaticProgram.schange();         //calling static method through the class reference
		System.out.println("-----------------------------");
		StaticProgram st1 = new StaticProgram();
		System.out.println("-----------------------------");
		st1.Change();
		System.out.println("-----------------------------");
	}

}
