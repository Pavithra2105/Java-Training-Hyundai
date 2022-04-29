package HospitalManagment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Doctor{
	
	//doctor......
	private String DoctorId;
	private String Doctorname;
	private String specilist;
	private String appoint;
	private String doc_qualification;
	private int droom;
	
	
	public Doctor(String DoctorId,String Doctorname, String specilist, String appoint, String doc_qualification,
			int droom) {
		this.DoctorId = DoctorId;
		this.Doctorname = Doctorname;
		this.specilist = specilist;
		this.appoint = appoint;
		this.doc_qualification = doc_qualification;
		this.droom = droom;
	}
	public String getDoctorId() {
		return DoctorId;
	}
	public String getDoctorname() {
		return Doctorname;
	}
	public String Getspecilist() {
		return specilist;
	}
	public String getappoint() {
		return appoint;
	}
	public String getqualification() {
		return doc_qualification;
	}
	public int getstaffId() {
		return droom;
	}
	public String toString(){
		return DoctorId+" "+Doctorname+" "+specilist+" "+appoint+" "+doc_qualification+" "+droom;
		}	
}

class Patient{
	
	private String patientid;
	private String patientname;
	private String disease;
	private String admit_status;
	private int age;
	private String bloodgroup;
	private int AadharNumber;
	private String Insurance;
	private String DoctAssigned;
	
	//Outpatient
	private String Outpatid;
	private String Outpatname;
	private String Outdisease;
	private int OutAadharNum;
	private String Outbloodgroup;
	private String DoctOutAssigned;
	private String OutInsurance;
	private int Outage;
	
	
	
	
	//IntPatient
	public String getPatientId() {
		return patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public String getOutDisease() {
		return disease;
	}
	public String getInBloodGroup() {
		return bloodgroup;
	}
	public int AadharCard() {
		return AadharNumber;
	}
	public String getDoctorAssigned() {
		return DoctAssigned;
	}
	public String GetInsurance() {
		return Insurance;
	}
	
	public String toString(){
		return patientid+" "+patientname+" "+disease+"  "+admit_status+" "+age+" "+bloodgroup+" "+AadharNumber+" "+DoctAssigned+" "+Insurance;
		}

	//Outpatient
	public String getOutPatId() {
		return Outpatid;
	}
	public String getPatname() {
		return Outpatname;
	}
	public int age() {
		return Outage;
	}
	public String getDisease() {
		return Outdisease;
	}
	public String getOutBloodGroup() {
		return Outbloodgroup;
	}
	public String getOutDoctorAssigned() {
		return DoctOutAssigned;
	}
	public int getOutAadharCard() {
		return OutAadharNum;
	}
	public String InsuranceDetails() {
		return OutInsurance;
	}
	
	public String toString1(){
		return Outpatid+" "+Outpatname+" "+Outbloodgroup+"  "+DoctOutAssigned+" "+Outage+" "+OutAadharNum+" "+OutInsurance;
		}		
}

public class HositalManagementSystem {

	ArrayList<Doctor> lst = new ArrayList<Doctor>();
	ArrayList<Patient> lst1 = new ArrayList<Patient>();
	
	Scanner s = new Scanner(System.in);
	
	int ch;
	do{
		System.out.println("\n");
		System.out.println("Welcome to Hospital Managment System\n1)Doctor \n2)Patient \n3)Exit Patient");
		System.out.println("\nEnter :");
		ch = s.nextInt();
		
		switch(ch){
		default: System.out.println("InValid Choice\n-------------------------");
		break;
		
		case 1:
			System.out.println("1)To register a Doctor\n2)Display Doctors\n3)modify student");
			int stu = s.nextInt();
			Iterator<Doctor> j = lst.iterator();
		         if(stu == 1) {
					System.out.println("1)Register a Doctor");
					
					System.out.println("Enter a DoctorId :");
					String DoctorId = s.next();
					System.out.println("Enter your Doctor Name :");
					String Doctorname = s.next();
					System.out.println("specilist :");
					String specilist = s.next();
					System.out.println("Enter the Appoinment :");
					String appoint = s.nextLine();
					System.out.println("Enter your DateOfJoining :");
					String doc_qualification = s.next();
					System.out.println("Enter your Room number:");
					int droom = s.nextInt();

					lst.add(new Doctor(DoctorId,Doctorname,specilist,appoint,doc_qualification,droom));
					System.out.println("\n");
					System.out.println("Created Successfully!");
					System.out.println("\n");
				}
		}
		
	}while(ch!=0);
	}
}
