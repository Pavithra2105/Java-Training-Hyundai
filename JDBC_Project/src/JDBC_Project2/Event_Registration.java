package JDBC_Project2;

import java.sql.*;
import java.util.Scanner;

public class Event_Registration {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = getConnection();
		Scanner sc = new Scanner(System.in);
		
		
		Create_Event_Registered(con);
		
		int ch = 1;
		do {
			System.out.println();
			System.out.println("*******Welcome to Event Registration*******");
			System.out.println();
			System.out.println(":MENU:");
			System.out.println();
			System.out.println("1.Event Details");
			System.out.println("2.Event Registration");
			System.out.println("3.Display Partiicipant");
			System.out.println("4.Delete  Participant");
			ch = sc.nextInt();
			
	switch(ch) {
		default:
			System.out.println("Invalid Choice!");
			break;
			
		case 1:
			Event_Details();
			break;
	      
	    case 2:
	    	insert_event_information(con , sc);
	    	break;
	    	
	    case 3:
	    	display_Participant_details(con);
	    	break;
	    	
	    case 4:
	    	System.out.println("Enter the phone number of the Participant to be deleted");
            String phone_num = sc.next();
	    	delete_Participant_data(con , phone_num);
	    	break;
		}	
	}while(ch!=0);
	sc.close();
	con.close();
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_registration","root","Manoj@1999");

        return con;
	}
	
	public static void Event_Details() {
		System.out.println("***:Event Details:***");
		System.out.println();
		System.out.println("Company Name : Pavithra National Pvt. Ltd.");
		System.out.println("Age Limit    : 1 to 6");
		System.out.println("Note         : Use Only Water Color");
		System.out.println("Venue        : Zebra park , Ernakulam ");
		System.out.println("Timing       : Morning 8 am to 11 am");
		System.out.println();
	}
	
	public static void Create_Event_Registered(Connection con) {
		try {
			String Create_Event_Registration = "CREATE TABLE event_registration(first_name VARCHAR(255) NOT NULL, second_name VARCHAR(255) NOT NULL, email_id VARCHAR(255) NOT NULL, phone_number VARCHAR(255) NOT NULL, Register VARCHAR(255) NOT NULL, status VARCHAR(255) NOT NULL)";
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(Create_Event_Registration);
			
			System.out.println("Event Registration table created successfully");
			
		}catch(Exception  e) {
			System.out.println("Error : "+e);
		}
	}
	
	public static void insert_event_information(Connection con , Scanner sc) {
		try {
			
			String status = "Registered";
			
			System.out.println("***:Event Registration:***");
			System.out.println();
			System.out.println("Enter your First Name : ");
			String first_name = sc.next();
			System.out.println("Enter your Last Name : ");
			String last_name = sc.next();
			System.out.println("Enter your Email ID : ");
			String email_id = sc.next();
			System.out.println("Enter your Phone Number : ");
		    String phone_num = sc.next();
			System.out.println("Want to Register : y / n");
			String reg = sc.next();
			
			
			if(reg.matches("y") || reg.matches("Y") || reg.matches("yes") || reg.matches("YES")) {
				
				String check = "SELECT phone_number FROM event_registration WHERE phone_number = '"+phone_num+"'";
				Statement stmt = con.createStatement();
				ResultSet resultSet;
				resultSet = stmt.executeQuery(check);
				
				if(!resultSet.next()) {
				String insert_event_reg = "insert into event_registration(first_name, second_name, email_id, phone_number, Register, status) values (?,?,?,?,?,?)";  
				
				PreparedStatement pst = con.prepareStatement(insert_event_reg);
				
				pst.setString(1, first_name);
				pst.setString(2, last_name);
				pst.setString(3, email_id);
				pst.setString(4, phone_num);
				pst.setString(5, reg);
				pst.setString(6, status);
					
				pst.executeUpdate();
				System.out.println("Registered Successfully !");
				System.out.println();
				
				}else {
					System.out.println("User Phone Number is Already Exist !");
					System.out.println();
					System.out.println("1.you can use your mailID to check are you a  new user or already exist !");
					System.out.println("Press 1");
					
					int ch2 = sc.nextInt();
					
					switch(ch2) {
						default:
							System.out.println("Invalid Choice !");
							break;
							
						case 1:
							String check1 = "SELECT email_id FROM event_registration WHERE email_id = '"+email_id+"'";
							Statement st = con.createStatement();
							ResultSet resultSet1;
							resultSet1 = st.executeQuery(check1);
							
							if(!resultSet1.next()) {
								String insert_event_reg = "insert into event_registration(first_name, second_name, email_id, phone_number, Register, status) values (?,?,?,?,?,?)";  
								
								PreparedStatement pst = con.prepareStatement(insert_event_reg);
								
								pst.setString(1, first_name);
								pst.setString(2, last_name);
								pst.setString(3, email_id);
								pst.setString(4, phone_num);
								pst.setString(5, reg);
								pst.setString(6, status);
									
								pst.executeUpdate();
								System.out.println("Registered Successfully !");
								System.out.println();
								
								}else {
									System.out.println("User Email ID is Already Exist !");
								}
							break;
					}
				}
				
				
			}else if(reg.matches("n") || reg.matches("N") || reg.matches("no") || reg.matches("NO")) {
				System.out.println("1.ReEnter details");
				int ch1 = sc.nextInt();
				switch(ch1) {
				default :
					System.out.println("Invalid Choice !");
					break;
					
				case 1:
					insert_event_information(con , sc);
					break;
				}	
			}else {
				System.out.println("Invalid Entry!");
			}
		}catch(Exception e) {
			System.out.println("Error :"+e);
		}
	}
	
	public static void display_Participant_details(Connection con) {
		try {
			String view_psrticipant_details = "SELECT * FROM event_registration";
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(view_psrticipant_details);
			if (!rs.isBeforeFirst()) {
               System.out.println("No data Found!");
           } else {
           	System.out.println("***Participant Details***");
				System.out.println();
           	System.out.println("-------------------------------------------------------------------------------");
               System.out.println("First Name    ||    Second name        ||    Email ID               || Contect Number  ");
               System.out.println("-------------------------------------------------------------------------------");
               while (rs.next())
                   System.out.println(rs.getString(1) + "        \t" + rs.getString(2) + "         \t" + rs.getString(3)+ "         \t" + rs.getString(4));
           }
		}catch(Exception e) {
			System.out.println("Error :"+e);
		}
	}
	
	public static void delete_Participant_data(Connection con, String phone_num) {
        try {
            String delete_query = "DELETE FROM event_registration WHERE phone_number = ?";
            PreparedStatement pstmt = con.prepareStatement(delete_query);
            pstmt.setString(1, phone_num);
            pstmt.executeUpdate();
            System.out.println("Deleted Participant with phone number " + phone_num + " succesfully");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
	}

}
