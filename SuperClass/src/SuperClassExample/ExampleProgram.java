package SuperClassExample;

class Professor {
	String title = "Trainer";
	String name = "Ananth sir";
	
	void teachers() {
		System.out.println(" Professor "+this.name+" is "+this.title+" teaches JAVA");
	}
	void Display() {
		System.out.println(this.title);
		System.out.println(this.name);
	}
}

class AsstProfessor extends Professor{
	String title = "Co-ordinator";
	String name = "Anitha mam";
	
	void teachers() {
		System.out.println(" Professor "+this.name+" is "+this.title+" teaches Testing");
	}
	void Display() {
		System.out.println(this.title);
		System.out.println(this.name);
		//this.teachers();				 //it calls the subclass ( inner classes )
		super.teachers();                //it calls the parent class 
	}
}

class Lecturer extends Professor {
	String title = "HOD";
	String name = "Manirathanam sir";
	
	void teachers() {
		System.out.println(" Professor "+this.name+" is "+this.title+" Manages the Team");
	}
	void Display() {
		System.out.println("Title :"+this.title);
		System.out.println("Name :"+this.name);
		this.teachers();				 //it calls the subclass ( inner classes )
		//super.teachers();                //it calls the parent class 
	}
	
}

public class ExampleProgram {                                //super takes to immidiate parent class

	public static void main(String[] args) {
		Professor obj = new Professor();
		obj.teachers();
		obj.Display();
		System.out.println("\n");
		AsstProfessor obj1 = new AsstProfessor();
		obj1.teachers();
		obj1.Display();
		System.out.println("\n");
		Lecturer obj2 = new Lecturer();
		obj2.teachers();
		obj2.Display();
		
	}

}
