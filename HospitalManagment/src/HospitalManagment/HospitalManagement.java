package HospitalManagment;

//import java.io.*;
//import java.util.*;
//
//class doctor
//{
//    String did, dname, specilist, appoint, doc_qual,Doc_Assigned, bloodgroup, InsuranceDetails,paymentdetails;
//    int droom , age, WardBed, AdhaarCard;
//    
//    void new_doctor()
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("id:-");
//        did = input.nextLine();
//        System.out.print("name:-");
//        dname = input.nextLine();
//        System.out.print("specilization:-");
//        specilist = input.nextLine();
//        System.out.print("work time:-");
//        appoint = input.nextLine();
//        System.out.print("qualification:-");
//        doc_qual = input.nextLine();
//        System.out.print("room no.:-");
//        droom = input.nextInt();
//        System.out.print("age :-");
//        age = input.nextInt();
//        System.out.println("Doctor Assigned :-");
//        Doc_Assigned = input.nextLine();
//        System.out.println("Blood Group :-");
//        bloodgroup = input.nextLine();
//        System.out.println("Ward Bed Number :-");
//        WardBed = input.nextInt();
//        System.out.println("Aadhar Number :-");
//        AdhaarCard = input.nextInt();
//        System.out.println("Aadhar Number :-");
//        InsuranceDetails = input.nextLine();
//        System.out.println("paymentdetails :-");
//        paymentdetails = input.nextLine();
//    }
//    void doctor_info()
//    {
//        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
//    }
//}
//class patient{
//    String pid, pname, disease, sex, admit_status;
//    int age;
//    void new_patient()
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("id:-");
//        pid = input.nextLine();
//        System.out.print("name:-");
//        pname = input.nextLine();
//        System.out.print("disease:-");
//        disease = input.nextLine();
//        System.out.print("sex:-");
//        sex = input.nextLine();
//        System.out.print("admit_status:-");
//        admit_status = input.nextLine();
//        System.out.print("age:-");
//        age = input.nextInt();
//    }
//    void patient_info()
//    {
//        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
//    }
//}
//class medical
//{
//    String med_name, med_comp, exp_date;
//    int med_cost, count;
//    void new_medi()
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("name:-");
//        med_name = input.nextLine();
//        System.out.print("comp:-");
//        med_comp = input.nextLine();
//        System.out.print("exp_date:-");
//        exp_date = input.nextLine();
//        System.out.print("cost:-");
//        med_cost = input.nextInt();
//        System.out.print("no of unit:-");
//        count = input.nextInt();
//    }
//    void find_medi()
//    {
//        System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
//    }
//}
//class lab
//{
//    String fecility;
//    int lab_cost;
//    void new_feci()
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("fecility:-");
//        fecility = input.nextLine();
//        System.out.print("cost:-");
//        lab_cost = input.nextInt();
//    }
//    void feci_list()
//    {
//        System.out.println(fecility + "\t\t" + lab_cost);
//    }
//}
//class fecility 
//{
//    String fec_name;
//    void add_feci()
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("fecility:-");
//        fec_name = input.nextLine();
//    }
//    void show_feci()
//    {
//        System.out.println(fec_name);
//    }
//}
//public class HospitalManagement
//{
//    public static void main(String args[])
//    {
//         
//        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
//        System.out.println("      Welcome to Hospital Management System     ");
//        System.out.println("---------------------------------------------------------------------------------------");
//        doctor[] d = new doctor[25];
//        patient[] p = new patient[100];
//        lab[] l = new lab[20];
//        fecility[] f = new fecility[20];
//        medical[] m = new medical[100];
//        
//        int i;
//        for (i = 0; i < 25; i++)
//            d[i] = new doctor();
//        for (i = 0; i < 100; i++)
//            p[i] = new patient();
//        for (i = 0; i < 20; i++)
//            l[i] = new lab();
//        for (i = 0; i < 20; i++)
//            f[i] = new fecility();
//        for (i = 0; i < 100; i++)
//            m[i] = new medical();
//
//
//        Scanner input = new Scanner(System.in);
//        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
//        while (status == 1)
//        {
//            System.out.println("1.Doctos  \n2. Patients  \n3.prescription  \n4.Laboratories  \n5. Facilities  \n6. Staff ");
//            System.out.println("-----------------------------------------------------------------------------------");
//            choice = input.nextInt();
//       do {
//            switch (choice)
//            {
//                case 1:
//                    {
//                        System.out.println("                      DOCTOR SECTION");
//                        System.out.println("--------------------------------------------------------------------------------");
//                        s1 = 1;
//                        while (s1 == 1)
//                        {
//                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
//                            c1 = input.nextInt();
//                            switch (c1)
//                            {
//                                case 1:
//                                    {
//                                        d[count1].new_doctor();
//                                        count1++;
//                                        break;
//                                    }
//                                case 2:
//                                    {
//                                        System.out.println("--------------------------------------------------------------------------------");
//                                        System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
//                                        System.out.println("--------------------------------------------------------------------------------");
//                                        for (j = 0; j < count1; j++)
//                                        {
//                                            d[j].doctor_info();
//                                        }
//                                        break;
//                                    }
//                            }
//                        }
//                        break;
//                    }
//                case 2:
//                    {
//                        System.out.println("                     **PATIENT SECTION**");
//                        System.out.println("--------------------------------------------------------------------------------");
//                        s2 = 1;
//                        while (s2 == 1)
//                        {
//                            System.out.println("1.Add New Entry\n2.Existing Patients List");
//                            c1 = input.nextInt();
//                            switch (c1)
//                            {
//                                case 1:
//                                    {
//                                        p[count2].new_patient();
//                                        count2++;
//                                        break;
//                                    }
//                                case 2:
//                                    {
//                                        System.out.println("--------------------------------------------------------------------------------");
//                                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
//                                        System.out.println("--------------------------------------------------------------------------------");
//                                        for (j = 0; j < count2; j++) {
//                                            p[j].patient_info();
//                                        }
//                                        break;
//                                    }
//                            }
//                        }
//                        break;
//                    }
//                case 3:
//                    {
//                        s3 = 1;
//                        System.out.println("                     **p SECTION**");
//                        System.out.println("--------------------------------------------------------------------------------");
//                        while (s3 == 1)
//                        {
//                            System.out.println("1.Add New Entry\n2. Existing Medicines List");
//                            c1 = input.nextInt();
//                            switch (c1)
//                            {
//                                case 1:
//                                    {
//                                        m[count3].new_medi();
//                                        count3++;
//                                        break;
//                                    }
//                                case 2:
//                                    {
//                                        System.out.println("--------------------------------------------------------------------------------");
//                                        System.out.println("Name \t Company \t Expiry Date \t Cost");
//                                        System.out.println("--------------------------------------------------------------------------------");
//                                        for (j = 0; j < count3; j++) {
//                                            m[j].find_medi();
//                                        }
//                                        break;
//                                    }
//                            }
//                        }
//                        break;
//                    }
//                default:
//                    {
//                        System.out.println(" You Have Enter Wrong Choice!!!");
//                    }
//            }
//        }while(choice!=1);
//    }
//    }
//}
