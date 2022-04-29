package ToStringPack;

class MyStudent{
	String name;
	int roll_num;
	int age;
	String School;
	
	MyStudent(String name,int roll_num, int age,String School){
		this.name = name;
		this.roll_num = roll_num;
		this.age = age;
		this.School = School;
	}
	
	void display() {
		System.out.println(name+"  \t"+roll_num+"  \t"+age+"  \t"+School);
	}
	
	public String  toString() {
		return name+"  \t"+roll_num+"  \t"+age+"  \t"+School;
	}
}
public class ToStringExample {

	public static void main(String[] args) {
		MyStudent ms1 = new MyStudent("Manojkumar", 1234,16,"ABCD School");
		MyStudent ms2 = new MyStudent("Suresh" ,1235,16,"EFGH school");
		
		//tostring
		System.out.println(ms1);   
		System.out.println(ms2);
		System.out.println();
		
		//display
		ms1.display();
		ms2.display();

	}

}
