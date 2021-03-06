package JDBCExampleProject;

import java.sql.*;
import java.util.Scanner;

public class Student_JDBC_Example {
	
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
	         System.out.println("3. Enter each Subject Marks of the student");
	         System.out.println("4. Enter Student leave details");
	         System.out.println("5. Enter Staff Details");
	         System.out.println("--------------Display-----------");
	         System.out.println("6. Display Student Details ");
	         System.out.println("7. Display Student's Parents Details ");
	         System.out.println("8. Display Staff Details ");
	         System.out.println("9. Display Students Marks , Percentage and Grade ");
	         System.out.println("10.Display those Students who have Scored more 60% in each Grade ");
	         System.out.println("11.Search Student Name :");
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
	            	 insert_student_leaves(con , sc);
	            	 break;            	 
	             case 5:
	             	insert_staff_details(con , sc);
	                break;	
	                
	                
	             case 6:
	            	 display_student_details(con);
	            	 break;
	             case 7:
	            	 display_student_parent_data(con);
	            	 break;
	             case 8:
	            	 display_staff_data(con);
	            	 break;
	             case 9:
	            	 display_sub_marks_grade(con);
	            	 break;
	             case 10:
	            	 display_grade_wise(con);
	            	 break;
	             case 11:
	            	 display_student_name(con ,sc);
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
				System.out.println("***Student Details***");
				System.out.println();
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
				System.out.println("***Parents Details***");
				System.out.println();
				String create_Student_Parent_Details = "insert into student_parent(Student_id, father_name, mother_name, father_contact_number) values (?,?,?,?)";
			
				System.out.println("Enter Student ID : ");
				int student_id = sc.nextInt();
				System.out.println("Enter Student's Father name :");
				String father_name = sc.next();
				System.out.println("Enter Student's mother name :");
				String mother_name = sc.next();
				System.out.println("Enter Parents contact number :");
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
				String create_Student_sub_marks_query = "CREATE TABLE student_sub_mark(student_id INTEGER PRIMARY KEY, Chemistry INTEGER NOT NULL, Maths INTEGER NOT NULL, Physics INTEGER NOT NULL, Biology INTEGER NOT NULL, Tamil INTEGER NOT NULL, English INTEGER NOT NULL, Total INTEGER NOT NULL, Percentage INTEGER NOT NULL, Grade VARCHAR(255) NOT NULL)";
				
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate(create_Student_sub_marks_query);
				
