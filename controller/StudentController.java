package java_crud_simple_project_using_jdbc_statement.controller;

import java.util.Scanner;

import java_crud_simple_project_using_jdbc_statement.dto.StudentDto;
import java_crud_simple_project_using_jdbc_statement.service.StudentService;

public class StudentController {

	

	public static void main(String[] args) {
		StudentService service=new StudentService();
		Scanner sc=new Scanner (System.in);
		
		
		while(true){
			System.out.println("1.insert\n2.delete");
			System.out.println("Please select the option");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:{

				System.out.println("enter the student Id");
				int Id=sc.nextInt();
				System.out.println("enter the student Name");
				String name=sc.next();
				
				StudentDto student =new StudentDto(Id,name);
				
				service.addStudentDetails(student);
				
				
			}break;
			default:{
				System.out.println("you have chosen wrong option and please check the selected option");
			}break;
			}
			
			
		}
	}
}
