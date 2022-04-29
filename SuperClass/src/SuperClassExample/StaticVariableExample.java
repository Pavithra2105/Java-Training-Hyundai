package SuperClassExample;

class Student {
	String Stname;
	int Stid;
	static int count = 0;
	Student(String stname , int stid){
		this.Stname = stname;
		this.Stid = stid;
		count = count + 1;
	}
	
	void display() {
		System.out.println(this.Stname);
		System.out.println(this.Stid);
		System.out.println(this.count);
		System.out.println();
	}
}

public class StaticVariableExample {

	public static void main(String[] args) {
		Student st1 = new Student("Kamal",333);
		st1.display();
		Student st2 = new Student("Raj",444);
		st2.display();
		Student st3 = new Student("Raj",444);
		st3.display();
		
		System.out.println("Printingthe static variable ( through class reference only");
		System.out.println(Student.count);
		System.out.println(st1.count);
		
		st1.count = 15;
		System.out.println(st1.count);
		System.out.println(st2.count);
		System.out.println(st3.count);
	}

}
