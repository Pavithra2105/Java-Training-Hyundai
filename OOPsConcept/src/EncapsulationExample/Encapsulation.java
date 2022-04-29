/* Example for Encapsulation*/

package EncapsulationExample;

class EmpCap{
	private String Myname = "Anyname";
	//int myage;
	
	EmpCap(){
		System.out.println("I am a new born");
	}
    EmpCap(String name){
    	Myname = name;
    }
    
    void display() {
    	System.out.println("My Name is = "+Myname);
    }
}
public class Encapsulation {
		
	public static void main(String[] args) {
		EmpCap obj = new EmpCap();
		obj.display();
		EmpCap obj1 = new EmpCap("Manojkumar");
		obj1.display();	

	}
}
