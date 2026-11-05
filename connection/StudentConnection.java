package java_crud_simple_project_using_jdbc_statement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {
	public static Connection getStudentConnection() {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/BCA";
		String user="root";
		String pass="";
		
		return DriverManager.getConnection(url, user, pass);
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
	
		 
		
		
		return null;
	}

}
