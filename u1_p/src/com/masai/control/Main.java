package com.masai.control;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.dao.adminDao;
import com.masai.exceptions.StudentException;
import com.masai.usecases.LoginUseCase;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Management System ");
		
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter 1 for admin login"+"\n"+"Enter 2 for student login "+"\n"+"Emter 3 for new student registration ");
		int num = sc.nextInt();
		
		StudentDao dao = new StudentDaoImpl();
		adminDao dao1 = new AdminDaoImpl();
		
		switch(num) {
//======================================================================================
		case 1: 
		System.out.println("---Admin login---");
		System.out.println("========================");
		System.out.println("enter admin username ");
		String Ausername = sc.next();
		
		System.out.println("enter password");
		String Apassword = sc.next();
			try {
				String str = dao1.adminLogin(Ausername, Apassword);
				System.out.println("Admin login successfull...!");
				Admincontrol.selectOption();
			} catch (StudentException e) {
				System.out.println(e.getMessage());
			}
			break;
//======================================================================================			
		case 2: 
			System.out.println("--Login as Student--");
			System.out.println("========================");
			 System.out.println("Enter the username :");
			 String Uname = sc.next();
			 System.out.println("Enter the password :");
			 String pass = sc.next();			 
			 try {
				 
				Student student = dao.loginStudent(Uname, pass);
				
				System.out.println("Welcome "+student.getName()+" to JDBC");
				 StudentControl.selectOption();
			} catch (StudentException e) {
				System.out.println(e.getMessage());
			}
			 break;
//=========================================================================================
		case 3:
			System.out.println("---New Student Registration---");
			System.out.println("================================");
			System.out.println("Enter the student name:");
			String name = sc.next();
			
			System.out.println("Enter the student marks:");
			int marks = sc.nextInt();
			
			System.out.println("Enter the student email:");
			String email = sc.next();
			
			System.out.println("Enter the student password");
			String password = sc.next();
			
//			StudentDao dao = new StudentDaoImpl();
//			StudentDaoImpl dao = new StudentDaoImpl();
			String result = dao.registerStudent(name, marks, email, password);
			
			System.out.println(result);
			break;
			
			default: System.out.println("Invaid Entry ..!");
		}
		
		
	}

}
