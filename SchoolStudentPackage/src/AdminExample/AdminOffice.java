package AdminExample;

import java.util.Scanner;

import AdminExample.AdminActivities.Admin1;

interface AdminActivities {
public	void ModifyStudent();
public 	void ModifyStaff();
public	void ModifySubjects();
public	void ModifySections();
public 	void viewGrade();


static void StaticMethod () {
	System.out.println("inside interface");
    }

	class Admin1 implements AdminActivities {
		Scanner s = new Scanner(System.in);
		public void ModifyStudent() {
			
			System.out.println("1.create Student \n2.modify student");
			int num = s.nextInt();
			if(num==1) {
			System.out.println("Enter the FirstName = ");
			String fname = s.next();
			System.out.println("Enter the LastName = ");
			String lname = s.next();
			System.out.println("Enter the Date OF Birth = ");
			String dob = s.next();
			System.out.println("Enter the Aadhar Number = ");
			int aadhar = s.nextInt();
			System.out.println("Enter Date of Joining = ");
			String doj = s.next();
			System.out.println("Enter the Student ID = ");
			int Stuid = s.nextInt();
			
			//secondary details
			
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
			}
			else if(num==2) {
				
			}
			
			//Staff
			System.out.println("1.create Staff \n2.modify Staff");
			int staff = s.nextInt();
			if(staff == 1) {
				
			}
			
			//Students
			System.out.println("1.create subjects \n2.modify subjects");
			int subjects = s.nextInt();
			
		}
		public void ModifyStaff() {
			
			
			
		}

		@Override
		public void ModifySubjects() {
			
			
		}

		@Override
		public void viewGrade() {
			
			
		}

		@Override
		public void ModifySections() {
			
			
		}
		
	}
}
public class AdminOffice {

	public static void main(String[] args) {

		Admin1 obj = new Admin1();
		obj.ModifyStudent();
		
	}

}



