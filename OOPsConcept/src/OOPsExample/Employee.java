package OOPsExample;

import java.util.Scanner;

class Details{
	
	String emp_name ;
	int emp_id;
	int emp_basicSal;
	int Bonus;
	int emp_HRA;
	String emp_dept;
	int emp_MedRbs;
	int FBP;
	int PF;
	String DOJ;
	int emp_exp;
	int TotalSalary;
	int emp_convey;
	int emp_MonSal;
	int yearlySal;
	
	
	void GetInput() {
		Scanner in = new Scanner(System.in);
		  System.out.print("Enter the empid :: ");
		  emp_id = in.nextInt();
		  System.out.print("Enter the name :: ");
		  emp_name = in.next();
		  System.out.print("Enter the Basic salary :: ");
		  emp_basicSal = in.nextInt();
		  System.out.print("Enter the Medical Insurance :: ");
		  emp_MedRbs = in.nextInt();
		  System.out.print("Enter the Flexi Benefit Plan :: ");
		  FBP = in.nextInt();
		  System.out.print("Enter the Date of Joining  :: ");
		  DOJ = in.next();
		  System.out.print("Enter your Experiance :: ");
		  emp_exp = in.nextInt();	  
	
	}
	
	void Display() {
		System.out.println("*CONVEYANCE ALLOWANCE*" );
		System.out.println("Employee Basic Salary ="+emp_basicSal );
		System.out.println("Employee ID ="+emp_id );
		System.out.println("Employee Name ="+emp_name );
		System.out.println("HRA ="+emp_HRA );
		System.out.println("Employee Bonus ="+Bonus );
		System.out.println("HRA ="+emp_HRA );
		System.out.println("Medical Insurance ="+emp_MedRbs );
		System.out.println("Flexi Benefit Plan ="+FBP );
		System.out.println("Date of Joining ="+DOJ );
		System.out.println("Experiance "+emp_exp );
		System.out.println("Yearly Salary ="+yearlySal);
	}
	
	void Calculate() {
		emp_HRA = (int) (emp_basicSal*0.50);                   //type casting
		Bonus = (int) ((emp_basicSal*8.33)/100);
		PF = 1800/emp_basicSal;
		yearlySal =  emp_MonSal * 12;
	    TotalSalary = emp_basicSal + emp_HRA + emp_MedRbs + emp_convey + Bonus ; 
	}

}

public class Employee {
	
	public static void main(String[] args) {
		
		Details obj = new Details();
		obj.GetInput();
		obj.Display();
		obj.Calculate();
	}

	}


