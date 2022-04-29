package HospitalityManagement;

import java.lang.NullPointerException;
import java.util.Scanner;

class Medical{
	
	//doctor
	 String doctorid, doctorname, specilist, appoint, doctor_quali;
    int doctorroom;
    //In_patient;
    String Patientname , reason , bloodgroup , wardbed ,DoctorAssigned, InsurDetails , payment,age ,Aadhar;
    //Out_patient;
    String Patientname1 , reason1 , bloodgroup1 ,DoctorAssigned1, InsurDetails1 , payment1, age1, prescription;
    //doctor Assigned
    String res,age3,patInO,patId,pat2;
    
    public void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Doctor id:-");
        doctorid = input.nextLine();
        System.out.print("Doctor name:-");
        doctorname = input.nextLine();
        System.out.print("specilization:-");
        specilist = input.nextLine();
        System.out.print("work time:-");
        appoint = input.nextLine();
        System.out.print("qualification:-");
        doctor_quali = input.nextLine();
        System.out.print("room no.:-");
        doctorroom = input.nextInt();
        System.out.println();
        System.out.println("**Registered Successfully**");
        
    }
    
   public void doctor_info()
    {
        System.out.println(doctorid + "      \t" + doctorname + "      \t" + specilist + "      \t" + appoint + "      \t" + doctor_quali + "      \t" + doctorroom);
    }
    
   public void In_patient() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Patient Name:-");
    	Patientname = input.nextLine();
        System.out.print("Patient age:-");
        age = input.nextLine();
        System.out.print("Blood Group :-");
        bloodgroup = input.nextLine();
        System.out.print("Aadhar Number :-");
        Aadhar = input.nextLine();
        System.out.print("Reason :-");
        reason = input.nextLine();
        System.out.print("Assigned Doctor :-");
        DoctorAssigned = input.nextLine();
        System.out.print("Ward_Bed :-");
        wardbed = input.nextLine();
        System.out.print("Insurance Details .:-");
        InsurDetails = input.nextLine();
        System.out.print("Payment Details .:-");
        payment = input.nextLine(); 
        System.out.println();
        System.out.println("**Registered Successfully**");
    }
    
    public void InPatient_info() {
    	System.out.println(Patientname+ "      \t" + age +"      \t"+reason+ "      \t"+DoctorAssigned+"      \t" + Aadhar + "      \t" + bloodgroup + "      \t" + wardbed + "      \t" + InsurDetails+ "      \t" + payment);
    }
    

	public void Out_patient() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Patient Name:-");
    	Patientname1 = input.nextLine();
        System.out.print("Patient age:-");
        age1 = input.nextLine();
        System.out.print("Blood Group :-");
        bloodgroup1 = input.nextLine();
        System.out.println("Reason :");
        reason1 = input.nextLine();
        System.out.println("Doctor Assigned = ");
        DoctorAssigned1 = input.nextLine();
        System.out.print("Insurance Details .:-");
        InsurDetails1 = input.nextLine();
        System.out.print("Payment Details .:-");
        payment1 = input.nextLine();
        System.out.println();
        System.out.println("**Registered Successfully**");
    }
    
   public  void Outpatient_info() {
    	System.out.println(Patientname1 +"      \t" +age1 + "      \t" +reason1+"      \t" + DoctorAssigned1+"      \t"+bloodgroup1 +"      \t" +InsurDetails1+ "      \t" + payment1+"      \t"+prescription);
    }
    
    void AssignDoctor() {
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter Patient Name = ");
	    pat2 = input.nextLine();
	   System.out.println("Enter Patient ID = ");
	    patId = input.nextLine();
	   System.out.println("InParient or OutPatient = ");
	    patInO = input.nextLine();
	   System.out.println("Enter Reasion = ");
	    res = input.nextLine();
	   System.out.println("age = ");
	    age = input.nextLine();
    }
   void AssignDoctor_info() {
	
	   System.out.println("Patient Name    = "+pat2);
	   System.out.println("Patient ID      = "+patId);
	   System.out.println("Disease         = "+res);
	   System.out.println("Doctor Assigned = ");
	   System.out.println();
	   
	   if(res.matches("(.*)heart(.*)") || res.matches("(.*)valve(.*)") || res.matches("(.*)coronary(.*)") || res.matches("(.*)pericardial(.*)"))
	   {
		   System.out.println("Details: \nCardialogist Dr.Manojkumar R \nDuring : Mon-Fri 6-10AM \nPhone no : 4563473467");
		   System.out.println("----------------------------------------");
		   System.out.println("***Prescription***");
		   System.out.println("----------------------------------------");
		   System.out.println("Medicine Name : Ecosprin");
		   System.out.println("Number of Days : 30Days");
		   System.out.println("Tablet : per day 0-0-1 night only");
		   System.out.println("----------------------------------------");
		   System.out.println("**Fees Payement**");
		   System.out.println("----------------------------------------");
		   System.out.println("Doctor Fees : 250Rs");
		   System.out.println("Tablet Fees : 250Rs");
		   System.out.println("----------------------------------------");
		   System.out.println("Total Fees  : 500Rs");
		   
	   }
	   else if(res.matches("(.*)diaper rash(.*)") || res.matches("(.*)baby(.*)") || res.matches("(.*)acne(.*)") || res.matches("(.*)cold(.*)") || res.matches("(.*)flu(.*)"))
	   {
		   System.out.println("Details: \nPediatrics Dr.JayaKumar R \nDuring : Mon-Fri 6AM-12PM \nPhone no : 5678676796");
		   System.out.println("----------------------------------------");
		   System.out.println("***Prescription***");
		   System.out.println("----------------------------------------");
		   System.out.println("Medicine Name : P250");
		   System.out.println("Number of Days : 3Days");
		   System.out.println("Tablet : per day 1-0-1 morning and night only");
		   System.out.println("----------------------------------------");
		   System.out.println("**Fees Payement**");
		   System.out.println("----------------------------------------");
		   System.out.println("Doctor Fees : 250Rs");
		   System.out.println("Tablet Fees : 150Rs");
		   System.out.println("----------------------------------------");
		   System.out.println("Total Fees  : 400Rs");
	   }
	   else if(res.matches("(.*)nerves(.*)") || res.matches("(.*)spinal(.*)") || res.matches("(.*)disorders(.*)") || res.matches("(.*)memory loss(.*)") || res.matches("(.*)loss of feeling(.*)"))
	   {
		   System.out.println("Details: \nNeurologist Dr.Sudhakar H \nDuring : Mon-Fri 4-6AM  \nPhone no : 567834656");
		   System.out.println("----------------------------------------");
		   System.out.println("***Prescription***");
		   System.out.println("----------------------------------------");
		   System.out.println("Medicine Name : duloxetine");
		   System.out.println("Number of Days : 10Days");
		   System.out.println("Tablet : per day 1-0-1 morning and night only");
		   System.out.println("----------------------------------------");
		   System.out.println("**Fees Payement**");
		   System.out.println("----------------------------------------");
		   System.out.println("Doctor Fees : 250Rs");
		   System.out.println("Tablet Fees : 350Rs");
		   System.out.println("----------------------------------------");
		   System.out.println("Total Fees  : 600Rs");
	   }
	   else if(res.matches("(.*)leg(.*)") || res.matches("(.*)neck(.*)") || res.matches("(.*)hip(.*)") || res.matches("(.*)joints(.*)") || res.matches("(.*)excercise(.*)"))
	   {
		   System.out.println("Details: \nPhysiotherapist Dr.Sasmitha \nDuring Mon-Fri 10-12PM  \nPhone no : 549874698");
		   System.out.println("----------------------------------------");
		   System.out.println("**Prescription**");
		   System.out.println("----------------------------------------");
		   System.out.println("Medicine Name : doxepin");
		   System.out.println("Number of Days : 10Days");
		   System.out.println("Tablet : per day 1-0-1 morning and night only");
		   System.out.println("----------------------------------------");
		   System.out.println("**Fees Payement**");
		   System.out.println("----------------------------------------");
		   System.out.println("Doctor Fees : 250Rs");
		   System.out.println("Tablet Fees : 250Rs");
		   System.out.println("----------------------------------------");
		   System.out.println("Total Fees  : 500Rs");
	   } 
	   else if(res.matches("(.*)mental(.*)") || res.matches("(.*)stress(.*)") || res.matches("(.*)depression(.*)") || res.matches("(.*)disabled(.*)"))
	   {
		   System.out.println("Details: \nPsychologist Dr.Sudhakar A \nDuring Mon-Fri 10-3PM  \nPhone no : 549874698");
		   System.out.println();
		   System.out.println("***Prescription***");
		   System.out.println();
		   System.out.println("Medicine Name : Nexito 5mg");
		   System.out.println("Number of Days : 30Days");
		   System.out.println("Tablet : per day 0-0-1 morning and night only");
		   System.out.println("----------------------------------------");
		   System.out.println("**Fees Payement**");
		   System.out.println("----------------------------------------");
		   System.out.println("Doctor Fees : 250Rs");
		   System.out.println("Tablet Fees : 100Rs");
		   System.out.println("----------------------------------------");
		   System.out.println("Total Fees  : 350Rs");
	   } 
  }
            
}

