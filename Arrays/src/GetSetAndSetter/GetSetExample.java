//Encapsulation

package GetSetAndSetter;

import java.util.Scanner;

class Emp {
	
	private String name;
	private String id;
	
public String getName() {   //Getter - get the instance variable value
	return name;
	
  }

public void setName(String name) {   //setter- set a value to an instance variable
	this.name = name;
}
}
public class GetSetExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Emp s1 = new Emp();
		
		s1.setName("Manojkumar");
		System.out.println(s1.getName());
		
		System.out.println("Ennter the name : ");

		s1.setName(s.nextLine());
		System.out.println(s1.getName());
	}
}
