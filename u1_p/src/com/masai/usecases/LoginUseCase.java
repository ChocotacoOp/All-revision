package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentException;

public class LoginUseCase {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the username :");
		 String Uname = sc.next();
		 
		 System.out.println("Enter the password :");
		 String pass = sc.next();
		 
		 StudentDao dao = new StudentDaoImpl();
		 
		 try {
			 
			Student student = dao.loginStudent(Uname, pass);
			
			System.out.println("Welcome "+student.getName()+" to JDBC");
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		 
	}
}
