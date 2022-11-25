package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.CourceException;
import com.masai.exceptions.StudentException;

public class AllocateStudentToCourseUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the course id:");
		int cid = sc.nextInt();
		
		System.out.println("Enter the student roll:");
		int roll = sc.nextInt();
		
		
		StudentDao dao = new StudentDaoImpl();
		
		
			String result;
			try {
				result = dao.registerStudentInACourse(cid , roll);
				System.out.println(result);
				
				} catch (Exception e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			} 
			
	}
}