public class HospitalManagement {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		int j ,count1 = 6, count2 = 2, count3 = 2;
		
		
		int i,k,x;
		Medical[] c = new Medical[50];
        for (i = 0; i < 50; i++)
            c[i] = new Medical();
        
        Medical[] p = new Medical[50];
        for (k = 0; k < 25; k++)
            p[k] = new Medical();
        
        Medical[] op = new Medical[50];
        for (x = 0;x < 25;x++) 
        	op[x] = new Medical();
        
        //doctor details
        c[0].doctorid = "21";
        c[0].doctorname = "Dr.JayaKumar";
        c[0].specilist = "Pediatrics";
        c[0].appoint = "6-12PM";
        c[0].doctor_quali = "MBBS,MD";
        c[0].doctorroom = 17;
        c[1].doctorid = "32";
        c[1].doctorname = "Dr.Sudhakar A";
        c[1].specilist = "Psychologist";
        c[1].appoint = "10-3PM";
        c[1].doctor_quali = "MBBS,MD";
        c[1].doctorroom = 30;
        c[2].doctorid = "34";
        c[2].doctorname = "Dr.Sudhakar H";
        c[2].specilist = "Neurologist";
        c[2].appoint = "4-6AM";
        c[2].doctor_quali = "MBBS,MD";
        c[2].doctorroom = 34;
        c[3].doctorid = "33";
        c[3].doctorname = "Dr.Pramalatha";
        c[3].specilist = "Gynecologist";
        c[3].appoint = "10-6PM";
        c[3].doctor_quali = "MBBS,MS";
        c[3].doctorroom = 40;
        c[4].doctorid = "36";
        c[4].doctorname = "Dr.Manojkumar R";
        c[4].specilist = "Cardialogist";
        c[4].appoint = "6-10AM";
        c[4].doctor_quali = "MBBS,MS";
        c[4].doctorroom = 40;
        c[5].doctorid = "36";
        c[5].doctorname = "Dr.Sasmitha";
        c[5].specilist = "Physiotherapist";
        c[5].appoint = "10-12PM";
        c[5].doctor_quali = "MBBS,MS";
        c[5].doctorroom = 44;
        
