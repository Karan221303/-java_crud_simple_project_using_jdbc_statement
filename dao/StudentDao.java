package java_crud_simple_project_using_jdbc_statement.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java_crud_simple_project_using_jdbc_statement.connection.StudentConnection;
import java_crud_simple_project_using_jdbc_statement.dto.StudentDto;


public class StudentDao {
	
	Connection con=StudentConnection.getStudentConnection();
	
	public int addStudentDetails(StudentDto student) {
		
		String insertQuery="insert into student5 values("+student.getStudentId()+",'"+student.getStudentName()+"')";
		
		
		try {
			Statement statement=con.createStatement();
			
			int Id=statement.executeUpdate(insertQuery);
			
			if(Id>0) {
				System.out.println("Data has been stored");
			}
			
			else {
				System.out.println("Please check your code and SQL Query");
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}
	

}
