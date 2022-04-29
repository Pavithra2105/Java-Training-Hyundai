package Constructor;

import java.util.Scanner;

class Employee001{
	
	String EmpName ;
	int EmpId ;
	String Dept ;
	int Phone ; 
	
	Employee001(){
		System.out.println("Object is created");
	}
	
	Employee001(String n , int Id , String D , int p){
		EmpName = n;
		EmpId = Id;
		Dept = D;
		Phone = p;
	}
	void Show() {
		System.out.println("Employee name "+EmpName);
		System.out.println("Employee ID "+EmpId);
		System.out.println("Employee Department "+Dept);
		System.out.println("Phone number  "+Phone);
	}
}
public class Constructor01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name = ");
		String My_Name = s.next();
		System.out.println("Enter your ID = ");
		int My_ID = s.nextInt();
		System.out.println("Enter your Dep = ");
		String My_Dep = s.next();
		System.out.println("Enter your Phone no. = ");
		int My_Phone = s.nextInt();
		
		Employee001 obj = new Employee001();
		obj.EmpName = "MANOJ";
		obj.EmpId = 1234;
		obj.Dept = "GET";
		obj.Phone = 12234324;
		obj.Show();
		
		
		Employee001 obj1 = new Employee001(My_Name,My_ID,My_Dep,My_Phone);
		obj1.Show();
	}

}
