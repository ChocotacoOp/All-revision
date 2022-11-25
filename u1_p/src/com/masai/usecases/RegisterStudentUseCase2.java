package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class RegisterStudentUseCase2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name:");
		String name = sc.next();
		
		System.out.println("Enter the student marks:");
		int marks = sc.nextInt();
		
		System.out.println("Enter the student email:");
		String email = sc.next();
		
		System.out.println("Enter the student password");
		String password = sc.next();
		
		StudentDao dao = new StudentDaoImpl();
		
		
		Student student = new Student();
		student.setName(name);
		student.setMarks(marks);
		student.setEmail(email);
		student.setPassword(password); 	
		
		String result = dao.registerStudent2(student);
		
		System.out.println(result);
	}
}
