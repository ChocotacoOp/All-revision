package com.masai.usecases;

import java.util.List;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentException;

public class getAllStudentUseCase {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
			List<Student> students = dao.getAllStudentDetails();
			//printing students details useing lambda expression
			//students.forEach(s-> System.out.println(s));
			
			students.forEach(s->{
				System.out.println("Student name :"+s.getName());
				System.out.println("Student marks :"+s.getMarks());
				System.out.println("Student email :"+s.getEmail());
				
				System.out.println("==============================");
			});
			
			
		} catch (StudentException e) {
			
		}
	}
}