				System.out.println("student_sub_mark details Table created successfully");
				
			}catch(Exception e) {
				System.out.println("Error :"+e);
			}	
		}
		
		public static void Insert_Subject_marks(Connection con, Scanner sc) {
			try {
				int total=0;
			    int	per;
		
				String a="A";
				String b="B";
				String c="C";
				String d="D";
				System.out.println("***Student's Subjects,Marks,Percentage and Grade Details***");
				System.out.println();
					
				System.out.println("Enter the Student ID :");
				int student_id = sc.nextInt();
				System.out.println("Enter your marks ");
				System.out.println();
				System.out.println("Chemistry : ");
				int chem = sc.nextInt();
				System.out.println("Maths :");
				int math = sc.nextInt();
				System.out.println("Physics :");
				int phy = sc.nextInt();
				System.out.println("Biology :");
				int bio = sc.nextInt();
				System.out.println("Tamil :");
				int tam = sc.nextInt();
				System.out.println("English :");
				int eng = sc.nextInt();
				
				total = chem+math+phy+bio+tam+eng;
				per =(total*100/600);
				
				
				String insert_student_marks = "insert into student_sub_mark(student_id, Chemistry, Maths, Physics, Biology, Tamil, English, Total, Percentage, Grade) values (?,?,?,?,?,?,?,?,?,?)";
				String g = null;
				if(per>=80) {
					g = a;
				}else if(per>=60 && per<80) {
					g = b;
				}else if(per>=40 && per<60) {
					g = c;
				}else {
					g = d;
				}
				
				PreparedStatement pst = con.prepareStatement(insert_student_marks);
				
				pst.setInt(1,student_id);
				pst.setInt(2, chem);
				pst.setInt(3, math);
				pst.setInt(4, phy);
				pst.setInt(5, bio);
				pst.setInt(6, tam);
				pst.setInt(7, eng);
				pst.setInt(8, total);
				pst.setFloat(9, per);
				pst.setString(10, g);
					
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

	public static void insert_student_leaves(Connection con , Scanner sc) {
		try {
			String insert_Student_leave = "insert into student_leave_details(student_id, num_of_leaves, date_of_leave) values (?'?'?)";
			System.out.println("***Student Leave Details***");
			System.out.println();
			System.out.println("Enter the Student ID :");
			int stu_id = sc.nextInt();
			System.out.println("Enter the Number of leave you had taken");
			int num_leave = sc.nextInt();
			System.out.println("leave taken date");
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
			System.out.println("***Staff Details***");
			System.out.println();
			
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
	public static void display_student_details(Connection con) {
		try {
			String view_student_details = "SELECT * FROM student_in";
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(view_student_details);
			if (!rs.isBeforeFirst()) {
               System.out.println("No data Found!");
           } else {
           	System.out.println("***Student Details***");
				System.out.println();
           	System.out.println("-------------------------------------------------------------------------------");
               System.out.println("Student ID    ||  First name        ||  Last name     || Contect Number        ||  Gender ");
               System.out.println("-------------------------------------------------------------------------------");
               while (rs.next())
                   System.out.println(rs.getInt(1) + "        \t" + rs.getString(2) + "          \t" + rs.getString(3)+ "         \t" + rs.getString(4)+ "          \t" + rs.getString(5));
           }
		}catch(Exception e) {
			System.out.println("Error :"+e);
		}
	}
	
	public static void display_student_name(Connection con ,Scanner sc) {
		try {
			System.out.println("Enter the name :");
			String sname =sc.next();
			String view_Student_name = "SELECT * FROM student_in Where first_name = '"+sname+"'";
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(view_Student_name);
			if (!rs.isBeforeFirst()) {
	               System.out.println("No Name Found!");
	           } else {
	        	    System.out.println("***Student Details***");
					System.out.println();
	           	    System.out.println("-------------------------------------------------------------------------------");
	                System.out.println("Student ID    ||  First name        ||  Last name     || Contect Number        ||  Gender ");
	                System.out.println("-------------------------------------------------------------------------------");
	               while (rs.next())
	                   System.out.println(rs.getInt(1) + "        \t" + rs.getString(2) + "          \t" + rs.getString(3)+ "         \t" + rs.getString(4)+ "          \t" + rs.getString(5));
	           }
	      }catch(Exception e) {
				System.out.println("Error : "+e);
			}
		}
	
	public static void display_student_parent_data(Connection con) {
			try {
				String view_student_parent_data = "SELECT student_id, father_name, mother_name, father_contact_number FROM student_parent";
				
				Statement stmt = con.createStatement();
				
				ResultSet rs = stmt.executeQuery(view_student_parent_data);
				if (!rs.isBeforeFirst()) {
	                System.out.println("No data Found!");
	            } else {
	            	System.out.println("***Parents Details***");
					System.out.println();
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
	            System.out.println("No data Found!");
	        } else {
	        	System.out.println("***Staff Details***");
				System.out.println();
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
	public static void display_sub_marks_grade(Connection con) {
		try {
			String view_sub_mar_grade = "SELECT student_id, Chemistry, Maths, Physics, Biology, Tamil, English, Total, Percentage,Grade FROM student_sub_mark";
		
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(view_sub_mar_grade);
			if (!rs.isBeforeFirst()) {
	            System.out.println("No data Found!");
	        } else {
	        	System.out.println("***Student Subject , Mark , Percentage and Grade Details***");
				System.out.println();
	        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
	            System.out.println("Student ID ||   Chemistry   ||   Maths   ||   Physics   ||   Biology   ||   Tamil   ||   English   ||   Total   ||   Percentage   ||   Grade   ");
	            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
	            while (rs.next())
	            	System.out.println(rs.getInt(1) +"       \t"+rs.getInt(2) +"         \t"+rs.getInt(3) +"      \t"+rs.getInt(4) +"         \t"+rs.getInt(5) +"          \t"+rs.getInt(6) +"          \t"+rs.getInt(7) +"          \t"+rs.getInt(8) +"          \t"+rs.getFloat(9) +"          \t"+rs.getString(10)+"          \t");
	            
		}
	}catch(Exception e) {
		System.out.println("Error :"+e);
	}
  }
	public static void display_grade_wise(Connection con) {
		try {
			String view_grade_wise = "SELECT * FROM student_sub_mark where Percentage > 60.0 ";
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(view_grade_wise);
			if (!rs.isBeforeFirst()) {
	            System.out.println("No data Found!");
	        } else {
	        	System.out.println("***Display Grade wise***");
				System.out.println();
	        	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
	            System.out.println("Student ID ||   Total   ||   Percentage   ||   Grade   ");
	            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
	            while (rs.next())
	            	System.out.println(rs.getInt(1) +"       \t"+ rs.getInt(8) +"          \t"+rs.getFloat(9) +"          \t"+rs.getString(10)+"          \t");
	        }
		}catch(Exception e) {
			System.out.println("Error :"+e);
		}
	}

}
