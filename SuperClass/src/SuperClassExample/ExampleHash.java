package SuperClassExample;

public class ExampleHash {
	
	static int a = 10;
	int b;
	
	ExampleHash() {
		b = a;
		a++;
	}
	
	public int hashcode() {
		return a;				
	}
	

	public static void main(String[] args) {
		
		ExampleHash has = new ExampleHash();
		System.out.println(has);
		System.out.println(has.toString());	
	}
}
