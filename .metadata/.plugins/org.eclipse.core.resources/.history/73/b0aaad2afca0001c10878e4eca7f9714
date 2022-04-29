package JDBCExample;

import java.sql.*;

public class JDBCExample{
	{
	try{ 
		
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_staff_db","root","Manoj@1999");  
		
		Statement stmt=con.createStatement();  
		
		ResultSet rs = stmt.executeQuery("select staff from student_staff_db Where student_id = 1");  
		
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
