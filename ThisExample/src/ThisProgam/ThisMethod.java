package ThisProgam;
import java.util.*;
class Student{
	int rollnum;
	String name;
	int fee;
	
	Student(String name,int rollnum, int fee){
		this.rollnum = rollnum;             
		this.name =name;
		this.fee = fee;
	}
	void display() {
		System.out.println(this.name+" "+this.rollnum+" "+this.fee);
	}
	void Show() {
		System.out.println("Name RollNum Fees");
		this.display();
	}
	
}

class Ammer extends Student{
	int Donation;
	Ammer(String name, int rollnum, int fee , int Don) {
		super(name, rollnum, fee);
		Donation = Don;
	}
	void display() {
		System.out.println(this.name+" "+this.rollnum+" "+this.fee+" "+this.Donation);
	}
	void Show() {
		System.out.println("Name RollNum Fees");
		this.display();
	}
	
}



public class ThisMethod {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String f = Sc.next();
		System.out.println("Enter the Rollnumber: ");
		int r = Sc.nextInt();
		System.out.println("Enter the Fee: ");
		int fee = Sc.nextInt();
		
	
		Student Stu = new Student(f,r,fee);
		Stu.Show();
		Stu.display();
		System.out.println("\n");
		Student Stu1 = new Student(f,r,fee);
		Stu1.Show();
		Stu1.display();
	}

}
