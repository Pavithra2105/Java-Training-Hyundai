package Student_Details_JDBC;

import java.sql.*;
import java.util.Scanner;

 class Student_JDBC_Example {
	 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 
	 Connection con =getConnection(); 
	 Scanner sc = new Scanner(System.in);
	 
	 //create table
	 create_student_table(con);
	 create_student_Parent_table(con);
	 Create_Student_Subject_Marks_Table(con);
	 Student_leave_details(con);
	 create_staff_details(con);
	 
	int ch;
	 
	 do {
		 System.out.println();
		 System.out.println("**************WELCOME TO SCHOOL MANAGEMENT**************");
		 System.out.println();
		 System.out.println("--------------Insert-----------");
		 System.out.println("1. Enter Student Details:");
         System.out.println("2. Enter Student Parent Details");
         System.out.println("3. Enter Subject ID - Subject - Marks of the student");
         System.out.println("4. Enter Student leave details");
         System.out.println("5. Enter Staff Details");
         System.out.println("--------------Display-----------");
         System.out.println("6. Dsiplay Student Details ");
         System.out.println("7. Dsiplay Staff Details ");

          ch = sc.nextInt();

         switch (ch) {
             case 1:
            	 insert_into_Student_table(con, sc);
                 break;
                 
             case 2:
            	 insert_Student_Parent(con , sc);
            	 break;
            	 
             case 3:
            	 Insert_Subject_marks(con , sc);
            	 break;
            	 
             case 4:
            	 insert_student_leave(con , sc);
            	 break;
            	 
             case 5:
             	insert_staff_details(con , sc);
                break;
             
             case 6:
            	 display_student_parent_data(con);
            	 break;
             case 7:
            	 display_staff_data(con);
            	 break;

             default:
                 System.out.println("Invalid Choice !");
                 break;
         }
     }while(ch!=0);

     sc.close();
     con.close();
     }

	private static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_staff_db","root","Manoj@1999");

        return con;
	}
	public static void create_student_table(Connection con) {
        try {
            String create_Student_table_query = "CREATE TABLE student_in(student_id INTEGER PRIMARY KEY, first_name VARCHAR(255) NOT NULL, second_name VARCHAR(255) NOT NULL, cont_num VARCHAR(255) NOT NULL, gender VARCHAR(8) NOT NULL)";

            Statement stmt = con.createStatement();

            stmt.executeUpdate(create_Student_table_query);

            System.out.println("Student database created successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
	public static void insert_into_Student_table(Connection con, Scanner sc) {
		try {
            System.out.println("Enter the Student ID : ");
            int stu_id = sc.nextInt();
            System.out.println("Enter your first name : ");
            String f_name = sc.next();
            System.out.println("Enter your Last name : ");
            String s_name = sc.next();
            System.out.println("Enter your Contact Number : ");
            String c_num = sc.next();
            System.out.println("Gender : ");
            String gen = sc.next();
            
            String create_Student_query = "insert into student_in(student_id, first_name, second_name, cont_num, gender) values (?,?,?,?,?)";
            
            
            PreparedStatement pstmt = con.prepareStatement(create_Student_query);
            
            pstmt.setInt(1, stu_id);
            pstmt.setString(2, f_name);
            pstmt.setString(3, s_name);
            pstmt.setString(4, c_num);
            pstmt.setString(5, gen);
        
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully");
           
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}	
	}
	public static void create_student_Parent_table(Connection con) {
        try {
            String create_Student_table_query = "CREATE TABLE student_parent(student_id INTEGER PRIMARY KEY, father_name VARCHAR(255) NOT NULL, mother_name VARCHAR(255) NOT NULL, father_contact_number VARCHAR(255) NOT NULL)";

            Statement stmt = con.createStatement();

            stmt.executeUpdate(create_Student_table_query);

            System.out.println("Studen_parents details Table created successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
	
	public static void insert_Student_Parent(Connection con, Scanner sc) {
		try {
			String create_Student_Parent_Details = "insert into student_parent(Student_id, father_name, mother_name, father_contact_number) values (?,?,?,?)";
		
			System.out.println("Enter Student ID : ");
			int student_id = sc.nextInt();
			System.out.println("Enter Student's Father name :");
			String father_name = sc.next();
			System.out.println("Enter Student's mother name :");
			String mother_name = sc.next();
			System.out.println("Enter Student's mother name :");
			String fathers_contact_number = sc.next();
			
			PreparedStatement pstmt = con.prepareStatement(create_Student_Parent_Details);
			
			pstmt.setInt(1, student_id);
            pstmt.setString(2, father_name);
            pstmt.setString(3, mother_name);
            pstmt.setString(4, fathers_contact_number);
           
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully");
			
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	//student subject id,subject,marks .................
	
	public static void Create_Student_Subject_Marks_Table(Connection con) {
		try {
			String create_Student_sub_marks_query = "CREATE TABLE student_sub_mark(subject_id INTEGER PRIMARY KEY, subject_name VARCHAR(255) NOT NULL, stu_mark INTEGER NOT NULL)";
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(create_Student_sub_marks_query);
			
			System.out.println("student_sub_mark details Table created successfully");
			
		}catch(Exception e) {
			System.out.println("Error :"+e);
		}	
	}
	
	public static void Insert_Subject_marks(Connection con, Scanner sc) {
		try {
			String insert_student_marks = "insert into student_sub_mark(subject_id,subject_name,stu_mark) values (?,?,?)";
			
			System.out.println("Enter the subject ID :");
			int sub_id = sc.nextInt();
			System.out.println("Enter the subjects :");
			String sub_name = sc.next();
			System.out.println("Enter your marks :");
			int marks = sc.nextInt();
			
			PreparedStatement pst = con.prepareStatement(insert_student_marks);
			
			pst.setInt(1,sub_id);
			pst.setString(2, sub_name);
			pst.setInt(3, marks);
			
			pst.executeUpdate();
			System.out.println("Data inserted successfully");
			System.out.println();
			
			
		}catch(Exception e) {
			System.out.println("Error :"+e);
		}
	}
	
	//Student leave details .....
	
public static void Student_leave_details(Connection con) {
	try {
		String Create_Student_Leave_details = "CREATE TABLE student_leave_details(student_id INTEGER PRIMARY KEY, num_of_leaves INTEGER NOT NULL, date_of_leave VARCHAR(255) NOT NULL)";
	
		Statement stm = con.createStatement();
		
		stm.executeUpdate(Create_Student_Leave_details);
		
		System.out.println("student_leave_details Table created successfully");		
	
	}catch(Exception e) {
		System.out.println("Error :"+e);
	}
}

public static void insert_student_leave(Connection con , Scanner sc) {
	try {
		String insert_Student_leave = "insert into student_leave(student_id,num_of_leaves,date_of_leave) values (?'?'?)";
		
		System.out.println("Enter the Student ID :");
		int stu_id = sc.nextInt();
		System.out.println("Enter the Number of leave you had taken");
		int num_leave = sc.nextInt();
		System.out.println("date_leave");
		String leave_date = sc.next();
		
		PreparedStatement pst = con.prepareStatement(insert_Student_leave);
		
		pst.setInt(1, stu_id);
		pst.setInt(2, num_leave);
		pst.setString(3, leave_date);
		
		pst.executeUpdate();
		System.out.println("Data inserted successfully");
		System.out.println();
		
		
	}catch(Exception e) {
		System.out.println("Error :"+e);
	}
}

public static void create_staff_details(Connection con) {
	try {
		String create_staff_query = "CREATE TABLE staff_details(staff_id INTEGER PRIMARY KEY, role VARCHAR(255) NOT NULL, subject VARCHAR(255) NOT NULL)";
		
        Statement stm = con.createStatement();
		
		stm.executeUpdate(create_staff_query);
		
		System.out.println("staff_details Table created successfully");	
		
	}catch(Exception e) {
		System.out.println("Error :"+e);
	}
}

public static void insert_staff_details(Connection con , Scanner sc) {
	try {
		
		String insert_staff_details = "insert into staff_details(staff_id,role,subject) values (?,?,?)";
		
		System.out.println("Enter the Staff Id : ");
		int staff_id = sc.nextInt();
		System.out.println("Enter the Role : ");
		String role = sc.next();
		System.out.println("Enter the Subject : ");
		String subject = sc.next();
		
		PreparedStatement pst = con.prepareStatement(insert_staff_details);
		pst.setInt(1,staff_id);
		pst.setString(2, role);
		pst.setString(3, subject);
		pst.executeUpdate();
		System.out.println("Data inserted successfully");
		System.out.println();
				
	}catch(Exception e) {
		System.out.println("Error :"+e);
	}
}

public static void display_student_parent_data(Connection con) {
		try {
			String view_student_parent_data = "SELECT student_id, father_name, mother_name, father_contact_number FROM student_parent";
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(view_student_parent_data);
			if (!rs.isBeforeFirst()) {
                System.out.println("No data");
            } else {
            	System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Student ID  ||  Father's name  ||  Mother's name  || Father's Contect Number ");
                System.out.println("-------------------------------------------------------------------------------");
                while (rs.next())
                    System.out.println(rs.getInt(1) + "          \t" + rs.getString(2) + "             \t" + rs.getString(3)+ "           \t" + rs.getString(4));
            }
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}

public static void display_staff_data(Connection con) {
	try {
		String view_staff_data = "SELECT staff_id, role, subject FROM staff_details";
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(view_staff_data);
		if (!rs.isBeforeFirst()) {
            System.out.println("No data");
        } else {
        	System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Staff ID     ||      Role       ||  Subject  ");
            System.out.println("-------------------------------------------------------------------------------");
            while (rs.next())
                System.out.println(rs.getInt(1) + "        \t" + rs.getString(2) + "         \t" + rs.getString(3));
        }
		
	}catch(Exception e) {
		System.out.println("Error :"+e);
	}
}
}
