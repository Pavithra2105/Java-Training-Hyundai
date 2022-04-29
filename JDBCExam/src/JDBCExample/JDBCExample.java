package JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String[] args) {
	{
		try{ 
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_staff_db","root","Manoj@1999");  
			
			Statement stmt=con.createStatement();  
			
			ResultSet rs = stmt.executeQuery("Select staff_fn from staff;");  
			
			while(rs.next()) {  
				System.out.println(rs.getString(1));  
			} 
			//step5 close the connection object  
			con.close();  
			  
			
			//stmt.executeQuery("Insert into student_grades(student_id, student_grade) values ('102','B')");  
			
			//while(rs.next())  
				
			  // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			
			con.close();  
			
			}
			catch(Exception e){ 
				System.out.println(e);}  
		  }
	}
}
