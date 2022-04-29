package Managment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Student{
	
	//primary details
	private String Firstname;
	private String Lastname;
	private String DateOfBirth;
	private int Adhaar;
	private String DateOfJoining;
	private int StudentId;
	
	
	//constructor
	Student(String Firstname,String Lastname,String DateOfBirth,int Adhaar,String DateOfJoining,int StudentId){
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.DateOfBirth = DateOfBirth;
		this.Adhaar = Adhaar;
		this.DateOfJoining = DateOfJoining;
		this.StudentId = StudentId;
	}
	
	

	public String getFirst() {
		return Firstname;
	}
	public String getLast() {
		return Lastname;
	}
	public String getDob() {
		return DateOfBirth;
	}
	public int Adhaar() {
		return Adhaar;
	}
	public String getDoj() {
		return DateOfJoining;
	}
	public int getStuId() {
		return StudentId;
	}
	public String toString(){
		return StudentId+" "+Firstname+" "+Lastname+" "+DateOfBirth+" "+Adhaar+" "+DateOfJoining+" "+StudentId;
		}
}

class Staff {
	
	private String StaffFname;
	private String StaffLname;
	private String Qualification;
	private int Exp;
	private String Subjects;
	private int staffId;
	
	public Staff(String StaffFname2, String StaffLname2, String Qualification2, int Exp2, String Subjects2,
			int StaffId2) {
		this.StaffFname = StaffFname2;
		this.StaffLname = StaffLname2;
		this.Qualification = Qualification2;
		this.Exp = Exp2;
		this.Subjects = Subjects2;
		this.staffId = StaffId2;
	}

	public String getStafffirst() {
		return StaffFname;
	}
	public String getStafflast() {
		return StaffLname;
	}
	public String Qualifi() {
		return Qualification;
	}
	public int getExp() {
		return Exp;
	}
	public String getSubjects() {
		return Subjects;
	}
	public int getstaffId() {
		return staffId;
	}
	public String toString(){
		return StaffFname+" "+StaffLname+" "+Qualification+" "+Exp+" "+Subjects;
		}
}

class StudentMarks {
	
	private int math,sci,soc,eng,tam,StuId01;
	private float percentage;
	
	StudentMarks(int StuId01,int math,int sci,int soc,int eng,int tam,float percentage){
		this.StuId01 = StuId01;
		this.math = math;
		this.sci = sci;
		this.soc = soc;
		this.eng = eng;
		this.tam = tam;
		this.percentage = percentage;
	}
	public int getStuId() {
		return StuId01;
	}
	public int getMath() {
		return math;
	}
	public int getSci() {
		return sci;
	}
	public int getSoc() {
		return soc;
	}
	public int getEng() {
		return eng;
	}
	public int getTam() {
		return tam;
	}
	public float getGrade() {
		return percentage;
	}
	public String toString(){
		System.out.println("--------------------------------------------\n");
		System.out.println(":: Student Id = "+StuId01+" ::");
		System.out.println("Mathamatic    :"+math);
		System.out.println("Science       :"+sci);
		System.out.println("Social        :"+soc);
		System.out.println("English       :"+eng);
		System.out.println("Tamil         :"+tam);
		System.out.println("Percentage    :"+percentage);
		System.out.println("\n");
		System.out.println("--------------------------------------------\n");
		return StuId01+" "+math+" "+sci+" "+soc+" "+eng+" "+tam+" "+percentage;
		}
}

class StudentFeature{
	
	String news,Date,msg;
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" announcements/News =");
		news = sc.nextLine();
		System.out.println("Enter the Date = ");
		Date = sc.nextLine();
		System.out.println("Share anything Important = ");
		msg = sc.nextLine();
	}
	public void Show() {
		System.out.println("\n");
		System.out.println("Todays Announcements/News = "+news);
		System.out.println("Todays Date = "+Date);
		System.out.println("Important Message = "+msg);
		System.out.println("\n");
		System.out.println(".............Kindly check the new updates every ..............");
	}
}

