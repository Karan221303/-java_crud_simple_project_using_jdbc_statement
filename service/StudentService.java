package java_crud_simple_project_using_jdbc_statement.service;

import java_crud_simple_project_using_jdbc_statement.dao.StudentDao;
import java_crud_simple_project_using_jdbc_statement.dto.StudentDto;

public class StudentService {
	
	StudentDao dao=new StudentDao();
	public int addStudentDetails(StudentDto student) {
		return dao.addStudentDetails(student);
	}

}
