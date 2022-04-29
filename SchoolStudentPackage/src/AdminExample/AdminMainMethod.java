package AdminExample;

import java.util.Scanner;

public class AdminMainMethod {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the FirstName = ");
		String fname = s.next();
		System.out.println("Enter the LastName = ");
		String lname = s.next();
		System.out.println("Enter the Date OF Birth = ");
		String dob = s.next();
		System.out.println("Enter the Aadhar Number = ");
		String aadhar = s.next();
		System.out.println("Enter Date of Joining = ");
		String doj = s.next();
		System.out.println("Enter the Student ID = ");
		int Stuid = s.nextInt();
		
		//SECONDARY DETAILS
		System.out.println("Enter your Father's Name = ");
		String fathername = s.next();
		System.out.println("Enter your Mothers's Name = ");
		String mothersname = s.next();
		System.out.println("Enter your Phone Number = ");
		int contact = s.nextInt();
		System.out.println("Enter your Email ID = ");
		String emailId = s.next();
		System.out.println("Enter your Address = ");
		String Address = s.next();
		
		AdminMainMethod obj = new AdminMainMethod(fname,lname,dob,aadhar,doj,Stuid,fathername,mothersname,contact,emailId,Address);

	}

}
