package InHeritanvce;

import java.util.Scanner;

class DetailsEmployee {
	String name;
	int Basic_Salary ;
	int HRA;
	int MedReimburse;
	int convey;
	int Salary;
	
	public DetailsEmployee(String my_Name, int my_Bs, int b_hra, int my_Med, int c_con) {
		name = my_Name;
		Basic_Salary = my_Bs;
		HRA = b_hra;
		MedReimburse = my_Med;
		convey = c_con;
	}

	void SalaryCal() {
		 Salary = Basic_Salary + HRA + MedReimburse + convey;
	}
	void Display() {
		System.out.println("Employee Salary = "+Salary);
	}
}

class TeamLeader extends DetailsEmployee{
        int varpay;

	TeamLeader(String my_Name, int my_Bs, int b_hra, int my_Med, int c_con, int vap) {
		super(my_Name, my_Bs, b_hra, my_Med, c_con);
		varpay = vap;
	}
	void SalaryCal() {
		 Salary = Basic_Salary + HRA + MedReimburse + convey + varpay;
	}
	
	void Display() {
		System.out.println("TeamLeader Salary = "+Salary);
	}
}
	class Manager extends TeamLeader{
		int Bonus;
		Manager(String my_Name, int my_Bs, int b_hra, int my_Med, int c_con ,int B_Bon,int v_vap ) {
			super(my_Name, my_Bs, b_hra, my_Med, c_con,v_vap);
			Bonus = B_Bon;
		}
		void SalaryCal() {
			 Salary = Basic_Salary + HRA + MedReimburse + convey + Bonus;
		}
		void Display() {
			System.out.println("Manager Salary = "+Salary);
		}	
	}
public class Employee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name = ");
		String n_name = s.next();
		System.out.println("Enter your Basic Salary = ");
		int b_BasSal = s.nextInt();
		System.out.println("Enter your HRA = ");
		int b_hra = s.nextInt();
		System.out.println("Enter MedReimburse. = ");
		int m_MedRbs = s.nextInt();
		System.out.println("Enter your convey = ");
		int c_con = s.nextInt();
		System.out.println("Enter varpay = ");
		int v_vap = s.nextInt();
		System.out.println("Enter your Bonus = ");
		int B_Bon = s.nextInt();
		
		DetailsEmployee obj = new DetailsEmployee(n_name,b_BasSal,b_hra,m_MedRbs,c_con);
		obj.SalaryCal();
		obj.Display();
		TeamLeader obj1 = new TeamLeader(n_name,b_BasSal,b_hra,m_MedRbs,c_con,B_Bon);
		obj1.SalaryCal();
		obj1.Display();
		Manager obj2 = new Manager(n_name,b_BasSal,b_hra,m_MedRbs,c_con,B_Bon,v_vap);
		obj2.SalaryCal();
		obj2.Display();
	}
}
