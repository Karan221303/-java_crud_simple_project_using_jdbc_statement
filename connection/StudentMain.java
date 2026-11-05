package java_crud_simple_project_using_jdbc_statement.connection;

import java.sql.Connection;

public class StudentMain {
	public static void main(String[] args) {
		Connection con = StudentConnection.getStudentConnection();
		
		
		System.out.println(con);
	}

}
