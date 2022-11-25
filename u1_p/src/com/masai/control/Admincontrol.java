package com.masai.control;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.dao.adminDao;
import com.masai.exceptions.CourceException;
import com.masai.exceptions.StudentException;

public class Admincontrol {

	public static void selectOption() {
		
		
		StudentDao dao = new StudentDaoImpl();
		adminDao dao1 = new AdminDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1/ For allocate student to a course"+"\n"+"2/ Get all student details "+"\n"+"3/ Get student from course"+"\n"+"4/ Add a new Course" );
		int n = sc.nextInt();
		
		switch(n) {
//=================================================================================
		case 1:
			System.out.println("--allocate student to a course--");
			System.out.println("Enter the course id:");
			int cid = sc.nextInt();
			
			System.out.println("Enter the student roll:");
			int roll = sc.nextInt();
			String result;
			try {
				result = dao.registerStudentInACourse(cid , roll);
				System.out.println(result);
				
				} catch (Exception e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			} 
			break;
//================================================================================		
		case 2:
			System.out.println("Get all student details");
			try {
				List<Student> students = dao.getAllStudentDetails();
				
				students.forEach(s->{
					System.out.println("Student name :"+s.getName());
					System.out.println("Student marks :"+s.getMarks());
					System.out.println("Student email :"+s.getEmail());
					
					System.out.println("==============================");
				});
					
			} catch (StudentException e) {
			System.out.println(e.getMessage());	
			}
			break;
//=====================================================================================
		case 3: System.out.println("Get student from course");
		System.out.println("Enter the course name you want to search:");
		String cname1 = sc.next();
		try {
			List<StudentDTO> dtos =  dao.getAllStudentsByCname(cname1);
			
			dtos.forEach(dto->System.out.println(dto));
			
		} catch (CourceException e) {
			System.out.println(e.getMessage());
		}
		break;
//===========================================================================================
		case 4:
			System.out.println("--Add A New Course--");
			System.out.println("======================");
			System.out.println("Enter the course name you want to add:");
			String cname=sc.next();
			System.out.println("Enter the fee you Want to charge on that course:");
			int fee=sc.nextInt();
			String message;
			try {
				message = dao1.addNewCourse(cname, fee);
				System.out.println(message);
			} catch (StudentException e) {
			System.out.println(e.getMessage());
			}
			break;
//============================================================================================
		default :
			System.out.println("Invalid Entry...!");
			
		}
		
	}
}
