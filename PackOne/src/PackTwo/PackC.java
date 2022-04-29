package PackTwo;
import PackOne.*;


public class PackC {

	public static void main(String[] args) {
		PackA pac = new PackA();
		pac.display();
		System.out.println(pac.name);
		
		PackB pac1 = new PackB();
		System.out.println(pac1.name);
		pac1.display();
	}

}
