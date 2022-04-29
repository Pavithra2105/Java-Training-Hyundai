package SuperClassExample;

public class ObjectionsExp implements  Cloneable {

	int rollno;
	String name;
	
	ObjectionsExp(int rollno , String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
		
	}
	public static void main(String[] args) {
		try {
			ObjectionsExp s1 = new ObjectionsExp(101,"amit");
			ObjectionsExp s2 = (ObjectionsExp)s1.clone();
			
			System.out.println(s1.rollno+" "+s1.name);
			System.out.println(s2.rollno+" "+s2.name);
		}catch(CloneNotSupportedException c) {}
		
		System.out.println("DID SAFE EXIT");
	}
}
