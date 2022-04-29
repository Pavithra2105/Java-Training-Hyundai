package GetSetAndSetter;

import java.util.Scanner;

class Student{
	private String StudentName;
	private int StudentId;
	private String Class;
	private int marks;
	
	Student(String StudentName,int studentId,String Class,int marks){
		this.StudentName = StudentName;
		this.StudentId = studentId;
		this.Class = Class;
		this.marks = marks;
	}
	
	public String getStuName(){
		return StudentName;
	}
	public int getStuId(){
		return StudentId;
	}
	public String geClass(){
		return Class;
	}
	public int getStuMark(){
		return marks;
	}
	public void setStudentDetails(String StudentName,int StudentId,String Class,int marks) {   //setter- set a value to an instance variable
		this.StudentName = StudentName;
		this.StudentId = StudentId;
		this.Class = Class;
		this.marks = marks;
	}
	
}

class Teacher {
	private String StaffName;
	private int StaffId;
	private String Subject;
	private int Experiance;
	
	
	Teacher(String StaffName,int StaffId,String Subject,int Experiance){
		this.StaffName = StaffName;
		this.StaffId = StaffId;
		this.Subject = Subject;
		this.Experiance = Experiance;
	}
	
	public String getStffName(){
		return StaffName;
	}
	public int getStffId(){
		return StaffId;
	}
	public String getSub(){
		return Subject;
	}
	public int getStffExp(){
		return Experiance;
	}
	public void setStaffDetails(String StaffName,int StaffId,String Subject,int Experiance) {   //setter- set a value to an instance variable
		this.StaffName = StaffName;
		this.StaffId = StaffId;
		this.Subject = Subject;
		this.Experiance = Experiance;
	}	
}
public class Management {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Student
		System.out.println("Ente the Student Name : ");
		String StudentName = s.next();
		System.out.println("Ente the StudentID : ");
		int StudentId = s.nextInt();
		System.out.println("Ente the Class : ");
		String Class = s.next();
		System.out.println("Ente the Marks : ");
		int marks = s.nextInt();
		
		//Teacher
		System.out.println("Ente the StaffName : ");
		String StaffName = s.next();
		System.out.println("Ente the StaffID : ");
		int StaffId = s.nextInt();
		System.out.println("Enter the subject you have taken : ");
		String Subject = s.next();
		System.out.println("Ente the Experiance : ");
		int Experiance = s.nextInt();
		
	
		
		Student stu = new Student(StudentName,StudentId,Class,marks);
		
		
		stu.setStudentDetails(StudentName,StudentId,Class,marks);
		System.out.println("*************************************");
		System.out.println(" 		STUDENT DETAILS");
		System.out.println();
		System.out.println("Student Name : "+stu.getStuName());
		System.out.println("Student ID   : "+stu.getStuId());
		System.out.println("Class        : "+stu.geClass());
		System.out.println("Student Marks: "+stu.getStuMark());
		System.out.println("*************************************");
		
		Teacher tch = new Teacher(StaffName,StaffId,Subject,Experiance);
		
		tch.setStaffDetails(StaffName,StaffId,Subject,Experiance);
		System.out.println("		 STAFF DETAILS");
		System.out.println();
		System.out.println("Staff Name : "+tch.getStffName());
		System.out.println("Staff ID   : "+tch.getStffId());
		System.out.println("Subject    : "+tch.getSub());
		System.out.println("Experiance : "+tch.getStffExp());
		System.out.println("*************************************");
		
		s.close();
	}

}