public class StudentMangment{

	public static void main(String[] args) {
		
		ArrayList<Student> lst = new ArrayList<Student>();
		ArrayList<Staff> lst1  = new ArrayList<Staff>();
		ArrayList<StudentMarks> lst2 = new ArrayList<StudentMarks>();

		 int StudentId ,StaffId;
		Scanner s = new Scanner(System.in);
	
int ch;
do{
	System.out.println("\n");
	System.out.println("Welcome to School Managment System\n1)create/modify student\n2)create/modify staff\n3)Upload/View Marks&Subject\n4)Annoncement/News");
	System.out.println("\nEnter :");
	ch = s.nextInt();
			
	switch(ch){
		default: System.out.println("InValid Choice\n-------------------------");
		break;
		
	case 1:
		System.out.println("1)create student\n2)Show Student\n3)modify student");
		int stu = s.nextInt();
		Iterator<Student> j = lst.iterator();
	         if(stu == 1) {
				System.out.println("1)create student");
				
				System.out.println("Enter your FirstName :");
				String Firstname = s.next();
				System.out.println("Enter your LastName :");
				String Lastname = s.next();
				System.out.println("Enter your DateOfBirth :");
				String DateOfBirth = s.next();
				System.out.println("Enter your Adhaar Number :");
				int Adhaar = s.nextInt();
				System.out.println("Enter your DateOfJoining :");
				String DateOfJoining = s.next();
				System.out.println("Enter your StudentId:");
				 StudentId = s.nextInt();
				lst.add(new Student(Firstname,Lastname,DateOfBirth,Adhaar,DateOfJoining,StudentId));
				System.out.println("\n");
				System.out.println("Created Successfully!");
				System.out.println("\n");
			}
	         else if(stu == 2) {
	 			System.out.println("\nShowing the list of Student:\n-------------------------------------");

	 		while(j.hasNext()){
	 		Student e = j.next();
	 		System.out.println(e);
	 		}
	 		System.out.println("----------------------------------");		
	 	}
			else if(stu == 3) {
				System.out.println("3)modify student");
				
				boolean found = false;
				System.out.println("Enter the StudentId :");
				int StuId = s.nextInt();
				ListIterator<Student> l = lst.listIterator();
				
				while(l.hasNext()){
					Student e = l.next();
					if(e.getStuId()==StuId){
						System.out.println("Enter your FirstName :");
						String Firstname = s.next();
						System.out.println("Enter your LastName :");
						String Lastname = s.next();
						System.out.println("Enter your DateOfBirth :");
						String DateOfBirth = s.next();
						System.out.println("Enter your Adhaar Number :");
						int Adhaar = s.nextInt();
						System.out.println("Enter your DateOfJoining :");
						String DateOfJoining = s.next();
						System.out.println("Enter your StudentId:");
						 StudentId = s.nextInt();
					l.set(new Student(Firstname,Lastname,DateOfBirth,Adhaar,DateOfJoining,StudentId));
					found = true;
		       }
         }
	   if(!found){
		   System.out.println("\n");
			System.out.println("No Data Found");
			System.out.println("\n");
			}
		else{
			System.out.println(""+StuId+" is Successfully Updated");
			System.out.println("\n");
			   }
			    }
				break;
	case 2:
		System.out.println("1)create Staff\n2)Show Staff\n3)modify Staff\n");
		int stfId = s.nextInt();
		Iterator<Staff> i = lst1.iterator();
		if(stfId == 1) {
			System.out.println(": 1)create Staff :");
			
			System.out.println("Enter Staff FirstName :");
			String StaffFname = s.next();
			System.out.println("Enter Staff LastName :");
			String StaffLname = s.next();
			System.out.println("Enter the Qualification :");
			String Qualification = s.next();
			System.out.println("Enter Experiance :");
			int Exp = s.nextInt();
			System.out.println("Enter Subjects :");
			String Subjects = s.next();
			System.out.println("Enter the StaffId:");
			 StaffId = s.nextInt();
			 
			lst1.add(new Staff(StaffFname,StaffLname,Qualification,Exp,Subjects,StaffId));
			System.out.println("\n");
			System.out.println("Created Successfully!");
			System.out.println("\n");
			}
		else if(stfId == 2) {
			System.out.println("\nShowing the list of Staff:\n-------------------------------------");

		while(i.hasNext()){
		Staff e = i.next();
		System.out.println(e);
		}

		System.out.println("----------------------------------");		
	}
		else if(stfId == 3) {
			System.out.println(": 3)modify Staff :");
			
			boolean found = false;
			System.out.println("Enter the StaffId :");
			int StfId = s.nextInt();
			ListIterator<Staff> l = lst1.listIterator();
			
			while(l.hasNext()){
				Staff e = l.next();
				if(e.getstaffId()==StfId){
					System.out.println("Enter Staff FirstName :");
					String StaffFname = s.next();
					System.out.println("Enter Staff LastName :");
					String StaffLname = s.next();
					System.out.println("Enter  Qualification :");
					String Qualification = s.next();
					System.out.println("Enter Experiance :");
					int Exp = s.nextInt();
					System.out.println("Enter Subjects :");
					String Subjects = s.next();
					System.out.println("Enter the StaffId:");
					 StaffId = s.nextInt();
					
				l.set(new Staff(StaffFname,StaffLname,Qualification,Exp,Subjects,StaffId));
				found = true;
	       }
     }
   if(!found){
	   System.out.println("\n");
		System.out.println("No Data Found");
		System.out.println("\n");
		}
	else{
		System.out.println(""+StfId+" is Successfully Updated");
		System.out.println("\n");
		        }
	        }
		break;
		
	case 3:
		System.out.println("1)upload marks\n2)Show Student percentage");
		int stumark = s.nextInt();
		Iterator<StudentMarks> k = lst2.iterator();
		if(stumark == 1) {
		//System.out.println(": Grade : ");
		System.out.println("\n");
		
	
		float sum=0, avg=0;
		int num;
			System.out.println("Enter the Student ID = ");
			int StuId01 =s.nextInt();
			System.out.println(" Mathamatics :");
			int math = s.nextInt();
			System.out.println(" Science :");
			int sci = s.nextInt();
			System.out.println(" Social :");
			int soc = s.nextInt();
			System.out.println(" English :");
			int eng = s.nextInt();
			System.out.println(" Tamil :");
			int Tam = s.nextInt();
			sum = math+sci+soc+eng+Tam;
			avg = sum/500*100;
			lst2.add(new StudentMarks(StuId01,math,sci,soc,eng,Tam,avg));
			
		System.out.println("Student ID = "+StuId01+" Mathamatics = "+math+" Science = "+sci+" Social = "+soc+" English = "+eng+" Tamil = "+Tam+" = percentage "+avg);
			
		System.out.println("percentage = "+avg);
		
		if(avg>=90) {
			System.out.println("GRADE = A");
		}else if(avg>=75 && avg<90) {
			System.out.println("GRADE = B");
		}else if(avg>=60 && avg<75) {
			System.out.println("GRADE = C");
		}else if(avg>=45 && avg<60) {
			System.out.println("GRADE = D");
		}else if(avg>=35 && avg<45) {
			System.out.println("GRADE = E");
		}else {
			System.out.println("GRADE = Fail");
		   }
		
		}else if(stumark == 2) {
			System.out.println("\nShowing the list of Student marks:\n-------------------------------------");

	 		while(k.hasNext()){
	 		StudentMarks e = k.next();
	 		System.out.println(e);
	 		}
	 		System.out.println("----------------------------------");	
		}
		break;
	case 4:
		StudentFeature obj = new StudentFeature();
		obj.Input();
		obj.Show();
		}
	}while(ch!=0);
}
}