        int choice = 1;
        do{
    	  System.out.println("---------------------------------------------------------------------------------------------------\n");
        	System.out.println("******Welcome to Hospital Management System********");
    			System.out.println("1)Register/Display a Doctors\n2)Register/Display a Patient\n3)Doctor Details/Prescription/Fees Details");
    			int reg = input.nextInt();
    			
    			    if(reg==1) {
    			    	
    				System.out.println("1)Register a Doctors\n2)Display the Doctor Details");
    				int doc = input.nextInt();
    				
    			
    			switch(doc){
    			default: System.out.println("InValid Choice\n-------------------------");
        		break;
        		
    			case 1:
    				c[count1].new_doctor();
    				count1++;
                    break;
                   
    			case 2:
    				System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("DoctorId   \t DoctorName     \t Specilist       \t Timing \t Qualification \t Room No.");

                    System.out.println("------------------------------------------------------------------------------------------------------");
                    for (j = 0; j < count1; j++)
                    {
                        c[j].doctor_info();
                    }
                   
                    break;
    			}
    		}else if(reg==2) {
    			System.out.println("1)InPatient\n2)OutPatient");
				reg = input.nextInt();
				
				if(reg==1) {
					System.out.println("1)Register a InPatient\n2)Display the InPatient");
    				int pat = input.nextInt();
    			
    				switch(pat) {
    				default: System.out.println("InValid Choice\n-------------------------");
            		break;
            		
    				case 1:
    					p[count2].In_patient();
        				count2++;
                        break;
                        
                        
    				case 2:
    					System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Patient_Name     \tAge     \tReason      \tDoctor_Assigned      \tAadhar_Number      \t Blood_Group      \t Ward_Bed      \t Insurance Details      \t Payment Details.");

                        System.out.println("--------------------------------------------------------------------------------");
                        for (j = 0; j < count2; j++)
                        {
                            p[j].InPatient_info();
                        }
                        break;
    				}
    				
				}else if(reg==2) {
					System.out.println("1)Register a OutPatient\n2)Display the OutPatient");
    				int pat1 = input.nextInt();
    				
    				switch(pat1) {
    				default: System.out.println("InValid Choice\n-------------------------");
            		break;
            		
    				case 1:
    					op[count3].Out_patient();
        				count3++;
                        break;
                        
    				case 2:
    					System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Patient_Name      \tAge      \tReason      \tDoctor_Assigned      \tBlood_Group      \tInsurance Details       \tPayment Details      \tPrescription");

                        System.out.println("--------------------------------------------------------------------------------");
                        for (j = 0; j < count3; j++)
                        {
                            op[j].Outpatient_info();
                        }
                        break;
    				}
				}
    		}else if(reg==3) {
    			Medical obj = new Medical();
    			obj.AssignDoctor();
    		    obj.AssignDoctor_info();
    		}
    			   
	}while(choice!=0);
	}
}
