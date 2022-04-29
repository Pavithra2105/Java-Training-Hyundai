package AssignmentEmployee;

import java.util.Scanner;

class EmpDetails {
	
	String emp_name;
	int emp_Id;
	int emp_BasicSal;
	int emp_HRA;
	int emp_MedRbs;
	int emp_convey;
	String emp_dept;
	String emp_Doj;
	int emp_exp;
	int emp_Bonuscal;
	int emp_coney = 1600;
	int TotalSalary;
	int emp_PF;
	int emp_DA;
	int emp_FBP;
    int emp_phone;
    int emp_GrossPay;
    int emp_NetPay;
    String emp_Add;
    int emp_AnnulIn;
	
	void emp_DetailsInput() {                    //getting input  
		Scanner s = new Scanner(System.in);
		
		System.out.println("***Salary Management***");
		System.out.println();
		System.out.println("Enter your name = ");
		emp_name = s.next();
		System.out.println("Enter your Employment Id = ");
		emp_Id = s.nextInt();
		System.out.println("Enter your Permanent Address = ");
		emp_Add = s.next();
		System.out.println("Enter your Phone number = ");
		emp_phone = s.nextInt();
		System.out.println("Enter the Department = ");
		emp_dept = s.next();		
		System.out.println("Date of Joining = ");
		emp_Doj = s.next();
		System.out.println("Enter the Basic Salary = ");
		emp_BasicSal = s.nextInt();
		System.out.println("Enter your Experiance = ");
		emp_exp = s.nextInt();
		System.out.println("Enter Conveyance Allowance = ");
		emp_convey = s.nextInt();
		System.out.println("Medical Resources = ");
		emp_MedRbs = s.nextInt();
		}
	
	void emp_info() { 
		System.out.println("\n");   //employee information
		System.out.println("***EMPLOYEE INFORMATION***");
		System.out.println("\n");
		System.out.println("Employee name       = "+emp_name);
		System.out.println("Employment ID       = "+emp_Id);
		System.out.println("Permanent Address   = "+emp_Add);
		System.out.println("Phone Number        = "+emp_phone);
		System.out.println("Department          = "+emp_dept);
		System.out.println("Experiance          = "+emp_exp);
		System.out.println("Date of Joining     = "+emp_Doj);
		System.out.println("\n");
	}
	
	void emp_Salinfo() {             //Salary information
		System.out.println("***SALARY INFORMATION***");
		System.out.println("\n");
		System.out.println("Basic Salary                = "+emp_BasicSal);
		System.out.println("House Rent Allowance        = "+emp_HRA);
		System.out.println("Bonus                       = "+emp_Bonuscal);
		System.out.println("Conveyance Allowance        = "+emp_convey);
		System.out.println("Medical Resources           = "+emp_MedRbs);
		System.out.println("PF Employer Contribution    = "+emp_PF);
		System.out.println("Dearness Allowance          = "+emp_DA);
		System.out.println("GrossPay                    = "+emp_GrossPay);
		System.out.println("NetPay                      = "+emp_NetPay);
		System.out.println("Monthly Salary              = "+TotalSalary); //BasicSalary + HRA + Bonus + Convey + PF + Medical insurance
		System.out.println("Annual Income               = "+emp_AnnulIn); 
		 
	}
	
	void calculate() {               //calculation 
		emp_HRA = (int) (emp_BasicSal * 0.50);
		emp_Bonuscal =(int) ((emp_BasicSal*8.33)/ 100);
		emp_DA = (int) (emp_BasicSal * 0.21);
		emp_PF = (int) (emp_BasicSal * 0.12);
		emp_GrossPay = emp_BasicSal + emp_DA + emp_HRA ; 
		emp_NetPay = emp_GrossPay - emp_PF ;
		TotalSalary = emp_BasicSal+emp_HRA+emp_Bonuscal +emp_convey+emp_PF+emp_MedRbs; 
		emp_AnnulIn = TotalSalary * 12;
	}
}
public class EmployeDetails {

	public static void main(String[] args) {
		EmpDetails obj = new EmpDetails();        //creating an object
		obj.emp_DetailsInput();                   //invoking
		obj.calculate();
		obj.emp_info();
		obj.emp_Salinfo();
	}
}
